/**
 * 
 */
package code1;

/**
 * @author gouthamteja
 *
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayNum={100,200,300,400};
		String[][] arrayTwo={
				{"gou","krish"},
				{"tej","Mupp","hari"}
				};
		for(int i=0; i<arrayNum.length;i++)
		{
			System.out.println("arrary["+i+"]="+arrayNum[i]);
		}
		//System.out.println(arrayTwo[1].length);
		
		for(int i=0;i<arrayTwo.length;i++)
		{
			for(int j=0; j<arrayTwo[i].length;j++)
			{
				System.out.println("array["+i+"]["+j+"]="+arrayTwo[i][j]);
			}
		}
	}

}
