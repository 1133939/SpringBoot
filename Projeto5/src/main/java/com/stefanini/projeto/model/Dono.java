package com.stefanini.projeto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.stefanini.projeto.enums.SituacaoEnum;

@Entity
public class Dono implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SQ_DN_NU", sequenceName = "SQ_DN_NU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DN_NU")
	@Column(name = "DN_NU")
	private Long id;

	@Column(name = "DN_NO")
	private String nome;


	@OneToMany(mappedBy = "dono")
	private List<Cachorro> cachorros;

	public Dono() {
		super();
	}
	public Dono(String nome) {
		this.nome = nome;
	}

	public Dono(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public List<Cachorro> getCachorros() {
		return cachorros;
	}

	public void setCachorros(List<Cachorro> cachorros) {
		this.cachorros = cachorros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dono other = (Dono) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}