package Day2;

public class day2 {
    public static void main(String[] args) {
        String s="   hello,world,";
        String s1=s.trim();
        System.out.println(s1);
        System.out.println(s1.substring(0,5));
        String s2=s.substring(0,s.length()-1);
        System.out.println(s2);
        String s3=s2.replace(',','-');
        System.out.println(s3);
    }
}
