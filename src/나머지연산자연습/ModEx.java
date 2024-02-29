package 나머지연산자연습;

import java.util.Scanner;

// 100의 자리 정수를 입력 받아서 3개의 변수에 나눠 담기
// ex) 257 => a변수에 2, b변수에5, c변수에7
public class ModEx {
    public static void main(String[] args) {
        System.out.println("100의자리 정수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num/100;
        int b = (num%100)/10;
        int c = num%10;
        System.out.println("100의자리 : "+a+"\n10의자리 :" +b+"\n1의 자리 :"+c);
        if (a>b){
}           if (a > c)
