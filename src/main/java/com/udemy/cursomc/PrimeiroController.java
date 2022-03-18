package com.udemy.cursomc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.udemy.cursomc.domain.Pessoa;
import com.udemy.cursomc.service.AtivacaoNinjaService;

@Controller
public class PrimeiroController {
	
	private AtivacaoNinjaService ativacaoNinjaService;
	
	public PrimeiroController(AtivacaoNinjaService ativacaoNinjaService) {
		this.ativacaoNinjaService = ativacaoNinjaService;
		
		System.out.println("Primeiro Controller: "+ativacaoNinjaService);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Pessoa kakashi = new Pessoa("Kakashi", "Hokage","kakashi_sacana@gemeu.com","4002-8922");
		
		ativacaoNinjaService.ativar(kakashi);
		
		return "Hello";
	}

}
