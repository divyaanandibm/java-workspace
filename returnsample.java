class sample
 {
   public int subtraction(int value1,int value2)
     {
      int sum=value1+value2;
      return sum;
     } 
    
   public int subtraction2(int Value1,int Value2)
     {
       int sum=Value1=Value2;
        return sum;
     }
 }

 class returnsample
   {
     public static void main(String args[])
       {
         sample obj=new sample();
         int res1=obj.subtraction(15,25);
         int res2=obj.subtraction2(45,29);
         System.out.println("Result="+res1);
         System.out.println("Result="+res2);
      }


   }