import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Lotto {

	int[] myLotto = new int[6];

	public int[] getNum() {
		return myLotto;
	}

	public void start() {

		// 랜덤 객체 클래스 생성
		Random random = new Random();

		// 번호 임의로 생성(6개 1~45)3
		for(int i = 0; i<myLotto.length; i++){
			myLotto[i] = random.nextInt(45)+1;
			// 중복제거
//			for(int j=0; j<i; j++){
//				if(myLotto[i] == myLotto[j]){
//					i--;
//					break;
//				}
//			}
			sorting();
		}
	}

	public void sorting() {
		Arrays.sort(myLotto);
	}
}

public class lottoCreate {
	public static void main(String args[]) {
		Lotto lotto = new Lotto(); // 로또 객체 생성
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.println("안녕하세요 행복나눔로또 삼육대점입니다.");
		System.out.print("몇 게임을 구매하시겠습니까? ");

		n = sc.nextInt();

		for(int i=0; i<n; i++){
			lotto.start();

			for(int k : lotto.getNum()) {
				System.out.printf("%4d", k);
			}
			System.out.println();
		}
	}
}

//import java.util.Random;
//
//public class lottoCreate {
//
//	public static void main(String args[]) {
//
//		// 배열 생성
//		int[] myLotto = new int[6];
//
//		// 랜덤 객체 클래스 생성
//		Random random = new Random();
//
//		// 번호 임의로 생성(6개 1~45)
//		for (int i = 0; i < myLotto.length; i++) {
//			myLotto[i] = random.nextInt(45) + 1;
//
//			// 중복제거
//			for (int j = 0; j < i; j++) {
//				if (myLotto[i] == myLotto[j]) {
//					i--;
//					break;
//				}
//			}
//
//			// 나온 번호 정렬
//			for (int k = 0; k <= i; k++) {
//				if (myLotto[k] > myLotto[i]) {
//					int tmp;
//
//					tmp = myLotto[i];
//					myLotto[i] = myLotto[k];
//					myLotto[k] = tmp;
//				}
//			}
//		}
//
//		// 번호 6개 출력
//		for (int i = 0; i < myLotto.length; i++) {
//			System.out.printf(" " + myLotto[i]);
//		}
//		System.out.println();
//	}
//}
