/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalendar;

import java.text.DateFormat;
import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author zhanghexiao
 */
public class MyCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);  
    int year;
    int month;
    year = Validator.getInt(Sc, "Please input the year,four Digits",1900, 10000);
    month = Validator.getInt(Sc, "Please input the month,1-Jan...12-Dec", 0, 13);
    
    
    GregorianCalendar inputMonth = new GregorianCalendar(year,month-1,1);
    
    int DayOfWeek =inputMonth.get(DAY_OF_WEEK);
    int monthNumber = inputMonth.get(MONTH);
    
    Date monthInput = inputMonth.getTime();
    DateFormat defaultDate =DateFormat.getDateInstance(2, Locale.CANADA);
    String yearAndMonth = defaultDate.format(monthInput);
    yearAndMonth = yearAndMonth.substring(2);
    System.out.print("\n"+"  "+yearAndMonth+"\n");
    
    
    
    System.out.printf("  Su"+"  Mo"+"  Tu"+"  We"+"  Th"+"  Fr"+"  Sa"+"\n");
    
    while (DayOfWeek!=1)
    { System.out.print("    ");
      DayOfWeek-=1;
    }
    
    while(inputMonth.get(MONTH)==monthNumber){
   
    System.out.printf("%4d",inputMonth.get(DATE));
    
    inputMonth.add(inputMonth.DAY_OF_MONTH, 1);
    if((inputMonth.get(DAY_OF_WEEK)-1)%7==0)
    {System.out.print("\n");}
    
      
    }
         
    }      
}
