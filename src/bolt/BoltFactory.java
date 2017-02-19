package bolt;

import java.util.Date;

import aruk.*;
import aruk.tej.*;

public abstract class BoltFactory {

	public static FeltartosTej ujFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossag,
			double zsirtartalom) {
		return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossag, zsirtartalom);
	}

	public static TartosTej ujTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossag,
			double zsirtartalom) {
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossag, zsirtartalom);
	}

	public Szappan ujSzappan(Long vonalkod, String gyarto) {
		return new Szappan(vonalkod, gyarto);
	}

	public Sajt ujSajt(double suly, double zsirtartalom, long vonalkod, String gyarto, Date szavatossagiIdo) {
		return new Sajt(vonalkod, zsirtartalom, vonalkod, gyarto, szavatossagiIdo);

	}
}
