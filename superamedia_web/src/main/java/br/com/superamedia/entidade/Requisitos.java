/**
 * 
 */
package br.com.superamedia.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidade REQUISITOS
 * 
 * @author Rafael Martins
 * @since 08/08/2016
 * @version 1.0
 * 
 */
@Entity
@Table(name = "REQUISITOS")
public class Requisitos {

	@Id
	@GeneratedValue
	public long id;
	/** Nome Pessoa*/
	@Column(name="NOME")
	public String nome;
	/** Gênero: (M)asculino, (F)eminino */
	@Column(name="GENERO")
	public String genero;
	/** Data de Aniversário */
	@Column(name="DTANIVERSARIO")
	public Date dataAtniverario;
	/** Endereço completo */
	@Column(name="ENDERECO")
	public String endereço;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero
	 *            the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the dataAtniverario
	 */
	public Date getDataAtniverario() {
		return dataAtniverario;
	}

	/**
	 * @param dataAtniverario
	 *            the dataAtniverario to set
	 */
	public void setDataAtniverario(Date dataAtniverario) {
		this.dataAtniverario = dataAtniverario;
	}

	/**
	 * @return the endereço
	 */
	public String getEndereço() {
		return endereço;
	}

	/**
	 * @param endereço
	 *            the endereço to set
	 */
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Requisitos [nome=" + nome + ", genero=" + genero + ", dataAtniverario=" + dataAtniverario
				+ ", endereço=" + endereço + "]";
	}

}
