package ClassGrades;

import java.util.Scanner;
// Seperate subjects na method 
public class ClassGrades {
    private String name;
    private int numberGrades;
    private int totalScore;
    
    public ClassGrades (String name){
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public int getTotalScore() {
        return totalScore;
    }
    
    public void addScore(int score){ // make this array
        totalScore = totalScore + score;
        numberGrades++;
    }
    
    public double getAverage(){ // implement an array inside this program 
        return totalScore/(double)numberGrades;
    }
}
    
