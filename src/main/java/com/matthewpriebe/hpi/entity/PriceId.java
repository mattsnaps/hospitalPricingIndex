package com.matthewpriebe.hpi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
public class PriceId implements java.io.Serializable {

    @ManyToOne
    private Procedure procedure;
    @ManyToOne
    private Hospital hospital;


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriceId that = (PriceId) o;

        if (procedure != null ? !procedure.equals(that.procedure) : that.procedure != null) return false;
        if (hospital != null ? !hospital.equals(that.hospital) : that.hospital != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (procedure != null ? procedure.hashCode() : 0);
        result = 31 * result + (hospital != null ? hospital.hashCode() : 0);
        return result;
    }
}
