import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Gerenciador {

	public void inserir(String nome, String resenha, String fotocapa, String anolancamento, String duracao) {
		Connection conn = null;
		Statement st = null;

		try {
			conn = ConectaBanco.getConn();
			st = conn.createStatement();
			st.execute("INSERT INTO video (nome, resenha, fotocapa, anolancamento, duracao)"
					+ "VALUES ('"+nome+"', '"+resenha+"', '"+fotocapa+"', '"+anolancamento+"', '"+duracao+"')"
					);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e);
		} finally {
			try {
				if(st != null){
					st.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
			}

		}
	}
	
	public video listar(String nome)
	{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String SQL = "SELECT nome, resenha, fotocapa, anolancamento, duracao FROM video WHERE nome='"+nome+"'";
		
		try{
			conn = ConectaBanco.getConn();
			st = conn.createStatement();
			rs =  st.executeQuery(SQL);
			
			if(rs.next()) {
				String nomeVideo = rs.getString("nome");
				String resenhaVideo = rs.getString("resenha");
				String fotocapaVideo = rs.getString("fotocapa");
				String anolancamentoVideo = rs.getString("anolancamento");
				String duracaoVideo = rs.getString("duracao");
				
				video videoConsulta = new video(nomeVideo, resenhaVideo,fotocapaVideo, anolancamentoVideo, duracaoVideo);
				return videoConsulta;
			} else {
				JOptionPane.showMessageDialog(null,"Video não encontrado!");
			}
				
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,e);
		} finally {
			try {
				if(st != null){
					st.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
			}

		}
		return null;
	}
	
	public void alterar(video novoVideo, String nomeVideo)
	{
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = ConectaBanco.getConn();
			st = conn.createStatement();
			video achouVideo = listar(nomeVideo);
			if(achouVideo != null) {
				st.execute("UPDATE video SET nome='"+novoVideo.getNome()+
						"', resenha='"+novoVideo.getResenha()+
						"', fotocapa='"+novoVideo.getFotocapa()+
						"', anolancamento='"+novoVideo.getAnolancamento()+
						"', duracao='"+novoVideo.getDuracao()+"' WHERE nome='"+nomeVideo+"';"
						);
			}  else {
				JOptionPane.showMessageDialog(null,"Video não Encontrado!");
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,e);
		} finally {
			try {
				if(st != null) {
					st.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,e);
			}
		}
	}
	
	public void excluir(String nome)
	{
		Connection conn = null;
		Statement st = null;
		
		try{
			conn = ConectaBanco.getConn();
			st = conn.createStatement();
			st.execute("DELETE FROM video WHERE nome='"+nome+"'");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e);
		} finally {
			try {
				if(st != null){
					st.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch(Exception e){
				JOptionPane.showMessageDialog(null,e);
			}
		}
	}
	
}
