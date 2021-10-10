package com.matthewpriebe.hpi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Procedure.
 */
@Data
@NoArgsConstructor

@Entity(name = "Procedure")
@Table(name = "procedure")
public class Procedure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "hcpcs_code")
    private String procedureCode;

    @Column(name = "code_desc")
    private String codeDescription;

    @Column(name = "code_desc_english")
    private String codeDescriptionLong;

    @OneToMany(mappedBy = "procedure", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude private Set<HospitalProcedurePrice> procedures = new HashSet<>();

    /**
     * Instantiates a new Procedure.
     *
     * @param code                the code
     * @param codeDescription     the code description
     * @param codeDescriptionLong the code description long
     */
    public Procedure(String code, String codeDescription, String codeDescriptionLong) {
        this.procedureCode = code;
        this.codeDescription = codeDescription;
        this.codeDescriptionLong = codeDescriptionLong;
    }

    /**
     * Add procedure.
     *
     * @param procedure the procedure
     */
    public void addProcedure(HospitalProcedurePrice procedure) {
        procedures.add(procedure);
        procedure.setProcedure(this);
    }

    /**
     * Remove procedure.
     *
     * @param procedure the procedure
     */
    public void removeProcedure(HospitalProcedurePrice procedure) {
        procedures.remove(procedure);
        procedure.setProcedure(this);
    }
}
