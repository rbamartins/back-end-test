/**
 * 
 */
package br.com.superamedia.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.superamedia.entidade.Requisitos;

/**
 * Interface de persistência: REQUISITOS
 * 
 * @author Rafael Martins
 * @since 08/08/2016
 * @version 1.0
 * 
 */
@RepositoryRestResource(collectionResourceRel = "requisitos", path = "requisitos")
public interface RequisitosDAO extends CrudRepository<Requisitos, Integer> {

	/**
	 * Método responsável por lista todos os REQUISITOS, ordenando-os através do
	 * 'nome'.
	 * 
	 * @return List<Requisitos> - Lista de requisitos.
	 */
	@Query("select * from requisitos r order by r.nome")
	public List<Requisitos> listaTodos();

	/**
	 * Método responsável por listar os requisitos por genêro, ordenando-os
	 * através do 'nome'.
	 * 
	 * @param p_genero
	 *            - Genêro (M)asculino / (F)eminino
	 * @return List<Requisitos> - Lista de requisitos.
	 */
	@Query("select * from requisitos r where r.genero = :p_genero order by r.nome")
	public List<Requisitos> listaPorGenero(@Param("p_genero") String p_genero);

	/**
	 * Método responsável por listar os requisitos por genêro, ordenando-os
	 * através do 'nome'.
	 * 
	 * @param p_nome
	 *            - Nome requisito
	 * @return List<Requisitos> - Lista de requisitos
	 */
	@Query("select * from requisitos r where r.nome = :p_nome order by r.nome")
	public List<Requisitos> listaPorNome(@Param("p_nome") String p_nome);

}
