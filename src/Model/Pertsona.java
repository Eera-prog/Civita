package Model;

public class Pertsona {
private String NAN;
private String izena;
private String rol;
private String email;
private String telefonoa;
private String pasahitza;

public Pertsona(String nan, String izena, String rol, String email, String telefonoa, String pasahitza) {
	NAN = nan;
	this.izena = izena;
	this.rol = rol;
	this.email = email;
	this.telefonoa = telefonoa;
	this.pasahitza = pasahitza;
}
public String getNAN() {
	return NAN;
}
public String getIzena() {
	return izena;
}
public String getRol() {
	return rol;
}
public String getEmail() {
	return email;
}
public String getTelefonoa() {
	return telefonoa;
}
public String getPasahitza() {
	return pasahitza;
}
public void setNAN(String nAN) {
	NAN = nAN;
}
public void setIzena(String izena) {
	this.izena = izena;
}
public void setRol(String rol) {
	this.rol = rol;
}
public void setEmail(String email) {
	this.email = email;
}
public void setTelefonoa(String telefonoa) {
	this.telefonoa = telefonoa;
}
public void setPasahitza(String pasahitza) {
	this.pasahitza = pasahitza;
}
@Override
public String toString() {
	return "Pertsona [NAN=" + NAN + ", izena=" + izena + ", rol=" + rol + ", email=" + email + ", telefonoa="
			+ telefonoa + ", pasahitza=" + pasahitza + "]";
}

}
