import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class ManagerFinance {

	public static void main(String[] args) throws SQLException {
		// Cria usuário
        Usuario u = new Usuario();
        u.setNome("Anglesson");
        u.setEmail("anglesson@hotmail.com");
        u.setSenha("123");
        
        // Cria conta do usuário.
        Conta carteira = new Conta(u);
        carteira.setNome("Carteira");
        u.adicionarConta(carteira);
        
        // Cria lançamento na conta
        Lancamento lan = new Lancamento("Cacau", 2.25, new Date(), carteira);
        Lancamento lan2 = new Lancamento("Cacau", 2.45, new Date(), carteira);
        
        carteira.adicionarLancamento(lan);
        carteira.adicionarLancamento(lan2);
        
        ArrayList<Conta> contas = u.todasContas();
        for(int i=0; i < contas.size(); i++) {
        	System.out.println(contas.get(i).getNome());
        	System.out.println(contas.get(i).getSaldo());
        }
        
        try {
        	Conexao conn = new Conexao();
        	conn.CadastraUsuario(u);
        } catch (SQLException e) {
        	System.out.println("Houve um erro: "+ e.getMessage());
        }
        
        
	}

}
