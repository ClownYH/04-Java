package main.java.com.ohgiraffers.section01.object.book;

public class Book {

    private int number;

    private String title;

    private String author;

    private int price;


    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) { // 참조자료형으로 Object를 받는다는 것은 모든 형태를 다 받겠다는 의미

        // Book 클래스는 하나의 자료형이다.
        // 그렇기 때문에 여기서 이야기를 하는 this는 Book 클래스를 통해 생성된 인스턴스를 의미한다.
        // 인스턴스의 this는 heap 에 할당된 주소 공간, 즉 인스턴스 자기 자신을 반환한다.
        if(this == obj){
            return true;
        }
        // obj가 null이라고 하는 것은 heap 생성되지 않았다는 것을 의미한다.
        // 혹은 생성이 되어도 null로 초기화되어 더 이상 참조하지 않는 상태이다.
        if(obj == null){
            return false;
        }
        // 전달받은 obj를 book으로 형변환한다.
        Book other = (Book) obj;

        if(this.number != other.number){
            return false;
        }

        if(this.title == null){
            if(other.title != null){
                return false;
            }
        }else if(!this.title.equals(other.title)){
            return false;
        }

        if(this.price != other.price){
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {

        int result = 1;

        final int PRIME = 31;

        result = PRIME + result + this.number;

        result = PRIME + result + this.title.hashCode();

        result = PRIME + result + this.price;

        return result;
    }




}
