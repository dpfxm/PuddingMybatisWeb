package com.kh.member.controller;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.vo.Member;
import com.kh.member.service.MemberService;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/member/register.do")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// URL로 회원가입 페이지 이동시 사용, WEB-INF 폴더 내 자원들은 직접접근이 불가능
		// -> RequestDispathcer 객체를 이용해서 페이지 이동(변수 없이 메소드 채이닝 방식)
		request.getRequestDispatcher("/WEB-INF/views/member/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 회원가입 페이지에서 가입하기 버튼 누르면 동작, 한글 깨지지 않게
		request.setCharacterEncoding("UTF-8");
		/*
		 * 회원가입은 페이지에서 입력한 값을 서버로 전달받아 Mybatis를 이용하여 수행할 것!
		 * 입력받은 값을 서버에 저장 하기 위해서는 Member VO 클래스가 완성되어 있어야 함
		 * 만들어진 쿼리스트링을 request 객체의 getParameter() 메소드를 이용해서 가져오고
		 * getParameter() 메소드의 전닯값을 register.jsp에서 input태그의 name 속성값
		 */
		String memberId = request.getParameter("member-id");
		String memberPw = request.getParameter("member-pw");
		String memberName = request.getParameter("member-name");
		String memberAge = request.getParameter("member-age");
		String memberGender = request.getParameter("member-gender");
		String memberEmail = request.getParameter("member-email");
		String memberPhone = request.getParameter("member-phone");
		String memberAddress = request.getParameter("member-address");
		String memberHobby = request.getParameter("member-hobby");
		Member member = new Member(memberId, memberPw, memberName, Integer.parseInt(memberAge), memberGender,
				memberEmail, memberPhone, memberAddress, memberHobby);
		MemberService mService = new MemberService();
		int result = mService.insertMember(member);
		if (result > 0) {
			response.sendRedirect("/");
		} else {
			request.setAttribute("msg", "Service Failed");
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage").forward(request, response);
		}
	}
	
}
