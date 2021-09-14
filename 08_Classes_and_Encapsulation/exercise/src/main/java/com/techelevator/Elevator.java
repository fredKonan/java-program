package com.techelevator;

public class Elevator {
    private int currentFloor=1;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfLevels) {
       numberOfFloors= numberOfLevels;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public boolean isDoorOpen() {
        return this.doorOpen;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }


    public void openDoor() {
        this.doorOpen = true;
    }

    public void closeDoor() {
        this.doorOpen = false;
    }

    public void goUp(int desiredFloor) {

        if(doorOpen==false){
            if(desiredFloor>currentFloor && desiredFloor<=numberOfFloors)
                currentFloor = desiredFloor;
            this.currentFloor=currentFloor;
        }
        else
            System.out.println("close the door before moving the elevator");

    }

    public void goDown(int desiredFloor) {
        if (doorOpen == false) {
            if (desiredFloor < currentFloor && desiredFloor >= 1) {
                currentFloor = desiredFloor;
                this.currentFloor = currentFloor;
            }

        } else
            System.out.println("close the door before moving the elevator");
    }

}
