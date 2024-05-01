package Labsheet_08;

	class Node{
		int key;
		Node left,right;
		
		public Node (int item) {
			key=item;
			left=right=null;
		}
	}

	
	public class BinaryTree {
		
		Node root;
		
		BinaryTree(){
			root=null;
		}
	
		void PostOrder(Node node){
			
			if(node==null)
				return;
			
			PostOrder(node.left);
			PostOrder(node.right);
			System.out.print(node.key +" ");
			
		}
		
		void InOrder(Node node){
			
			if(node==null)
				return;
			
			InOrder(node.left);
			System.out.print(node.key +" ");
			InOrder(node.right);
		}
		

		void PreOrder(Node node){
			
			if(node==null)
				return;
			
			System.out.print(node.key +" ");
			PreOrder(node.left);
			PreOrder(node.right);
			
		}
		
		
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		Node root = new Node(40);
		tree.root = root;
		tree.root.left = new Node(20);
	    tree.root.left.left = new Node(10);
	    tree.root.left.left.left = new Node(5);
	    tree.root.left.right = new Node(30);
	    tree.root.right = new Node(50);
	    tree.root.right.right = new Node(60);
	    tree.root.left.right.left = new Node(67);
	    tree.root.left.right.right = new Node(78);
 
        System.out.println(
            "Preorder traversal of binary tree is ");
        	tree.PreOrder(tree.root);
 
        System.out.println(
            "\nInorder traversal of binary tree is ");
        tree.InOrder(tree.root);
 
        System.out.println(
            "\nPostorder traversal of binary tree is ");
        tree.PostOrder(tree.root);
		
	}

}
