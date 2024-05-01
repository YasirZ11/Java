
	public class Stock {
		
		String symbol;
		String name;
		double previousClosingPrice;
		double currentPrice;
		Stock(String symbol,String name){
			this.symbol=symbol;
			this.name=name;
		}
		double getChangePercent(double previousClosingPrice,double currentPrice) {
			double percent=((previousClosingPrice-currentPrice)/currentPrice);
			return percent;
		}
	public static void main(String[] args) {
		Stock s1= new Stock("ORCL","Oracle Corporation");
		System.out.println("Changed Percentage : "+s1. getChangePercent(34.5,34.35)+" %");
	}

}
