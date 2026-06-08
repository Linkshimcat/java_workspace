package Grammer;

class CarWithConstructor {
    String brand;
    String model;
    int year;

    //생성자가 없더라도 자바 컴파일러가 자동으로 기본 생성자를 생성해줌
    // 만약 매게변수가 있는 생성자를 하나라도 만들면, 자바 컴파일러는 기본 생성자를 만들지 않음.
    // 생성자를 내가 직접 "하나"라도 정의하면 컴파일러가 "기본 생성자"를 만들지 않음.

    CarWithConstructor() { //기본 생성자
        brand = "모름"; //디폴트 값
        model = "모름";
        year = -1;
        this("모름", "모름", -1);
    }
    CarWithConstructor(String brand, String model, int year) { //매게변수가 있는 생성자
            this.brand = brand;
            this.model = model;
            this.year = year;
    }
}

public class Overloding {
    public static void main(String[] args) {
        CarWithConstructor c1 = new CarWithConstructor(); //new 생성자 (매게변수 없는 기본 생성자)
        System.out.println(c1.brand); //"모름" 출력
        CarWithConstructor c2 = new CarWithConstructor("현대", "제네시스", 2019); //(매게변수가 있는 생성자)
        System.out.println(c2.model); //"현대" 출력

    }

}
