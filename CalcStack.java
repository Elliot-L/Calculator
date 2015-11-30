import java.util.Stack; 
public class CalcStack {
	//instance variables
	private Stack<Double> numbers = new Stack<Double>();
	private Stack<Character> operators = new Stack<Character>();
	private boolean opPushable = false; //starts false, adding an integer to the stack makes it true, indicating another operation can be added
	
	//getters and setters
	public boolean getOpPushable(){
		return opPushable;
	}
	
	public void setOpPushable(boolean b){
		opPushable = b;
	}
	
	public Double numPeekTop(){
		return numbers.peek();
	}
	
	public Character opPeekTop(){
		return operators.peek();
	}
	
	public void pushNum(Double i){
		numbers.push(i);
		opPushable = true; //indicates the calculator has another number to perform operations on
	}
	
	public void pushOp(Character i){
		if (opPushable){
			operators.push(i);
			opPushable = false; //indicates the calculator needs another number before an operator can be added
		}
	}
	
	//calculates and returns the result, opPushable is checked in the main class
	public double calculate(){
		double d;
		char op;
		double result = numbers.pop();
		while (numbers.size() > 0){
			d = numbers.pop();
			op = operators.pop();
			if (op == '+')
				result += d;
			else if(d == '-')
				result = result - d;
			else if (op == 'x')
				result = (result * d);
			else if (op == '/')
				result = (result / d);
		}//ends while loop
		opPushable = false;
		numbers.push(result);
		return result;
	}
	
	//clears the stacks
	public void clear(){
		int n = numbers.size();
		int o = operators.size();
		for (int i = 0; i < n; i++){
			numbers.pop();
		}
		for (int i = 0; i < o; i++){
			operators.pop();
		}
	}
}//ends class
