package logic;

public class Measure {    
    public static double getTime(int[] arr, int target, Algorithm alg){
        double before = System.nanoTime();
        alg.invoke(arr, target);
        double after = System.nanoTime();

        return (after - before) / (1000 );
    }
}
