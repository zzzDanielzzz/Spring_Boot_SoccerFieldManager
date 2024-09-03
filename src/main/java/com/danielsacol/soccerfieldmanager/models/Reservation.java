package com.danielsacol.soccerfieldmanager.models;

import java.io.Serializable;
import java.sql.Date;

import com.danielsacol.soccerfieldmanager.utils.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startime;
    private Date endTime;
    private String payment;

    
    private Status status;
    // Fectch Lazy solo trae el id de la entidad, por defecto la usa OneToMany y OnetoOne
    @ManyToOne // Usa Fetch Eager por defecto, trae todos los atributos
    private User user;
    @ManyToOne
    private SoccerField soccerField;

}
