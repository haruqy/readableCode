package readablecode;

/**
 * 七章＿制御フローを読みやすくする_B
 *
 * @author haru
 *
 */
public class 七章＿制御フローを読みやすくする_B {
    public static void main(String[] args) {

        int length = 20;
        if (10 <= length) {
            System.out.println("10 <= length");
        }

        Object obj = null;
        if (null == obj) {
            System.out.println("null == obj");
        }

        String str = "null";
        if ("null".equals(str)) {
            System.out.println("\"null\".equals(str)");
        }
    }
}
