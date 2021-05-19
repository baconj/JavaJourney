public class SwapVariables {

    public static void main(String[] args) {
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp=x;
        x=y;
        y=temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        /** The point here is that some programming languages do not have a
         * way of simply swapping variables, if you just set x=y you end up with
         * Kool-Aid for both variables, if you se y=x you get water for both variables.
         * You must create a temporary variable to store one of the vaules in order
         * to swap them.
         */
    }

}
