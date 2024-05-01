package Labsheet_08;
	
	public class SumOfNodes {

		public static class Node{
		int data;
		Node left,right;

		public Node (int data) {
			this.data=data;
			left=right=null;
		}
	}

			 Node root;
		
			 SumOfNodes(){
				 root=null;
			 }
			 
		public int calcSumOfNodes(Node temp) {
		
			int sum,sumLeft,sumRight;
			sum=sumLeft=sumRight=0;
			
			if(root==null) {
				System.out.println("Tree is empty");
				return 0;
			}
		
			else {
			
				if(temp.left!=null)
					sumLeft=calcSumOfNodes(temp.left);
				
				if(temp.right!=null)
					sumRight=calcSumOfNodes(temp.right);
				
				sum=temp.data+sumLeft+sumRight;
				return sum;	
			}
	
		}
		
	public static void main(String[] args) {
	
		SumOfNodes s=new SumOfNodes();
		
		s.root=new Node(5);
		s.root.left= new Node(4);
		s.root.right=new Node(6);
		s.root.left.left=new Node(2);
		s.root.left.right=new Node(8);
		s.root.right.left=new Node(3);
		s.root.right.right=new Node(9);
		
		System.out.println("Sum of all nodes of binary tree: " + s.calcSumOfNodes(s.root));  
	
	}

}
