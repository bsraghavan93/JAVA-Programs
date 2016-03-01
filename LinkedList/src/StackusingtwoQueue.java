import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class StackusingtwoQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public int pop(){
		if(q1.peek()==null){
			System.out.println("The Stack is Empty nothing to Return");
			int i =0;
			return i;
		}
		else {
			int pop= q1.remove();
			return pop;
		}
	}
	
	public void push(int data){
		if(q1.peek()== null){
			q1.add(data);
		}
		else{
			for(int i=q1.size();i>0;i--){
				q2.add(q1.remove());
			}
		}
		q1.add(data);
		for(int j =q2.size();j>0;j--){
			q1.add(q2.remove());
		}
		
	}



public static void main (String args[]){
	Stack<Integer> s1 = new Stack<Integer>();
	s1.push(1);
	s1.push(2);
	s1.push(3);
	
	System.out.println("1st = " + s1.pop());
	System.out.println("2nd = " + s1.pop());
	System.out.println("3rd=  "+ s1.pop());
	}
}