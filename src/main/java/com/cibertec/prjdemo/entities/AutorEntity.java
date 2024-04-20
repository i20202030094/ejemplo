package com.cibertec.prjdemo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="autor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutorEntity extends BaseEntity{
	
	
	@Column (columnDefinition = "CHAR (20)", nullable = false) 
	private String name;
	@Column (name="lastname", length = 50)
	private String lastName;

}
