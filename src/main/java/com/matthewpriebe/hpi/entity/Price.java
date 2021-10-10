package com.matthewpriebe.hpi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@NoArgsConstructor

@Entity(name = "HospitalProcedurePrice")
@Table(name = "hospital_procedure_price")
public class HospitalProcedurePrice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String price;

    @ManyToOne
    private Hospital hospital;

    @ManyToOne
    private Procedure procedure;

    public HospitalProcedurePrice(String price, Hospital hospital, Procedure procedure) {
        this.price = price;
        this.hospital = hospital;
        this.procedure = procedure;
    }
}
