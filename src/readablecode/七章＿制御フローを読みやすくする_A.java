package readablecode;

/**
 * 七章＿制御フローを読みやすくする_A
 *
 * @author haru
 *
 */
public class 七章＿制御フローを読みやすくする_A {
    public static void main(String[] args) {

        int length = 20;
        if (length >= 10) {
            System.out.println("length >= 10");
        }

        Object obj = null;
        if (obj == null) {
            System.out.println("obj == null");
        }

        String str = "null";
        if (str.equals("null")) {
            System.out.println("str.equals(\"null\")");
        }
    }
}
