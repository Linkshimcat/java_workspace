package Gammer;

public class TypeCastDemo {
    public static void main(String[] args) {
        byte bValue = 100;
        // 더 작은 자료형(byte)에서 큰 자료형(Short)으로 형 변환이 일어나니, 부작용이 없어서
        // 자동 형 변환이 일어남
        short sValue = bValue;
        int iValue = bValue;
        // 소괄호에다가 변환할 타입을 써서 변환하는 것을 "강제 형 변환"이라고 함.
        // 앞에서 변수 명을 선언했기 때문에 앞에 예약어를 사용하지 않아도 됨.
        sValue = (short) bValue;
        iValue = (int) bValue;


        int iValue2 = 100;
        byte bb = (byte) iValue2; //강제 형 변환 시킬려면 bb앞에서 (byte)라고 적어주면 됨, 그리고 byte의 범위는 -128~127
        short ss = (short) iValue2;
        System.out.println(bb);
        System.out.println(ss);

        iValue2 = 387;
        bb = (byte) iValue2;
        ss = (short) iValue2;
        System.out.println(bb);
        System.out.println(ss);

        //float fValue = iValue2;

        float fValue1 = 3.14f;
        double dValue1 = 3.14; //double이 가장 많이 사용하기 때문에 3.14;써도 오류가 안남. (단,float은 실수뒤에 접미사f를 붙어야 함.)
        int iValue3 =  (int) fValue1;
        iValue3 = (int) dValue1;
        System.out.println(iValue3); //출력은 3


    }
}
