package bolt;

public abstract class Aru {
	private Long vonalkod;
	private String gyarto;
	
	public Aru(Long vonalkod, String gyarto) {
		this.vonalkod = vonalkod;
		this.gyarto = gyarto;
	}

	public long getVonalkod() {
		return vonalkod;
	}

	public String getGyarto() {
		return gyarto;
	}
	
	@Override
	public String toString() {
		return String.format("Gyarto: %s | Vonalkod : %s | ", getGyarto(), 
				getVonalkod());
	}
}
