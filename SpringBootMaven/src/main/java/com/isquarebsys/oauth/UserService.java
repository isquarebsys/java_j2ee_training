package com.isquarebsys.oauth;

import java.util.List;

public interface UserService {

    OAuthUser save(OAuthUser user);
    List<OAuthUser> findAll();
    void delete(long id);
}