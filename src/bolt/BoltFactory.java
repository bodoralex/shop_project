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

	public static TartosTej ujFelzsirosTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossag) {
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossag, Tej.FELZSIROS);
	}

	public static TartosTej ujZsirosTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossag) {
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossag, Tej.ZSIROS);
	}

	public static FeltartosTej ujFelzsirosFelTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossag) {
		return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossag, Tej.FELZSIROS);
	}

	public static TartosTej ujZsirosLiteresTartosTej(long vonalKod, String gyarto, Date szavatossag) {
		return new TartosTej(vonalKod, Tej.LITER, gyarto, szavatossag, Tej.FELZSIROS);
	}

	public static FeltartosTej ujFelzsirosLiteresTartosTej(long vonalKod, String gyarto, Date szavatossag) {
		return new FeltartosTej(vonalKod, Tej.LITER, gyarto, szavatossag, Tej.FELZSIROS);
	}

	public static FeltartosTej ujZsirosLiteresFeltartosTej(long vonalKod, String gyarto, Date szavatossag) {
		return new FeltartosTej(vonalKod, Tej.LITER, gyarto, szavatossag, Tej.ZSIROS);
	}

	public static Szappan ujSzappan(Long vonalkod, String gyarto,char mosoHatas){
		return new Szappan(vonalkod, gyarto, mosoHatas);
	}
	public static Szappan ujMosoHatasuSzappan(Long vonalkod, String gyarto) {
		return new Szappan(vonalkod, gyarto, Szappan.MOSOHATAS);
	}

	public static Sajt ujSajt(double suly, double zsirtartalom, long vonalkod, String gyarto, Date szavatossagiIdo) {
		return new Sajt(vonalkod, zsirtartalom, vonalkod, gyarto, szavatossagiIdo);

	}
}
