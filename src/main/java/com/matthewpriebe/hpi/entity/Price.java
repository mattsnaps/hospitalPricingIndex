package com.matthewpriebe.hpi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * The type Price.
 * Represents the price of one procedure from one hospital
 */
@Getter
@Setter
@NoArgsConstructor

@Entity(name = "ProcedureHospital")
@Table(name = "standard_charge")
public class Price implements Serializable {

    @EmbeddedId
    private PriceId id;

    @ManyToOne
    @MapsId("hospitalId")
    private Hospital hospital;

    @ManyToOne
    @MapsId("procedureId")
    private Procedure procedure;

    @Column(name = "id")
    private int tableId;

    @Column(name = "discounted_cash_price")
    private String price;

    public Price(Hospital hospital, Procedure procedure) {
        this.hospital = hospital;
        this.procedure = procedure;
        this.id = new PriceId(hospital.getId(), procedure.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Price that = (Price) o;
        return Objects.equals(hospital, that.hospital) &&
                Objects.equals(procedure, that.procedure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hospital, procedure);
    }
}
