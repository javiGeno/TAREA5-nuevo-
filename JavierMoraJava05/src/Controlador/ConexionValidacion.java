
package Controlador;



import java.sql.*;


public class ConexionValidacion {
    
    private static Connection conexionBD=null;//conectar base de datos postgres
    private static Connection conexionBD2=null;//conectar base de datos mysql
    private static PreparedStatement statamentValidacion=null;//para validar al usuario
    private static String usuario;//guardara el nombre del usuario que se ha validado para realizar operaciones
    
    
   /* private static boolean conectadoPostgres;
    private static boolean conectadoMysql;*/
    private static boolean validadoUsuario;
    
    public ConexionValidacion()
    {
        
        
    }

    public static Connection getConexionBD() {
        return conexionBD;
    }

    public static PreparedStatement getStatamentValidacion() {
        return statamentValidacion;
    }
   /////////////////////////////////CONEXIÓN//////////////////////////////////////
    //Si salta la exepcion, se captura aqui pero devuelve un boleano que sera tratado en la vista
    //Para no pasarle tantos parametros he creado un metodo de conexion para cada bd
    public static boolean realizarConexionPostgres() 
    {
        String URL="jdbc:postgresql://localhost:5432/TIENDA";
        String usuario="usuario";
        String contraseña="pass";
        try{
            Class.forName("org.postgresql.Driver");
            conexionBD=DriverManager.getConnection(URL, usuario, contraseña);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un problema con la BD 1: "+e.getMessage());
            //conectadoPostgres=false;
            return false;
        }
        
        //conectadoPostgres=true;
        return true;
        
    }
    
    public static boolean realizarConexionMysql() 
    {
        String URL="jdbc:mysql://localhost:3306/Tiendas";
        String usuario="root";
        String contraseña="pass";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexionBD2=DriverManager.getConnection(URL, usuario, contraseña);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un problema con la BD 2: "+e.getMessage());
            //conectadoMysql=false;
            return false;
        }
        
        //conectadoMysql=true;
        return true;
        
    }
    ////////////////////////////////////////////FIN CONEXIÓN//////////////////////////////////////////
    
    
    //comprueba que la contraseña sea correcta y usuario 
    public static boolean realizaStatementValidacion(String pass, String usu) throws SQLException
    {
        String sentenciaSQL="select * from USUARIOS where password=? and usuario=?";
        
        
           
            //Valido en mysql y machaco porque no vy hacer mas operaciones con él 
            statamentValidacion=conexionBD2.prepareStatement(sentenciaSQL,  ResultSet.CONCUR_UPDATABLE);//Valido en mysql y machaco
            
            statamentValidacion.setString(1, pass);
            statamentValidacion.setString(2, usu);

            //valido en postgres
            statamentValidacion=conexionBD.prepareStatement(sentenciaSQL, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            statamentValidacion.setString(1, pass);
            statamentValidacion.setString(2, usu);
            
            
            ResultSet user=statamentValidacion.executeQuery();
            
            user.beforeFirst();
            user.next();
            
            
            usuario=user.getString("usuario");
            
            
            validadoUsuario=true;
            return isValidadoUsuario();
            
      
        
    }

    public static String getUsuario() {
        return usuario;
    }
    
  

    public static boolean isValidadoUsuario() {
        return validadoUsuario;
    }
    
    
    
    public static void cerrarConexion()
    {
         try{
            
            conexionBD.close();
            conexionBD2.close();
             System.out.println("Se han cerrado las conexiones con la bd");
         }
         catch(SQLException e)
         {
             
         }
        
    }
}
