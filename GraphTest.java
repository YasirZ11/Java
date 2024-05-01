	package Labsheet_09;
	
		class vertex{
			char data;
			boolean visited;
			
			vertex(char data){
				this.data=data;
				visited= false;
			}
		}

	class Graph{
		
		private int nvertex;
		vertex nodes[];
		private boolean directed;
		private boolean weighted;
		private int matrix[][];
		private boolean [][] isSetMatrix;
		Stack stack = new Stack();
		Queue queue= new Queue();
		
	public Graph(int num,boolean directed, boolean weighted) {
		
		this.directed=directed;
		this.weighted=weighted;
		matrix=new int[num][num];
		isSetMatrix= new boolean [num][num];
		nodes= new vertex[num];
		nvertex=0;
		}
	
	void addVertex(char a)	{
		nodes[nvertex++]=new vertex(a);
		}
	
	void addEdge(char start,char end){
		int value=1;
		
		if(weighted)
			value=0;
		matrix[find(start)][find(end)]=value;
		isSetMatrix[find(start)][find(end)]=true;
	
			if(!directed){
		matrix[find(end)][find(start)]=value;
		isSetMatrix[find(end)][find(start)]=true;
				}
		}
	
	void addEdge(char start,char end,int weight){
	
		int value=weight;
			
		if(!weighted)
			value=1;
			matrix[find(start)][find(end)]=value;
			isSetMatrix[find(start)][find(end)]=true;
			
		if(!directed){
			matrix[find(end)][find(start)]=value;
			isSetMatrix[find(end)][find(start)]=true;
			}
		}
		
		int find(int f){
		int index=0;
			for(int i=0;i<nodes.length;i++){
				if(nodes[i].data==f)
						index=i;
			}
			
			return index;
		}
	
	
	public void printMatrix() {
		
		System.out.print("\t");
			
			for(int j=0;j<matrix.length;j++){
				System.out.print(nodes[j].data+"\t");
			}
			System.out.println();
			
			for(int i=0;i<matrix.length;i++){
				System.out.print(nodes[i].data+"\t");
		
				for(int j=0;j<matrix.length;j++){
					
					if(isSetMatrix[i][j])
						System.out.print(matrix[i][j]+"\t");
					else
						System.out.print("-\t");
				}
	
				System.out.println();
			}
		}
	
	public void printEdges() {
		
		for(int i=0; i<matrix.length;i++) {
			System.out.print("Vertex " +i+" is connected to: " );
			
		for(int j=0;j<matrix.length;j++) {
				
				if (isSetMatrix[i][j]) {
						System.out.print(j+ " ");
					}
				}
				
				System.out.println();
			}
		
		}
	
	public boolean hasEdge(char start, char end) {
		
			return isSetMatrix[find(start)][find(end)];				
		}
	
	public int unvisitedVertex(int index) {
			for(int i=0; i<nodes.length;i++ ) {
				if(isSetMatrix[index][i]==true && !nodes[i].visited)
					return i;
			}
			return -1;
		}
		
	void dfs(char start) {
		stack.push(start);
		nodes[find(start)].visited=true;
		
			while(!stack.isEmpty()) {
				
					int in=unvisitedVertex(find(stack.peek()));
						if(in==-1) {
							System.out.print(stack.pop()+" ");
						}
						
						else {
							stack.push(nodes[in].data);
							nodes[in].visited=true;
						}
					}
				
				for (int i=0;i<nodes.length;i++) {
					nodes[i].visited=false;
				}		
		}
	
	void bfs(char start) {
		queue.enqueue(start);
		nodes[find(start)].visited=true;
		
		while(!queue.isEmpty()) {
			for(int i=0; i<nodes.length;i++ ) {
				if(isSetMatrix[find(queue.peek())][i]==true && !nodes[i].visited) {
					queue.enqueue(nodes[i].data);
					nodes[i].visited=true;
				}
			}
				System.out.print(queue.dequeue()+" ");
		}
			for(int i=0;i<nodes.length;i++) {
				nodes[i].visited=false;
		}
	}

	}

public class GraphTest {

	public static void main(String[] args) {

		Graph g=new Graph(7,false,false);
		g.addVertex('0');
		g.addVertex('1');
		g.addVertex('2');
		g.addVertex('3');
		g.addVertex('4');
		g.addVertex('5');
		g.addVertex('6');
		g.addEdge('0', '1');
		g.addEdge('0', '2');
		g.addEdge('0', '3');
		g.addEdge('1', '5');
		g.addEdge('1', '6');
		g.addEdge('2', '4');
		g.addEdge('3', '2');
		g.addEdge('3', '4');
		g.addEdge('4', '1');
		g.addEdge('6', '4');
		g.printMatrix();
		System.out.println();
		g.printEdges();
		System.out.println();
		System.out.println("DFS traversal");
		g.dfs('0');
		System.out.println();
		System.out.println();
		System.out.println("BFS traversal");
		g.bfs('0');
		}
	}

