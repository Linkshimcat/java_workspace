class MyRectangle {
    int width;
    int height;
}

public class Test3 {
    public static void main(String[] args) {
        MyRectangle result = new MyRectangle();
        result.width = 10;
        result.height = 5;

        System.out.println("넓이: "+(result.height)*(result.width));
    }
}
