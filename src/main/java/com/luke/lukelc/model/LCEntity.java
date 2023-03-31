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
public class LCEntity {
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


}
