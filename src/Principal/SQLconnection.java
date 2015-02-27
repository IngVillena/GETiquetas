
package Principal;

import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;

public class SQLconnection
    {
        private String user;
            private String password;
                private String db;
                    private String host;
                    private String port;
                private String url;
            private Connection conn = null;
        private Statement stm;
    private ResultSet rs = null;
private PreparedStatement pst = null;

public SQLconnection()
{
this.url = "jdbc:mysql://" + this.host + "/" + this.db;
}

public SQLconnection (String server, String puerto, String usuario, String contraseña, String bd)
    {
        this.user = usuario;
            this.password = contraseña;
                this.db = bd;
            this.host = server;
        this.port = puerto;
    this.url = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.db;
}

public static Connection ConnectDb(String server, String puerto, String BD, String usuario, String pass){
    try
        {
            Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://"+server+":"+puerto+"/"+BD, usuario, pass);
                    return conn;
                        }
                    catch (Exception e)
                {
            JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}

public String getDb()
{
return db;
}

public void setDb(String db)
{
this.db = db;
}

public String getHost()
{
return host;
}

public void setHost(String host)
{
this.host = host;
}

public String getPassword()
{
return password;
}

public void setPassword(String password)
{
this.password = password;
}

public String getUser()
{
return user;
}

public void setUser(String user)
{
this.user = user;
}

public String getPort()
{
return port;
}

public void setPort(String port)
{
this.port = port;
}

public ResultSet consultar(String tabla) throws SQLException
{
rs = stm.executeQuery("SELECT * FROM " + tabla);
return rs;
}

public static void borrarDirectorio(File directorio)
    {
        File[] ficheros = directorio.listFiles();
            for(int q=0;q<ficheros.length;q++)
                {
                    if (ficheros[q].isDirectory())
                    {
                borrarDirectorio(ficheros[q]);
            }
        ficheros[q].delete();
    }  
}
/*{
File[] ficheros = directorio.listFiles();
                
    for (File fichero : ficheros) {
        if (fichero.isDirectory()) {
            borrarDirectorio(fichero);
        }
        fichero.delete();
    }  
}*/

}