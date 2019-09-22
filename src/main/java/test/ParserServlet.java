package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/parser")
public class ParserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Respond reversed json.

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HashMapReverser reverser = new HashMapReverser();

        resp.setContentType("application/json");

        String input = Util.readStream(req.getInputStream());
        String returnString = reverser.reverse(input);

        resp.getWriter().println(returnString);

    }



}
