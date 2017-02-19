package bolt;

import java.util.Date;

public class Tej {

	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;
	protected long ar;

	protected long vonalKod;

	protected final int LITER = 10;
	protected final int FELLITER = 5;
	protected final int POHAR = 2;
	protected final double ZSIROS = 3.5;
	protected final double FELZSIROS = 1.5;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossag, double zsirtartalom, long ar) {
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossag;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}

	public long getVonalKod() {
		return vonalKod;
	}

	@Override
	public String toString() {
		return String.format("Gyarto: %s | Urtartalom: %s | Zsirtartalom: %s | Szavatossag : %s | Ar : %s", getGyarto(),
				getUrtartalom(), getZsirtartalom(), getSzavatossagiIdo(), getAr());
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

	public long getAr() {
		return ar;
	}
}
