package com.matthewpriebe.hpi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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

    public Price(String price) {
        this.price = price;
    }

    public Price(String price,PriceId pk) {
        this.price = price;
        this.pk = pk;
    }

    @Transient
    public Procedure getProcedure() {
        return getPk().getProcedure();
    }

    public void setProcedure(Procedure procedure) {
        getPk().setProcedure(procedure);
    }

    @Transient
    public Hospital getHospital() {
        return getPk().getHospital();
    }

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
