import java.util.Random;
import java.util.Scanner;

/**
 * Random和Scanner结合的小测试，猜一个1到100的随机数字
 */
public class Demo03RandomAndScannerTest {
    public static void main(String[] args) {
        guessNumber();
    }

    /**
     * 猜一个 1到100的随机数
     */
    public static void guessNumber() {
        Random random = new Random();
        int result = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true){
            int i = sc.nextInt();
            if(i > result){
                System.out.println("您输入的数字比结果大了");
            }else if(i< result){
                System.out.println("您输入的数字比结果小了");
            }else{
                System.out.println("恭喜猜对了，结果就是"+result);
                break;
            }
        }
    }
}
