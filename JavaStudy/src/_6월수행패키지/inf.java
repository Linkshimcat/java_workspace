package _6월수행패키지;

class Empty {
    String name;
    int age = 17;

    Empty(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return this.age = age;
    }

    void setAge() {
        this.age = age;
    }

    void printl() {
        System.out.println("뭐죠");
    }

}

public class inf {
    public static void main(String[] args) {
        /*Empty ax = new Empty("이윤재", 17);
        System.out.println(ax.name + " " + ax.age + "살");
        ax.printl();*/

        String[] arry = new String[4];
        arry[0] = "A1";
        arry[1] = "A2";
        arry[2] = "A3";
        arry[3] = "A4";

        for (String s : arry) {
            System.out.print(s + "\t");
        }


    }
}
