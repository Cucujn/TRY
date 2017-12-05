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
		//设置编码格式
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		//前台得到用户输入数据
		String chineseName = request.getParameter("chineseName");
		String userPassword = request.getParameter("userPassword");
		String userId = request.getParameter("userId");
		//实例化一个VO对象
		UserRegister user = new UserRegister();
		//将前台得到的数据存入VO
		user.setChineseName(chineseName);
		user.setUserId(userId);
		user.setUserPassword(userPassword);
		//实例化一个数据库操作对象
		UserDao userdao = new UserDao();
		//调用增加用户方法
		userdao.insertUser(user);
		//转到登录界面
		request.getRequestDispatcher("/userlogin.jsp").forward(request, response);
		
	}

}
