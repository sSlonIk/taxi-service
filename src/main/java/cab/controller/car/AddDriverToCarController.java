package cab.controller.car;

import cab.lib.Injector;
import cab.model.Car;
import cab.model.Driver;
import cab.service.CarService;
import cab.service.DriverService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddDriverToCarController extends HttpServlet {
    private static final String DRIVERID = "driver_id";
    private static final Injector injector = Injector.getInstance("mate");
    private final CarService carService = (CarService) injector
            .getInstance(CarService.class);
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("cars", carService.getAll());
        req.setAttribute("drivers", carService.getAll());
        req.getRequestDispatcher("/WEB-INF/views/cars/drivers/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        long driverId = Long.parseLong(req.getParameter(DRIVERID));
        long carId = Long.parseLong(req.getParameter("car_id"));
        Driver driver = driverService.get(driverId);
        Car car = carService.get(carId);
        carService.addDriverToCar(driver, car);
        resp.sendRedirect("/cars/drivers/add");
    }
}