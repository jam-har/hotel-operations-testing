package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied; //match variable to getter
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }

    public Room() {
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public void checkIn() {
        if (isAvailable()) {
            occupied = true;//conditional with isAvailable and then change occupied and dirty
            dirty = true;
        }
    }

    public void cleanRoom() {
        if (!occupied) {
            dirty = false;//check for occupied first
        }
    }

    public void checkOut() {
        occupied = false;
    }
}
