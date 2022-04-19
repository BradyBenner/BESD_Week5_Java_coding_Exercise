package week_5_coding_exersises;

public class SpacedLogger implements Logger {

	@Override
	public void log(String msg) {
		StringBuilder msg1 = new StringBuilder();
		msg1= spaceOut(msg);
		System.out.println(msg1);
		

	}

	@Override
	public void error(String msg) {
		StringBuilder msg1 = new StringBuilder();
		msg1= spaceOut(msg);
		System.out.println("ERROR: "+msg1);
	}
	private StringBuilder spaceOut(String msg) {
		StringBuilder msg1 = new StringBuilder();
		msg1.append(msg);
		StringBuilder msgFinal = new StringBuilder();
		for(int i = 0; i<msg1.length(); i++) {
			msgFinal.append(msg1.charAt(i));
			msgFinal.append(" ");
		}
		msgFinal.deleteCharAt(msgFinal.length()-1);
		return msgFinal;
		
	}

}
