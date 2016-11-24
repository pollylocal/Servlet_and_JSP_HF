import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Ch1Servlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter printWriter = resp.getWriter();
        Date today = new Date();
        printWriter.println(
                "<html>\n" + "<body>\n" + "<h1 align=\"center\">\n" + "    HF's Chapter1 Servlet\n" + "</h1>\n"
                        + "<br>\n" + today + "</body>\n" + "</html>");
    }
}
