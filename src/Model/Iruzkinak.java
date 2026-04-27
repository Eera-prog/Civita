package Model;

public class Iruzkinak {
private int iruzkina_id;
private String pertsona_izena;
private String email_pertsona;
private String sortze_data;
private String deskribapena;
private String NAN_pertsona;
public Iruzkinak(int iruzkina_id, String pertsona_izena, String email_pertsona, String sortze_data, String deskribapena,String nAN_pertsona) {
	this.iruzkina_id = iruzkina_id;
	this.pertsona_izena = pertsona_izena;
	this.email_pertsona = email_pertsona;
	this.sortze_data = sortze_data;
	this.deskribapena = deskribapena;
	NAN_pertsona = nAN_pertsona;
}
public int getIruzkina_id() {
	return iruzkina_id;
}
public String getPertsona_izena() {
	return pertsona_izena;
}
public String getEmail_pertsona() {
	return email_pertsona;
}
public String getSortze_data() {
	return sortze_data;
}
public String getDeskribapena() {
	return deskribapena;
}
public String getNAN_pertsona() {
	return NAN_pertsona;
}
public void setIruzkina_id(int iruzkina_id) {
	this.iruzkina_id = iruzkina_id;
}
public void setPertsona_izena(String pertsona_izena) {
	this.pertsona_izena = pertsona_izena;
}
public void setEmail_pertsona(String email_pertsona) {
	this.email_pertsona = email_pertsona;
}
public void setSortze_data(String sortze_data) {
	this.sortze_data = sortze_data;
}
public void setDeskribapena(String deskribapena) {
	this.deskribapena = deskribapena;
}
public void setNAN_pertsona(String nAN_pertsona) {
	NAN_pertsona = nAN_pertsona;
}
@Override
public String toString() {
	return "Iruzkinak [iruzkina_id=" + iruzkina_id + ", pertsona_izena=" + pertsona_izena + ", email_pertsona="
			+ email_pertsona + ", sortze_data=" + sortze_data + ", deskribapena=" + deskribapena + ", NAN_pertsona="
			+ NAN_pertsona + "]";
}

}
