import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/OutcomeServlet")
public class OutcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String outcome = request.getParameter("outcome");

        request.setAttribute("message", outcome.equals("win") ? "You Won!" : "You Lose!");
        request.getRequestDispatcher("outcome.jsp").forward(request, response);
    }
}
