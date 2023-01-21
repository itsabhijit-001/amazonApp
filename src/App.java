// package test;
import customer.Customer;
import product.*;
// import product.category.Category;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Customer c1=new Customer();
        Customer c2=new Customer();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter customer Id: ");
        c1.custId=scn.nextInt();
        System.out.println("Enter customer Name: ");
        c1.custName=scn.nextLine();
        System.out.println("Enter customer Type: ");
        c1.type=scn.nextLine();
        System.out.println("Enter customer Phone number : ");
        c1.phoneNumber=scn.nextLong();
        System.out.println("Enter customer email id : ");
        c1.emailId=scn.nextLine();
        System.out.println("Enter customer location : ");
        c1.location=scn.nextLine();
        System.out.println("Enter customer marital status : ");
        c1.maritalStatus=scn.nextLine();
        System.out.println("Enter customer gender : ");
        c1.gender=scn.nextLine();
        
        // Second object
        System.out.println("Enter customer Id: ");
        c2.custId=scn.nextInt();
        System.out.println("Enter customer Name: ");
        c2.custName=scn.nextLine();
        System.out.println("Enter customer Type: ");
        c2.type=scn.nextLine();
        System.out.println("Enter customer Phone number : ");
        c2.phoneNumber=scn.nextLong();
        System.out.println("Enter customer email id : ");
        c2.emailId=scn.nextLine();
        System.out.println("Enter customer location : ");
        c2.location=scn.nextLine();
        System.out.println("Enter customer marital status : ");
        c2.maritalStatus=scn.nextLine();
        System.out.println("Enter customer gender : ");
        c2.gender=scn.nextLine();

        // Methods of customer class
        //  First object
        c1.login();
        c1.logOut();
        long phoneNo=scn.nextLong();

        c1.changePhoneNumber(phoneNo);
        String email=scn.nextLine();
        c1.changeEmail(email);
        //  second object
        
        c2.login();
        c2.logOut();
        long phoneNo2=scn.nextLong();

        c2.changePhoneNumber(phoneNo2);
        String email2=scn.nextLine();
        c2.changeEmail(email2);

        Product p1=new Product();
               
        System.out.println("Enter product Id: ");
        p1.prodId=scn.nextInt();
        System.out.println("Enter product Name: ");
        p1.prodName=scn.nextLine();
        System.out.println("Enter product price: ");
        p1.prodPrice=scn.nextInt();
        System.out.println("Enter product color : ");
        p1.prodQuant=scn.nextInt();
        System.out.println("Enter product brand : ");
        p1.prodBrand=scn.nextLine();
        System.out.println("Enter product category : ");
        p1.prodCategory=scn.nextLine();
        System.out.println("Enter customer marital status : ");
        p1.timeTakenToShip=scn.nextLine();
        System.out.println("Enter cost of shipment : ");
        p1.costOfShipment=scn.nextInt();

        System.out.println("Enter if product is in stock?  : ");
        p1.isAvailable=scn.nextBoolean();
        System.out.println("Enter discount percentage : ");
        p1.discountPercentage=scn.nextInt();

        
        Product p2=new Product();
               
        System.out.println("Enter product Id: ");
        p2.prodId=scn.nextInt();
        System.out.println("Enter product Name: ");
        p2.prodName=scn.nextLine();
        System.out.println("Enter product price: ");
        p2.prodPrice=scn.nextInt();
        System.out.println("Enter product color : ");
        p2.prodQuant=scn.nextInt();
        System.out.println("Enter product brand : ");
        p2.prodBrand=scn.nextLine();
        System.out.println("Enter product category : ");
        p2.prodCategory=scn.nextLine();
        System.out.println("Enter customer marital status : ");
        p2.timeTakenToShip=scn.nextLine();
        System.out.println("Enter cost of shipment : ");
        p2.costOfShipment=scn.nextInt();

        System.out.println("Enter if product is in stock?  : ");
        p2.isAvailable=scn.nextBoolean();
        System.out.println("Enter discount percentage : ");
        p2.discountPercentage=scn.nextInt();
        
//  Methods of product class

//   First object
        p1.availabilityOfDiscount();
        p1.estimatedDeliveryTime();
        p1.addToCart();
        p1.message();

        
        //  second object
        p2.availabilityOfDiscount();
        p2.estimatedDeliveryTime();
        p2.addToCart();
        p2.message();



    }
}
