package readablecode;

/**
 * YAGNI(You Aren't Going to Need It)説明用クラス
 *
 * @author haru
 *
 */
public class YagniSample {

	public static void main(String[] arg) {
		Person 李丙旭 = new YagniSample().new Person("李", "丙旭");
		Person 李受珉 = new YagniSample().new Person("李", "受珉");
		Person 仲田尚泰 = new YagniSample().new Person("仲田", "尚泰");

		System.out.println("###A goodmorning：" + goodmorning(李丙旭));
		System.out.println("###A goodmorning：" + goodmorning(李受珉));
		System.out.println("###A goodbye：" + goodbye(仲田尚泰));
	}

	private static String greetings(String message, Person person) {
		return message + " " + person.getFullName() + "さん";
	}

	private static String goodmorning(Person person) {
		return greetings("おはようございます！", person);
	}

	private static String goodbye(Person person) {
		return greetings("さよなら〜", person);
	}

	public class Person {
		private String firstName;
		private String lastName;
		private String middleName;

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

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
			return lastName + " " + middleName + " " + firstName;
		}

		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
		}

	}
}
