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
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "hospital_Name")
    private String hospitalName;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude private Set<HospitalProcedurePrice> hospitals = new HashSet<>();

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
    public void addHospitals(HospitalProcedurePrice hospital) {
        hospitals.add(hospital);
        hospital.setHospital(this);
    }

    /**
     * Remove hospitals.
     *
     * @param hospital the hospital
     */
    public void removeHospitals(HospitalProcedurePrice hospital) {
        hospitals.remove(hospital);
        hospital.setHospital(this);
    }
}
