package readablecode;

/**
 * DRY(Don't Repeat You)説明用クラス
 * @author haru
 *
 */
public class DrySampleA {

	public static void main(String[] arg) {
		Person 李丙旭 = new DrySampleA().new Person("李", "丙旭");
		Person 李受珉 = new DrySampleA().new Person("李", "受珉");
		Person 仲田尚泰 = new DrySampleA().new Person("仲田", "尚泰");

		System.out.println("###A goodmorning：" + goodmorning(李丙旭));
		System.out.println("###A goodmorning：" + goodmorning(李受珉));
		System.out.println("###A goodbye：" + goodbye(仲田尚泰));
	}

	/**
	 * 朝の挨拶
	 *
	 * @param person
	 * @return
	 */
	private static String goodmorning(Person person) {
		return "おはようございます！ " + person.getLastName() + "さん";
	}

	/**
	 * 別れの挨拶
	 * @param person
	 * @return
	 */
	private static String goodbye(Person person) {
		return "さよなら〜 " + person.getLastName() + "さん";
	}

	/**
	 * 個人のオブジェクト
	 * @author haru
	 *
	 */
	public class Person {
		private String firstName;
		private String LastName;

		public Person(String LastName) {
			this.setLastName(LastName);
		}

		public Person(String LastName, String firstName) {
			this.setFirstName(firstName);
			this.setLastName(LastName);
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		@Override
		public String toString() {
			return "Persion [firstName=" + firstName + ", LastName=" + LastName + "]";
		}
	}
}
