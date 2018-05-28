package security.oauth.example1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuthUserDao extends CrudRepository<OAuthUser, Long> {
    OAuthUser findByUsername(String username);
}