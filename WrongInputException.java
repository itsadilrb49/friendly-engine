//ch-6 act 1.1

package game; 
public class WrongInputException extends RuntimeException 
{
 WrongInputException() 
 {
 System.out.println("Please provide a single character only..!!"); 
 }
}