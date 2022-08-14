package north_prob;

//整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
import java.util.Scanner;
public class prob4_5 {
	public static void main(String[] args) {
		int sum = 0;
		try (Scanner scan = new Scanner(System.in)) {
			for (int i = 1; i <= 10; i++) {
					int num = scan.nextInt();
					sum += num;
				}
		}
		System.out.println("平均値は" + (sum / 10));
	}
}
