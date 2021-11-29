package cursojava.thread;

import java.util.Objects;

public class ObjetoFilaThread {
	
	private String nome;
	private String email;
	public String getNome() {
		return nome;
	}
	
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoFilaThread other = (ObjetoFilaThread) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
