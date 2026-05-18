class Car { // <- (인스턴스 화) class의 정의 방법 (필드의 상태)
    // 상태 -> "필드" (field)
    String brand; //제조사
    String model; //모델명
    int year; // 출시년도
    boolean engineRunning;

    //메서드 정의
    void drive(String destination) { //메서드 이름은 drive
        if(engineRunning) {
            System.out.println(destination + "으로 이동");
        }
        else {
            System.out.println("시동을 켜세요");
        }
        // return; //반환값이 없다면 return만 쓰기!
    }

    void startEngine() {
        engineRunning = true;
    }

    // Q) stopEnginedmf 정의하세요.
    void stopEngine() {
        engineRunning = false;
    }


    // "브랜드: Hyundai 모델명: 제네시스 연식: 2017"
    String getInfo() {
        return "브랜드: " + brand + "모델명: " + model + "연식: " + year;
    }

}

class Car2 {
    String brand;
    String model;
    int year;
}

public class ClassStudy {
    public static void main(String[] args) {

        Car car1 = new Car(); //new 키워드 사용하여 객체 생성 (여기서부터 행동)
//        System.out.println(car1.brand); null출력
//        System.out.println(car1.model); null 출력
//        System.out.println(car1.year); 0출력

        car1.brand = "Hyundai";
        car1.model = "제네시스";
        car1.year = 2017;
        car1.drive("서울");
        car1.startEngine();
        car1.drive("서울");
        car1.stopEngine();
        String info = car1.getInfo();
        System.out.println(info);
        car1.getInfo();




//        System.out.println(car1.brand);
//        System.out.println(car1.model);
//        System.out.println(car1.year);





    }
}
