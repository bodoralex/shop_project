package bolt;

import java.util.Date;

import tej.FeltartosTej;
import tej.TartosTej;


public abstract class TejFactory {
	
	public static FeltartosTej ujFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossag, double zsirtartalom){
		return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossag, zsirtartalom);
	}
	public static TartosTej ujTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossag, double zsirtartalom){
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossag, zsirtartalom);
	}

}
