import java.util.Scanner;
public class calculator {
    static void powerInt(int num1,int num2) {
        System.out.println(Math.pow(num1,num2));
    }
    static void powerDouble(double num1,int num2) {
        System.out.println(Math.pow(num1,num2));
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        powerInt((int)num1,(int)num2);
        powerDouble((double)num1,(int)num2);

    }
 
    
}
