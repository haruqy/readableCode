package readablecode;

import java.util.Arrays;

/**
 * KISS(Keep It Short and Simple)説明用クラス
 *
 * @author haru
 *
 */
public class KissSample {

	private static final boolean CONST_BOOL_ODD_TRUE = true;
	private static final boolean CONST_BOOL_ODD_FALSE = false;
	private static final int[] intArr = { 1, 2, 3, 4, 5, 6 };

	public static void main(String[] arg) {
		System.out.println("###A 奇数の合計は：" + getIntArrSumA(intArr, CONST_BOOL_ODD_TRUE));
		System.out.println("###A 偶数の合計は：" + getIntArrSumA(intArr, CONST_BOOL_ODD_FALSE));
		System.out.println("###B 奇数の合計は：" + getIntArrSumB(intArr, CONST_BOOL_ODD_TRUE));
		System.out.println("###B 偶数の合計は：" + getIntArrSumB(intArr, CONST_BOOL_ODD_FALSE));
	}

	/**
	 * for ループを利用した奇数、偶数の合計取得関数
	 *
	 * @param intArr
	 * @param isOdd
	 * @return retSum
	 */
	private static Integer getIntArrSumA(int[] intArr, boolean isOdd) {
		int retSum = 0;

		for (int arr : intArr) {
			if (isOdd) {
				if ((arr % 2) != 0) {
					retSum += arr;
				}
			} else {
				if ((arr % 2) == 0) {
					retSum += arr;
				}
			}
		}

		return retSum;
	}

	/**
	 * Java8 StreamAPIを利用した奇数、偶数の合計取得関数
	 *
	 * @param intArr
	 * @param isOdd
	 * @return retSum
	 */
	private static Integer getIntArrSumB(int[] intArr, boolean isOdd) {
		return isOdd ? Arrays.stream(intArr).filter(i -> i % 2 != 0).sum()
				: Arrays.stream(intArr).filter(i -> i % 2 == 0).sum();
	}
}
