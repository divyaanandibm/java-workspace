class sample
 {
    sample(int Unit)
	{
	  if(Unit>1000)
    	   {
	     System.out.println("Rupees 11.55 per unit");
	   }
         else if((Unit>=0)&& (Unit<=100))	
	  {
	     System.out.println("Free of cost");
	  }			
	  else if((Unit>=101) && (Unit<400))
	   {
	     System.out.println("Rupees 4.7 per unit");
	   }
	 else if((Unit>=401) && (Unit<500))
	   {
	     System.out.println("Rupees 6.3 per unit");
	   }
	else if((Unit>=501)&& (Unit<=600))	
	  { 
	     System.out.println("Rupees 8.4 per unit");
	  }
        else if((Unit>=601)&& (Unit<=800))	
	  {
	     System.out.println("Rupees 9.45 per unit");
	  }
        else if((Unit>=801)&& (Unit<=1000))	
	  {
	     System.out.println("Rupees 10.5 per unit");
	  }
   	else
	  {
	     System.out.println("Invalid unit is processed");
	  }

	}
 }

class ebbill
 {
    public static void main(String asd[])
	{
	   sample obj=new sample(867);
	}
 }