class sample
 {
    public void for2(int N)
       {
         System.out.println(N);
         for(int i=1;i<=100;i++)
           { 
                System.out.println(i+"*"+N+"="+i*N); 
           }
       }
 }



      

class tables
   {
     public static void main(String args[])  
        {
          sample obj= new sample();
          obj.for2(34);
        }
   }

