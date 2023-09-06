public class Samples {

    public static void main( String[] args ) {

        implicitTypeCasting();
        // explicitTypeCasting();
        // stringsAndNumbers();
    }

    public static void implicitTypeCasting( ) {

        int x = 5;
        // The integer literal 9 is converted to 9.0 when stored in y
        double y = 9;

        System.out.println( "The value of x is: " + x + ", and the value of y is " + y );

        // We can also create just one formatted String with printf
        // System.out.printf("The value of x is: %d, and the value of y is %f \n", x, y);

        // How many type castings happen in this statement?
        // System.out.println(" x / y = " + ( x / y ) );

        // We can print floating point numbers to a specific precision using printf
        // System.out.printf(" x / y = %.2f \n", ( x / y ) );

    }

    public static void explicitTypeCasting( ) {

        double y = 6.489;
        // The mathematical floor of 4.59 is stored as an integer in x
        int x = (int)(4.59);

        System.out.printf("The value of x is: %d, and the value of y is %f \n", x, y);

        /*
        // How many type castings happen in this statement?
        System.out.println( "Case 1: " + (double)(16) / 3 );

        // How many type castings happen in this statement?
        System.out.println( "Case 2: " +  16 / (double)(3) );

        // How many type castings happen in this statement?
        System.out.println( "Case 3 " + (double)( 16 / 3 ) );
         */

        // double z = 16 / 3;
        // What will be the value of z?
        // System.out.println( "The value of z is: " + z );
    }

    public static void stringsAndNumbers( ) {

        // What happens when we try to join a String and an integer
        // System.out.println( 5 + " of Hearts");

        // What if we have multiple numbers?
        // System.out.println( 5 + 5 + " of Diamonds");

        // What if we have multiple numbers on either side?
        // System.out.println( 5 + " of of Club" + 5);

        // What if our numbers are on the end?
        // System.out.println( "Spades of " + 5 + 5 );

        // What if we add a different operation?
        // System.out.println( "I\'m all out of suits. " + 5 / 5 );

    }
}
