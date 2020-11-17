public class Variable {
	public static void main(String[] args) {
		byte numberCoreProcessor = 4;
		short frequencyProcessor = 3500;
		int ram = 8192;
		long ssd = 274877906944L;
		float cpuRatio = 35.0f;
		double cpuVoltage = 1.296d;
		char cpu1 = 'a';
		char cpu2 = 'm';
		char cpu3 = 'd';
		boolean presenceIDE = false;
		System.out.println("Number of processor cores  - " + numberCoreProcessor);
		System.out.println("Frequency Processor - " + frequencyProcessor);
		System.out.println("Amount of RAM - " + ram);
		System.out.println("Amount of SSD - " + ssd);
		System.out.println("CPU Ratio - " + cpuRatio);
		System.out.println("CPU Voltage - " + cpuVoltage);
		System.out.println("Brand of the processor - " + new String(new char[] { cpu1, cpu2, cpu3 }));
		System.out.println("Presence IDE- " + presenceIDE);
	}
}