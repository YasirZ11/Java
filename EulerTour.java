package Labsheet_08;

import java.util.Vector;

public class EulerTour {
		
		static class Node{
			int data;
			Node left;
			Node right;
		}

		static Node newNode(int data){
			Node temp = new Node();
			temp.data = data;
			temp.left = temp.right = null;
			return temp;
			}
		
		void PostOrder(Node node){
			
			if(node==null)
				return;
			
			PostOrder(node.left);
			PostOrder(node.right);
			System.out.print(node.data +" ");
			
		}
		
		void InOrder(Node node){
			
			if(node==null)
				return;
			
			InOrder(node.left);
			System.out.print(node.data +" ");
			InOrder(node.right);
		}
		
		void PreOrder(Node node){
			
			if(node==null)
				return;
			
			System.out.print(node.data +" ");
			PreOrder(node.left);
			PreOrder(node.right);
		}
		
		boolean printAncestor(Node node, int target) {
			if(node==null)
				return false;
			
			if(node.data==target)
				return true;
			
			if (printAncestor(node.left,target) || printAncestor(node.right,target)) {
				System.out.print(node.data+" ");
				
			return true;
		}
			
			return false;
		}
		

		static Vector eulerTree(Node root, Vector Euler)	{
			
			Euler.add(root.data);

			if (root.left != null){
				
				Euler = eulerTree(root.left, Euler);
				Euler.add(root.data);
			}

			if (root.right != null){
		
				Euler = eulerTree(root.right, Euler);
				Euler.add(root.data);
			}
			return Euler;
		}

		static void printEulerTour(Node root){

			Vector Euler = new Vector();
			Euler = eulerTree(root, Euler);

			for (int i = 0; i < Euler.size(); i++)
				System.out.print(Euler.get(i) + " ");
		}

		public static void main(String[] args)	{
			
			EulerTour E=new EulerTour();
			Node root = newNode(1);
			root.left = newNode(2);
			root.right = newNode(3);
			root.left.left = newNode(4);
			root.left.right = newNode(5);
			root.right.left = newNode(6);
			root.right.right = newNode(7);
			root.right.left.right = newNode(8);

			System.out.println("The euler tour traversal: ");
				printEulerTour(root);

	       System.out.println("\nPreorder traversal of  euler tour is: ");
	        	E.PreOrder(root);
	 
	        System.out.println("\nInorder traversal of  euler tour is: ");
	        E.InOrder(root);
	 
	        System.out.println("\nPostorder traversal of  euler tour is: ");
	        E.PostOrder(root);
		
	        System.out.println("\nAncestors traversal of  euler tour is: ");
	        E.printAncestor(root,8);
	}
}
