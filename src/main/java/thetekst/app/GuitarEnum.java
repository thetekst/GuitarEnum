package thetekst.app;

public enum GuitarEnum {
	EPIPHONE(2000, "Les Paul Standard Ebony"),
	FENDER(2016, "American Special"),
	GIBSON(2051, "LP Standard"),
	GYPSY_ROSE(2051, "Gypsy Rose");

	private final int year;
	private final String brand;

	private GuitarEnum(int year, String brand) {
		this.year = year;
		this.brand = brand;
	}

	public int getCode() {
		return year;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return year + ": " + brand;
	}
}
