package main.java.com.ohgiraffers.section08.initblok;

public class Application {

    public static void main(String[] args){
        Product product = new Product();
        System.out.println(product);

        System.out.println("Product 2");
        Product product1 = new Product();
        System.out.println(product1);

        System.out.println(Product.getBrand());
    }
}
