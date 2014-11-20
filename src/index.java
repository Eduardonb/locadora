import javax.swing.JOptionPane;


public class index {

	public static void main(String[] args) {
	
		Gerenciador gerenciador = new Gerenciador();
		
		int flag = 0;
		while(flag == 0){
			int menu = Integer.parseInt(JOptionPane.showInputDialog("MENU"+"\n"+"\n"+
			"1) Cadastrar video"+"\n"+
			"2) Alterar video"+"\n"+
			"3) Buscar video"+"\n"+
			"4) Excluir video"+"\n"+
			"5) Sair"));
			
			if(menu == 1){
				String nome = JOptionPane.showInputDialog("Informe o nome do video");
				String resenha = JOptionPane.showInputDialog("Informe a resenha do video");
				String fotocapa = JOptionPane.showInputDialog("Informe o caminho do foto");
				String anolancamento = JOptionPane.showInputDialog("Informe o ano de lançamento");
				String duracao = JOptionPane.showInputDialog("Informe a duração do filme");
				gerenciador.inserir(nome, resenha, fotocapa, anolancamento, duracao);
				
			}
			
			if(menu == 2){
				String nomeVideo = JOptionPane.showInputDialog("Informe o nome do video que deseja alterar");
				String nome = JOptionPane.showInputDialog("Informe o novo nome do video");
				String resenha = JOptionPane.showInputDialog("Informe a  nova resenha do video");
				String fotocapa = JOptionPane.showInputDialog("Informe o novo caminho do foto");
				String anolancamento = JOptionPane.showInputDialog("Informe o novo ano de lançamento");
				String duracao = JOptionPane.showInputDialog("Informe a nova duração do filme");
				video novoVideo = new video(nome, resenha, fotocapa, anolancamento, duracao);
				
				gerenciador.alterar(novoVideo, nomeVideo);
				
			}
			
			if(menu == 3){
				String nome = JOptionPane.showInputDialog("Informe o novo nome do video");
				video video = gerenciador.listar(nome);
				if(video != null) {
					JOptionPane.showMessageDialog(null,"Nome do video: "+video.getNome()+"\n"+
													"Resenha: "+video.getResenha()+"\n"+
													"Caminho da foto: "+video.getFotocapa()+"\n"+
													"Ano lançamento: "+video.getAnolancamento()+"\n"+
													"Duração: "+video.getDuracao());
				}
			}
			
			if(menu == 4){
				String nome = JOptionPane.showInputDialog("Informe o novo nome do video");
				gerenciador.excluir(nome);
			}
			
			if(menu == 5){
				flag = 1;
			}
		}
	}
}