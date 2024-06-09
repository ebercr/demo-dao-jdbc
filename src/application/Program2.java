package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        ;

        System.out.println("=== TEST 1: Department findById =======");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: Department findAll =======");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: Department insert =======");
        Department newDepartment = new Department(null, "Decorations");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        sc.close();
    }
}
