import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;


public class JDBCEmployees {

    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new Driver());

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );


        Statement stmt = conn.createStatement();


        String query = "SELECT * FROM albums";

        ResultSet rs = stmt.executeQuery( "SELECT first_name FROM employees LIMIT 10");

        while (rs.next()) {
            System.out.println(rs.getString(1));


        }
    }
}
