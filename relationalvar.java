class sample
 {
   sample(int x ,int y)
     {
         System.out.println(x<=y);
      }

   public void greater(int x,int y)
       {
          System.out.println(x>y);
        }

   public void greaterorequal(int x,int y)
       {
          System.out.println(x>=y);
        }
 
    
   public void less(int x,int y)
       {
         System.out.println(x<y);
        }
 
   public void equal(int x,int y)
       {
         System.out.println(x==y);
        }
 
    public void notequal(int x,int y)
       {
         System.out.println(x!=y);
        } 
           
 }

class relationalvar
   {
    public static void main(String args[])
      {
       sample obj=new sample(100,120);
       obj.greater(10,12);
       obj.greaterorequal(13,12);
       obj.less(12,124);
       obj.equal(12,12);
       obj.notequal(126,12);
      } 
   }
