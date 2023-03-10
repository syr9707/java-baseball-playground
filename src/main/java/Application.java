import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> computerNum = new ArrayList<>();
        while(computerNum.size() < 3) {
            int num = (int)(Math.random() * 9) + 1;
            if(!computerNum.contains(num)) computerNum.add(num);
        }

        System.out.print("숫자를 입력해 주세요 : ");
        String numStr = br.readLine();


    }

}
