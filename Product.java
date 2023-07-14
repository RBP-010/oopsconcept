package oopsdemo;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
    class ShoppingCart{
        private List<Product> items;
        public ShoppingCart(){
            this.items = new ArrayList<>();
        }
        public void  addItem(Product product){
            items.add(product);
        }
        public void removeItem(Product product){
            items.remove(product);
        }
        public void viewCart(){
            if (items.isEmpty()){
                System.out.println("Shopping item is empty");
            }else{
                for (Product item :items){
                    System.out.println(item.getName());
                }
            }
        }
         public double getTotal(){
            double total = 0.0;
            for (Product item:items){
                total = total+item.getPrice();
            }
            return total;
         }
         public void placeOrder(){
            if (items.isEmpty()){
                System.out.println("shopping item is empty");
            }else {
                double total = getTotal();
                System.out.println("Total amount is:"+total);
                System.out.println("Your order placed successfully");
            }
         }
         public void ClearCart(){
            items.clear();
             System.out.println("Your shopping items is cleared");
         }

        public static void main(String[] args) {
            Product p1 = new Product("Shirt",299.0);
            Product p2 = new Product("Tshirt",589.0);
            Product p3 = new Product("Jeans",999.0);
            ShoppingCart cart = new ShoppingCart();
            cart.addItem(p1);
            cart.addItem(p2);
            cart.addItem(p3);
            cart.viewCart();
            cart.placeOrder();
            cart.ClearCart();
            cart.viewCart();
        }
    }


