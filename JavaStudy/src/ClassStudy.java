class BankAccount {
    String owner; //owner 필드
    int balance; //balance 필드

//    -------------------------------------------

    void printInfo() {
        System.out.println(owner + ": " + balance + "원");
    }

    String getSummary() {
        return "[" + owner + "] 잔액: " + balance + "원";
    }

    // 입금
    // 내가 입근한 금액 그대로 반환하게 구현
    int deposit(int amount) { //입금 메서드
        balance += amount;
        return amount;

    }

    boolean withdraw(int amount) {
        if (amount > balance) {
//            *잔액 부족 (인출 희망 금액: )
            System.out.println("잔액 부족 (인출 희망 금액 :" + amount + ", 남은 잔액: " + balance + ")");
            return false;
        }

        // "출금되었습니다.
        System.out.println("출금되었습니다. (출금 금액 :" + amount + ", 남은 잔액: " + (balance) + ")");
        balance -= amount;
        return true;
        }

    }



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

//        BankAccount account = new BankAccount(); //BankAccount의 인스턴스
//        account.owner = "김미림";
//        account.withdraw(1000);
//        account.deposit(10000);
//
//        boolean b1 = account.withdraw(6000); //true 1만원 -> 6000원 빼면 4000원 남음.
//        boolean b2 = account.withdraw(5000); //false 아까 4000원 남았는데 5000원을 뺄수 없기에 flase.

//        SolveBankAccount acc1 = new SolveBankAccount();
//        acc1.owner = "홍길동";
//        acc1.balance = 10000;
//
//        SolveBankAccount acc2 = new SolveBankAccount();
//        acc2.owner = "김철수";
//        acc2.balance = 50000;
//
//        System.out.println(acc1.getSummary());
//        System.out.println(acc2.getSummary());


//        Car car1 = new Car(); //new 키워드 사용하여 객체 생성 (여기서부터 행동)
//        System.out.println(car1.brand); null출력
//        System.out.println(car1.model); null 출력
//        System.out.println(car1.year); 0출력


        /*
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
         */


//        System.out.println(car1.brand);
//        System.out.println(car1.model);
//        System.out.println(car1.year);





    }
}
