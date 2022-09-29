package Arrays;

public class JaggedArray {

	public static void main(String[] args) {
       int jagged[][]=new int[3][];
       jagged[0]=new int[3];
       jagged[1]=new int[2];
       jagged[2]=new int[3];
       int count=0;
       //value assumtion
       for(int column=0;column<3;column++)
       {
    	   for (int row=0;row<jagged[column].length;row++)
    	   {
    		   jagged[column][row]=count+=10;
    	   }
       }
       //print a jagged value
       for(int column=0;column<3;column++)
       {
    	   for(int row=0;row<jagged[column].length;row++)
    	   {
    		   System.out.print(jagged[column][row]+" ");
    	   }
    	   System.out.println();
       }
	}

}
