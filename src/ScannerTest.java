import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String s= str.nextLine();
        char[] cs=s.toCharArray();
        for (int i=0;i<s.length();i++)
            if ((Character.isDigit(cs[i])) || (Character.isUpperCase(cs[i])))
                System.out.println(cs[i]);
    }
}
