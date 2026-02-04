package com.meet;
import java.sql.*;

// ================= STUDENT CLASS =================
class Student {
    int rollno;
    String sname;
}


// ================= DAO CLASS =================
class StudentDAO {

    String url = "jdbc:mysql://localhost:3306/startersql";
    String uname = "root";
    String pass = "root123";

    // -------- GET STUDENT BY ID --------
    public Student getStudent(int rollno) {

        Student s = new Student();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, uname, pass);

            String query = "SELECT name FROM users WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, rollno);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                s.rollno = rollno;
                s.sname = rs.getString("name");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }


    // -------- DELETE STUDENT BY ID --------
    public void deleteStudent(int rollno) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, uname, pass);

            String query = "DELETE FROM users WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student deleted successfully");
            else
                System.out.println("Student not found");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



// ================= MAIN CLASS =================
public class StudentApp {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        int id = 12;

        // FETCH NAME
        Student s = dao.getStudent(id);

        if (s.sname != null)
            System.out.println("Student Name: " + s.sname);
        else
            System.out.println("Student not found");

        // DELETE RECORD
        dao.deleteStudent(id);
    }
}
