package com.luke.lukelc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "leetcodes")
public class LeetcodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
	@NotEmpty
	private String name;

    @Column(name = "algorithm")
	@NotEmpty
	private String algorithm;

	@Column(name = "lcNumber")
	@NotEmpty
	@Digits(fraction = 0, integer = 10)
	private String lcNumber;

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getLcNumber() {
        return lcNumber;
    }

    public void setLcNumber(String lcNumber) {
        this.lcNumber = lcNumber;
    }


}
