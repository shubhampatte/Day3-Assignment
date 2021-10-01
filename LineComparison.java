public class LineComparison
{
	public static void main(String args[])
    { 
		int x1 = 4, x2 = 8;
		int y1 = 0, y2 = 9;
		
		int len = (int) Math.sqrt((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));

		System.out.println("Line Distance : " +len);
	}
}
