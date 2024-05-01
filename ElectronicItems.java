		class SuperSonicProduct{
			protected int productld;
			protected double regularPrice;
			
			public SuperSonicProduct(){
			
			}
			
			public SuperSonicProduct(int productld, double regularPrice){
				this.productld=productld;
				this.regularPrice=regularPrice;
			}
			
			public double computerSalePrice(){
				return regularPrice;
			}
		}

			class MP3Player extends SuperSonicProduct{
				private String manufacturer;
				private String color;
			
				public MP3Player(int productld, double regularPrice, String manufacturer,String color){
						this.productld=productld;
						this.regularPrice=regularPrice;
						this.manufacturer=manufacturer;
						this.color=color;
				}

					public void displayDetails(){
						System.out.println("\t\tMP3 Player");
						System.out.println("product ID\t\t"+productld);
						System.out.println("Manufacturer\t\t"+manufacturer);
						System.out.println("Regular price\t\t"+regularPrice);
						System.out.println("Color\t\t\t"+color);
						System.out.println("Sale Price\t\t"+computerSalePrice());
					}
					
					public double computerSalePrice(){
						return regularPrice*0.9;
					}
			}

				class Television extends SuperSonicProduct{
					private String manufacturer;
					private int size;
					public Television(int productld, double regularPrice, String manufacturer,int size){
						this.productld=productld;
						this.regularPrice=regularPrice;
						this.manufacturer=manufacturer;
						this.size=size;
					}
					public void displayDetails(){
						System.out.println("\t\tTelevision");
						System.out.println("product ID\t\t"+productld);
						System.out.println("Manufacturer\t\t"+manufacturer);
						System.out.println("Regular price\t\t"+regularPrice);
						System.out.println("Size\t\t\t"+size+" inches");
						System.out.println("Sale Price\t\t"+computerSalePrice());
					}
					
					public double computerSalePrice(){
						if(size>=24 && size<=40)
							return regularPrice*0.6;
						else if (size>=41 && size<=60)
							return regularPrice*0.8;
						else
							return regularPrice*0.9;
					}
				}
				
				class Laptop extends SuperSonicProduct{
					private String manufacturer;
					private int ramMemory;
					private int storage;
					private String processor;
					
		public Laptop(int productld, double regularPrice, String manufacturer,int ramMemory,int storage,String processor){
					this.productld=productld;
					this.regularPrice=regularPrice;
					this.manufacturer=manufacturer;
					this.ramMemory=ramMemory;
					this.storage=storage;
					this.processor=processor;
		}
		public void displayDetails(){
			System.out.println("\t\tLaptop");
			System.out.println("product ID\t\t"+productld);
			System.out.println("Manufacturer\t\t"+manufacturer);
			System.out.println("Regular price\t\t"+regularPrice);
			System.out.println("Ram\t\t\t"+ramMemory+"GB");
			System.out.println("Storage\t\t\t"+storage+"GB");
			System.out.println("Processor\t\t"+processor);
			System.out.println("Sale Price\t\t"+computerSalePrice());
		}
		
		public double computerSalePrice(){
			double regularPrice1 =regularPrice;
			if(processor=="Corei3" && (ramMemory==2 || ramMemory==3)&& storage==300)
				regularPrice1=regularPrice*0.55;
			else if(processor=="Corei5" && ramMemory==2 &&(storage==300 || storage==500))
				regularPrice1=regularPrice*0.65;
			else if(processor=="Corei5" && ramMemory==4 &&storage==300 )
				regularPrice1=regularPrice*0.7;
			else if(processor=="Corei7" && ramMemory==3 &&(storage==300 || storage==500))
				regularPrice1=regularPrice*0.80;
			else if(processor=="Corei7" && (ramMemory==4 || ramMemory==8)&& (storage==500 || storage==1))
				regularPrice1=regularPrice*0.9;
				return regularPrice1;
		}
				}

				public class ElectronicItems {
					public static void main(String[] args){
						MP3Player m=new MP3Player(1012,1000,"Sony","Grey");
						m.displayDetails();
						Television t=new Television(2019,42000,"Samsung",42);
						t.displayDetails();
						Laptop l=new Laptop(2093,67000,"Acer",4,500,"Corei7");
						l.displayDetails();
						System.out.println("Total Price\t\t"+(m.computerSalePrice()
								+t.computerSalePrice()+l.computerSalePrice()));
					}
				}
