import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[] numbersToAdd = new int[count];

        int total = 0;

        for(int i = 0; i < count; i++) numbersToAdd[i] = Integer.parseInt(br.readLine());

        for(int k = 1; k < numbersToAdd.length; k++){
            if(numbersToAdd[k] == 0) numbersToAdd[k - 1] = 0;
        }

        for(int m = 0; m < numbersToAdd.length; m++) total += numbersToAdd[m];

        System.out.println(total);
        

    }
}