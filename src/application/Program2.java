package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======= Test 1: Insert Department========");
		Department newDep = new Department(null,"Human Resources");
		departmentDao.insert(newDep);
		System.out.println("Insert completed - Id: "+ newDep.getId() +" | Name: "+newDep.getName());
		

	}

}
