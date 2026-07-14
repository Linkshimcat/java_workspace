package solveJava;

public class StudentArry {
    public static void main(String[] args) {
        Student5[] student = new Student5[4];
        student[0] = new Student5("홍길동", 75);
        student[1] = new Student5("김천재", 100);
        student[2] = new Student5("김재", 87);
        student[3] = new Student5("김천주", 99);

        // 일반 for문
        for (int i = 0; i < student.length; i++) {
            if (student[i].getScore()  >= 80) {
                System.out.println(student[i].getName());
            }
        }

        // 배열에 향상된 for문
        for (Student5 s : student) {
            if(s.getScore() >= 80) {
                System.out.println(s.getName());
            }
        }
    }

}
