package solveJava;

class MyGrade {
    int score;

    MyGrade(int score) {
        this.score = score;
    }

    String getGrade() {
        switch(score / 10) {
            case 10, 9: return "A";
            case 8 : return "B";
            case 7 : return "C";
            case 6 : return "D";
            default : return "F";
        }
    }


}

public class ArrayGrade {
    public static void main(String[] args) {
        int[] scores = new int[]{95, 83, 71, 60, 45};
        for (int s : scores) { //향상된 for문
            MyGrade grade = new MyGrade(s);
            System.out.println(grade.score + "점: " + grade.getGrade());
        }
    }
}
