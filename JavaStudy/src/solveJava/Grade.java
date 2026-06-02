package solveJava;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    int getScore() {
        return this.score = score;
    }


}

public class Grade {
    public static void main(String[] args) {

        Student[] students = {
                new Student("홍길동", 80),
                new Student("김철수", 95),
                new Student("이영희", 70),
                new Student("박민준", 88),
                new Student("최수연", 92),
        };

        int maxIndex = 0;
        int maxScore = -1;

        for (int i = 0; i< students.length; i++) {
            if(students[i].score > maxScore) {
                maxScore = students[i].getScore();
                maxIndex = i;
            }
        }

        System.out.println("최고 점수: " + students[maxIndex].name + "(" + students[maxIndex].score + "점)");


    }

}
