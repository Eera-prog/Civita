package Model;

public class Erreserba {
private int Erreserba_id;
private String NAN_pertsona;
private String cif;
private String bisita_kodea;
private int irteera_id;
public Erreserba(int erreserba_id, String nAN_pertsona, String cif, String bisita_kodea, int irteera_id) {
	Erreserba_id = erreserba_id;
	NAN_pertsona = nAN_pertsona;
	this.cif = cif;
	this.bisita_kodea = bisita_kodea;
	this.irteera_id = irteera_id;
}
public int getErreserba_id() {
	return Erreserba_id;
}
public String getNAN_pertsona() {
	return NAN_pertsona;
}
public String getCif() {
	return cif;
}
public String getBisita_kodea() {
	return bisita_kodea;
}
public int getIrteera_id() {
	return irteera_id;
}
public void setErreserba_id(int erreserba_id) {
	Erreserba_id = erreserba_id;
}
public void setNAN_pertsona(String nAN_pertsona) {
	NAN_pertsona = nAN_pertsona;
}
public void setCif(String cif) {
	this.cif = cif;
}
public void setBisita_kodea(String bisita_kodea) {
	this.bisita_kodea = bisita_kodea;
}
public void setIrteera_id(int irteera_id) {
	this.irteera_id = irteera_id;
}
@Override
public String toString() {
	return "Erreserba [Erreserba_id=" + Erreserba_id + ", NAN_pertsona=" + NAN_pertsona + ", cif=" + cif
			+ ", bisita_kodea=" + bisita_kodea + ", irteera_id=" + irteera_id + "]";
}

}
