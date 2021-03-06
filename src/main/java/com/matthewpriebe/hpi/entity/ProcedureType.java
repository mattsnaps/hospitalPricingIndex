package com.matthewpriebe.hpi.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * type of procedure. category
 */
@NoArgsConstructor
@Getter
@Setter

@Entity(name = "ProcedureType")
@Table(name = "procedure_category")
public class ProcedureType {
    @Column(name = "rev_code")
    private String revCode;

    @Column(name = "rev_desc")
    private String revDescription;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @OneToMany(mappedBy = "procedureType", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Procedure> procedures = new HashSet<>();

    /**
     * instantiates a new procedure category
     * @param revCode
     * @param revDescription
     */
    public ProcedureType(String revCode, String revDescription) {
        this.revCode = revCode;
        this.revDescription = revDescription;
    }

    /**
     * allows you to add procedure to a list.
     * @param procedure
     */
    public void addProcedure(Procedure procedure) {
        procedures.add(procedure);
        procedure.setProcedureType(this);
    }

    public void removeProcedure(Procedure procedure) {
        procedures.remove(procedure);
        procedure.setProcedureType(null);
    }

}