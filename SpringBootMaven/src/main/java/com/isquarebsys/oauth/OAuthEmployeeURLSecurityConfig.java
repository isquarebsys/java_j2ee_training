package com.isquarebsys.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class OAuthEmployeeURLSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }

    /**
     * We are securing the url->/secured/apis/employees
     * 
     * For ADMIN role, the url is permitted to configure security
     * 
     * formLogin() mandates user to login with user credentials and then permits all operations
     * 
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/oauth/apis/employees")
            .hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin()
            .permitAll().and().logout().permitAll();

        http.csrf().disable();
    }

    /**
     * .authorities("ROLE_ADMIN") should be used as SUCH
     * do NOT use as .authorities("ADMIN")
     */
    @Override
    public void configure(AuthenticationManagerBuilder authenticationMgr) throws Exception {
        authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin")
            .authorities("ROLE_ADMIN");
    }
}