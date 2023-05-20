package readablecode;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * 六章＿コメントは正確に簡潔に_A
 *
 * @author haru
 *
 */
public class 六章＿コメントは正確に簡潔に_A {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("C", "C++", "Java");
        reversePrint(list);
    }

    /**
     * `ListIterator`を使用して、リストを逆の順序で繰り返します
     * リストに前の要素がある場合、 `hasPrevious()`はtrueを返します
     * リストに前の要素がなくなるまでリストの文字列を出力します。
     *
     * @param list
     */
    static void reversePrint(List<String> list) {

        // `ListIterator`を使用して、リストを逆の順序で繰り返します
        ListIterator<String> itr = list.listIterator(list.size());

        // リストに前の要素がある場合、 `hasPrevious()`はtrueを返します
        // リストに前の要素がなくなるまでリストの文字列を出力します。
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
