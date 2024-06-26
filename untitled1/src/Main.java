import java.util.Scanner;
class repo {
    int add(int a, int b) {
        if (a > 10 && b > 10) {
            System.out.println(a+b);
        } else {
            System.out.println("Enter the input greater than 10");
        }
        return a+b;
    }
    int sub(int a, int b) {
        if (a%2==0 && b%2==0) {
            System.out.println(a-b);
        } else {
            System.out.print("Enter the input as even number");
        }
        return a-b;
    }
}
public class Main{
    public static void main (String[] args){
        repo repo1 = new repo();
        int sum=repo1.add(12,24);
        int sub= repo1.sub(13,24);
    }
}
