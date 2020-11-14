package 基本程序设计结构;

import java.util.Scanner;

/*
lottery guess
 */
public class ForTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to draw?");
        int n = in.nextInt();
        System.out.println("What is the highest number you want draw?");
        int n2 = in.nextInt();

        //compute guess
        int lotteryOdd = 1;
        for (int i = 1; i < n+1; i++) {
            lotteryOdd*=(n2 - i + 1) /i;
        }
        System.out.println("1/"+lotteryOdd);
    }
}
