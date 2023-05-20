package readablecode;

/**
 * 九章＿変数と読みやすさ_B
 *
 * @author haru
 *
 */
public class 九章＿変数と読みやすさ_B {

    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        String str_ = "method1";
        System.out.println("### method1 str_:" + str_);
        str_ = method2(str_);
        System.out.println("### method1 str_:" + str_);
    }

    static String method2(String str) {
        // Uses str_
        str = "method2";
        return str;
    }
    // Lots of other methods that don't use str_ ...
}
