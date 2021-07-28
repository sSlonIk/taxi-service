package cab.service;

import cab.exception.AuthenticationExcception;
import cab.lib.Inject;
import cab.lib.Service;
import cab.model.Driver;

import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationExcception {
        Optional<Driver> driver = driverService.getDriverByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationExcception("Login or password was incorrect");
    }
}
