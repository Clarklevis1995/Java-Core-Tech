package 基本程序设计结构;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while(!in.next().equals("end")){
            stringBuilder.append(in.next());
        }
        System.out.println(stringBuilder.toString());*/

        Console con = System.console();
        String username = con.readLine("UserName: ");
        char[] password =con.readPassword("Password: ");
        System.out.println(username+" "+ Arrays.toString(password));
    }
}
