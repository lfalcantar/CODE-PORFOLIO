
public class Linear_Fibonachi {
	
	  public static void main(String[] args)
	  {
	    int n =20;
	    long[] container = new long [n+1];
	    container[0]=container[1]=1;
	    
	    for(int i =2 ; i< container.length;i++)
	    {
	      container[i] = container[i-1] + container[i-2];
	    }
	    
	    for(long s:container)
	      System.out.println(s);
	    
	  }
	
	

}
