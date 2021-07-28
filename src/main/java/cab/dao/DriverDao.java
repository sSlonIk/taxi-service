package cab.dao;

import cab.model.Driver;
import java.util.Optional;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> getDriverByLogin(String driverLogin);
}
