package ComProg;


import java.util.Scanner;

public class Silvano {

  public static void main(String[] args) {
   double LoanAmount, InterestPerYear, MonthlyPay, InterestPerMonth;
   double InterestPer2ndMonth = 0;
   double SecondMonthlyPay = 0;
   double count = 0;
   
    Scanner Apple= new Scanner(System.in);
    
    System.out.println(">>>>>>>>>>>>><<<<<<<<<<<");
    System.out.println(" |      METROBANK      |");
    System.out.println(">>>>>>>>>>>>><<<<<<<<<<<");
    System.out.print("> Loan Amount: $");
    LoanAmount = Apple.nextDouble();
    System.out.print(" Interest Per Year: ");
    InterestPerYear = Apple.nextDouble();
    System.out.print(" Monthly Payment: $");
    MonthlyPay = Apple.nextDouble();
    
    double InterestRate = InterestPerYear/100;
  
  
  do
  {
    InterestPerMonth = InterestRate / 12;
    InterestPer2ndMonth= LoanAmount * InterestPerMonth;
    SecondMonthlyPay = MonthlyPay - InterestPerMonth;
    
    if(MonthlyPay < InterestPer2ndMonth)
    {
      System.out.println("The monthly payment is less than the first month's interest payment loan amount could not be repaid.");
    }
    
     else
    {
     LoanAmount = LoanAmount - SecondMonthlyPay;
     count++;
     
    }
  } 
 
  
   while (LoanAmount> 0);  
  
    System.out.println();
    System.out.println("Months To Paid: " + count);
  }
}
