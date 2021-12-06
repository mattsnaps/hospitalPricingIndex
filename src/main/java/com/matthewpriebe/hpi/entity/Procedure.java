package com.matthewpriebe.hpi.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Procedure.
 * Represents a medical procedure
 */
@NoArgsConstructor
@Getter
@Setter

@Entity(name = "Procedure")
@Table(name = "`procedure`")
public class Procedure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String code;

    @Column(name = "code_type")
    private String codeType;

    @Column(name = "code_desc")
    private String codeDescription;

    @ManyToOne
    @JoinColumn(name="procedure_catagory_id", nullable = false)
    private ProcedureType procedureType;

    @OneToMany(mappedBy = "procedure", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Price> prices = new HashSet<>();

    public Procedure(String code, String codeType, String codeDescription, ProcedureType procedureType) {
        this.code = code;
        this.codeType = codeType;
        this.codeDescription = codeDescription;
        this.procedureType = procedureType;
    }

    public void addHospital(Hospital hospital) {
        Price procedurePrice = new Price(hospital, this);
        prices.add(procedurePrice);
        hospital.getPrices().add(procedurePrice);
    }

}
