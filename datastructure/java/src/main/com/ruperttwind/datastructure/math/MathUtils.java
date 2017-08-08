package com.ruperttwind.datastructure.math;

/**
 * Created by ruperttwind on 08/08/17.
 */
public class MathUtils {

    /**
     * Babylonian method / Hero's method for finding square root.
     *
     * Returns the square root of n. Note that the function
     * */
    public static Double squareRoot(Double n)
    {
        /*We are using n itself as initial approximation - This can definitely be improved */
        Double x = n;
        Double y = 1.0;
        Double e = 0.000001; /* e decides the accuracy level*/

        while(x - y > e) {
            x = (x + y)/2;
            y = n/x;
        }
        return x;
    }
}
