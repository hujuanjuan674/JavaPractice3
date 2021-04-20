import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("你自己想一个1至100之间的整数，请电脑来猜测这个数");
        int realNumber = random.nextInt(100) + 1;
        int a=70; //a表示电脑的猜测
        while ( a != realNumber) {
            if (a> realNumber) {
                System.out.print("猜大了,输出1,请电脑再次输入它的猜测" );
                a = reader.nextInt();
            } else if (a < realNumber) {
                System.out.print("猜小了,输出0,请电脑再次输入它的猜测");
                a = reader.nextInt();
            }
        }
        System.out.println("猜对了!输出over");
    }
}

