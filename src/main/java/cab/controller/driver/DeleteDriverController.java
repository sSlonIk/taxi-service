package cab.controller.driver;

import cab.lib.Injector;
import cab.service.DriverService;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/drivers/delete")
public class DeleteDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("cab");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        driverService.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect("/drivers/all");
    }
}
