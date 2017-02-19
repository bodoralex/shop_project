package bolt;

import java.util.Hashtable;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, Tej> tejpult;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long, Tej> tejpult) {
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
		if (tejpult == null)
			tejpult = new Hashtable<Long, Tej>();
		tejpult.put(m.getVonalKod(), m);
	}

	public boolean vanMegTej() {
		if (tejpult == null || tejpult.size() == 0)
			return false;
		return true;
	}

	public Tej vasarolTej(long vonalKod) {
		if (tejpult.contains(vonalKod)) {
			Tej ki = tejpult.get(vonalKod);
			tejpult.remove(vonalKod);
			return ki;
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

	class BoltBejegyzes {

		private Tej t;
		private int mennyiseg;
		private int ar;

		public BoltBejegyzes(Tej t, int mennyiseg, int ar) {
			super();
			this.t = t;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}

		public Tej getT() {
			return t;
		}

		public void setT(Tej t) {
			this.t = t;
		}

		public int getMennyiseg() {
			return mennyiseg;
		}

		public void adMennyiseg(int mennyiseg) {
			this.mennyiseg += mennyiseg;
		}

		public void levonMennyiseg(int mennyiseg) {
			this.mennyiseg -= mennyiseg;
		}

		public void setMennyiseg(int mennyiseg) {
			this.mennyiseg = mennyiseg;
		}

		public int getAr() {
			return ar;
		}

		public void setAr(int ar) {
			this.ar = ar;
		}
	}
}
