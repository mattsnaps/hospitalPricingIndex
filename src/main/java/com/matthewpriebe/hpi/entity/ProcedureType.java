package com.matthewpriebe.hpi.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor

@Entity(name = "ProcedureType")
@Table(name = "procedure_category")
public class ProcedureType implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "rev_code")
    String revCode;

    @Column(name = "rev_desc")
    String revDescription;

    @OneToMany(mappedBy = "pk.procedure", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude private Set<Price> prices = new HashSet<>(0);

    public ProcedureType(String revCode, String revDescription) {
        this.revCode = revCode;
        this.revDescription = revDescription;
    }

    public ProcedureType(String revCode, String revDescription,  Set<Price> prices) {
        this.revCode = revCode;
        this.revDescription = revDescription;
        this.prices = prices;
    }
}
