package Model;

public class Irteera {
private int Irteera_id;
private String cif;
private String ekintza;
private int denbora;
private String eguna;
private int kopurua;
public Irteera(int irteera_id, String cif, String ekintza, int denbora, String eguna, int kopurua) {
	Irteera_id = irteera_id;
	this.cif = cif;
	this.ekintza = ekintza;
	this.denbora = denbora;
	this.eguna = eguna;
	this.kopurua = kopurua;
}
public int getIrteera_id() {
	return Irteera_id;
}
public String getCif() {
	return cif;
}
public String getEkintza() {
	return ekintza;
}
public int getDenbora() {
	return denbora;
}
public String getEguna() {
	return eguna;
}
public int getKopurua() {
	return kopurua;
}
public void setIrteera_id(int irteera_id) {
	Irteera_id = irteera_id;
}
public void setCif(String cif) {
	this.cif = cif;
}
public void setEkintza(String ekintza) {
	this.ekintza = ekintza;
}
public void setDenbora(int denbora) {
	this.denbora = denbora;
}
public void setEguna(String eguna) {
	this.eguna = eguna;
}
public void setKopurua(int kopurua) {
	this.kopurua = kopurua;
}
@Override
public String toString() {
	return "Irteera [Irteera_id=" + Irteera_id + ", cif=" + cif + ", ekintza=" + ekintza + ", denbora=" + denbora
			+ ", eguna=" + eguna + ", kopurua=" + kopurua + "]";
}

}
