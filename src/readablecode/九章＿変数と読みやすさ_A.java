package readablecode;

/**
 * 九章＿変数と読みやすさ_A
 *
 * @author haru
 *
 */
public class 九章＿変数と読みやすさ_A {

    static String str_;
    public static void main(String[] args) {
        System.out.println("### str_:" + str_);
        method1();
        System.out.println("### str_:" + str_);
    }

    static void method1() {
        str_ = "method1";
        method2();
    }

    static void method2() {
        // Uses str_
        str_ = "method2";
    }
    // Lots of other methods that don't use str_ ...
}
