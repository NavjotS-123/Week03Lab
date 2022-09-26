/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author navjo
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String firstNumber = request.getParameter("firstNum");
                String secondNumber = request.getParameter("secondNum");
                
                request.setAttribute("result", "Apple");
              
            try{
                    int firstNum = Integer.parseInt(firstNumber);
                    int secondNum = Integer.parseInt(secondNumber);
                    if (request.getParameter("plus")!= null) {
                        request.setAttribute("result", firstNum + secondNum);
                    }
                    else if(request.getParameter("subtract")!= null){
                         request.setAttribute("result", firstNum - secondNum);
                    }


                }
                catch(Exception e){
                    request.setAttribute("result", "Result: Invalid");
                    getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                    return;
                }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
}
