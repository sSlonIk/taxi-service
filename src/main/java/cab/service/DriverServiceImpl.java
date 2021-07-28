package cab.service;

import cab.dao.DriverDao;
import cab.lib.Inject;
import cab.lib.Service;
import cab.model.Driver;
import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements cab.service.DriverService {
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver create(Driver driver) {
        return driverDao.create(driver);
    }

    @Override
    public Driver get(Long id) {
        return driverDao.get(id).get();
    }

    @Override
    public List<Driver> getAll() {
        return driverDao.getAll();
    }

    @Override
    public Driver update(Driver driver) {
        return driverDao.update(driver);
    }

    @Override
    public boolean delete(Long id) {
        return driverDao.delete(id);
    }

    @Override
    public Optional<Driver> getDriverByLogin(String login) {
        return driverDao.getDriverByLogin(login);
    }
}
