package cab.service;

import cab.exception.AuthenticationExcception;
import cab.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationExcception;
}
