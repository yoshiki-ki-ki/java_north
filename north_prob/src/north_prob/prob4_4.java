package north_prob;

//7 の階乗を計算し、表示するプログラムを作成しなさい。
public class prob4_4 {
	public static void main(String[] args) {
		int x = 1;

		for( int i = 7 ; i > 0 ; i-- ) {
		    x *= i;
		}

		System.out.println( x );
	}
}
