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
 * Represents a medical procedure
 */
@Data
@NoArgsConstructor

@Entity(name = "Procedure")
@Table(name = "`procedure`")
public class Procedure implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "code")
    private String procedureCode;

    @Column(name = "code_type")
    private String codeType;

    @Column(name = "code_desc")
    private String codeDescription;

    @OneToMany(mappedBy = "pk.procedure", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude private Set<Price> prices = new HashSet<>(0);

    /**
     * Instantiates a new Procedure.
     *
     * @param procedureCode       the code
     * @param codeDescription     the code description
     */
    public Procedure(String procedureCode, String codeType, String codeDescription) {
        this.procedureCode = procedureCode;
        this.codeType = codeType;
        this.codeDescription = codeDescription;
    }

    /**
     * Instantiates a new Procedure.
     *
     * @param procedureCode       the procedure code
     * @param codeDescription     the code description
     * @param prices              the prices
     */
    public Procedure(String procedureCode, String codeDescription, Set<Price> prices) {
        this.procedureCode = procedureCode;
        this.codeDescription = codeDescription;
        this.prices = prices;
    }
}
