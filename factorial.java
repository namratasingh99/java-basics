import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int num,fact =1,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        num= sc. nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
}
