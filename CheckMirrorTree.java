package DS3;

public class CheckMirrorTree {
	public boolean checkMirror(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
		return true;
				}
		if(root1.value !=root2.value){
		return false;
		                }
		if ((root1 == null && root2 != null)
		|| (root1 != null && root2 == null)) { // if any node doesn't
		                                    // have corresponding node in the another tree, return false
		return false;
				}
		// check if left node in one tree is the right node in another tree, and
		// vice versa
		return checkMirror(root1.leftPart, root2.rightPart)
		&& checkMirror(root1.rightPart, root2.leftPart);
			}
		public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
				root1.leftPart = new TreeNode(2);
				root1.leftPart.rightPart = new TreeNode(3);
				root1.rightPart = new TreeNode(4);
		TreeNode root2 = new TreeNode(1);
				root2.rightPart = new TreeNode(2);
				root2.rightPart.leftPart = new TreeNode(3);
				root2.leftPart = new TreeNode(4);
		CheckMirrorTree i = new CheckMirrorTree();
		System.out.println("Is Mirror Trees : " + i.checkMirror(root1, root2));
			}
		}

