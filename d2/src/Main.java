import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
// shert operatoru
/*
if(true){
    System.out.println("if block is working");
}
*/
 /*
 int a =-2;
 if(a>0){
     System.out.println(a + " is popsetive number");
 }else {
     System.out.println(a + " is negative number");
*/
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER a");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a + "is posetive");

        } else if (a < 0) {
            System.out.println(a + "is negative");

        } else {
            System.out.println(a + "is equal to zero");
        }
*/
        /*
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your id number");
        int c = scanner1.nextInt();
        if(c>0){
            System.out.println(c + "is posetive number");
        }
        else if(c<0){
                System.out.println(c + "is negative");
            }
            else {
                System.out.println(c+ "is equal to zero");
            }
            */
/*
    Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your number");
    int b = scanner2.nextInt();
if(b>0){
    System.out.println(b + "is posetive number");
}
else {
    if (b < 0) {
        System.out.println(b + "is negative");
    } else {
        System.out.println(b + "is equal to zero");
    }
}
*/
        //ferz edek ki istifadeci sistemde daha evvelden qeydiyyatdan kecib ve ad parol yazib sisteme

      /*  Scanner scanner = new Scanner(System.in);
        String defaultUsername = "admin";
        String defaultUserPassword = "12345";
        System.out.println("Enter your username: ");
        String enteredUser = scanner.next();
        System.out.println("Enter yor password");
        String enterePassword = scanner.next();
        if (defaultUsername.equals(enteredUser)) {
            if (enterePassword.equals(defaultUserPassword)) {
                System.out.println("Welcome" + " " + enteredUser);
            } else {
                System.err.println("Password is wrong");
            }
        } else {
            System.err.println("unername is wrong");
        }
*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = scanner.nextInt();
        System.out.println("Enter b ");
        int b = scanner.nextInt();
        if (a + b > 0) {
            System.out.println(" answer is posetive number");
        } else {
            if (a + b < 0) {
                System.out.println("answer is negative number");
            } else {
                System.out.println("answer is equal to zero");
            }*/

        /*   Scanner scanner = new Scanner(System.in);
            String defaultUsername = "admin";
            String defaultUserPassword = "12345";
            System.out.println("Enter your username: ");
            String enteredUser = scanner.next();
            System.out.println("Enter yor password");
            String enterePassword = scanner.next();
            if (defaultUsername.equals(enteredUser)&&defaultUserPassword.equals(enterePassword)){
                System.out.println("Welcome");
            }
            else {
                System.out.println("username or password is wrongg");
            }

*/
        /*
        if (false||true|| false){
            System.out.println("working");
        }
*/
/*
        int tarix = 90;
        int riyaziyyat = 40;
        int fizika = 100;
        int kimya = 55;
       /* if(kimya<51||riyaziyyat<51||fizika<51||kimya<51){
            System.err.println("kesrin var");
        }
        else {
            System.out.println("kesrin yoxdur");
        }


        if(kimya>=51&& riyaziyyat>=51&&fizika>=51&&kimya>=51){
            System.out.println(" sucsess");
        }
        else {
            System.err.println("kesrin var");
        }
        */


    //and ile or bir yerde islemek isteyerse evvel && baxiriq sonra or a cunki && vurmadi vurma birinci hesablanir yeni && ordan daha ustundur

        if(false||true&& false){
            System.out.println("true");
        }
    else {
            System.out.println("false");
        }
    }

}
// task ve qalan  bu mövzu haqqda another task classından gelecek :)


//---------------------------------------------------------------------------------------------------------------------------------------
// Looplar dersi:



=======
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
>>>>>>> a6b0e0ee54600aff9e80a1125d54244959b08c5f
