package Day2;

import java.util.Scanner;

public class man {
    public static void main(String[] args) {
        /**
         * 足球队
         * Scanner scanner = new Scanner(System.in);
         int age = scanner.nextInt();
         int sex = scanner.nextInt();
         if (age >= 10 && age <= 12) {
         if (sex == 1) {
         System.out.println("年龄：" + age + ",性别：男" + "    可以加入足球队！");
         } else if (sex == 0) {
         System.out.println("年龄：" + age + ",性别：女" + "    可以加入足球队！");
         } else {
         System.out.println("性别输入错误！！");
         }
         } else {
         System.out.println("不可以加入足球队！");
         }*/

        /**
         * Max  Min
         * Scanner scanner = new Scanner(System.in);
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         int c = scanner.nextInt();
         int d,d1;
         d=a>b?a:b;
         System.out.println("Max:"+(c>d?c:d));
         d1=a<b?a:b;
         System.out.println("Min:"+(c<d1?c:d1));*/

        /**
         * 逐位输出
         * Scanner scanner = new Scanner(System.in);
         int a=scanner.nextInt();
         String s=String.valueOf(a);
         String c=s.substring(0, 3);
         System.out.println(c.charAt(0));
         System.out.println(c.charAt(1));
         System.out.println(c.charAt(2));*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String c = String.valueOf(a);
        for (int i = 0; i < c.length() / 2; i++) {
            if (c.charAt(i) == c.charAt(c.length() - 1 - i)) {
                System.out.println(a + "是回文数！");
                break;
            } else {
                System.out.println(a + "不是回文数！");
                break;
            }
        }

    }
}
