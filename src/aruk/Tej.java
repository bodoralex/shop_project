package aruk;

import java.util.Date;

public abstract class Tej extends Elelmiszer {

	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;

	protected long vonalKod;

	public static final int LITER = 10;
	public static final int FELLITER = 5;
	public static final int POHAR = 2;
	public static final double ZSIROS = 3.5;
	public static final double FELZSIROS = 1.5;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.urtartalom = urtartalom;
		this.zsirtartalom = zsirtartalom;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("Urtartalom : %s | Zsírtartalom : %s", getUrtartalom(), getZsirtartalom());
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

}
