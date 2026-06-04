package solveJava;

class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

}

class VendingMachine {
//  필드 2개
    Item[] items = new Item[5]; //Item의 5개 배열 만듦
    int balance = 0;

//  매서드 시작
    void addItem(int solt, Item item) {
        items[solt] = item;
    }

    void insertMoney(int amount) {
        balance =+ amount;
    }

    void buy(int slot) {
        if(items[slot] == null) {
            System.out.println("상품이 없습니다.");
        }
        else {
            int ProductPrice = items[slot].price;
            String ProductName = items[slot].name;

            if(ProductPrice > balance) {
                System.out.println("잔액이 부족합니다. (잔액: "
                + balance + "원, 가격"
                + ProductPrice + "원)");
            } else {
                balance -= ProductPrice;
                System.out.println(ProductName + " 구매 완료. 잔액: " + balance + "원");
            }
        }
    }


}

public class Vending {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        Item cola = new Item("콜라", 500);
        vm.addItem(0, cola);
        vm.addItem(4, new Item("사이다", 400));
        vm.buy(0);
        vm.buy(4);
        vm.buy(2);
        vm.insertMoney(600);
        vm.buy(0); //콜라 사기 가능
        vm.buy(4); // 돈이 모자름(100원 밖에 없어서 못 삼)
    }
}
