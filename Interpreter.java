import java.util.ArrayList;
import java.util.List;

public class Interpreter {
	List<Variable> variables;
	String code;
	
	public Interpreter(String code){
		this.code = code;
		variables = new ArrayList<Variable>();
	}
	
	public void run(){
		String CODE = code.replaceAll("\t", "");
		CODE = CODE.replaceAll(";", "\n");
		CODE = CODE.replaceAll(" ", "");
		
		for(String s : CODE.split("\n")){
			if(s.startsWith("BARK")){
				System.out.println(s.replace("BARK", "") );
			}
			
			else if(s.startsWith("REMEMBER")){
				String v = s.replace("REMEMBER", "");
				String a[] = v.split("=");
				if(a.length == 2)
				variables.add(new Variable(a[0],a[1]));
				else{
					System.out.println("Error, incorrect variable assigment syntax");
				}
			}
			
			else if(s.startsWith("YAP")){
				
				String var = s.replace("YAP", "");
				
				for(Variable a : variables){
					
					if(!var.equals(a.getName())) {
						System.out.println(var + " is undefined");
					}
					else{
						System.out.println(a.getValue());
					}
				}
				
				
					
			}
			
		}	
	}
}
