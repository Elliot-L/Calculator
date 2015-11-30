import java.util.*;
public class CalcQueue {
	//instance variables
	private Queue<Double> numbers = new LinkedList<Double>();
	private Queue<Character> operators = new LinkedList<Character>();
	private boolean opQueueable = false; //starts false, adding an integer to the stack makes it true, indicating another operation can be added
	
	//getters and setters
	public boolean getOpQueueable(){
		return opQueueable;
	}
	
	public void setOpQueueable(boolean b){
		opQueueable = b;
	}
	
	public Double numPeekTop(){
		return numbers.peek();
	}
	
	public Character opPeekTop(){
		return operators.peek();
	}
	
	public void addNum(Double i){
		numbers.add(i);
		opQueueable = true; //indicates the calculator has another number to perform operations on
	}
	
	public void addOp(Character i){
		if (opQueueable){
			operators.add(i);
			opQueueable = false; //indicates the calculator needs another number before an operator can be added
		}
	}
	
	//calculates and returns the result, opQueueable is checked in the main class
	public double calculate(){
		double d;
		char op;
		double result = numbers.remove();
		while (numbers.size() > 0){
			d = numbers.remove();
			op = operators.remove();
			if (op == '+')
				result += d;
			else if(op == '-')
				result = (result - d);
			else if (op == 'x')
				result = (result * d);
			else if (op == '/')
				result = (result / d);
		}//ends while loop
		opQueueable = false;
		numbers.add(result);
		return result;
	}
	
	//clears the stacks
	public void clear(){
		int n = numbers.size();
		int o = operators.size();
		for (int i = 0; i < n; i++){
			numbers.remove();
		}
		for (int i = 0; i < o; i++){
			operators.remove();
		}
	}
}//ends class
