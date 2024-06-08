package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.of(1990, 5,22), 3000.0, obj);

        System.out.println(seller);
        System.out.println(obj);
    }
}
