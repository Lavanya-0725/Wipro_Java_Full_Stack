import java.util.Scanner;
public class Uppercaseorlowercase {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char var=sc.next().charAt(0);
        System.out.println((int)var);
        if((var>=65&&var<=90)||(var>=97&&var<=122)) {
            System.out.println("Alphabet");
        }
        else if(var>=48&&var<=57) {
            System.out.println("Number");
        }
        else {
            System.out.println("Special Character");
        }
    }
    
}
