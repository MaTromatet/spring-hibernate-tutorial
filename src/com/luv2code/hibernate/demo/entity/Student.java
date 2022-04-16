package com.luv2code.hibernate.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="student")
public class Student {

	/*
Strategy = GenerationType.AUTO : La génération de la clé primaire est laissée à l’implémentation.  C’est hibernate qui s’en charge et qui crée une séquence unique sur tout le schéma via la table hibernate_sequence.


Strategy = GenerationType. IDENTITY : La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.

Exemple pour MySQL, il s’agit d’un AUTO_INCREMENT.


Strategy = GenerationType. TABLE : La génération de la clé primaire se fera en utilisant une table dédiée hibernate_sequence qui stocke les noms et les valeurs des séquences.

Cette stratégie doit être utilisée avec une autre annotation qui est @TableGenerator.

Exemple: {{< highlight java "linenos=table" >}} @GeneratedValue (strategy = GenerationType.TABLE, generator = "clientGenerator")

@TableGenerator (name = "clientGenerator", pkColumnName = "nom_colonne_pk", valueColumnName = "nom_colonne_valeur_pk", allocationSize = 1)

{{< / highlight >}}


Strategy = GenerationType. SEQUENCE : La génération de la clé primaire se fera par une séquence définie dans le SGBD, auquel on ajoutera l’attribut generator. Cette stratégie doit être utilisée avec une autre annotation qui est @SequenceGenerator. Cette annotation possède l’attribut name pour le nom du generator, l’attribut sequenceName pour le nom de la séquence et enfin allocationSize qui est l’incrémentation de la valeur de la séquence.

Exemple: {{< highlight java "linenos=table" >}} @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "enerator_client")

@SequenceGenerator (name = "generator_client", sequenceName = "WINDEV_SEQ", allocationSize = 1) {{< / highlight >}} Nous verrons ultérieurement comment utiliser d’autres annotations de mapping.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
    @Column(name="date_of_birth")
    @Temporal(TemporalType.DATE)    
    private Date dateOfBirth;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, String email, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
}




