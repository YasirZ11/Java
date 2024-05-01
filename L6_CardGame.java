package Labsheets;

class L6_CardGame {

	public static void main(String[] args) {
	 int n=(int)(1+Math.random()*13);
	 int d=(int)(Math.random()*3);
	 
	 System.out.print("The card you picked is ");
	
	 switch(n) {
	 case 1:System.out.print("Ace ");
	 break;
	 case 2:System.out.print("2 ");
	 break;
	 case 3:System.out.print("3 ");
	 break;
	 case 4:System.out.print("4 ");
	 break;
	 case 5:System.out.print("5 ");
	 break;
	 case 6:System.out.print("6 ");
	 break;
	 case 7:System.out.print("7 ");
	 break;
	 case 8:System.out.print("8 ");
	 break;
	 case 9:System.out.print("9 ");
	 break;
	 case 10:System.out.print("10 ");
	 break;
	 case 11:System.out.print("Jack ");
	 break;
	 case 12:System.out.print("Queen ");
	 break;
	 case 13:System.out.print("King ");
	 break;
	 }
	 
	 System.out.print("of ");
	 switch(d) {
	 case 0:System.out.print("Hearts ");
	 break;
	 case 1:System.out.print("Spades ");
	 break;
	 case 2:System.out.print("Diamonds ");
	 break;
	 case 3:System.out.print("Clubs ");
	 break;
	 }

	}

}
