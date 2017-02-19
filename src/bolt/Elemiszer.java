package bolt;

import java.util.Date;

public abstract class Elemiszer {
	private long vonalkod;
	private String gyarto;
	private Date szavatossagiIdo;

	public Elemiszer(long vonalKod, String gyarto, Date szavatossagiIdo) {
		this.vonalkod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
	}
	
	public boolean joMeg() {
		Date jelenIdo = new Date();
		return jelenIdo.before(getSzavatossagiIdo());
	}
	
	@Override
	public String toString() {
		return String.format("Gyarto: %s |Szavatossag : %s | Vonalkod : %s |", getGyarto(),
				getSzavatossagiIdo(), getVonalkod());
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