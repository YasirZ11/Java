package Labsheet_08;

public class SumOfRightLeaves {
		
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
	
	int RightLeavesSum(Node node) {
		
		int sum=0;
		 if(node!=null) {
			 
			 if(isLeaf(node.right))
				 sum+=node.right.data;
			 
			 else
				 sum+=RightLeavesSum(node.right);
			 
			 sum+=RightLeavesSum(node.left);
			 
		 }
		 
		 return sum;
	
	}

	public static void main(String[] args) {
	
	SumOfRightLeaves R=new SumOfRightLeaves();
	
	R.root= new Node(20); 
	R.root.left = new Node(9); 
	R.root.right = new Node(49); 
	R.root.left.right = new Node(12); 
	R.root.left.left = new Node(5); 
	R.root.right.left = new Node(23); 
	R.root.right.right = new Node(64); 
	R.root.left.right.right = new Node(12); 
	R.root.right.right.left = new Node(23); 
	R.root.right.right.right = new Node(52);
	
	 System.out.println("The sum of right leaves: " +R.RightLeavesSum(R.root));

	}

}


