public class Variable {
	public static void main(String[] args) {
		byte numberCoreCpu = 4;
		short frequencyCpu = 3500;
		int ram = 8192;
		long ssd = 274877906944L;
		float cpuRatio = 35.0f;
		double cpuVoltage = 1.296d;
		char a = 'a';
		char m = 'm';
		char d = 'd';
		boolean presenceIde = false;

		System.out.println("Number of CPU cores  - " + numberCoreCpu);
		System.out.println("Frequency CPU - " + frequencyCpu);
		System.out.println("Amount of RAM - " + ram);
		System.out.println("Amount of SSD - " + ssd);
		System.out.println("CPU Ratio - " + cpuRatio);
		System.out.println("CPU Voltage - " + cpuVoltage);
		System.out.println("Brand of the CPU - " + a+m+d);
		System.out.println("Presence IDE- " + presenceIde);
	}
}