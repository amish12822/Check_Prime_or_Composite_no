/**
 * prime_composite
 */
public class prime_composite {

    public static void main(String[] args) {
        int a = 1; // user enter value to check
        int b = 0;

        if ( a == 0 || a == 1){
            b = 2;
        }else {
            for ( int i=2; i<=a/2; i++){
                if ( a%i == 0) {
                    b = 1;
                    break;
                }
            }
        }

        if ( b == 2 ){
            System.out.println( a + " is not a Prime no. Or not a Composite no.");
        } else if ( b == 1 ){
            System.out.println( a + " is a Composite no.");
        }else {
            System.out.println( a + " is a Prime no.");
        }

    }
    
}