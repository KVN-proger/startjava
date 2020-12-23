public class Jaeger {
	private String modelName;
	private String mark;
	private String status;
	private String origin;
	private double height;
	private double weight;
	private int speed;
	private int strength;
	private int armor;
	private boolean isDrift;
	private int steps;
	private boolean scan;

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void setIsDrift(boolean isDrift) {
		this.isDrift = isDrift;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public void setScan(boolean scan) {
		this.scan = scan;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getStatus() {
		return status;
	}

	public String getOrigin() {
		return origin;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrength() {
		return strength;
	}

	public int getArmor() {
		return armor;
	}

	public boolean drift() {
		if (isDrift) {
			System.out.println("you both entered the drift");
			return true;
		} else {
			System.out.println("you both didn't enter the drift");
			return false;
		}
	}

	public void move() {
		switch(steps) {
			case 1 :
				System.out.println("Jaeger passed 1 step");
				break;
			case 2 :
				System.out.println("Jaeger passed 2 steps");
				break;
		}
	}

	public String scanKaiju() {
		if (scan) {
			return "Kaiju detected";
		} else {
			return "Nothing";
		}
	}
}