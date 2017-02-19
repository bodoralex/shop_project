package bolt;

import java.util.Date;

public class Tej {

	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;

	protected long vonalKod;

	public final int LITER = 10;
	public final int FELLITER = 5;
	public final int POHAR = 2;
	public final double ZSIROS = 3.5;
	public final double FELZSIROS = 1.5;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossag, double zsirtartalom) {
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossag;
		this.zsirtartalom = zsirtartalom;
	}

	public long getVonalKod() {
		return vonalKod;
	}

	@Override
	public String toString() {
		return String.format("Gyarto: %s | Urtartalom: %s | Zsirtartalom: %s | Szavatossag : %s | Ar : %s", getGyarto(),
				getUrtartalom(), getZsirtartalom(), getSzavatossagiIdo());
	}

	public boolean joMeg() {
		Date jelenIdo = new Date();
		return jelenIdo.before(getSzavatossagiIdo());
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

}
