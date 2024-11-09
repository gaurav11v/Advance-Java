package com.JDBC_PreparedStatement;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {

	public static void main(String[] args) throws Exception {

		//testAdd();
		//testDelete();
		//testUpdate();
		//testSearch();
	//testAuthenticate();
		
		  
		
		
		

	}

	private static void testAuthenticate()  throws Exception{
		UserModel model = new UserModel();
		
		UserBean bean = model.authenticate("ram123@gmail.com", "pass123");
		
		if (bean != null) {
			System.out.println(bean.getFirst_Name());
			System.out.println(bean.getLast_Name());
		} else {
			System.out.println("User not found");
		}
		
	}

	private static void testSearch() throws Exception {
		
		UserModel model = new UserModel();
		
		UserBean bean = new UserBean ();
		
		List list = model.search(bean);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			bean = (UserBean) it.next();
			
			System.out.println(bean.getId());
			System.out.println(bean.getFirst_Name());
			System.out.println(bean.getLast_Name());
			System.out.println(bean.getLoginId());
			System.out.println(bean.getPassword());
			System.out.println(bean.getAddress());
			System.out.println(bean.getDOB());
		}
	}

	private static void testUpdate () throws Exception{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		UserModel model = new UserModel();
		
		UserBean bean = new UserBean();
		
		bean.setId(1);
		bean.setFirst_Name("Taru");
		bean.setLast_Name("Sharma");
		bean.setLoginId("kamal@gmail.com");
		bean.setPassword("pass123");
		bean.setAddress("Bhopal");
		bean.setDOB(sdf.parse("2003-02-10"));
		
		model.update(bean);
	}

	private static void testDelete() throws Exception {
		 
		UserModel model = new UserModel();
		
		model.delete(4);
		
		
	}

	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModel model = new UserModel();

		UserBean bean = new UserBean();

		bean.setId(4);
		bean.setFirst_Name("Gv");
		bean.setLast_Name("verma");
		bean.setLoginId("gv@gmail.com");
		bean.setPassword("pass123");
		bean.setAddress("chittorgarh");
		bean.setDOB(sdf.parse("1995-01-22"));

		model.add(bean);

	}

}