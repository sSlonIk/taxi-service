package cab.dao;

import cab.model.Car;
import java.util.List;

public interface CarDao extends cab.dao.GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
