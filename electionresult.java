class party
{
  public void DMK()
   {
	System.out.println("Dravida Munnetra Kazhagam (DMK) = "+(22));
   }
  public void INC()
   {
	System.out.println("Indian National Congress (INC) = "+(9));
   }
  public void VCK()
   {
	System.out.println("Viduthalai Chiruthaigal Katchi (VCK) = "+(2));
   }
  public void CMI()
   {
	System.out.println("Communist Party of India (CPI) = "+(2));
   }
  public void CPI()
   {
	System.out.println("Communist Party of India (Marxist) (CPI) = "+(2));
   }

  public void MDMK()
   {
	System.out.println("Marumalarchi Dravida Munnetra Kazhagam (MDMK) = "+(1));
   }
  public void IUML()
   {
	System.out.println("Indian Union Muslim League (IUML) = "+(1));
   }
}

class electionresult
{
   public static void main(String args[])
    {
 	party obj=new party();
	obj.DMK();
	obj.INC();
	obj.VCK();
	obj.CMI();
	obj.CPI();
	obj.MDMK();
	obj.IUML();
    }
}