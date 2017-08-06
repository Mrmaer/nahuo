import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Date date = new Date(12,12,12);
        Studets studets  = new Studets(19,"wo", date);
       int i =  tianjia(studets);
        System.out.println(i);
    }


        private static Connection zhenbei() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/laoma?characterEncoding=utf8&useSSL=true";
        String name ="root";
        String password = "root";
        Connection connection = null;
        Class.forName(driver);
        connection = DriverManager.getConnection(url,name,password);
        return connection;
    }

    private static int tianjia(Studets studets) throws SQLException, ClassNotFoundException {
        Connection connection = zhenbei();
        int i = 0 ;
        String sql = "insert into person (number,name,birthday) values(?,?,?)";
        PreparedStatement preparedStatement;
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,studets.getNumber());
        preparedStatement.setString(2,studets.getName());
        preparedStatement.setDate(3,studets.getDate());
        i = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        return i;
    }
}
