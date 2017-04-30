/*
 * Created by Steven Jennings (zzApotheosis) on 08 June 2016.
 */

package day12;

class Student extends Person {
    private int[] testScores;

    Student(String name0, String name2, int id, int[] scores) {
        super(name0, name2, id);
        this.testScores = scores;
    }

    char calculate() {
        char grade = 'T';
        int avgSum = 0;
        double avg;
        for (int i = 0; i < this.testScores.length; i++) {
            avgSum += this.testScores[i];
        }
        avg = (double)avgSum / this.testScores.length;
        System.out.println("avg = " + avg); //Debug info

        // Check out this weird grading scale
        if (avg <= 100 && avg >= 90) {
            grade = 'O'; //A
        } else if (avg < 90 && avg >= 80) {
            grade = 'E'; //B
        } else if (avg < 80 && avg >= 70) {
            grade = 'A'; //C
        } else if (avg < 70 && avg >= 55) {
            grade = 'P'; //D
        } else if (avg < 55 && avg >= 40) {
            grade = 'D'; //F
        } else if (avg < 40) {
            grade = 'T'; //F- ?
        } else {
            System.out.println("Something went wrong."); //MFW your grade is outside the grading scale.
        }
        return grade;
    }
}