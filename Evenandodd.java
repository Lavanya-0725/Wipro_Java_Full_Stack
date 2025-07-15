import java.util.Scanner;
class Evenandodd 
{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        if(num%2==0) {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}

