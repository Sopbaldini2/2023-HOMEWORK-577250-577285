package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.*;

public interface FabbricaDiComando {
	public Comando costruisciComando(String istruzione, IO io);
}

