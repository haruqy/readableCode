package readablecode;

/**
 * 十三章＿短いコードを書く_B
 *
 * @author haru
 *
 */
public class 十三章＿短いコードを書く_B {

    public static void main(String[] args) {

        String str = " 　 A B C 　 ";

        // Stringのtrimは半角スペースのみの対応で全角スペースは削除されない
        System.out.println("### String.trim:" + str.trim());

        System.out.println("### localTrim:" + localTrim(str));
        System.out.println("### Stripper.strip:" + Stripper.strip(str));

    }

    /**
     * 正規表現を利用して全角スペース（\h）を空白にReplaceする
     * @param str
     * @return
     */
    static String localTrim(String str) {
        return str.replaceFirst("^[\\h]+", "").replaceFirst("[\\h]+$", "");
    }

}

/**
 * 独自のStripクラスを作成
 * @author haru
 *
 */
class Stripper {
    static String strip(String str) {
        return stripTrailing(stripLeading(str));
    }

    static String stripLeading(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();
        int firstIndex = 0;

        // 文字列の先頭から削除対象でない文字を探して…
        for (; firstIndex < chars.length; firstIndex++) {
            if (!isTarget(chars[firstIndex])) {
                break;
            }
        }

        return str.substring(firstIndex); // substringして戻す
    }

    static String stripTrailing(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();
        int lastIndex = chars.length - 1;

        // 文字列の最後から削除対象でない文字を探して…
        for (; lastIndex >= 0; lastIndex--) {
            if (!isTarget(chars[lastIndex])) {
                break;
            }
        }

        return lastIndex >= 0 ? str.substring(0, lastIndex + 1) : str; // substringして戻す
    }

    private static boolean isTarget(char c) {
        return Character.isWhitespace(c);
    }
}
