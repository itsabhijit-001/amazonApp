package product;
public class Product{
    public int prodPrice;
    public int prodId;
    public String prodName;
    public String prodColor;
    public int prodQuant;
    public String prodBrand;
    public String prodCategory;
    public String timeTakenToShip;
    public int costOfShipment;
    public boolean isFragile;
    public boolean isAvailable;
    public int discountPercentage;
    public void availabilityOfDiscount(){
        System.out.println("On "+prodName+" you have selected there is a offer of "+discountPercentage+" % off.");
    }
    public void estimatedDeliveryTime(){
        System.out.println(prodName+" would takes about "+timeTakenToShip+" days.");
    }
    public void addToCart(){
        System.out.println(prodQuant+" "+prodName+" of "+prodBrand+" will be delivered in "+timeTakenToShip+" days.");
    }
    public void message(){
        System.out.println("we will provide you "+prodName);
    }
}