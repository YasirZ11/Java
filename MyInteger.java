
	public class MyInteger {
		
		int value;
		
		MyInteger(int value){
			this.value=value;
		}
		
		boolean isEven() {
			return value%2==0;
			
				}
		
		boolean isOdd() {
			return value%2==1;
			
			}
		
		boolean isPrime() {
			if(value==1)
				return false;
		else if (value==2)
			return true;
				else	{
					    for(int i=2;i<value;i++) {
						if(value%i==0)
							return false;
					}
					return true;
				}
			}
		boolean isArmstrong() {
			int a=value;
			int sum=0;
			    while (a!=0) {
			    	int b=a%10;
			    	sum+=(b*b*b);
			    	a=a/10;
			    }
			    return (sum==value);
		}
		
		void display() {
			if(isEven())
				System.out.println("This is Even number");
			if(isOdd())
				System.out.println("This is Odd number");
			if(isPrime())
				System.out.println("This is Prime number");
			if(isArmstrong())
				System.out.println("This is Armstrong number");
		}
		
	public static void main(String[] args) {
	
		MyInteger I1=new MyInteger(371);
		I1.display();
		}

}
