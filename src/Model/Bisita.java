package Model;

public class Bisita {
private String kode_id;
private String izena;
private String deskribapena;
private Boolean jubilatuak;
public Bisita(String kode_id, String izena, String deskribapena, Boolean jubilatuak) {
	this.kode_id = kode_id;
	this.izena = izena;
	this.deskribapena = deskribapena;
	this.jubilatuak = jubilatuak;
}
public String getKode_id() {
	return kode_id;
}
public String getIzena() {
	return izena;
}
public String getDeskribapena() {
	return deskribapena;
}
public Boolean getJubilatuak() {
	return jubilatuak;
}
public void setKode_id(String kode_id) {
	this.kode_id = kode_id;
}
public void setIzena(String izena) {
	this.izena = izena;
}
public void setDeskribapena(String deskribapena) {
	this.deskribapena = deskribapena;
}
public void setJubilatuak(Boolean jubilatuak) {
	this.jubilatuak = jubilatuak;
}
@Override
public String toString() {
	return "Bisita [kode_id=" + kode_id + ", izena=" + izena + ", deskribapena=" + deskribapena + ", jubilatuak="
			+ jubilatuak + "]";
}

}
