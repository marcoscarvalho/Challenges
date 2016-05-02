package br.com.hackerrank.challenges.day04;

public class Person {

	public static void main(String[] args) {

		int[] opa = { 4, -1, 10, 16, 18 };

		for (int i = 0; i < opa.length; i++) {
			Person p = new Person(opa[i]);
			p.amIOld();

			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}

			p.amIOld();
			System.out.println();
		}

	}

	private int age;

	public Person(Integer initialAge) {

		if (initialAge >= 0) {
			this.age = initialAge;
		} else {
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}

	}

	public void yearPasses() {
		age += 1;
	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");

		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");

		} else {
			System.out.println("You are old.");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
