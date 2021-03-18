import java.util.Scanner;
public class LabActivityDoLoop
{
  public static void main(String[] arg)
  {
    
    //CONSTANTS
    final String CORRECT_USERNAME = "student";
    final String CORRECT_PASSWORD = "abc123";
    
    //VARIABLES
    String inputUsername;
    String inputPassword;
    
    //ARRAYS
    
    //OBJECTS
    Scanner keyboardInput = new Scanner(System.in);
    
    //SOLUTION
    CS170.information("Cole Mooney", "Lab Activity", "Do Loop");
       
    //Assignment Statements
    int invalidLoginAttempts = -1;
    
    //Loop
   
    
    
    final double MOVEMENT_INCREMENT = 0.1; // mm

double adjustments = 0;
double printHeadPosition = 0.6;
double desiredPosition = 10.5;

while(printHeadPosition != desiredPosition)
{
     printHeadPosition = printHeadPosition + MOVEMENT_INCREMENT;
     adjustments++;
     System.out.print(printHeadPosition);
}
    
    
    
    
    
     
    keyboardInput.close();
    
    }
}
