package model;
// Generated Sep 25, 2017 10:03:09 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Sestra generated by hbm2java
 */
@Entity
@Table(name="sestra"
    ,catalog="domzdravlja"
)
public class Sestra  implements java.io.Serializable {


     private int userId;
     private Korisnik korisnik;
     private String tipSestre;

    public Sestra() {
    }

    public Sestra(Korisnik korisnik, String tipSestre) {
       this.korisnik = korisnik;
       this.tipSestre = tipSestre;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="korisnik"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="userId", unique=true, nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Korisnik getKorisnik() {
        return this.korisnik;
    }
    
    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    
    @Column(name="tipSestre", nullable=false, length=20)
    public String getTipSestre() {
        return this.tipSestre;
    }
    
    public void setTipSestre(String tipSestre) {
        this.tipSestre = tipSestre;
    }




}


