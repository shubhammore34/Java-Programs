/*

***
***
***

rows=3
columns=3

*/

//ONE WAY :

class star_pattern1
{
	public static void main(String[] args) {
		int i; //outer loop variable --> for rows 
		int j; //inner loop variable --> for columns

		for(i=1; i<=3; i++) //outer loop
		{
			for(j=1; j<=3; j++) //inner loop
			{
				System.out.print("*");
			}

			System.out.println();
		}
		
	}
}


/* dry run :
i=1--> j=1,2,3 --> "*"
i=2--> j=1,2,3 --> "*"
i=3--> j=1,2,3 --> "*"
i=4 --> condition false >> loop terminate
*/

//SAME PATTERN CAN BE WRITTEN IN 3 MORE DIFFERENT WAYS AS FOLLOWS :

//2ND WAY:

/*class star_pattern1
{
	public static void main(String[] args) {
		int i; //outer loop variable --> for rows 
		int j; //inner loop variable --> for columns

		for(i=3; i>=1; i--) //outer loop
		{
			for(j=3; j>=1; j--) //inner loop
			{
				System.out.print("*");
			}

			System.out.println();
		}
		
	}
}
*/

//3RD WAY :

/*class star_pattern1
{
	public static void main(String[] args) {
		int i; //outer loop variable --> for rows 
		int j; //inner loop variable --> for columns

		for(i='A'; i<='C'; i++) //outer loop
		{
			for(j='A'; j<='C'; j++) //inner loop
			{
				System.out.print("*");
			}

			System.out.println();
		}
		
	}
}
*/

//4TH WAY :

/*class star_pattern1
{
	public static void main(String[] args) {
		int i; //outer loop variable --> for rows 
		int j; //inner loop variable --> for columns

		for(i='C'; i>='A'; i--) //outer loop
		{
			for(j='C'; j>='A'; j--) //inner loop
			{
				System.out.print("*");
			}

			System.out.println();
		}
		
	}
}
*/