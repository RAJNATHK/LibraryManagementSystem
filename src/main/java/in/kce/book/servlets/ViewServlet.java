package in.kce.book.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import in.kce.bean.BookBean;
import in.kce.service.Administrator;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewBook")
public class ViewServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
    	String isbn = request.getParameter("isbn");

    	if (isbn != null) {
    	    isbn = isbn.trim();
    	}

    	Administrator admin = new Administrator();
    	BookBean book = admin.viewBook(isbn);


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (book == null) {
            out.println("<h2>No Book Found</h2>");
            return;
        }

        out.println("<h2>Book Details</h2>");
        out.println("ISBN: " + book.getIsbn() + "<br>");
        out.println("Title: " + book.getBookName() + "<br>");
        out.println("Type: " + book.getBookType() + "<br>");
        out.println("Author: " + book.getAuthor().getAuthorName() + "<br>");
        out.println("Contact: " + book.getAuthor().getContactNo() + "<br>");
        out.println("Cost: " + book.getCost());
    }
}
