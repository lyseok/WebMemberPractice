package member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.dao.MemberDaoImpl;
import member.service.IMemberService;
import member.service.MemberServiceImpl;
import member.vo.JavaMemberVO;

import java.io.IOException;
import java.util.List;

@WebServlet("/member/memberList.do")
public class MemberList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IMemberService service = MemberServiceImpl.getInstance(MemberDaoImpl.getInstance());
		List<JavaMemberVO> list = service.getAllMember();
		
		request.setAttribute("list", list);
		request
			.getRequestDispatcher("/WEB-INF/member/memberList.jsp")
			.forward(request, response);
	}

}
