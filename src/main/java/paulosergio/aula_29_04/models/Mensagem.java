package paulosergio.aula_29_04.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {
	private final String remetente;
	private final String mensagem;
	private final LocalDateTime horario;
	private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

	public Mensagem(String remetente, String mensagem) {
		this.remetente = remetente;
		this.mensagem = mensagem;
		this.horario = LocalDateTime.now();
	}

	public String getRemetente() { return remetente; }

	public String getMensagem() { return mensagem; }

	public String getHorario() { return fmt.format(horario); }
}

