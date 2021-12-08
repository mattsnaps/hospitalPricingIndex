package com.matthewpriebe.hpi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.io.Serializable;

/**
 * The type Price.
 * Represents the price of one procedure from one hospital
 */
@Getter
@Setter
@NoArgsConstructor

@Entity(name = "ProcedureHospital")
@Table(name = "standard_charge")
public class ProcedureHospital implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "discounted_cash_price")
    private String price;

    @Id
    @ManyToOne
    @JoinColumn(name = "hospital_id", referencedColumnName = "id")
    private Hospital hospital;

    @Id
    @ManyToOne
    @JoinColumn(name = "procedure_id", referencedColumnName = "id")
    private Procedure procedure;

    public ProcedureHospital(Hospital hospital, Procedure procedure) {
        this.hospital = hospital;
        this.procedure = procedure;
    }

    public ProcedureHospital(Hospital hospital, Procedure procedure, String price) {
        this.hospital = hospital;
        this.procedure = procedure;
        this.price = price;
    }


}
