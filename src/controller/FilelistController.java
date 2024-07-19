package controller;

import test.dao.FileinfoDao;
import test.dto.Fileinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/file/list")
public class FilelistController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileinfoDao dao = new FileinfoDao();
        ArrayList<Fileinfo> list = dao.selectAll();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/list.jsp").forward(req, resp);

    }





}
