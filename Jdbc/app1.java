// import java.sql.Connection;
// import java.sql.DriverManager;

// public class App {
//     public static void main(String[] args) throws Exception {

//         String url = "jdbc:mysql://localhost:3306/jdbc_db";
//         String user = "root";
//         String pass = "Hainy@28"; // put your real password

//         Connection con = DriverManager.getConnection(url, user, pass);

//         System.out.println("✅ 💥Connected to MySQL successfully!");

//         con.close();
//     }
// }


import java.sql.*;

public class app1 {
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/startersql";
        String uname = "root";
        String pass = "root123";
        int uid = 27;
        String name = "Aamir";
        String email = "Aamir@gmai.com";
        //String query = "SELECT * FROM users";
        String query = ("Insert into users (id , name,email)VALUES (?,?,?)");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);

        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, 27);
        st.setString(2, name);
        st.setString(3, email);
        
        int count = st.executeUpdate();
        
        System.out.println(count+"Row affected");

        // while(rs.next()) {
        //     String userdata = rs.getInt(1)+":"+rs.getString(2);
        //     System.out.println(userdata);
        // }
        

        //rs.close();
        st.close();
        con.close();
    }
}

// public class App{
//     public static void main(String[] args) throws Exception {
//         Class.forName("com.mysql.jdbc.Driver");
//     }
// }

// class pqr{

//     static{
//         System.out.println("In static");
//     }
//     //Instance
//     {
//         System.out.println("In Instance");
//     }
}