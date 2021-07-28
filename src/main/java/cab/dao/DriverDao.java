package cab.dao;

import mate.model.Driver;

import java.util.Optional;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> getDriverByLogin(String driverLogin);
}
