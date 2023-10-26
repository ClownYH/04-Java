package main.java.com.ohgiraffers.section08.initblok;

public class Product {

    private String name = "사이언";
    private int price;
    private static String brand;

    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 100000;
        brand = "사과"; // "사과"가 출력되는 이유는 static 영역에서 초기화된 "드래곤볼"을 인스턴스 생성 후 다시 초기화시키기 때문이다.

    }


    // static 블럭 -> 미리 준비되어 있던 것이기 때문에 인스턴스 초기화 블럭보다 먼저 적용된 후 인스턴스가 나중에 적용된다.
    static {
//        name = "손오공";
//        price = 10000;
        brand = "드래곤볼";
    }

    public Product(){

    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Product.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                Product.brand +
                '}';
    }
}
