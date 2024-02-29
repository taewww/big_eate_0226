package 짝수홀수판단하기;
// 임의의 정수를 입력 받아 해당 값이 짝수 인지 홀수 출력하는 문제

import java.util.Scanner;

public class oddevenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
                int num = sc.nextInt();
        String outstring = (num % 2 ==0) ? "짝수 입니다." : "홀수 입니다.";
        System.out.println(outstring);
   }
}
