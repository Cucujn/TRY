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
		response.setCharacterEncoding("utf-8");//���ñ���ģʽΪutf-8
		String username = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		String userProvince = request.getParameter("userProvince");
		String userCity = request.getParameter("userCity");
		String userSex = request.getParameter("userSex");
		String userDescribe = request.getParameter("userDescribe");
		String userHobby[] = request.getParameterValues("userHobby");
		//ǰ̨�õ� �û���������
		String str="";
		for(int i = 0;i<userHobby.length;i++) {
			str = str+userHobby[i];
			if(i != (userHobby.length-1)) {
				str += ",";
				//�����Ϊ���һ��Ԫ�أ��ã�����
			}
		}
		//for ѭ��ƴ�Ӱ��������е�����
		Uservo user = new Uservo();
		user.setUsername(username);
		user.setUserPassword(userPassword);
		user.setUserProvince(userProvince);
		user.setUserHobby(str);
		user.setUserSex(userSex);
		user.setUserDescribe(userDescribe);
		//��ǰ̨�õ������ݴ���VO
		UserDao userdao = new UserDao();
		//ʵ����һ�����ݿ��������
		userdao.insertUser(user);
        // ���������û�����
        request.getRequestDispatcher("/userlogin.jsp").forward(request,
                response);
        // ת����¼ҳ��
	}

}
