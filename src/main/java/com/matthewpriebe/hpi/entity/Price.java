package com.matthewpriebe.hpi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

/**
 * The type Price.
 * Represents the price of one procedure from one hospital
 */
@Data
@NoArgsConstructor

@Entity(name = "Price")
@Table(name = "hospital_procedure_price")
@AssociationOverrides({
        @AssociationOverride(name = "pk.hospital",
                joinColumns = @JoinColumn(name = "hospital_id")),
        @AssociationOverride(name = "pk.procedure",
                joinColumns = @JoinColumn(name = "procedure_id")) })

public class Price implements java.io.Serializable{

    @EmbeddedId
    private PriceId pk = new PriceId();
    private String price;

    /**
     * Instantiates a new Price.
     *
     * @param price the price
     */
    public Price(String price) {
        this.price = price;
    }

    /**
     * Instantiates a new Price.
     *
     * @param price the price
     * @param pk    the pk
     */
    public Price(String price,PriceId pk) {
        this.price = price;
        this.pk = pk;
    }

    /**
     * Gets procedure key.
     *
     * @return the procedure
     */
    @Transient
    public Procedure getProcedure() {
        return getPk().getProcedure();
    }

    /**
     * Sets procedure key.
     *
     * @param procedure the procedure
     */
    public void setProcedure(Procedure procedure) {
        getPk().setProcedure(procedure);
    }

    /**
     * Gets hospital key.
     *
     * @return the hospital
     */
    @Transient
    public Hospital getHospital() {
        return getPk().getHospital();
    }

    /**
     * Sets hospital key.
     *
     * @param hospital the hospital
     */
    public void setHospital(Hospital hospital) {
        getPk().setHospital(hospital);
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Price that = (Price) o;

        if (getPk() != null ? !getPk().equals(that.getPk())
                : that.getPk() != null)
            return false;

        return true;
    }

    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }
}
