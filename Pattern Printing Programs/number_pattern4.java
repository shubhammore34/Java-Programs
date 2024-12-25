/*

54321
54321
54321
54321
54321

rows=5
columns=5
*/

class number_pattern4
{
	public static void main(String[] args) {
		int i; //outer loop variable --> for rows 
		int j; //inner loop variable --> for columns

		for(i=5; i>=1; i--)
		{
			for(j=5; j>=1; j--)
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}