package Day2;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int num = 1000;
        boolean t = true;
        for (int i = 2; i < 1000/2; i++) {
            if (num % i == 0) {
                t=false;
                System.out.println("不是");
                break;
            }
        }
        if (t ) {
            System.out.println("是");
        }


      /*  final int VALUE = 6;
        int[] arr = new int[VALUE];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
            arr[i] = scanner.nextInt();
        int Max = arr[0], Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println(Max);
        System.out.println(Min);*/
        /**
         * 分离 相加四位数
         * String s="1234";
         int a=0;
         for (int i = 0; i <s.length() ; i++) {
         a+=Integer.parseInt(String.valueOf(s.charAt(i)));
         }
         System.out.println(a);*/

        /* int s = 0,s1=0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                s += i;
                System.out.println(i);
            } else {
                s1+=i;
            }
        }
        System.out.println(s);
        System.out.println(s1);*/
    }
}
