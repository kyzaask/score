import java.util.Scanner;

public class ortalama {

    public static void main(String[] args) {
        int quiz , midterm , ffinal;
        double score;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quiz score.");
        quiz = input.nextInt();
        System.out.println("Please enter your midterm score.");
        midterm = input.nextInt();
        System.out.println("Please enter your final score.");
        ffinal = input.nextInt();
        score = (quiz * 0.2) + (midterm * 0.35) +  (ffinal * 0.45);
        System.out.println("Your score is : " + score );
        String str = ( score >= 50 ) ? "You can pass the course" : "You cant pass the course";
        System.out.println(str);
 


    }
}
