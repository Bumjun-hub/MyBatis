package com.mybatis.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mybatis.member.service.MemberServiceImpl;
import com.mybatis.member.vo.Member;

@WebServlet("/insert.me")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			Member m = new Member();
			m.setUserId(request.getParameter("userId"));
			m.setUserName(request.getParameter("userPwd"));
			m.setUserName(request.getParameter("userName"));
			
			m.setEmail(request.getParameter("email"));
			m.setBirthday(request.getParameter("birthday"));
			m.setGender(request.getParameter("gender"));
			m.setPhone(request.getParameter("phone"));
			
			int result = new MemberServiceImpl().insertMember(m);
			
			if(result>0) {
				response.sendRedirect(request.getContextPath());
			} else {
				request.setAttribute("errorMsg", "회원가입 실패");
				request.getRequestDispatcher("WEB-INF-views-common-errorPAge.jsp").forward(request,  response);
			}
	}

}
