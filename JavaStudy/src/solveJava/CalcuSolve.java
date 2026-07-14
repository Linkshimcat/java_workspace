package solveJava;

class Calculator {
     public static int sums(int... nums) {
         int result = 0;
         for (int num : nums) {
             result += num;
         }
         return result;
    }

    public static double average(int ... nums) {
         if (nums.length == 0) {
             return 0.0;
         }
         int total = 0;
         for (int n : nums) {
             total += n;
         }
         return (double) total / nums.length;
    }

}
