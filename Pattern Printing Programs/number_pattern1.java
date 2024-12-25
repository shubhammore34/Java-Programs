/*

11111
22222
33333
44444
55555

rows=5
columns=5
*/
class number_pattern1
{
	public static void main(String[] args) {
		int i; //outer loop variable --> for rows 
		int j; //inner loop variable --> for columns

		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				System.out.print(i);
			}

			System.out.println();
		}
	}
}