//ch-6 act 1.2


package game; 
public class MenuInputException extends RuntimeException 
{
 MenuInputException() 
{
 
 System.out.println("Please provide a valid input (1-3)"); 
 }
}