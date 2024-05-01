
	public class ConstructChain {
		
		
		int id;
		String name;
		ConstructChain(){
		System.out.println("default constis invoked");
		}
		
		ConstructChain(int id,String name){
		this ();
		this.id = id;
		this.name = name;
		}
	
	public static void main(String[] args) {
		

	}

}
