package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mytable")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	@Id
	private int id;
	private String address;
	private int mobile;

}
