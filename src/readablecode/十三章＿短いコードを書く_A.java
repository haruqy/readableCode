package readablecode;

import org.apache.commons.lang3.StringUtils;

/**
 * 十三章＿短いコードを書く_A
 *
 * @author haru
 *
 */
public class 十三章＿短いコードを書く_A {

    public static void main(String[] args) {

        String str = " 　 A B C 　 ";

        // Stringのtrimは半角スペースのみの対応で全角スペースは削除されない
        System.out.println("### String.trim:" + str.trim());

        // Java バージョンが１１以上であれば、stripを利用
        System.out.println("### java11Strip:" + java11Strip(str));

        // Java バージョンが１１未満であれば、Apache Common API のstripを利用
        System.out.println("### ApacheCommonStrip:" + ApacheCommonStrip(str));
    }

    /**
     * Java バージョン１１のstrip利用
     *
     * @param str
     * @return
     */
    static String java11Strip(String str) {
        return str.strip();
    }

    /**
     * Apache Common API のstripを利用
     *
     * @param str
     * @return
     */
    static String ApacheCommonStrip(String str) {
        return StringUtils.strip(str);
    }
}
