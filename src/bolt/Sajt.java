package bolt;

import java.util.Date;

public class Sajt {
	protected double suly;
	protected double zsirtartalom;
	protected long vonalkod;
	protected String gyarto;
	protected Date szavatossagiIdo;

	public Sajt(double suly, double zsirtartalom, long vonalkod, String gyarto, Date szavatossagiIdo) {
		super();
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;
		this.vonalkod = vonalkod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
	}

	@Override
	public String toString() {
		return String.format("Gyarto: %s | Suly: %s | Zsirtartalom: %s | Szavatossag : %s | Ar : %s", getGyarto(),
				getSuly(), getZsirtartalom(), getSzavatossagiIdo());
	}

	public boolean joMeg() {
		Date jelenIdo = new Date();
		return jelenIdo.before(getSzavatossagiIdo());
	}

	public double getSuly() {
		return suly;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	public long getVonalkod() {
		return vonalkod;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}
}
