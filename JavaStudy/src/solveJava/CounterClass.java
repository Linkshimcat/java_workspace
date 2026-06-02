package solveJava;

class Counter {
    int count;

    Counter() {
        this.count = count = 0; //0으로 기본값
    }

    void increment() {
        ++count;
    }

    void decrement() {
        if(count > 0) {
            --count;
        }
        else  {
            System.out.println("더 이상 감소할 수 없습니다.");
        }
    }

    void reset() {
        count = 0;
    }

     int getCount() {
        return count;
    }

}

public class CounterClass {
    public static void main(String[] args) {
        Counter a = new Counter();
        a.increment();
        a.increment();
        a.increment();
        a.increment();
        a.increment();
        a.decrement();
        a.decrement();
        System.out.println("현재 카운트: " + a.count);
        a.reset();
        System.out.println("리셋 후: " + a.count);
        a.decrement();
    }
}
