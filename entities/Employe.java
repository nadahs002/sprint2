package com.nada.employes.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    @NotNull
    @Size(min = 4,max = 15)
    private String nomEmploye;

    @Min(value = 10)
    @Max(value = 10000)

    private Double salaire;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private Date dateRec;

    public Employe() {
        super();
    }

    public Employe(String nomEmploye, Double salaire, Date dateRec) {
        super();
        this.nomEmploye = nomEmploye;
        this.salaire = salaire;
        this.dateRec = dateRec;
    }

    public Long getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public Date getDateRec() {
        return dateRec;
    }

    public void setDateRec(Date dateRec) {
        this.dateRec = dateRec;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "idEmploye=" + idEmploye +
                ", nomEmploye='" + nomEmploye + '\'' +
                ", salaire=" + salaire +
                ", dateRec=" + dateRec +
                '}';
    }
}
