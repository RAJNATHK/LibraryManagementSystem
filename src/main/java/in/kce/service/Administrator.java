package in.kce.service;

import in.kce.bean.BookBean;
import in.kce.dao.BookDAO;

public class Administrator {

    public String addBook(BookBean bookBean) {

        if (bookBean == null ||
                bookBean.getIsbn() == null ||
                bookBean.getBookName() == null ||
                bookBean.getAuthor() == null ||
                bookBean.getCost() <= 0) {

            return "Invalid";
        }

        BookDAO dao = new BookDAO();
        return dao.createBook(bookBean) == 1 ? "Success" : "Failure";
    }

    public BookBean viewBook(String isbn) {

        if (isbn == null || isbn.isEmpty()) {
            return null;
        }

        BookDAO dao = new BookDAO();
        return dao.fetchBook(isbn);
    }
}