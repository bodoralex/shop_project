package bolt;

import java.util.Date;

public class Sajt extends Elemiszer {
	protected double suly;
	protected double zsirtartalom;

	public Sajt(double suly, double zsirtartalom, long vonalkod, String gyarto, Date szavatossagiIdo) {
		super(vonalkod, gyarto, szavatossagiIdo);
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;

	}

	public double getSuly() {
		return suly;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Suly : %s | Zsírtartalom : %s", getSuly(), getZsirtartalom());
	}
}
