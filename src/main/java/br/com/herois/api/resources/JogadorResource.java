package br.com.herois.api.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.herois.api.domain.Jogador;

@RestController
@RequestMapping(value="/jogadores")
public class JogadorResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Jogador> listar(){
		
		Jogador jog1 = new Jogador(1, "Admin", "123456", "Homem-Aranha");
		Jogador jog2 = new Jogador(2, "Usuário", "0123456789", "Batman");
		List<Jogador> listaJogador = new ArrayList<>();
		listaJogador.add(jog1);
		listaJogador.add(jog2);
		
		return listaJogador;
	}

}









































