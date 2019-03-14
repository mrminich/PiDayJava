// Works Cited
// originally from https://codeboard.io/projects/77478

public class PiDayJavaMain
{
    public static void main(String[] args) 
    {
        int numIterations = 5000;       // # of terms from the series to use to approximate PI
        double result = 0.0;            // approximation of PI
        boolean positive = true;        // changing between pos & neg terms in the series
    
        for (int i = 0; i < numIterations; i++) 
        { 
            double nextTerm = 1. / (2 * i + 1); // compute next term in the series
            
            if (positive) 
            {
                result += nextTerm; 
            }
            else 
            {
                result -= nextTerm; 
            }
            
            positive = !positive;       // terms in series alternate between pos & neg
        }
        
        result *= 4;                    // formula approximate 1/4th of PI
        
        System.out.println("Pi is approximately " + result);
    } // end of main method

}
