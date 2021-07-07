package ue9;

import java.util.Arrays;
import java.util.List;

public class IntegerArrayUtil {
	
	public static final List<String> OPS = Arrays.asList("=", ">", "<", "!=");
	
	public Integer sumIf(final Integer[] arr, final Integer compare, final String op)
		throws NullPointerException, UnsupportedOperationException {
		if (arr == null || compare == null || op == null)
			throw new NullPointerException("Ungültige Parameterübergabe festgestellt");
		
		if (!OPS.contains(op))
			throw new UnsupportedOperationException("Der Vergleichsoperator " + op + " wird nicht unterstützt");
		
		Integer sum = 0;
		
		for (Integer i : arr) {
			if (i == null) throw new NullPointerException("Element innerhalb des Arrays hat den Wert null");
			
			if (op.equals("=") && i == compare) sum += i;
			else if (op.equals(">") && i > compare) sum += i;
			else if (op.equals("<") && i < compare) sum += i;
			else if (op.equals("!=") && i != compare) sum += i;
		}
		
		return sum;
	}
	
}
