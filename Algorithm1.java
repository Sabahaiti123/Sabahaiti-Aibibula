import java.util.Scanner;
// Printing the Highest and Lowest Marks
/**
 * Write a description of class Algorithm1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithm1
{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int numberOfStudents = 30;
        
        double[] marks = new double[numberOfStudents];
        
        double lowestmarks = marks[0];
        double highestmarks = marks[0];
        
        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();
        
        System.out.println("Give marks for 30 students");
        
        // Input marks with validation
        for(int i=0; i<numberOfStudents; i++){
            
            double temp = scanner.nextDouble();
            
            if(temp < 0 || temp > 30){
                
                System.out.println("Invalid marks, Please enter again");
                
            }
            
            // Update highest and lowest marks
            marks[i] = temp;
            if(lowestmarks > temp){
                
                lowestmarks = temp;
                
            }
            if(highestmarks < temp){
                
                highestmarks = temp;
                        
            }
    }
    
    // Printing the results
    System.out.print("Assignment: ");
    System.out.println(assignmentName);
    System.out.print("lowestmarks: ");
    System.out.println(lowestmarks);
    System.out.print("highestmarks: ");
    System.out.println(highestmarks);
    
}
}

