package practicegit;
/* This program is sample program that prints out sample message.
 * @author chanmei
 * */
public class Sample {

	public Sample() {
		System.out.println("sample message");
	}

	public static void main(String[] args) {
		new Sample();
		System.out.println(""+args[0]);
		System.out.println(""+args[1]);
	}

}
