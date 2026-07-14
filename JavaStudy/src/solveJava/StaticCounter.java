package solveJava;

class Dog {
    private static int totalCount = 0;
    private String name;

    public Dog(String name) {
        this.name = name;
        totalCount++;
    }

    public String getName() {
        return name;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}

public class StaticCounter {
    public static void main(String[] args) {
        System.out.println("현재 강아지 수: " + Dog.getTotalCount());
        Dog d1 = new Dog("뽀미");
        Dog d2 = new Dog("코코");
        Dog d3 = new Dog("초코");
        System.out.println("현재 강아지 수: " + Dog.getTotalCount());
        System.out.println(d1.getName() + " / " + d2.getName() + " / " + d3.getName());
    }
}
