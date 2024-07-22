class newfile
{
    public void display(int x,int y,int z)      
      {
	int sum=x+y;
	int sum2=y+z;
        int sum3=y*z;
	System.out.println(sum);
	System.out.println(sum2);
        System.out.println(sum3);
      }
}

class mathee
{
    public static void main(String args[])
     {
	newfile obj=new newfile();
	obj.display(10,20,30);      
     }
}