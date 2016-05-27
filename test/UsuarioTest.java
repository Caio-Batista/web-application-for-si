import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import models.Usuario;
import models.UsuarioComparator;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
	
	@Test
	public void testaExcecoes() {
		//Nome longo
		try {
			new Usuario("abcabcdabcdabcdabcdabcdabcdabcdabcdabcdaabcabcdabcdabcdabcdabcdabcdabcdabcdabcda", "email@email.com", "senha123");
			Assert.fail();
		} catch(Exception e) { }
		//Email invalido
		try {
			new Usuario("Nome", "email@", "senha123");
			Assert.fail();
		} catch(Exception e) { }
		//Senha curta
		try {
			new Usuario("Nome", "email@email.com", "sen");
			Assert.fail();
		} catch(Exception e) { }
	}
	
	@Test
	public void testaIgualdade() throws Exception {
		Usuario u1 = new Usuario("Pedro", "usuario@usuario.com", "senhaalternativa");
		Usuario u2 = new Usuario("Ana", "usuario@usuario.com", "eusoudescolada");
		Usuario u3 = new Usuario("José", "pegatoda@gmail.com", "vemnimimgatinha");
		Assert.assertTrue(u1.equals(u2));
		Assert.assertFalse(u1.equals(u3));
	}
	
	@Test
	public void testaComparator() throws Exception {
		Usuario u1 = new Usuario("Pedro", "usuario@usuario.com", "senhaalternativa");
		Usuario u2 = new Usuario("Ana", "usuario@usuario.com", "eusoudescolada");
		Usuario u3 = new Usuario("José", "pegatoda@gmail.com", "vemnimimgatinha");
		u1.setEventosCriados(2);
		u1.setEventosParticipados(5);
		u2.setEventosCriados(20);
		u2.setEventosParticipados(3);
		u3.setEventosCriados(10);
		u3.setEventosParticipados(7);
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u3);
		Collections.sort(usuarios, new UsuarioComparator());
		Iterator i = usuarios.iterator();
		Assert.assertEquals(u2, i.next());
		Assert.assertEquals(u3, i.next());
		Assert.assertEquals(u1, i.next());
	}
	
}