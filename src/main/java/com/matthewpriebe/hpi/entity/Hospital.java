package com.matthewpriebe.hpi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Hospital.
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

    @OneToMany(mappedBy = "pk.hospital", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude private Set<Price> prices = new HashSet<>();

    /**
     * Instantiates a new Hospital.
     *
     * @param hospitalName the hospital name
     */
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * Add hospitals.
     *
     * @param hospital the hospital
     */
    public void addHospitals(Price hospital) {
        prices.add(hospital);
        hospital.setHospital(this);
    }

    /**
     * Remove hospitals.
     *
     * @param hospital the hospital
     */
    public void removeHospitals(Price hospital) {
        prices.remove(hospital);
        hospital.setHospital(this);
    }
}
