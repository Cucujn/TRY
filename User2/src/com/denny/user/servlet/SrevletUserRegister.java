package com.denny.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.denny.user.dao.UserDao;
import com.denny.user.vo.Uservo;

/**
 * Servlet implementation class SrevletUserRegister
 */
@WebServlet("/SrevletUserRegister")
public class SrevletUserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrevletUserRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");//设置编码模式为utf-8
		String username = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		String userProvince = request.getParameter("userProvince");
		String userCity = request.getParameter("userCity");
		String userSex = request.getParameter("userSex");
		String userDescribe = request.getParameter("userDescribe");
		String userHobby[] = request.getParameterValues("userHobby");
		//前台得到 用户输入数据
		String str="";
		for(int i = 0;i<userHobby.length;i++) {
			str = str+userHobby[i];
			if(i != (userHobby.length-1)) {
				str += ",";
				//如果不为最后一个元素，用，隔开
			}
		}
		//for 循环拼接爱好数组中的数据
		Uservo user = new Uservo();
		user.setUsername(username);
		user.setUserPassword(userPassword);
		user.setUserProvince(userProvince);
		user.setUserHobby(str);
		user.setUserSex(userSex);
		user.setUserDescribe(userDescribe);
		//将前台得到的数据存入VO
		UserDao userdao = new UserDao();
		//实例化一个数据库操作对象
		userdao.insertUser(user);
        // 调用增加用户方法
        request.getRequestDispatcher("/userlogin.jsp").forward(request,
                response);
        // 转到登录页面
	}

}
