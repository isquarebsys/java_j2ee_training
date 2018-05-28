package security.oauth.example1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth_users")
public class OAuthUserController {
	@Autowired
    private UserService userService;

    @RequestMapping(value="/oauth_user", method = RequestMethod.GET)
    public List listUser(){
        return userService.findAll();
    }

    @RequestMapping(value = "/oauth_user", method = RequestMethod.POST)
    public OAuthUser create(@RequestBody OAuthUser user){
        return userService.save(user);
    }

    @RequestMapping(value = "/oauth_user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Long id){
        userService.delete(id);
        return "success";
    }
}
