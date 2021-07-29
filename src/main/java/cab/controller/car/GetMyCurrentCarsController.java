package cab.controller.car;

import cab.lib.Injector;
import cab.model.Car;
import cab.service.CarService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/cars/current")
public class GetMyCurrentCarsController extends HttpServlet {
    private static final String DRIVERID = "driver_id";
    private static final Injector injector = Injector.getInstance("cab");
    private final CarService carService = (CarService) injector.getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Car> cars = carService.getAllByDriver((Long) session.getAttribute(DRIVERID));
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/WEB-INF/views/cars/all.jsp").forward(req, resp);
    }
}
