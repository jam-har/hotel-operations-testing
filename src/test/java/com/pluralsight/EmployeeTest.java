package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void PunchIn_EmployeeTime_SavesTime(){
        //Arrange
        Employee employee = new Employee();
        //Act
        employee.punchIn(8.93);
        //Assert
        assertEquals(8.93, employee.getStartTime());
    }

    @Test
    public void PunchOut_EmployeeTime_GivesHoursWorked(){
        //Arrange
        Employee employee = new Employee();
        employee.punchIn(8.93);
        //Act
        employee.punchOut(16.0);
        //Assert
        assertEquals(7.07, employee.getHoursWorked());
    }

}