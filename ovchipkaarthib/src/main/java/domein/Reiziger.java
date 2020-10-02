package domein;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name="reiziger")
public class Reiziger {

    @Id
    private int reiziger_id;

    private String voorletters;
    private String tussenVoegsel;
    private String achternaam;
    private LocalDate geboorteDatum;




    public Reiziger(int id, String vL, String tV, String aN, LocalDate gD){
        reiziger_id = id;
        voorletters = vL;
        tussenVoegsel = tV;
        achternaam = aN;
        geboorteDatum = gD;
    }

    public Reiziger(){
    }
    @Id
    @Column(name="reiziger_id")
    public int getReiziger_id() {
        return reiziger_id;
    }

    public void setReiziger_id(int reiziger_id) {
        this.reiziger_id = reiziger_id;
    }

    @Column(name="voorletters")
    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    @Column(name="tussenvoegsel")
    public String getTussenVoegsel() {
        return tussenVoegsel;
    }

    public void setTussenVoegsel(String tussenVoegsel) {
        this.tussenVoegsel = tussenVoegsel;
    }


    @Column(name="achternaam")
    public String getAchternaam() {
        return achternaam;
    }



    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    @Column(name="geboortedatum")
    public LocalDate getDate() {
        return Date.valueOf(geboorteDatum).toLocalDate();
    }

    public void setDate(LocalDate date) {
        this.geboorteDatum = date;
    }

//    public List<OVChipkaart> getKaart() {
//        return kaart;
//    }
//
//    public void setKaart(List<OVChipkaart> kaart) {
//        this.kaart = kaart;
//    }

    @Override
    public String toString() {
        return "reiziger{" +
                "reiziger_id=" + reiziger_id +
                ", voorletters='" + voorletters + '\'' +
                ", tussenVoegsel='" + tussenVoegsel + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geboorteDatum=" + geboorteDatum +
                '}';
    }
}
