package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		for (int num = 2; num <= 10; num++)
		{
			boolean isPrime = true;
			for (int i=2; i <= num/2; i++)
			{
				if ( num % i == 0)
				{
					isPrime = false;
					break;
				}
			}

			if ( isPrime == true )
				System.out.println(num);
		}

	}

}
