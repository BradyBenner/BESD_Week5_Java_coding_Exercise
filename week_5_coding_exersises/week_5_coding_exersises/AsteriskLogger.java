package week_5_coding_exersises;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String msg) {
		System.out.println("***"+msg+"***");
	}

	@Override
	public void error(String msg) {
		StringBuilder msg1= new StringBuilder();
		StringBuilder ast1 = new StringBuilder();
		msg1.append("***");
		msg1.append("Error: ");
		msg1.append(msg);
		msg1.append("***");
		for(int i = 0; i<msg1.length();i++) {
			ast1.append("*");
		}
		System.out.println(ast1.toString());
		System.out.println(msg1.toString());
		System.out.println(ast1.toString());
		

	}

}
