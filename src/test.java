import java.util.Random;

public class test {

	public static void main(String args[]) {

		// 배열 생성
		int[] myLotto = new int[6];

		// 랜덤 객체 클래스 생성
		Random random = new Random();

		// 번호 임의로 생성(6개 1~45)
		for (int i = 0; i < myLotto.length; i++) {
			myLotto[i] = random.nextInt(45) + 1;

			// 중복제거
			for (int j = 0; j < i; j++) {
				if (myLotto[i] == myLotto[j]) {
					i--;
					break;
				}
			}

			// 나온 번호 정렬
			for (int k = 0; k <= i; k++) {
				if (myLotto[k] > myLotto[i]) {
					int tmp;

					tmp = myLotto[i];
					myLotto[i] = myLotto[k];
					myLotto[k] = tmp;
				}
			}
		}

		// 번호 6개 출력
		for (int i = 0; i < myLotto.length; i++) {
			System.out.printf(" " + myLotto[i]);
		}
		System.out.println();
	}
}