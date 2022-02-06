
public class Runner {

	public static void main(String[] args) {
		LazyNumberDetails lnd = new LazyNumberDetails(1_000_000_009);

		// Prime number nano time
		long start1 = System.nanoTime();
		boolean result1 = lnd.isPrime();
		long end1 = System.nanoTime();
		System.out.println("PRIME NUMBER");
		System.out.println("First: " + (end1 - start1) + " ns: " + lnd.isPrime());

		long start2 = System.nanoTime();
		boolean result2 = lnd.isPrime();
		long end2 = System.nanoTime();
		System.out.println("[CACHNG] Second: " + (end2 - start2) + " ns: " + lnd.isPrime());

		// Perfect number nano time
		System.out.println();
		long start3 = System.nanoTime();
		boolean result3 = lnd.isPerfect();
		long end3 = System.nanoTime();
		System.out.println("PERFECT NUMBER");
		System.out.println("First: " + (end3 - start3) + " ns: " + lnd.isPerfect());

		long start4 = System.nanoTime();
		boolean result4 = lnd.isPerfect();
		long end4 = System.nanoTime();
		System.out.println("[CACHNG] Second: " + (end4 - start4) + " ns: " + lnd.isPerfect());

		// Magic number nano time
		System.out.println();
		long start5 = System.nanoTime();
		boolean result5 = lnd.isMagic();
		long end5 = System.nanoTime();
		System.out.println("MAGIC NUMBER");
		System.out.println("First: " + (end5 - start5) + " ns: " + lnd.isMagic());

		long start6 = System.nanoTime();
		boolean result6 = lnd.isMagic();
		long end6 = System.nanoTime();
		System.out.println("[CACHNG] Second: " + (end6 - start6) + " ns: " + lnd.isMagic());

		lnd.updateNumber(1_000_000_008);

		// Magic number nano time after update
		System.out.println();
		long start7 = System.nanoTime();
		boolean result7 = lnd.isMagic();
		long end7 = System.nanoTime();
		System.out.println("MAGIC NUMBER AFTER UPDATE");
		System.out.println("First: " + (end7 - start7) + " ns: " + lnd.isMagic());

		long start8 = System.nanoTime();
		boolean result8 = lnd.isMagic();
		long end8 = System.nanoTime();
		System.out.println("[CACHNG] Second: " + (end8 - start8) + " ns: " + lnd.isMagic());

	}
}
