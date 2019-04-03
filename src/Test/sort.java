package Test;

public class sort {
    public static void main(String[] args) {
        int[] a = {30, 2, 12, 41, 6, 34, 23};
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
       /* for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");*/
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
