package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void CheckIn_Room_OccupiedAndDirty(){
        Room room = new Room();
        //Act
        room.checkIn();
        //Assert
        assertTrue(room.isOccupied() && room.isDirty());
    }

    @Test
    public void CheckOut_Room_Occupied(){
        Room room = new Room();
        room.checkIn();
        //Act
        room.checkOut();
        //Assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void CleanRoom_Room_NotOccupiedAndClean(){
        //Arrange
        Room room = new Room();
        room.checkIn();
        room.checkOut();
        //Act
        room.cleanRoom();
        //Assert
        assertFalse(room.isOccupied() && room.isDirty());

    }

}