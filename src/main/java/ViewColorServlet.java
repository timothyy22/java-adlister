import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/viewcolor")
public class ViewColorServlet extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            req.getRequestDispatcher("viewcolor.jsp").forward(req, resp);
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String pickedColor = req.getParameter("pickcolor");
        req.setAttribute("pickedcolor", pickedColor);
        System.out.println(pickedColor);

        req.getRequestDispatcher("/viewcolor.jsp").forward(req, resp);




    }
}
