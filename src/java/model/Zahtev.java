package model;
// Generated Sep 25, 2017 10:03:09 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Zahtev generated by hbm2java
 */
@Entity
@Table(name="zahtev"
    ,catalog="domzdravlja"
)
public class Zahtev  implements java.io.Serializable {


     private int zahtevId;
     private Korisnik korisnik;
     private String stanje;

    public Zahtev() {
    }

	
    public Zahtev(int zahtevId, Korisnik korisnik) {
        this.zahtevId = zahtevId;
        this.korisnik = korisnik;
    }
    public Zahtev(int zahtevId, Korisnik korisnik, String stanje) {
       this.zahtevId = zahtevId;
       this.korisnik = korisnik;
       this.stanje = stanje;
    }
   
     @Id 

    
    @Column(name="zahtevId", unique=true, nullable=false)
    public int getZahtevId() {
        return this.zahtevId;
    }
    
    public void setZahtevId(int zahtevId) {
        this.zahtevId = zahtevId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="osiguranoLiceId", nullable=false)
    public Korisnik getKorisnik() {
        return this.korisnik;
    }
    
    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    
    @Column(name="stanje", length=20)
    public String getStanje() {
        return this.stanje;
    }
    
    public void setStanje(String stanje) {
        this.stanje = stanje;
    }




}


