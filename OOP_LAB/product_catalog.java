import java.util.Scanner;
class Product{
    String productName;
    double price;
    int stock;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        System.out.print("Enter Stock Quantity: ");
        stock = sc.nextInt();
    }
    void display() {
        System.out.println("\nProduct Details");
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Stock : " + stock);
    }
    public static void main(String[] args) {
        Product p = new Product();
        p.getDetails();
        p.display();
    }
}