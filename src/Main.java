import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Scanner keyboard= new Scanner(System.in);
       System.out.println("Enter a Minimum Number");
        int x= keyboard.nextInt();
        System.out.println("Enter a Max Number \n");
        int y= keyboard.nextInt();

    /* int x = keyboard.nextInt();
    int y= keyboard.nextInt();
    */
        for ( int i = x; i<=y; i++)
        {
            System.out.println(i+ " " + "Number is "+ isEven(i));
        }

    }


    public static boolean isEven (int i) {
        if (i % 2 == 0) {
            return true;
        }
    else {
    return false;
    }
}
}