package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //============================
        /* 진행 순서 */
        //1. 영단어 입력
        //2. 쪼개고 -> 배열에 담기
        //3. 몇번째 글자를 꺼낼지 숫자 입력
        //4. 출력
        //============================
        Scanner sc = new Scanner(System.in);

        //1. 영단어 입력
        String word = sc.nextLine();

        //2. 쪼개고 -> 배열에 담기
        String[] strArray = word.split("");
        String[] chk = new String[strArray.length];
        //->입력받은 영단어의 글자수만큼 반복해서 넣어줌
        for (int i = 0; i < strArray.length; i++) {
            chk[i] = strArray[i];
        }

        //3. 몇번째 글자를 꺼낼지 숫자 입력
        int num = sc.nextInt();

        //4. 출력
        System.out.println(chk[num - 1]);

    }

}
