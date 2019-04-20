import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    private final String fonte = "jdbc:mysql://localhost/db_manager_finance";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String usuario = "root";
    private final String senha = "090690";
    private Connection con;
    private PreparedStatement stm;
    
    public void CadastraUsuario(Usuario usuario) throws SQLException {
    	this.con = DriverManager.getConnection(this.fonte, this.usuario, this.senha);
    	this.stm = this.con.prepareStatement("INSERT INTO usuario(nome, email, senha) VALUES (?, ?, ?)");
    	
    	this.stm.setString(1, usuario.getNome());
    	this.stm.setString(2, usuario.getEmail());
    	this.stm.setString(3, usuario.getSenha());
    	
    	this.stm.executeUpdate();
    	this.stm.close();
    }
    
    /*
    public void CadastrarCliente(Clientes clientes) throws SQLException{
        this.con = DriverManager.getConnection(this.fonte, this.usuario, this.senha);
        this.stm = this.con.prepareStatement("INSERT INTO cliente(nome, telefone, celular, email) VALUES (?, ?, ?, ?)");

        this.stm.setString(1, clientes.getNOME());
        this.stm.setString(2, clientes.getTELEFONE());
        this.stm.setString(3, clientes.getCELULAR());
        this.stm.setString(4, clientes.getEMAIL());
        
        this.stm.execute();
        this.stm.close();
    }
    
    public void PegarUltmId() throws SQLException{
        this.con = DriverManager.getConnection(this.fonte, this.usuario, this.senha);
        this.stm = this.con.getClientInfo();
    }
    
    public Clientes ProcurarClientes(int id) throws SQLException{
        this.con = DriverManager.getConnection(this.fonte, this.usuario, this.senha);
        this.stm = this.con.prepareStatement(" SELECT * FROM cliente WHERE id = ? ");
        
        this.stm.setInt(1, id);
        
        ResultSet rs = this.stm.executeQuery();
        Clientes cliente = new Clientes();
        while(rs.next()){
            cliente.setID(rs.getInt("id"));
            cliente.setNOME(rs.getString("nome"));
            cliente.setTELEFONE(rs.getString("telefone"));
            cliente.setCELULAR(rs.getString("celular"));
            cliente.setEMAIL(rs.getString("email"));
        }
        this.con.close();
        return cliente;
    }
    
    public void AtulizarCliente(Clientes cliente, int id) throws SQLException{
        this.con = DriverManager.getConnection(this.fonte, this.usuario, this.senha);
        this.stm = this.con.prepareStatement(" UPDATE cliente SET nome = ?, telefone = ?, celular = ?, email = ? WHERE id = ? ");
        
        this.stm.setString(1, cliente.getNOME());
        this.stm.setString(2, cliente.getTELEFONE());
        this.stm.setString(3, cliente.getCELULAR());
        this.stm.setString(4, cliente.getEMAIL());
        
        this.stm.setInt(5, id);
        this.stm.executeUpdate();
        this.con.close();
    }
    
    public void RemoverCliente(int id) throws SQLException{
        this.con = DriverManager.getConnection(this.fonte, this.usuario, this.senha);
        this.stm = this.con.prepareStatement("DELETE FROM cliente WHERE id = ?");
        this.stm.setInt(1, id);
        this.stm.execute();
        this.stm.close();
    }
    
    public ArrayList<Clientes> ListaCliente() throws SQLException{
        ArrayList<Clientes> lista = new ArrayList<Clientes>();
        this.con = DriverManager.getConnection(this.fonte, this.usuario, this.senha);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM cliente");
        
        while(rs.next()){
            Clientes cliente = new Clientes();
            cliente.setID(rs.getInt("id"));
            cliente.setNOME(rs.getString("nome"));
            cliente.setTELEFONE(rs.getString("telefone"));
            cliente.setCELULAR(rs.getString("celular"));
            cliente.setEMAIL(rs.getString("email"));
            lista.add(cliente);
        }
        this.stm.close();
        return lista;
    }*/
	
}