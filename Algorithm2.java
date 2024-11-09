import java.util.Scanner;
// Calculate mean and standard deviation
/**
 * Write a description of class Algorithm2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithm2{
    public static void main(String[] args){
        
        int numberOfStudents = 30;
        
        double[] marks = new double[numberOfStudents];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give marks for 30 students");
        for(int i=0; i<numberOfStudents; i++){
            double temp = scanner.nextDouble();
            if(temp < 0 || temp>30){
                
                System.out.println("Invalid marks, please enter again");
                continue;
                
            }
            
            marks[i] = temp;
        
        }
        
        double total = 0;
        
        for(int i=0; i<numberOfStudents; i++){
            
            total = total + marks[i];
            
        }
        
        double mean = 0;
        
        mean = total / numberOfStudents;
        
        System.out.print("Mean: ");
        System.out.println(mean);
        
        double sumdiff = 0;
        
        for(int i=0; i<numberOfStudents; i++){
            
            sumdiff = sumdiff + (marks[i] - mean) * (marks[i] - mean);
            
            sumdiff = sumdiff / numberOfStudents;
            
        }
        
        System.out.println(Math.abs(-1));
        
}
}
