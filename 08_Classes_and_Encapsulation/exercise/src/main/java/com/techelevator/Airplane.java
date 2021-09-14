package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int availableFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.planeNumber = planeNumber;
        this.totalCoachSeats = totalCoachSeats;
    }

    public int getAvailableFirstClassSeats() {
        return availableFirstClassSeats = this.totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        return availableCoachSeats = this.totalCoachSeats - bookedCoachSeats;
    }

    public String getPlaneNumber() {
        return this.planeNumber;
    }

    public int getTotalCoachSeats() {
        return this.totalCoachSeats;
    }

    public int getTotalFirstClassSeats() {
        return this.totalFirstClassSeats;
    }

    public int getBookedCoachSeats() {
        return this.bookedCoachSeats;
    }

    public int getBookedFirstClassSeats() {
        return this.bookedFirstClassSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass ){
            if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            } else {
                return false;
            }
        }
        else  {
            if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
                bookedCoachSeats += totalNumberOfSeats;
                return true;
            } else {
                return false;
            }
        }
    }

}

