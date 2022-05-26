/**
 * 
 */
package exemplo.jpa.teste;

import exemplo.jpa.dao.LocalDAO;
import exemplo.jpa.model.Categoria;
import exemplo.jpa.model.Local;

/**
 * @author NatanPC
 * CRUD em JPA no Console
 */
public class LocalTest {
	
	public static void main(String[] args) {
		LocalDAO dao = new LocalDAO();
		
		Categoria catA = new Categoria();
		catA.setId(1L);
		
		Categoria catB = new Categoria();
		catB.setId(2L);
		
		Local l1 = new Local();
		l1.setPredio("Montparnasse");
		l1.setSala("F303");
		l1.setCapacidade(80);
		l1.setCategoria(catA);
		
		l1 = dao.salvar(l1); // executa o insert
		
		System.out.println("Local salvo: " + l1.getId() + " - " + l1.getPredio() + 
				" - " + l1.getSala() + " - " + l1.getCapacidade() + " - " + l1.getCategoria().getDescricao());
	
		Local l2 = dao.consultarPorId(l1.getId()); // executa o select
		System.out.println("Consultando o local: " +  l1.getId() + " - " +  l1.getCapacidade());

		l2.setCapacidade(120);
		l2 = dao.salvar(l2); // executa o update
		
		System.out.println("Local salvo: " + l2.getId() + " - " + l2.getPredio() + 
				" - " + l2.getSala() + " - " + l2.getCapacidade() + " - " + l2.getCategoria().getDescricao());
		
		dao.remover(l2.getId()); // executa o delete
		System.out.println("O local foi removido");
		
		Local l3 = new Local();
		l3.setPredio("Flamboyant");
		l3.setSala("G02");
		l3.setCapacidade(200);
		l3.setCategoria(catA);
		
		l3 = dao.salvar(l3); // executa o insert
		
		Local l4 = new Local();
		l4.setPredio("Belmont");
		l4.setSala("102");
		l4.setCapacidade(140);
		l4.setCategoria(catB);
		
		l4 = dao.salvar(l4); // executa o insert
		
		System.out.println("ID"+"\t"+"Nome"+"\t"+"Sala"+"\t"+"Capacidade"+"\t"+"Categoria");
		for (Local l : dao.listarTodos()) {
			System.out.println(l.getId() + "\t" + l.getPredio() + 
					"\t" + l.getSala() + "\t" + l.getCapacidade() + 
					"\t" + l.getCategoria().getDescricao());
		}
		
		
	}

}
