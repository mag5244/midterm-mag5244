/*
Assignment: midterm practicum
Class: ExerciseOne
Name: Margaret Gray
Email: mag5244@rit.edu

Description:
 */
package practicum;

public class ExerciseOne {

    /**
     * the main method, tests the sumDiv method
     * @param args any args passed in on command line
     */
    public static void main(String[] args) {
        try {
            System.out.println("Testing sumDivisions(1): " + sumDivisions(1));
            System.out.println("Testing sumDivisions(5): " + sumDivisions(5));
            System.out.println("Testing sumDivisions(10): " + sumDivisions(10));
        } catch (Exception e){
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
    /**
     * takes input n, bigger than zero and strictly positive, and calculates
     * 1 + 1/2 + 1/3 + 1/4 + ... + 1/n and returns the value of that sum in float
     * @param n
     * @return
     */
    public static float sumDivisions(int n) throws Exception{
        if (n < 0){
            throw new Exception("n cannot be negative!");
        }
        float sum = 0;
        for (float i = 1; i <= n; i++){
//            System.out.println("adding 1/i " + (1/i));
            sum += (1.0/i);
        }
        return sum;
    }
}
