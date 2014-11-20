public class video {

	video(
			String nome,
			String resenha,
			String fotocapa,
			String anolancamento,
			String duracao)
		{
		setNome(nome);
		setResenha(resenha);
		setFotocapa(fotocapa);
		setAnolancamento(anolancamento);
		setDuracao(duracao);
	}
	
	private String nome;
	private String resenha;
	private String fotocapa;
	private String anolancamento;
	private String duracao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResenha() {
		return resenha;
	}
	public void setResenha(String resenha) {
		this.resenha = resenha;
	}
	public String getFotocapa() {
		return fotocapa;
	}
	public void setFotocapa(String fotocapa) {
		this.fotocapa = fotocapa;
	}
	public String getAnolancamento() {
		return anolancamento;
	}
	public void setAnolancamento(String anolancamento) {
		this.anolancamento = anolancamento;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
}
