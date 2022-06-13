package spoondemo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.declaration.CtField;
import spoon.reflect.visitor.filter.TypeFilter;

public class SpoonStarter {
	public static String query1 ="select * from table1"; 


	
	public static void main(String[] args) {

		
		Launcher launcher = new Launcher();
		launcher.addInputResource("C:\\Users\\91831\\eclipse-workspace\\demoParser\\src\\main\\java\\spoondemo\\DynamicCodeForJDBC.java");
		launcher.buildModel();
		CtModel model = launcher.getModel();
		
		for (CtLocalVariable<?> variable : model.getElements(new TypeFilter<>(CtLocalVariable.class))) {
			
//			System.out.print(variable.getPath()+"\n");
			System.out.print(variable.getSimpleName());
			System.out.print("\n"+variable.getAssignment());
			
		}

	}
}