package Labsheet_08;

public class SumOfLeftLeaves {
		
		public static class Node{
			int data;
			Node left,right;

			public Node (int data) {
				this.data=data;
				left=right=null;
			}
		}
		
		Node root;
		
		boolean isLeaf(Node node) {
		
			if(node==null)
				return false;
			
			if(node.left==null && node.right==null)
				return true;
	
			return false;
			}
		
		int LeftLeavesSum(Node node) {
			
			int sum=0;
			 if(node!=null) {
				 
				 if(isLeaf(node.left))
					 sum+=node.left.data;
				 
				 else
					 sum+=LeftLeavesSum(node.left);
				 
				 sum+=LeftLeavesSum(node.right);
				 
			 }
			 
			 return sum;
			
		}
	
	public static void main(String[] args) {
		
		SumOfLeftLeaves L=new SumOfLeftLeaves();
		
		L.root = new Node(20); 
		L.root.left = new Node(9); 
		L.root.right = new Node(49); 
		L.root.left.right = new Node(12); 
		L.root.left.left = new Node(5); 
		L.root.right.left = new Node(23); 
		L.root.right.right = new Node(52); 
		L.root.left.right.right = new Node(12); 
		L.root.right.right.left = new Node(50); 
		
		 System.out.println("The sum of left leaves: " + L.LeftLeavesSum(L.root));

	}

}
