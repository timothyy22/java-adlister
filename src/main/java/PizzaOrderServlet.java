import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/pizza")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
    }
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust =req.getParameter("crust");
        String crustsize = req.getParameter("crustsize");
        String saucetype = req.getParameter("saucetype");
        String[] toppings = req.getParameterValues("toppings");
        String adress = req.getParameter("delivery");

    System.out.println(crust);
    System.out.println(crustsize);
    System.out.println(saucetype);
    System.out.println(Arrays.toString(toppings));
    System.out.println(adress);
}




}
