/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package se_hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;

public class hw4 {
   public static char letterGrade(int score){
            char grade;
            if(score<0 || score>100){
                grade = 'X';
            }
            else if(score>=90 && score<=100){
                grade = 'A';
            }
            else if(score>=80 && score<90){
                grade = 'B';
            }
            else if(score>=70 && score<80){
                grade = 'C';
            }
            else if(score>=60 && score<70){
                grade = 'D';
            }
            else{
                grade = 'F';
            }
            return grade;
        }

    public static void main(String[] args) {
        int score=0;
        System.out.print("Enetr the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            score = Integer.parseInt(br.readLine());
            char grade = hw4.letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex){
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }
}