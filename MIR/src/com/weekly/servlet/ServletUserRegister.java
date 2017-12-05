package com.weekly.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weekly.dao.UserDao;
import com.weekly.user.vo.UserRegister;

/**
 * Servlet implementation class ServletUserRegister
 */
@WebServlet("/ServletUserRegister")
public class ServletUserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUserRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//���ñ����ʽ
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		//ǰ̨�õ��û���������
		String chineseName = request.getParameter("chineseName");
		String userPassword = request.getParameter("userPassword");
		String userId = request.getParameter("userId");
		//ʵ����һ��VO����
		UserRegister user = new UserRegister();
		//��ǰ̨�õ������ݴ���VO
		user.setChineseName(chineseName);
		user.setUserId(userId);
		user.setUserPassword(userPassword);
		//ʵ����һ�����ݿ��������
		UserDao userdao = new UserDao();
		//���������û�����
		userdao.insertUser(user);
		//ת����¼����
		request.getRequestDispatcher("/userlogin.jsp").forward(request, response);
		
	}

}
