package security.oauth.example1;

import java.util.List;

public interface UserService {

    OAuthUser save(OAuthUser user);
    List<OAuthUser> findAll();
    void delete(long id);
}