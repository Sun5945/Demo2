package Day2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int time=scanner.nextInt();
        if(time<60){
            System.out.println(time);
        }else {
            int h=time/60;
            int s=time%60;
            System.out.println(time+"分钟="+h+"小时"+s+"分钟");
        }
    }
}
