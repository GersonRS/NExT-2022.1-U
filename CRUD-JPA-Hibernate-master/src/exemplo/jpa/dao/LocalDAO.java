/**
 * 
 */
package exemplo.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplo.jpa.model.Local;

/**
 * @author NatanPC
 *
 */
public class LocalDAO {
	
	// conexao com o BD
	public EntityManager getEM() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		return factory.createEntityManager();
	}
	
	public Local salvar(Local local) {
		EntityManager em = getEM();
		
		try { //tratar erros
			em.getTransaction().begin(); // iniciar transação
			if (local.getId() == null){ // sem PK, então é novo
				em.persist(local); // inserção no BD pelo JPA
			}else {
				if (!em.contains(local)) { // se EntMan conhece local
					if (em.find(Local.class, local.getId()) == null) { 
						// não existe mais no BD
						throw new Exception("Erro ao atualizar o local");
					}
				}
				local = em.merge(local);// executa update
			}
			em.getTransaction().commit(); // finalizar transação
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
			// desfaz tudo que fez e não salva nada,
			// se algo der errado
		} finally {
			em.close();
		} 
		
		return local;
	}
	
	public void remover(Long id) {
		EntityManager em = getEM();
		Local l = em.find(Local.class, id);
		try {
			em.getTransaction().begin();
			em.remove(l); // executa o delete
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			em.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Local> listarTodos(){
		EntityManager em = getEM();
		List<Local> locais = null;
		
		try {
			locais = em.createQuery("FROM Local l").getResultList(); //JPQL
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return locais;
	}
	
	public Local consultarPorId(Long id) {
		EntityManager em = getEM();
		Local l = null;
		
		try {
			l = em.find(Local.class, id); // executa o select
		} catch (Exception e) {
			System.err.println(e); 
		} finally {
			em.close();
		}
		
		return l;
		
	}
}
