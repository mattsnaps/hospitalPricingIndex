package com.matthewpriebe.hpi.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Hospital. Represents a Hospital.
 */
@Getter
@Setter
@NoArgsConstructor

@Entity(name = "Hospital")
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "entity_cd")
    private String entity;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Price> prices = new HashSet<>();

    /**
     * Instantiates a new Hospital.
     *
     * @param hospitalName the hospital name
     */
    public Hospital(String hospitalName, String entity) {
        this.entity = entity;
        this.hospitalName = hospitalName;
    }

    /**
     * Instantiates a new Hospital.
     *
     * @param hospitalName the hospital name
     * @param prices       the prices
     */
    public Hospital(String hospitalName, String entity, Set<Price> prices) {
        this.hospitalName = hospitalName;
        this.entity = entity;
        this.prices = prices;
    }
}