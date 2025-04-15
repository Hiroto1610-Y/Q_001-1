import java.util.Scanner;

public class Enhance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder(name);

        for (int i = 0; i < N; i++) {
            sb.insert(0, "a");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}