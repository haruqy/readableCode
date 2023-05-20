package readablecode;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * 六章＿コメントは正確に簡潔に_B
 *
 * @author haru
 *
 */
public class 六章＿コメントは正確に簡潔に_B {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("C", "C++", "Java");
        reversePrint(list);
    }

    /**
     * 引数のリストの文字列を逆順で出力します
     * @param list
     */
    static void reversePrint(List<String> list) {

        ListIterator<String> itr = list.listIterator(list.size());

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
