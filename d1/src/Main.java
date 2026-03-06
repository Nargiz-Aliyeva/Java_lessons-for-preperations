import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world");
    //string username = "jet001";
        //int a = 5;
        //int b = 6;
        /*int c = a+b;
        boolean d = c<0;
        System.out.println(c);
        System.out.println(d);
        boolean y = true;
        System.out.println(y);
        Scanner scanner = new Scanner(System.in); // input
        System.out.print("Enter first number :");
        int e  = scanner.nextInt();
        System.out.print("Enter second number : ");
        int z = scanner.nextInt();
        System.out.print("Result: ");
        System.out.println(z*e); // output
        // practise et
*/

     /*   String username = "agent 007";
      //  System.out.print("Welcome, ");
        //System.out.println(username);
        System.out.println("Welcome, "+ username+(3+5));
       */
        /*
         int i = 8 ;
         i+=4;
         i-=2;
         i++;
         i*=5;
         i/=2;
        System.out.println(i);
*/
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name please: ");
String name = scanner.next();
System.out.print("Enter your age please: ");
int age = scanner.nextInt();
System.out.println("Your result infprmation: " +name + " "+ (age>18));
MyFirstClass firstClass = new MyFirstClass();
firstClass.FirstTry();

    }
}