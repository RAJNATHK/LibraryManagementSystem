package in.kce.book.servlets;

import java.io.IOException;

import in.kce.bean.AuthorBean;
import in.kce.bean.BookBean;
import in.kce.service.Administrator;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addBook")
public class MainServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        BookBean book = new BookBean();
        AuthorBean author = new AuthorBean();

        book.setIsbn(request.getParameter("isbn"));
        book.setBookName(request.getParameter("bookName"));
        book.setBookType(request.getParameter("bookType").charAt(0));
        book.setCost(Float.parseFloat(request.getParameter("cost")));

        author.setAuthorName(request.getParameter("author"));
        book.setAuthor(author);

        Administrator admin = new Administrator();
        String result = admin.addBook(book);

        if (result.equals("Success"))
            response.sendRedirect("Menu.html");
        else if (result.equals("Invalid"))
            response.sendRedirect("Invalid.html");
        else
            response.sendRedirect("Failure.html");
    }
}