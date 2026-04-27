package Model;

public class Enpresa {
private String CIF;
private String izena;
private String helbidea;

public Enpresa(String cif, String izena, String helbidea) {
	CIF = cif;
	this.izena = izena;
	this.helbidea = helbidea;
}
public String getCIF() {
	return CIF;
}
public String getIzena() {
	return izena;
}
public String getHelbidea() {
	return helbidea;
}
public void setCIF(String cIF) {
	CIF = cIF;
}
public void setIzena(String izena) {
	this.izena = izena;
}
public void setHelbidea(String helbidea) {
	this.helbidea = helbidea;
}
@Override
public String toString() {
	return "Enpresa [CIF=" + CIF + ", izena=" + izena + ", helbidea=" + helbidea + "]";
}

}
