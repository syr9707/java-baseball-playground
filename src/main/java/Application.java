import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> computerNum = new ArrayList<>();
        computerNum = generateNumber();

        System.out.print("숫자를 입력해 주세요 : ");
        String numStr = br.readLine();
        judgeNumber(numStr, computerNum);

    }

    public static ArrayList<Integer> generateNumber() {
        ArrayList<Integer> computerNum = new ArrayList<>();
        while(computerNum.size() < 3) {
            int num = (int)(Math.random() * 9) + 1;
            if(!computerNum.contains(num)) computerNum.add(num);
        }

        return computerNum;
    }

    public static void judgeNumber(String numStr, ArrayList<Integer> computerNum) {
        int countStrike = 0;
        int countBall = 0;

        for(int i = 0; i < 3; i++) {
            if(computerNum.contains(numStr.charAt(i) - '0')) countBall++;
            if(computerNum.get(i) == numStr.charAt(i) - '0') countStrike++;
        }
        countBall = countBall - countStrike;
        printResult(countStrike, countBall);
    }

    public static void printResult(int countStrike, int countBall) {

        if(countStrike != 0 && countBall != 0) {
            System.out.println(countBall + "볼 " + countStrike + "스트라이크");
            return;
        }

        if(countStrike != 0 && countBall == 0) {
            System.out.println(countStrike + "스트라이크");
            return;
        }

        if(countStrike == 0 && countBall != 0) {
            System.out.println(countBall + "볼 ");
            return;
        }

        System.out.println("낫싱");

    }


}
