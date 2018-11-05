
import java.util.Stack;
import java.util.Iterator;

public class Calculator {
	
	private Stack<Integer> stack;
	
	public Calculator () {
		stack = new Stack<Integer>();
	}
	
	public void loadConstant (int c) {
		
		stack.push(c);
	}
	
	public String toString() {
		String result = "[";
		
		Iterator<Integer> it = stack.iterator();
		while (it.hasNext()) {
			result += it.next();
			if (it.hasNext())
				result += " ";
		}
		
		result += "].";
		
		return result;
	}
	
	public void add () {
		int n = stack.pop();
		
		int m = stack.pop();
		
		loadConstant (n+m);
	}
	
	public void subtract () {
		int n = stack.pop();
		
		int m = stack.pop();
		
		loadConstant (m-n);
	}
	
	public void multiply () {
		
		int n = stack.pop();
		
		int m = stack.pop();
		
		loadConstant (n*m);
	}
	
	public void divide () {
		
		int n = stack.pop();
		
		int m = stack.pop();
		
		loadConstant (m/n);
	}
	
	public void total () {
		int result = 0;
		
		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		
		loadConstant (result);
	}
}
