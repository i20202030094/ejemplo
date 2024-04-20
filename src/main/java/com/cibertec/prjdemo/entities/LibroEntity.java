package com.cibertec.prjdemo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="libro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibroEntity extends BaseEntity {	
	private String name;
	private String gene;
	private int pages;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<AutorEntity> autores;
	 

}
