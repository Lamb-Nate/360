/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.util.Date;

/**
 *
 * @author Nate
 */
public class Testapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String employeeName = "Nate";
            String employeeLocation = "Phoenix";
            double employeeSalary = 100000;
            if (DatabaseAccessObject.addEmployee(employeeName, employeeLocation, employeeSalary, new Date())){
                System.out.println("Employee Added");
            }else {
                System.out.println("Error Occured");
            }
         }
      
    }
    

