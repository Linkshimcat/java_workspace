package Gammer;

public class ArrayDemo {
    public static void main(String[] args) {
        // # Array 배열
//        int[] arr1; //이게 정석
//        int arr2[]; // 이렇게 해도 됨. (C언어 스타일이긴 함)
//        int[] arr3 = new int[3]; //배열 생성하여 대입
//        // System.out.println(arr3[0]);
//        System.out.println(arr3.length);
//        System.out.println(arr3[arr3.length - 1]);
//
//        int[] nums1 = {10, 20, 30};
//        int[] nums2 = new int[] {10, 20, 30};
//        int[] nums3;
//        nums3 = new int[] {10, 20, 30};

//        int[] arr = {10, 20, 30, 40, 50};
//        System.out.println(arr[0]);
//        arr[0] = 100;
//        arr[4] = 500;
//        System.out.println(arr[arr.length -1]); // 마지막 {50}부분 인덱스 값 500 출력

//        int[] data = {1, 2, 3, 4, 5};
//        int sum = 0;
//        // data의 모든 값을 sum에 더하기 (for문 사용)
//        // 지시) data.length 사용, 인덱스 값을 i로 사용.
//
//        for (int i = 0; i<data.length; i++) {
//            sum += data[i];
//        }
//        System.out.println(sum);


//        int[] x = {1, 2, 3};
//        int[] y = x; // x의 참조(주소)를 y에 복사 -> 같은 배열 공유
//
//        y[0] = 999;
//        System.out.println(x[0]);

//        int[] x = {1, 2, 3};
//        int[] y = new int[3];
//        // y = x; <- Shallow copy
//
//        for(int i = 0; i<y.length; i++) {
//            y[i] = x[i];
//        }
//
//        y[0] = 999;
//        System.out.println(x[0]);
//        System.out.println(y[0]);


//        int[] nums = {10, 20, 30, 40, 50}; //#1
//        // 향상된 for문 (for-each ans)
//        for (int n : nums) {
//            System.out.println(n);
//
//        }
//
//        for (int i = 0; i<nums.length; i++) { //#1번과 결과는 같음.
//            System.out.println(nums[i]);
//        }
//
//        // 짝수 위치의 인덱스에 있는 요소만 출력 (20,40)
//        for(int i = 0; i<nums.length; i++) {
//            if ((i+1)%2 == 0) {
//                System.out.println(nums[i]); //20 , 40 위치 출력
//            }
//        }

//        // 1) 스캐너로 배열의 크기를 입력 받고
//        Scanner sc = new Scanner(System.in);
//        System.out.print("배열의 크기를 입력하세요: ");
//        int size = sc.nextInt();
//        // 2) 그 사이즈 만큼 배열을 만들어 주고
//        int[] numsarry = new int[size];
//
//        // 3) 배열의 크기만큼 숫자를 입력받게 해서 모두 채우고
//        for (int i = 0; i<numsarry.length; i++) {
//            System.out.print((i+1) + "번째 숫자 입력: ");
//            numsarry[i] = sc.nextInt();
//        }
//
//        // 4) 배열의 모든 내용을 출력 (가급적 for-each 사용)
//        for (int n : numsarry) {
//            System.out.println(n);
//        }
//
//
//
//        //배열의 크기는 절대. 변경할 수 없다.
//        int[] x = new int[5];
//        // x.length = 10 오류 뜸
//        x = new int[10]; //이건 원래 있던 new int[5]를 10으로 바꾸는 것이 아닌, 새로운 배열 10을 생성함.

        // 복습
//         double[] dArr = new double[3];
//         dArr[0] = 1.0;
//         System.out.println(dArr[0]);
//         System.out.println(dArr.length);
//         System.out.println(dArr.length-1);

//        String[] strs = new String[3]; // 참조형은 기본값이 null로 지정.
//        strs[0] = "Hello";
//        strs[1] = "World~";
//        strs[2] = "Mirim Meister High School";
//        System.out.println(strs[1]);


//        // # 2차원 배열
//        int[][] a;
//        a = new int[2][3];
//        // 1행
//        a[0][0] = 1; //1행 - 1열
//        a[0][1] = 2; //1행 - 2열
//        a[0][2] = 3; //1행 - 3열
//        System.out.println(a.length); // 행의 개수 => 2개
//        System.out.println(a[0].length); // 열의 개수 => 3
        // 2행
//        a[1][0] = 4;
//        a[1][1] = 5;
//        a[1][2] = 6;
//
//        // 행과 열 값 알아보기
//        System.out.println(a[0][0]);
//        System.out.println(a[0][1]);
//        System.out.println(a[0][2]);
//        System.out.println(a[1][0]);
//        System.out.println(a[1][1]);
//        System.out.println(a[1][2]);


        //# 반복문 돌면서 모든 요소 출력하기

//        for (int i = 0; i<a.length; i++) {
//            // 열 반복
//            for (int j = 0; j<a[0].length; j++) {
//                System.out.print(a[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        // 이중 반복문 사용
//        int[][] a;
//        a = new int[3][3];
//
//        for (int i = 0; i<a.length; i++) { //행 반복
//
//            // 열 반복
//            for (int j = 0; j<a[0].length; j++) { //열 반복
//                a[i][j] = (i*3  + j+1);
//                System.out.print(a[i][j] + "\t");
//            }
//
//            System.out.println();
//        }


//        // Q) 어떤 이차원 배열이 정사각 행렬(square matrix)인지 확인하는 코드
//        int[][] mat = new int[3][3]; // 정사각형 true
//        mat[0] = new int [3];
//        mat[1] = new int [2];
//        mat[2] = new int [1];


//
//        boolean issquare=true;
//
//        for(int i=0; i<mat.length; i++) {
//            if (mat.length != mat[i].length) {
//                issquare = false;
//                break;
//            }
//        }
//        System.out.println(issquare);


//        // 쉬운 버전) 조건문으로 검사 하나 끝
//        if (mat.length != mat[0].length) { // mat.length은 (행), mat[0].length은 (열)
//            issquare=false;
//        }
//        System.out.println(issquare); // true or false


        // jagged 열 확인문제
//        int[][] mat = new int[3][4];
//
//        boolean isjagged = true;
//        mat[0] = new int[3];
//        mat[1] = new int[2];
//        mat[2] = new int[1];
//
//        for(int i = 0; i < mat.length; i++) {
//            if (mat[0].length !=  mat[i].length) {
//                isjagged =  false;
//                break;
//
//            }
//        }
//        System.out.print(isjagged);


//        // 어떤 행렬이 단의 행렬(identity)인지를 확인하는 코드
//        int[][] mat = new int[3][3];
//        mat[0] = new int[]{1, 0, 0};
//        mat[1] = new int[]{0, 1, 0};
//        mat[2] = new int[]{1, 0, 1};
//        boolean isIdentity = true;
//
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if (i == j && mat[i][j] != 1) {
//                    // 주대각성분인데, 1이 아니면
//                    isIdentity = false;
//                    break;
//                }
//                // 주대각성분이 아닌데 0이 아니면,
//                else if (i != j && mat[i][j] != 0) {
//                    isIdentity = false;
//                    break;
//                }
//            }
//        }
//        System.out.print(isIdentity);
//
//
//    }
    }
}