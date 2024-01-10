package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HuyLTM
 */
public class calServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

//        String f = request.getParameter("first");
//        String s = request.getParameter("second");
//        double fisrt = Double.parseDouble(f);
//        double second = Double.parseDouble(s);
//        
//        double result = 0;
//        String op = request.getParameter("ope");
//        String errorMessage = "";
//
//        if (second == 0 && op.equals("/")) {
//            errorMessage = "Error: Division by zero";
//        } else {
//            if (op.equals("+")) {
//                result = fisrt + second;
//            } else if (op.equals("-")) {
//                result = fisrt - second;
//            } else if (op.equals("*")) {
//                result = fisrt * second;
//            } else {
//                result = fisrt / second;
//            }
//        }
//
//        PrintWriter out = response.getWriter();
//
//        out.println("<html>");
//        out.println("<head><title>Calculator Result</title></head>");
//        out.println("<body>");
//        out.println("<h2>Calculator Result:</h2>");
//        out.println("<p>First Number: " + f + "</p>");
//        out.println("<p>Second Number: " + s + "</p>");
//        out.println("<p>Operator: " + op + "</p>");
//
//        if (!errorMessage.isEmpty()) {
//            out.println("<p style='color: red;'>" + errorMessage + "</p>");
//        } else {
//            out.println("<p>Result: " + result + "</p>");
//        }
//
//        out.println("</body>");
//        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
        int result = num1 + num2 ;
        request.setAttribute("cal_result", result); 
        request.getServletContext().getRequestDispatcher("/calculater.html").forward(request,response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
