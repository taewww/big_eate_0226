package 학점구하기;

import java.util.Scanner;

public class GradeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(.in) // 입력을 받기위해 한번만 생성
        int score = 0;
        while (true) { // 성적이 잘 못 입력된 경우 재 입력 처리를 하기 위해서}
        System.out.print("성적을 입력 하세요 : ")
        score = sc.nextInt();
        if(score < 0 || score > 100) continue; // 아래 코드를 수행하지 않고
        if(score >=90) System.out.println("a");
        else