import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= 10) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
            i++;
        }
    }
}