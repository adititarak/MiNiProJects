package org;

import java.util.Scanner;   
import java.lang.Exception;   
class InvalidMarksException extends Exception   
{   
  InvalidMarksException(String message)   
  {   
     super(message);   
  }   
}   
class variables   
{   
  int i, k;   
  int marks[]=new int[10];   
  int mark=0;   
  float total=0;   
}   
interface sports   
{   
  int sports=10;   
}   

class student extends variables implements sports   
{   
  int detail()   
  {   
     Scanner inp =new Scanner(System.in);   
     for(i=0;i<6;i++)   
     {   
       try   
       {   
          mark=inp.nextInt();   
          if(mark>=0 && mark<=100)   
          {   
            marks[i]=mark;   
            total=total+marks[i];   
          }   
          else   
          {   
            i=i-1;   
        throw new InvalidMarksException("INVALID MARKS INPUT ERROR");   
          }   
       }   
       catch(InvalidMarksException e)   
       {   
          System.out.println(e.getMessage());   
       }   
     }   
     for(i=0;i<6;i++)   
     {   
       if(marks[i]<=50)   
       {   
          k=1;   
       }   
     }   
     if(k==1)   
     {   
       return 1;   
     }   
     else   
     {   
       return 0;   
     }   
  }   
  int status()   
  {   
     return k;   
  }   
  float grade()   
  {   
     System.out.println("* SPORTS MARKS 10 HAS BEEN ADDED TO THE TOTAL *");   
     total=total+10;   
     float avg=(total/600)*100;   
     System.out.println("TOTAL  : "+total);   
     System.out.println("PERCENTAGE %  :"+avg );   
     return avg;   
  }   
}   