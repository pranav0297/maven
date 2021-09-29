package first_maven_project;

public class demo {

	public String app() {
		return "Hello World";
	}
	public static void main (String args[]) {
		demo d = new demo();
		System.out.println(d.app());
	}
}
