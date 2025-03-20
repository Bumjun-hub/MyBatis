package com.mybatis.member.controller;

import java.io.IOException;

import com.mybatis.member.service.MemberServiceImpl;
import com.mybatis.member.vo.Member;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login.me")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Member m = new Member();
		String id = request.getParameter("userId");
		String pwd = request.getParameter("userPwd");

		m.setUserId(id);
		m.setUserPwd(pwd);

		// Member ServiceImpl mi = new MemberServiceImpl();
		Member loginUser = new MemberServiceImpl().loginMember(m);

		if (loginUser != null) {
			request.getSession().setAttribute("loginUser", loginUser);
			response.sendRedirect(request.getContextPath());
		}

	}

}
