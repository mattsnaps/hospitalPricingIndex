package com.matthewpriebe.hpi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Hospital. Represents a Hospital.
 */
@Data
@NoArgsConstructor

@Entity(name = "Hospital")
@Table(name = "hospital")
public class Hospital implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "hospital_Name")
    private String hospitalName;

    @OneToMany(mappedBy = "pk.hospital", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude private Set<Price> prices = new HashSet<>(0);

    /**
     * Instantiates a new Hospital.
     *
     * @param hospitalName the hospital name
     */
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * Instantiates a new Hospital.
     *
     * @param hospitalName the hospital name
     * @param prices       the prices
     */
    public Hospital(String hospitalName, Set<Price> prices) {
        this.hospitalName = hospitalName;
        this.prices = prices;
    }
}
