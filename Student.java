
package test7;


public class Student {
    
    private String name;
    private int numOfGrades;
    private int totalScore;

    public Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getTotalScore() {
        return totalScore;
    }
    public void addQuiz(int score) {
        totalScore = totalScore + score;
        numOfGrades++;
    }
    public double getAverageScore(){
        return totalScore/(double)numOfGrades;
    }
    
}
