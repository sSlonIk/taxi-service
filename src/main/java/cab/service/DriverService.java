package cab.service;

import cab.model.Driver;
import java.util.Optional;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> getDriverByLogin(String login);
}
