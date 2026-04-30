package paulosergio.aula_29_04.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import paulosergio.aula_29_04.models.Mensagem;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/chat")
public class ChatController {
	private final List<Mensagem> mensagens = new ArrayList<Mensagem>();

	@GetMapping
	public List<Mensagem> index() {
		return mensagens;
	}

	@PostMapping
	public void add(@RequestBody Mensagem mensagem) {
		mensagens.add(mensagem);
	}
}
