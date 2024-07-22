class sample
 {
   public void newdata(int x,int y,int a,int b,int n,int v)
      {
         int sum=x*y;
         int sub=a-b;
         int add=n+v;
         System.out.println("MULTIPLE ="+sum);
         System.out.println("SUBTRACTION ="+sub);
         System.out.println("ADDITION ="+add);
      }
 }

 class newdemo
 {
   public static void main(String args[])
      {
        sample obj=new sample();
        obj.newdata(10,20,20,30,50,20);
      } 
 }
