// package test;
import customer.Customer;
import product.*;
// import product.category.Category;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello1");
        Customer c1=new Customer();
        c1.custId=1170;
        c1.custName="Abhijit";
        c1.type="Prime";
        c1.login();
        System.out.println("Hello");

    }
}
