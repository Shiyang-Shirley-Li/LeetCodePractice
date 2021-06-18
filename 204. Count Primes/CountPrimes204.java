/*
 * Author: Shiyang (Shirley) Li
 * Tag: HashTable, Math
 * Difficulty： Easy
 * 
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * Prime numbers are numbers that have only 2 factors: 1 and themselves.
 */
public class CountPrimes204 {
	public static void main(String[] args) {
		System.out.println(countPrimes(10));
	}
	
	public static int countPrimes(int n) {
		int numOfPrimes = 0;
		boolean[] isPrime = new boolean[n];
		//initialize all to be primes and prime starts from 2
		for(int i = 2; i < n; i++) {
			isPrime[i] = true;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {//***
			if(!isPrime[i]) {
				continue;
			}
			for(int j = i*i; j < n; j += i) {//***
				isPrime[j] = false;
			}
		}
		
		for(int i = 2; i < n; i++) {
			if(isPrime[i]) {
				numOfPrimes++;
			}
		}
		return numOfPrimes;
	}
}

/*
 * Conclusion:
 * 1. As we know the number must not be divisible by any number > n / 2, 
 *    we can immediately cut the total iterations half by dividing only up to n / 2.
 * 2. Let's write down all of 12's factors:
 *    2 × 6 = 12
 *    3 × 4 = 12
 *    4 × 3 = 12
 *    6 × 2 = 12
 *    As you can see, calculations of 4 × 3 and 6 × 2 are not necessary. Therefore, 
 *    we only need to consider factors up to √n because, if n is divisible by some number p, 
 *    then n = p × q and since p ≤ q, we could derive that p ≤ √n. Our total runtime has now 
 *    improved to O(n1.5), which is slightly better. 
 * 
 */
