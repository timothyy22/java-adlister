package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
        import com.codeup.adlister.models.User;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    private Users usersDao;

    public void init() {
        // Initialize the usersDao (You can use DaoFactory or dependency injection here)
        usersDao = DaoFactory.getUsersDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve user registration data from the form
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Validate user input (e.g., check for duplicate usernames, strong password policy, etc.)
        boolean invalidInputs = username.isEmpty() ||
                                email.isEmpty() ||
                                password.isEmpty();

        if(invalidInputs) {
            response.sendRedirect(("register?invalid=true"));
            return;
        }
        // Create a new User object with the provided data
        User newUser = new User(username, email, password);

        // Insert the user into the database
        usersDao.insert(newUser);

        // Redirect the user to a login page or another appropriate page
        response.sendRedirect("/login"); // You may change the URL as needed
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward the user to the registration form
        boolean invalid = Boolean.parseBoolean(request.getParameter("invalid"));
        request.setAttribute("invalid", invalid);
        request.getRequestDispatcher("/WEB-INF/ads/register.jsp").forward(request, response);
    }
}
