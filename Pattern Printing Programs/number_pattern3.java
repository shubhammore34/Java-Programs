/*

55555
44444
33333
22222
11111

rows=5
columns=5
*/

class number_pattern3
{
	public static void main(String[] args) {
		int i; //outer loop variable --> for rows 
		int j; //inner loop variable --> for columns

		for(i=5; i>=1; i--)
		{
			for(j=1; j<=5; j++)
			{
				System.out.print(i);
			}

			System.out.println();
		}
	}
}