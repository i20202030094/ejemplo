package com.cibertec.prjdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="localidad")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LocalidadEntity extends BaseEntity{
	
	private String name;
	
}
