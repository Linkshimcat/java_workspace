//1211 이윤재
package proj1211.B;
import java.util.Scanner;

class Product {
    String division; //구분
    String producutName;
    int inventory; //재고량
    int unitPrice; //단가

    Product(String division, String producutName, int inventory, int unitPrice) {
        this.division = division;
        this.producutName = producutName;
        this.inventory = inventory;
        this.unitPrice = unitPrice;
    }

    String getProductInfo() {
        return division + "\t     " + producutName + "\t     " + inventory + "\t     " + unitPrice ;

    }

}

public class ProductTest_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] productData = new Product[5];
        for (int i = 0; i < productData.length; i++) {
            System.out.print("상품" + (i + 1) + " 구분: ");
            String division = sc.next();
            System.out.print("상품" + (i + 1) + " 상품명: ");
            String productName = sc.next();
            System.out.print("상품" + (i + 1) + " 재고량: ");
            int inventory = sc.nextInt();
            System.out.print("상품" + (i + 1) + " 단가: ");
            int unitPrice = sc.nextInt();
            // 새로운 인스턴스 생성
            productData[i] = new Product(division, productName, inventory, unitPrice);
        }

        int totalInventory = 0;
        System.out.println("----------------------------");
        System.out.println("구분 \t 상품명 \t  재고량 \t 단가");
        for (int i = 0; i < productData.length; i++) {
            System.out.println(productData[i].getProductInfo());
            totalInventory += productData[i].inventory;
        }
        System.out.println("----------------------------");
        System.out.println("상품의 총 재고량: " + totalInventory);
    }
}
