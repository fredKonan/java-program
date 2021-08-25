package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public  HomeworkAssignment( int possibleMarks,String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName= submitterName;
    }
    public String getLetterGrade(){
        if(earnedMarks*100/this.possibleMarks>=90)
            return "A";
        else if(earnedMarks*100/this.possibleMarks>=80 && earnedMarks*100/this.possibleMarks<=89)
            return "B";
        else if(earnedMarks*100/this.possibleMarks>=70 && earnedMarks*100/this.possibleMarks<=79)
            return "C";
        else if(earnedMarks*100/this.possibleMarks>=60 && earnedMarks*100/this.possibleMarks<=69)
            return "D";
        return "F";
    }
    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }


    public int getEarnedMarks() {
        return this.earnedMarks;
    }

    public int getPossibleMarks() {
        return this.possibleMarks;
    }

    public String getSubmitterName() {
        return this.submitterName;
    }
}
