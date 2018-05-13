package com.isquarebsys.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * http://www.javainuse.com/spring/spring-boot-oauth-introduction
 * 
 * http://www.javainuse.com/spring/spring-boot-oauth-authorization-code
 * 
    The Resource Owner will ask the Client Application to get some data from the Resource Server.
    The Resource Server asks the Resource Owner to authenticate itself and as for authorization to share data.
    After successful authentication the Resource Server shares an authorization code with the client application

 * 
 * 
 * @author user
 *
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory().withClient("client").secret("client").authorizedGrantTypes("authorization_code")
            .scopes("read").authorities("CLIENT");
    }
}