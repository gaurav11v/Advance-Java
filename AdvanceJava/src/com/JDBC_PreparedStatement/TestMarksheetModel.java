package com.JDBC_PreparedStatement;

public class TestMarksheetModel {

	public static void main(String[] args) throws Exception {
		
		
		testAdd();
		//testUpdate();
		//testDelete();
		//testFindByRollNo();
		
		
		
	}

	private static void testFindByRollNo() throws Exception {
		
		MarksheetModel model = new MarksheetModel();
		
		MarksheetBean bean = new MarksheetBean();
		
		bean = model.findByRollNo(107);
		
		if (bean != null) {
			
			System.out.println(bean.getId());
			System.out.println(bean.getRollno());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
		
		} else {
			System.out.println("Student not found");
			
		}
	}

	private static void testDelete() throws Exception {
	
	MarksheetModel model = new MarksheetModel();
	
	model.delete(11);
	
	}

	private static void testUpdate() throws Exception {
		
		MarksheetModel model = new  MarksheetModel();
		
		MarksheetBean bean = new MarksheetBean();
		
		bean.setId(11);
		bean.setRollno(111);
		bean.setName("Sam");
		bean.setPhysics(65);
		bean.setChemistry(85);
		bean.setMaths(75);
		
		model.update(bean);
		
	}

	private static void testAdd() throws Exception {
		
		MarksheetBean bean = new MarksheetBean();
		
		MarksheetModel model = new MarksheetModel();
		
		//bean.setId(id);
		bean.setRollno(111);
		bean.setName("Shashi");
		bean.setPhysics(54);
		bean.setChemistry(84);
		bean.setMaths(89);
		
		model.add(bean);
		
		
		
	}
}
