package north_prob;

//2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
public class prob4_3 {
	public static void main(String[] args) {
		for (int i = 1, j = 2; i <= 8; i++, j *= 2) {
			System.out.println("2の" + i + "乗=" + j);
		}
	}
}
