package com.virtusa.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List <Integer> intList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integers seperated by a comma ");
        String [] strList = null;
        
        strList = sc.next().split(",");
       
        for (String strNum: strList) {
                    intList.add(Integer.parseInt(strNum));
            }
            System.out.println(intList);
    }
    
    
}
