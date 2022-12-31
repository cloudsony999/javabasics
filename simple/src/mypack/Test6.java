package mypack;

import javax.swing.JOptionPane;

class Test6 {

	public static void main(String[] args) {
		System.out.println("if else...");

		switchcaseold("arpan");
		switchcasebetter("nisha");
		String lang = JOptionPane.showInputDialog("enter the language");
		JOptionPane.showMessageDialog(null, "the user name is " + switchcasebetter(lang));
	}

	static String switchcasebetter(String name) {
		String answer = switch (name) {
		case "arpan" -> "I am arpan";
		case "nisha" -> "I am nisha";
		case "rishi", "arju", "rishikesh" -> "I am rishi in all 3 cases";

		default -> "other";
		};
		return answer;
	}

	static void choiceLanguage(String name) {
		switch (name) {
		case "Java", "Python" -> System.out.println("Mouma loves Java and Python");
		case "SQL" -> System.out.println("I hate SQL");
		default -> System.out.println("other");
		}
	}

	static void switchcaseold(String name) {

		switch (name) {
		case "amitava":
			System.out.println("I am amitava");
			break;

		case "arpan":
			System.out.println("I am arpan");
			break;
		case "nisha":
			System.out.println("I am nisha");
			break;

		default:
			System.out.println("other....");
		}
	}

}
