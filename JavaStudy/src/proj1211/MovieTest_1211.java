//1211 이윤재
package proj1211;
import java.util.Scanner;

class Movie {
    String movieTitle;
    String director;
    int movieTime;

    // 매게변수가 있는 생성자로 (괄호 안) 입력
    Movie(String movieTitle, String director, int movieTime) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.movieTime = movieTime;
    }

    String getMovieInfo() {
        return movieTitle + "\t     " + director + "\t      " + movieTime;
    }

}

public class MovieTest_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 중복되는 개체가 많으니 클래스 배열 사용
        Movie[] movies = new Movie[5];

        // 반복문으로
        for (int i = 0; i < movies.length; i++) {
            System.out.print("영화" + (i + 1) + " 제목: ");
            String inputTitle = sc.next();
            System.out.print("영화" + (i + 1) + " 감독명: ");
            String inputDirector = sc.next();
            System.out.print("영화" + (i + 1) + " 상영시간(분): ");
            int inputTime = sc.nextInt();
            // 인스턴스 객체 새로 생성
            movies[i] = new Movie(inputTitle, inputDirector, inputTime);
        }

        System.out.println("------------------------");
        System.out.println("영화제목 \t 감독명  \t  상영시간");

        int totalTime = 0;
        for (int i = 0; i < movies.length; i++) {
            totalTime += movies[i].movieTime;
            System.out.println(movies[i].getMovieInfo());
        }

        System.out.println("------------------------");
        System.out.println("총 상영시간: " + totalTime + "분");

    }
}
