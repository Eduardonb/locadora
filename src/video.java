public class video {

	video(
			String nome,
			String resenha,
			String fotocapa,
			String anomelancamento,
			String duracao,
			int categoria,
			int midia,
			int classificacao)
		{
		setNome(nome);
		setResenha(resenha);
		setFotocapa(fotocapa);
		setAnolancamento(anomelancamento);
		setDuracao(duracao);
		setCategoria(categoria);
		setMidia(midia);
		setClassificacao(classificacao);
	}
	
	private String nome;
	private String resenha;
	private String fotocapa;
	private String anolancamento;
	private String duracao;
	private int categoria;
	private int midia;
	private int classificacao;
	
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
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getMidia() {
		return midia;
	}
	public void setMidia(int midia) {
		this.midia = midia;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
}
