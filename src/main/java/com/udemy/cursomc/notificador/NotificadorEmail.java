package com.udemy.cursomc.notificador;

import org.springframework.stereotype.Component;

import com.udemy.cursomc.domain.Pessoa;

@Component
public class NotificadorEmail {

	public void notificar(Pessoa pessoa, String msg) {
		System.out.printf("Notificando o %s, %s, através do e-mail %s: %s\n",pessoa.getTitulo(),pessoa.getNome(),pessoa.getEmail(),msg);
	}
	
}
