package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
public class Departement implements Serializable {

	private static final long serialVersionUID = -357738161698377833L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@JsonIgnore
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Employe> employes;
	 
	@ManyToOne
	private Entreprise entreprise;

	public Departement() {
		super();
	}
	
	public Departement(String name) {
		this.name = name;
	}
	 


}
 