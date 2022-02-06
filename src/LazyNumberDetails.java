
public class LazyNumberDetails {

	// Stare
	private int number;

	private boolean primeNumber;
	private int primeCache;

	private boolean perfectNumber;
	private int perfectCache;

	private boolean magicNumber;
	private int magicCache;

	// Constructor
	public LazyNumberDetails(int number) {
		this.number = number;

		this.primeNumber = false;
		this.perfectNumber = false;
		this.magicNumber = false;

		this.primeCache = -1;
		this.perfectCache = -1;
		this.magicCache = -1;
	}

	public void updateNumber(int number) {
		this.number = number;

		if (number != this.number) {
			this.primeNumber = false;
			this.perfectNumber = false;
			this.magicNumber = false;

			this.primeCache = -1;
			this.perfectCache = -1;
			this.magicCache = -1;
		}
	}

	public boolean isPrime() {

		if (this.primeCache != this.number) {
			this.primeCache = this.number;
			for (int i = 2; i * i <= this.number; i++) {
				if (this.number % i == 0) {
					this.primeNumber = false;
					return false;
				}
			}
			this.primeNumber = true;
			return true;
		} else {
			return this.primeNumber;
		}
	}

	public boolean isPerfect() {

		int sumDivisors = 1;
		if (this.perfectCache != this.number) {
			this.perfectCache = this.number;
			for (int i = 2; i <= this.number / 2; i++) {
				if (this.number % i == 0) {
					sumDivisors += i;
				}
			}
			if (sumDivisors == this.number) {
				this.perfectNumber = true;
				return true;
			} 
			this.perfectNumber = false;
			return false;
		} else {
			return this.perfectNumber;
		}
	}

	private int digitsSum(int number) {

		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public boolean isMagic() {

		if (magicCache != this.number) { 
			magicCache = this.number; 
			int copy = this.number; 
			while (copy >= 10) {
				copy = digitsSum(copy); 
			} 
			this.magicNumber = (copy == 3 || copy == 7 || copy == 9);

		}
		return this.magicNumber;
	}
}
