package aruk;

import bolt.Aru;

public class Szappan extends Aru {
	
	public static char MOSOHATAS = 'M';
	private final char mosoHatas;
	
	public char getMosoHatas() {
		return mosoHatas;
	}

	public Szappan(Long vonalkod, String gyarto, char mosoHatas) {
		super(vonalkod, gyarto);
		this.mosoHatas = mosoHatas;
	}
	

}
