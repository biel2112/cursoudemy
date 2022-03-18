package com.udemy.cursomc.service;

import org.springframework.stereotype.Component;

import com.udemy.cursomc.domain.Pessoa;
import com.udemy.cursomc.notificador.NotificadorEmail;

@Component
public class AtivacaoNinjaService {

	private NotificadorEmail notificador;
	
	public void ativar(Pessoa pessoa) {
		pessoa.ativar();
		
		notificador.notificar(pessoa, "Cadastro ativo!");
	}
}
