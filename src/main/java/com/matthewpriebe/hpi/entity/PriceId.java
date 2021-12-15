package com.matthewpriebe.hpi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * The Id for the price. Id for the hospital and procedure.
 */
@NoArgsConstructor
@Getter
@Setter

@Embeddable
public class PriceId implements Serializable {

    @Column(name = "hospital_id")
    private int hospitalId;

    @Column(name = "procedure_id")
    private int procedureId;

    /**
     * set the hospital id and the procedure id part.
     * @param hospitalId
     * @param procedureId
     */
    PriceId(int hospitalId, int procedureId){
        this.hospitalId = hospitalId;
        this.procedureId = procedureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceId that = (PriceId) o;
        return Objects.equals(hospitalId, that.hospitalId) &&
                Objects.equals(procedureId, that.procedureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hospitalId, procedureId);
    }

}
