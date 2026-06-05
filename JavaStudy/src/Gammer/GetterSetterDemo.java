package Gammer;

class CarwithGetterSetter {
//    필드 3개
    String brand;
    String model;
    int year;

//    게터 메서드
//    get + 필드이름(맨 앞글자를 대문자)
//    예시: getYear , getBrand
//    게터 메서드는 매개변수가 없음

    //  brand
    String getBrand() {

        return brand;
    }
    //  model
    String getModel() {

        return model;
    }
    //    year
    int getYear() {

        return year;
    }

    //    세터 메서드는 그 필드값을 대입해서 값을 부여하는 메서드
    void setBrand(String b) {
        brand = b;
    }
    //    세터 setModel
    void setModel(String c) {

        model = c;
    }
    //    세터 setModel
    void setYear(int d) {

        year = d;
    }

}

public class GetterSetterDemo {
    public static void main(String[] args) {
        CarwithGetterSetter o2 = new CarwithGetterSetter();
        o2.setBrand("현대 자동차");
        System.out.println((o2.getBrand()));

    }
}
