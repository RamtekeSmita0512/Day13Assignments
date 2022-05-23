public class  MaximumFloats
{
    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;                           // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y;                         // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z;                        // z is the largest

        return max;                        // returns the largest object
    }                                      // end method maximum

    public static void main(String args[]) {
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n",5.7 , 2.0, 4.7, maximum(5.7, 2.0, 4.7));

    }
}
