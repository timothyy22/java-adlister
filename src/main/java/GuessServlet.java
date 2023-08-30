import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("guess.jsp").forward(req, resp);
    }


@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        int userGuess = Integer.parseInt(request.getParameter("guess"));
        if (userGuess == randomNumber) {
            response.sendRedirect("correct");
        }else {
            response.sendRedirect("incorrect");
        }

//        response.sendRedirect("OutcomeServlet?outcome=" + outcome);
    }
}
