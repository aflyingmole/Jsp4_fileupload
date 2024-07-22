package controller;

import test.dao.FileinfoDao;
import test.dto.Fileinfo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/file/delete")
public class FiledeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileinfoDao dao = new FileinfoDao();

        int num = Integer.parseInt(req.getParameter("filenum"));
        Fileinfo select = dao.select(num);
        String orgfilename = select.getOrgfilename();
        dao.delete(num);
        ServletContext application = getServletContext();
        String uploadPath = application.getRealPath("/upload"); //upload폴더의 실제 경로 얻어오기

        File deletefile = new File(uploadPath + "/" + orgfilename);
        deletefile.delete();

        resp.sendRedirect("/main.jsp");


    }
}
