import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Z = new Scanner(System.in);
        int n = Z.nextInt();
        int temp=n;
        int sum=0;
        int a;
        while(temp>0){
            a=temp%10;
            sum+=(a*a*a);
            temp=temp/10;

        }
        if(n==sum){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}