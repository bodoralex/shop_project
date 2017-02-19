package bolt;

import java.util.Hashtable;

import aruk.Elelmiszer;
import aruk.Sajt;
import aruk.Tej;
import kivetel.NemLetezoAruKivetel;
import kivetel.TulsokLevonasKivetel;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, BoltBejegyzes> elelmiszerPult;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long, BoltBejegyzes> elelmiszerPult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerPult = elelmiszerPult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	public void feltoltUjelelmiszerrel(Elelmiszer e, long mennyiseg, long ar) {
		if (elelmiszerPult == null)
			elelmiszerPult = new Hashtable<Long, BoltBejegyzes>();
		BoltBejegyzes bB = new BoltBejegyzes(e, mennyiseg, ar);
		elelmiszerPult.put(e.getVonalkod(), bB);
	}

	public void feltoltElelmiszerrel(long vonalKod, long mennyiseg) {
		elelmiszerPult.get(vonalKod).adMennyiseg(mennyiseg);
	}

	public void torolElelmiszert(long volnalKod) {
		elelmiszerPult.remove(volnalKod);
	}

	public void vasarolElelmiszert(long vonalkod, long mennyiseg) {
		if (elelmiszerPult.get(vonalkod) == null) {
			try {
				throw new NemLetezoAruKivetel("Nem letezik ilyen aru.");
			} catch (NemLetezoAruKivetel e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		} else if (elelmiszerPult.get(vonalkod).mennyiseg - mennyiseg < 0) {
			try {
				throw new TulsokLevonasKivetel("Nincs ennyi aru.");
			} catch (TulsokLevonasKivetel e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		}
		elelmiszerPult.get(vonalkod).levonMennyiseg(mennyiseg);
	}

	protected boolean vanMegAdottAru(@SuppressWarnings("rawtypes") Class c) {
		for (BoltBejegyzes bB : elelmiszerPult.values()) {
			if (c.equals(bB.getElemiszer().getClass())) {
				return bB.mennyiseg > 0 ? true : false;
			}
		}
		return false;
	}

	public boolean vanMegTej() {
		for (BoltBejegyzes bB : elelmiszerPult.values()) {
			if (bB.getElemiszer().getClass().getSuperclass() == Tej.class) {
				return bB.mennyiseg > 0 ? true : false;
			}
		}
		return false;
	}

	public boolean vanMegSajt() {
		for (BoltBejegyzes bB : elelmiszerPult.values()) {
			if (bB.getElemiszer() instanceof Sajt) {
				return bB.mennyiseg > 0 ? true : false;
			}
		}
		return false;
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

		private Elelmiszer e;
		private long mennyiseg;
		private long ar;

		public BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar) {
			super();
			this.e = e;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}

		public Elelmiszer getElemiszer() {
			return e;
		}

		public void setElelmiszer(Elelmiszer e) {
			this.e = e;
		}

		public long getMennyiseg() {
			return mennyiseg;
		}

		public void adMennyiseg(long mennyiseg) {
			this.mennyiseg += mennyiseg;
		}

		public void levonMennyiseg(long mennyiseg) {
			this.mennyiseg -= mennyiseg;
		}

		public void setMennyiseg(int mennyiseg) {
			this.mennyiseg = mennyiseg;
		}

		public long getAr() {
			return ar;
		}

		public void setAr(int ar) {
			this.ar = ar;
		}
	}
}
