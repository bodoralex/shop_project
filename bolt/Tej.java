package bolt;

import java.util.Date;

public class Tej {

	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;
	protected long ar;

	public Tej(int urtartalom, String gyarto, Date szavatossag, double zsirtartalom, long ar) {
		super();
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossag;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
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
