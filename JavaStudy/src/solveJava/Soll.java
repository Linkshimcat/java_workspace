package solveJava;

class MyBook {
    String title;
    String author;
    int price;

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
        if (price >= 0) {
            this.price = price;
        }
        else {
            System.out.println("에러 입니다.");
        }
    }

    String getInfo() {
        return "제목: " + title + ", 저자: " + author + ", 가격: " + price + "원";
    }
}

public class Soll {
    public static void main(String[] args) {
        MyBook b = new MyBook();
        System.out.println(b.getInfo());
    }
}
