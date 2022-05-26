package exemplo.jpa.teste;

import exemplo.jpa.dao.CategoriaDAO;
import exemplo.jpa.model.Categoria;

public class CategoriaTest {

	public static void main(String[] args) {
		CategoriaDAO dao = new CategoriaDAO();
		
		Categoria c1 = new Categoria();
		c1.setDescricao("Prédio");
		c1 = dao.salvar(c1);
		
		Categoria c2 = new Categoria();
		c2.setDescricao("Empresarial");
		c2 = dao.salvar(c2);
		
		for (Categoria c : dao.listarTodos()) {
			System.out.println("Categoria: " + c.getDescricao() + " - id: " + c.getId());
		}

	}

}
