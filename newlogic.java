class sample
  {
     public void checkoffer(int offer)
	{
	  if(offer>=2800)
		{
	          System.out.println("5% of discount");
		}
	  else
		{
		 System.out.println("no offer and discount");
		}
         }

      public void details1(String name,String product,int quantity,int price) 
        {
          System.out.println("Customer Name = "+name);
          System.out.println("Product="+product);
          System.out.println("Quantity="+quantity);
          System.out.println("Price="+price);
        }
      
     public void details2(String product,int quantity,int price) 
        {
          System.out.println("Product="+product);
          System.out.println("Quantity="+quantity);
          System.out.println("Price="+price);
        }

      public void details3(String product,int quantity,int price)  
        {
          System.out.println("Product="+product);
          System.out.println("Quantity="+quantity);
          System.out.println("Price="+price);
        }


        
       public void sample(String product1,String product2,String product3,int cost1,int cost2,int cost3,int offer)
         {          
          System.out.println("Product 1 = "+product1);
          System.out.println("Product 2 = "+product2);
          System.out.println("Product 3 = "+product3);

          int sum=cost1+cost2+cost3;
          System.out.println("Total amount = "+sum);

          int discount=(sum*5)/100;
          System.out.println("Discount amount = "+discount);
          }

  }



class newlogic
   {
     public static void main(String args[])
       {
         sample obj=new sample();
         obj.details1("Sathishkumar Paramasivam","Chicken",2,500);
         obj.details2("Mutton",1,800);
         obj.details3("Fish",2,1200);
         obj.sample("Chicken","Mutton","Fish",500,800,1200,2500);
         obj.checkoffer(2500);
       }
   }