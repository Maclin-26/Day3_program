import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        String [] s = z.nextLine().split(" ");
        for(int i = 0; i <s.length; i++){
            if(!s[i].equals("this")){
                System.out.print(s[i]+" ");
            }
        }

    }
}