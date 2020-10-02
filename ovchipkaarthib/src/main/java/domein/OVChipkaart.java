package domein;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ov_chipkaart")
public class OVChipkaart {

    @Id
    private int kaartnummer;

    private LocalDate geldig_tot;
    private int klasse;
    private double saldo;
    private int reiziger_id;


    public OVChipkaart(int kN, LocalDate gT, int kl, double sal, int rId){
        kaartnummer = kN;
        geldig_tot = gT;
        klasse = kl;
        saldo = sal;
        reiziger_id = rId;
    }

    public OVChipkaart(){
    }

    @Id
    @Column(name="kaart_nummer")
    public int getKaartnummer() {
        return kaartnummer;
    }

    public void setKaartnummer(int kaartnummer) {
        this.kaartnummer = kaartnummer;
    }

    @Column(name="geldig_tot")
    public LocalDate getGeldig_tot() {
        return geldig_tot;
    }

    public void setGeldig_tot(LocalDate geldig_tot) {
        this.geldig_tot = geldig_tot;
    }

    @Column(name="klasse")
    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    @Column(name="saldo")
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Column(name="reiziger_id")
    public int getReiziger() {
        return reiziger_id;
    }

    public void setReiziger(int reiziger) {
        this.reiziger_id = reiziger;
    }

    @Override
    public String toString() {
        return "OVchipkaart{" +
                "kaartnummer = " + kaartnummer +
                ", geldig_tot = " + geldig_tot +
                ", klasse = " + klasse +
                ", saldo = " + saldo +
                ", reiziger_id = " + reiziger_id +
                '}';
    }
}
