package model;
// Generated Sep 25, 2017 10:03:09 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.resource.spi.AuthenticationMechanism;

/**
 * Raspored generated by hbm2java
 */
@Entity
@Table(name = "raspored",
         catalog = "domzdravlja"
)
public class Raspored implements java.io.Serializable {

    private int rasporedId;
    private Korisnik korisnik;
    private Date datum;
    private String stanje;

    public Raspored() {
    }

    public Raspored(int rasporedId, Korisnik korisnik, Date datum) {
        this.rasporedId = rasporedId;
        this.korisnik = korisnik;
        this.datum = datum;
    }

    public Raspored(int rasporedId, Korisnik korisnik, Date datum, String stanje) {
        this.rasporedId = rasporedId;
        this.korisnik = korisnik;
        this.datum = datum;
        this.stanje = stanje;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "rasporedId", unique = true, nullable = false)
    public int getRasporedId() {
        return this.rasporedId;
    }

    public void setRasporedId(int rasporedId) {
        this.rasporedId = rasporedId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lekarId", nullable = false)
    public Korisnik getKorisnik() {
        return this.korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datum", nullable = false, length = 19)
    public Date getDatum() {
        return this.datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Column(name = "stanje", length = 20)
    public String getStanje() {
        return this.stanje;
    }

    public void setStanje(String stanje) {
        this.stanje = stanje;
    }

}
