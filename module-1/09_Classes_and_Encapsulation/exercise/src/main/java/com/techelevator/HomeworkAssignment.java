package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public HomeworkAssignment( int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;

    }


    public int getPossibleMarks(){
        return this.possibleMarks;
    }
    public int getEarnedMarks(){
        return this.earnedMarks;
    }
    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }
    public String getSubmitterName(){
        return this.submitterName;
    }
    public String getLetterGrade(){
        String grade = "F";
        double percentage = (double) this.earnedMarks /this.possibleMarks;



        if(percentage >= 0.9){
            grade = "A";
        } else if (percentage >= 0.8){
            grade = "B";
        } else if (percentage >= 0.7){
            grade = "C";
        } else if (percentage >= 0.6){
            grade ="D";
        }
        return grade;
    }

}
