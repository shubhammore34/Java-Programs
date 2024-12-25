/*

####
####
####
####

rows=4
columns=4

*/

class hash_pattern
{
	public static void main(String[] args) 
	{
		int i; //outer loop variable --> for rows 
	    int j; //inner loop variable --> for columns

		for(i=1; i<=4; i++) //rows printing
		{
			for(j=1; j<=4; j++) //columns printing
			{
				System.out.print("#");
			}
			System.out.println();

		}
	}
}


//dry run: similar as star_pattern1



