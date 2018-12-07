package ClassGrades;
/*
    Needs in this program: 

    - Syempre dapat may dalawang java class Main and ClassGrades 
    - Meron dapat inputs/scanner para pag hiningi yung name and grade for that
      subject
    - Sa main mag tatanong ng name dun 
    - Tapos may loop dapat na pag yung inputs tapos na press 'q' or 'Q'
    - Priprint yung pangalan nung student total score lahat tapos GWA nun
    - Sa ClassGrades naman isang constructor para sa name 
    - Isang setter para sa name
    - Dalawang getters para sa getName at getTotalScore
    - Method na addScore para dagdagan yung grades
    - At isang method para sa getAverage
*/
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner myReader = new Scanner(System.in);
        
        System.out.println("Welcome! I can Compute your GWA with your grades in each subject");
        
        System.out.print("What is your name? ");
        String username = myReader.nextLine();

        ClassGrades student = new ClassGrades(username);

        System.out.print("(Type 'q' to stop adding grades)\nWhat's the final grade of the subject? ");
        String score = myReader.nextLine();

        while (!score.equals("q")) {
            System.out.print("What's the final grade of the subject? ");
            student.addScore(Integer.parseInt(score));
            score = myReader.nextLine();
        }

        System.out.println("Student name: " + student.getName()); //Make it student to string
        System.out.println("Total Score: " + student.getTotalScore());
        System.out.println("Student's average score: " + student.getAverage());
    }
}
