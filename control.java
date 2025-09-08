import java.util.Scanner;
public class control {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("enter two numbers");
     int n1= sc.nextInt();
     int n2= sc.nextInt();
     if(n1%2==0)
     {
        System.out.println(n1+"is a even number");
     }
     if(n2%2==0){
        System.out.println(n2+"is a even number");
     }
 }
    
}
