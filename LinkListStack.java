package DS2;

import java.util.Scanner;

	/**
	 * class to implement stack using linklist function to perform push and pop
	 * operation
	 * @author jyoti
	 */
	public class LinkListStack<E> {
		SingleLinkedlist<E> li;
		public static Node top;
		public static LinkListStack<Character> stack = new LinkListStack<Character>();
		private static String inputExpression;
String outexpression="";
		public static Node getTop() {
			return top;

		}

		public void setTop(Node<E> top) {
			LinkListStack.top = top;
		}

		public LinkListStack() {
			li = new SingleLinkedlist<E>();
			top = SingleLinkedlist.start;
		}

		// function to push item
		public void push(E data) {
			li.add(data);
		}

		// function to pop item
		public Object pop() {
			Object a = li.remove();
			return a;

		}

		public void showlist() {
			li.currentNode = top;
			while (li.currentNode.next == null) {
				li.currentNode = li.currentNode.next;
				System.out.println(li.currentNode.value);

			}
		}

		public void convertInfixToPostfix() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter expression");
			inputExpression = sc.next();
			for (int i = 0; i <inputExpression.length(); i++) {
				char ch = inputExpression.charAt(i);
				if (isOperator(ch)) {
					char x = (char) stack.pop();
					
					while (isOperator(x) && precedence(x) >= precedence(ch)) {
						
					outexpression=outexpression+x;
						x = (char) stack.pop();
					}
					stack.push(x);
					stack.push(ch);
					
				}else if (ch == ')') {

					while (stack.top.value.equals('(')) {
						char re = (char) stack.pop();
						outexpression=outexpression+re;
					}				}

				else {
					outexpression=outexpression+ch;
				}
				
			}
			System.out.println(outexpression);
			sc.close();
		}
		public int precedence(char symbol) {
			if (symbol == '^') {
				return (3);
			} else if (symbol == '*' || symbol == '/') {
				return (2);
			} else if (symbol == '+' || symbol == '-') {
				return (1);
			} else {
				return (0);
			}
		}
		
		

		private boolean isOperator(char c) {
			if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^'
					|| c == ')') {
				return true;
			} else {
				return false;
			}
		}

		public static void main(String args[]) {
			stack.push(' ');
			LinkListStack obj = new LinkListStack();
			obj.convertInfixToPostfix();
			
		}
	}

