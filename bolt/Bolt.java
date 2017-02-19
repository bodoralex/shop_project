package bolt;

import java.util.Vector;

public class Bolt {

	protected String nev;
	protected String cim;
	protected String tulajdonos;
	protected Vector<Tej> tejpult;
	protected int flag;

	public Bolt(String nev, String cim, String tulajdonos, Vector<Tej> tejpult) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}
	
	public void feltoltTej(Tej m) {
		if(tejpult == null) tejpult = new Vector<Tej>();
		tejpult.add(m);
	}

	public boolean vanMegTej() {
		if (tejpult == null || tejpult.size() == 0)
			return false;
		return true;
	}

	public Tej vasarolTej(Tej m) {
		if (tejpult.contains(m)) {
			tejpult.remove(m);
			return m;
		}
		System.out.println("A kért tej nem létezik.");
		return null;
	}

	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}
}
