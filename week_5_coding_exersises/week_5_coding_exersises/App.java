package week_5_coding_exersises;

public class App {

	public static void main(String[] args) {
		AsteriskLogger ast = new AsteriskLogger();
		SpacedLogger spc = new SpacedLogger();
		spc.log("testing spc log");
		spc.error("Testing spc error");
		System.out.println();
		ast.log("testing ast log");
		System.out.println();
		ast.error("testing ast error");
		System.out.println();

	}

}
