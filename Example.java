
public class Example {

	public static void main(String[] args) {
		int number;
		String str;
		try {
			str="5";
			number= Integer.parseInt(str.substring(5));
			System.out.println("A");
		}catch (NumberFormatException e) {
			System.out.println("B");
			}catch (IllegalArguementException e) {
				System.out.println("C");
				}catch (Exception e) {
					System.out.println("E");
				}
				finally {
					System.out.println("E");
				}
		System.out.println("G");
	}

}
