package DS8;

/**
 * to define node of tree
 * each node contain value,leftpart,rightpart
 *
 */
public class BTNode {
	int value;
	BTNode leftPart;
	 BTNode rightPart;
	 //parameterized constructor to set value at node
	public BTNode(int value){
		this.value=value;
		this.leftPart=null;
		this.rightPart=null;
	}

}
