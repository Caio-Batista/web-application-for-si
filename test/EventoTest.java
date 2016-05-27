import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import models.Evento;
import models.GerenciadorDeInscricao;
import models.Local;
import models.InscricaoNormal;
import models.InscricaoPorExperiencia;
import models.Tema;
import models.Usuario;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EventoTest {
	
	private Usuario criador;
	private Local local;
	private Date data;
	private List<Tema> temas;
	private GerenciadorDeInscricao comExperiencia, semExperiencia;
	
	@Before
	public void setUp() throws Exception {
		criador = new Usuario("Usuario", "usuario@usuario.com", "senha123");
		local = new Local("UFCG", "Bodocongó, Campina Grande", 3);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 1);
		data = c.getTime();
		temas = new ArrayList<Tema>();
		temas.add(Tema.ARDUINO);
		temas.add(Tema.DESAFIOS);
		comExperiencia = new InscricaoPorExperiencia();
		semExperiencia = new InscricaoNormal();
	}
	
	@Test
	public void testaExcecoes() {
		//Sem criador
		try {
			new Evento(null, "Evento", "Exemplo de evento", data, temas, local, semExperiencia);
			Assert.fail();
		} catch(Exception e) { }
		//Titulo vazio
		try {
			new Evento(criador, "", "Exemplo de evento", data, temas, local, semExperiencia);
			Assert.fail();
		} catch(Exception e) { }
		//Data atrasada
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, -1);
		Date data2 = c.getTime();
		try {
			new Evento(criador, "Evento", "Exemplo de evento", data2, temas, local, semExperiencia);
			Assert.fail();
		} catch(Exception e) { }
		//Temas vazio
		List<Tema> temas2 = new ArrayList<Tema>();
		try {
			new Evento(criador, "Evento", "Exemplo de evento", data, temas2, local, semExperiencia);
			Assert.fail();
		} catch(Exception e) { }
	}
	
	@Test
	public void testaCapacidadeNaoPrioritario() throws Exception {
		Local l = new Local("Local pequeno", "Quase não cabe ninguém", 3);
		Evento ev = new Evento(criador, "Festa de aniversário", "Na casa do luizinho", data, temas, l, semExperiencia);
		Assert.assertEquals(1, ev.getTotalInscritos());
		Assert.assertEquals(0, ev.getTotalListaDeEspera());
		Usuario u1 = new Usuario("Pedro", "pedro@usuario.com", "senhaalternativa");
		Usuario u2 = new Usuario("Ana", "anagatinha@usuario.com", "eusoudescolada");
		Usuario u3 = new Usuario("José", "pegatoda@gmail.com", "vemnimimgatinha");
		u1.setEventosCriados(2);
		u1.setEventosParticipados(5);
		u2.setEventosCriados(20);
		u2.setEventosParticipados(3);
		u3.setEventosCriados(10);
		u3.setEventosParticipados(7);
		ev.criaInscricao(u1);
		Assert.assertEquals(2, ev.getTotalInscritos());
		Assert.assertEquals(0, ev.getTotalListaDeEspera());
		ev.criaInscricao(u2);
		Assert.assertEquals(3, ev.getTotalInscritos());
		Assert.assertEquals(0, ev.getTotalListaDeEspera());
		ev.criaInscricao(u3);
		Assert.assertEquals(3, ev.getTotalInscritos());
		Assert.assertEquals(1, ev.getTotalListaDeEspera());
		Assert.assertFalse(ev.getParticipantes().get(u3));
		ev.destroiInscricao(u1);
		Assert.assertEquals(3, ev.getTotalInscritos());
		Assert.assertEquals(0, ev.getTotalListaDeEspera());
		Assert.assertTrue(ev.getParticipantes().get(u3));
	}
	
	@Test
	public void testaCapacidadePrioritario() throws Exception {
		Local l = new Local("Local pequeno", "Quase não cabe ninguém", 3);
		Evento ev = new Evento(criador, "Festa de aniversário", "Na casa do luizinho", data, temas, l, comExperiencia);
		Assert.assertEquals(1, ev.getTotalInscritos());
		Assert.assertEquals(0, ev.getTotalListaDeEspera());
		Usuario u1 = new Usuario("Pedro", "pedro@usuario.com", "senhaalternativa");
		Usuario u2 = new Usuario("Ana", "anagatinha@usuario.com", "eusoudescolada");
		Usuario u3 = new Usuario("José", "pegatoda@gmail.com", "vemnimimgatinha");
		Usuario u4 = new Usuario("Dalton", "dalto@dalton.com", "senhadoida");
		u1.setEventosCriados(2);
		u1.setEventosParticipados(5);
		u2.setEventosCriados(20);
		u2.setEventosParticipados(3);
		u3.setEventosCriados(10);
		u3.setEventosParticipados(7);
		//ordem: 2, 3, 1, 4
		ev.criaInscricao(u1);
		Assert.assertEquals(2, ev.getTotalInscritos());
		Assert.assertEquals(0, ev.getTotalListaDeEspera());
		ev.criaInscricao(u2);
		Assert.assertEquals(3, ev.getTotalInscritos());
		Assert.assertEquals(0, ev.getTotalListaDeEspera());
		ev.criaInscricao(u3);
		Assert.assertEquals(3, ev.getTotalInscritos());
		Assert.assertEquals(1, ev.getTotalListaDeEspera());
		//participando: admin, u2, u3
		//em espera: u1
		Assert.assertTrue(ev.getParticipantes().get(u3));
		Assert.assertFalse(ev.getParticipantes().get(u1));
		ev.criaInscricao(u4);
		Assert.assertEquals(2, ev.getTotalListaDeEspera());
		ev.destroiInscricao(u1);
		Assert.assertEquals(3, ev.getTotalInscritos());
		Assert.assertEquals(1, ev.getTotalListaDeEspera());
		Assert.assertTrue(ev.getParticipantes().get(u3));
	}
	
}
