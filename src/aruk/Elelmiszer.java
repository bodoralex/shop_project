package aruk;

import java.util.Date;

import bolt.Aru;

public abstract class Elelmiszer extends Aru {
	private Date szavatossagiIdo;

	public Elelmiszer(long vonalKod, String gyarto, Date szavatossagiIdo) {
		super(vonalKod, gyarto);
		this.szavatossagiIdo = szavatossagiIdo;
	}

	public boolean joMeg() {
		Date jelenIdo = new Date();
		return jelenIdo.before(getSzavatossagiIdo());
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Szavatossag : %s | ", getSzavatossagiIdo());
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}
}