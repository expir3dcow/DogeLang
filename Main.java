
public class Main {
/*
 *REMEMBER <name> <value> declares a variable.
 *YAP <name> Prints the value of a variable.
 *<Bark> <value> Prints text.
 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Interpreter(""
				+ "REMEMBER abc = 13;"
				+ "YAP abc;"
				+ "BARK Hi Twitter").run();
		
	}

}
