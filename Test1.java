package Test;
import java.sql.*;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.用户信息和url
        //String url = "jdbc:mysql://localhost:3306/WEATHER?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String url = "jdbc:mysql://localhost:3306/WEATHER?characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "12345678";


        //3.连接成功，数据库对象
        Connection connection = DriverManager.getConnection(url,username,password);

        //4.执行SQL对象
        Statement statement = connection.createStatement();

        //.执行SQL
        String sql = "SELECT * FROM student";//查询student表中的所有数据
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()) {
            System.out.println("student_id=" + resultSet.getObject("student_id"));
            System.out.println("student_name=" + resultSet.getObject("student_name"));
            System.out.println("gender=" + resultSet.getObject("gender"));
            System.out.println("hobby=" + resultSet.getObject("hobby"));
            System.out.println("             ");
        }
        System.out.println("!!!!!!!!!!!!!");
        String sql2 = "SELECT * FROM student where hobby = 'dance'";//查询表中所有hobby是dance的数据
        resultSet = statement.executeQuery(sql2);
        while(resultSet.next()) {
            System.out.println("student_id=" + resultSet.getObject("student_id"));
            System.out.println("student_name=" + resultSet.getObject("student_name"));
            System.out.println("gender=" + resultSet.getObject("gender"));
            System.out.println("hobby=" + resultSet.getObject("hobby"));
            System.out.println("             ");
        }
        System.out.println("!!!!!!!!!!!!!");
        String sqll3 = "UPDATE class SET class_name='SI' WHERE class_name='NG'";//更新表中的数据
        int resultset3 = statement.executeUpdate(sqll3);
        System.out.println(resultset3);//打印受影响的行数
        System.out.println();
        String sql3 = "SELECT class_id,class_name FROM class";
        resultSet = statement.executeQuery(sql3);
        while(resultSet.next()) {
            System.out.println("class_id=" + resultSet.getObject("class_id"));
            System.out.println("class_name=" + resultSet.getObject("class_name"));
            System.out.println("             ");
        }
        System.out.println("!!!!!!!!!!!!!");
        String sql5 = "SELECT * FROM student as s,class as c, goto_school as g\n" +
                "                where (s.student_id = g.student_id) and (c.class_id=g.class_id)";
        resultSet = statement.executeQuery(sql5);
        while(resultSet.next()) {
            System.out.println("student_id=" + resultSet.getObject("student_id"));
            System.out.println("student_name=" + resultSet.getObject("student_name"));
            System.out.println("gender=" + resultSet.getObject("gender"));
            System.out.println("hobby=" + resultSet.getObject("hobby"));
            System.out.println("class_id=" + resultSet.getObject("class_id"));
            System.out.println("class_name=" + resultSet.getObject("class_name"));
            System.out.println("student_con=" + resultSet.getObject("student_con"));
            System.out.println("time_inter=" + resultSet.getObject("time_inter"));            System.out.println("             ");
        }
        String sqll6 = "DELETE from goto_school where student_id = 10011 ";//删除表中数据
        int resultset6 = statement.executeUpdate(sqll6);
        System.out.println(resultset6);
        System.out.println();



        resultSet.close();
        statement.close();
        connection.close();



        }


    }

