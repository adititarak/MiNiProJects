package org;

import java.util.Scanner;

class Student1   
{   
  public static void main(String args[])   
  {   
     Scanner inp=new Scanner(System.in);   
     student student1=new student();   
     int RollNo, a, i, c;   
     float b;   
     String name;   
     System.out.println("Enter the NAME of the Student:");   
     name=inp.nextLine();   
     System.out.println("Enter the RollNo of the Student:");   
     RollNo =inp.nextInt();   
     
     for(;;)   
     {   
  System.out.println("ENTER \n 1: STUDENT MARKS 2: GENERATE REPORT 3: EXIT");   
     i=inp.nextInt();   
     switch(i)   
     {   
       case 1 :System.out.println("Enter the Marks of the student:");   
          a=student1.detail();   
          break;   
       case 2:c=student1.status();   
          b=student1.grade();   
          if(c==1)   
          {   
  System.out.println("Student Name : "+name+"  \nRoll_No : "+RollNo+"  \nResult = FAILED.");   
          }   
          else   
          {   
  System.out.println("Student Name : "+name+"  \nRoll_No : "+RollNo+"  \nResult = PASSED.");   
          }   
          
          
          if((b>=80&&b<=100)&&c==0)   
          {   
            System.out.println("* YOU ARE HONOURED A Grade *");   
          }   
          if((b>=70&&b<80)&&c==0)   
          {   
            System.out.println("* YOU ARE HONOURED B Grade *");   
          }   
          if((b>=60&&b<70)&&c==0)   
          {   
            System.out.println("* YOU ARE HONOURED C Grade *");   
          }   
          if((b>=50&&b<60)&&c==0)   
          {   
            System.out.println("* YOU ARE HONOURED D Grade *");   
          }   
          if((b>=40&&b<=100)&&c==1)   
          {   
            System.out.println("* YOU ARE HONOURED FAIL *");   
          }   
          break;   
       case 3:   
          System.out.println();   
          System.out.println("THANK YOU!");   
          System.exit(0);   
       default:   
          System.out.println("TRY AGAIN!");   
     }   
     }   
  }   
}