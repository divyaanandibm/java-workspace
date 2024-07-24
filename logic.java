class sample
 {
   sample(int x,int y)
     {
       System.out.println((x<y)&&(x!=y));
       System.out.println((x>y)||(x!=y));
       System.out.println((x==y)|(x<y));
      }
      
 }


class logic
   {
     public static void main(String args[])
      {
       new sample(12,45);
       }
   }
 