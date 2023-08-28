import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class CountServlet  extends HttpServlet {
    public static int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String reset = req.getParameter("reset");
        if (reset != null) {
            count = 0;
            res.getWriter().println("<h1>" + count + "</h1>");
        } else{
            res.getWriter().println("<h1>" + count + "</h1>");
            count++;
        }


    }
}
