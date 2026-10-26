import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int count = br.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < count; i++){
            int n = br.nextInt();
            if(n == 0) stack.pop();
            else stack.push(n);
        }

        int total = 0;
        for(int n : stack) total += n;

        System.out.println(total);
    }
}
