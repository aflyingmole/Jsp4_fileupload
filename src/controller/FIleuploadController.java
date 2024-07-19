package controller;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
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

@WebServlet("/file/upload")
public class FIleuploadController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext application = getServletContext();
        String uploadPath = application.getRealPath("/upload"); //upload폴더의 실제 경로 얻어오기
        MultipartRequest mr = new MultipartRequest(
                req,
                uploadPath, //저장할 디렉토리
                1024 * 1024 * 5,  //업로드 할 최대 바이트수 크기
                "utf-8",
                new DefaultFileRenamePolicy()
        );

        String writer = mr.getParameter("writer");
        String title = mr.getParameter("title");
        String content = mr.getParameter("content");
        String orgFilename = mr.getOriginalFileName("file1");
        String saveFilename = mr.getFilesystemName("file1");
        File f = mr.getFile("file1");
        long filesize = f.length();
        Fileinfo vo = new Fileinfo(0, writer, title, content, orgFilename, saveFilename, filesize);

        FileinfoDao dao = new FileinfoDao();
        int n = dao.insert(vo);
        if (n > 0) {
            resp.sendRedirect(req.getContextPath() + "/main.jsp");
        } else {
            resp.sendRedirect(req.getContextPath() + "/error.jsp");
        }

    }
}
