package readablecode;

public class DrySampleB {

    public static void main(String[] arg) {
        Person 李丙旭 = new DrySampleB().new Person("李", "丙旭");
        Person 李受珉 = new DrySampleB().new Person("李", "受珉");
        Person 仲田尚泰 = new DrySampleB().new Person("仲田", "尚泰");

        System.out.println("###B goodmorning：" + greetings("おはようございます！ ", 李丙旭));
        System.out.println("###B goodmorning：" + greetings("おはようございます！ ", 李受珉));
        System.out.println("###B goodbye：" + greetings("さようなら〜 ", 仲田尚泰));
    }

    /**
     * 挨拶（汎用）
     *
     * @param message
     * @param person
     * @return
     */
    private static String greetings(String message, Person person) {
        return message + " " + person.getFullName() + "さん";
    }

    /**
     * 個人のオブジェクト
     *
     * @author haru
     *
     */
    public class Person {
        private String firstName;
        private String lastName;

        public Person(String lastName) {
            this.setLastName(lastName);
        }

        public Person(String lastName, String firstName) {
            this.setFirstName(firstName);
            this.setLastName(lastName);
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFullName() {
            return lastName + " " + firstName;
        }

        @Override
        public String toString() {
            return "Persion [firstName=" + firstName + ", LastName=" + lastName + "]";
        }
    }
}
