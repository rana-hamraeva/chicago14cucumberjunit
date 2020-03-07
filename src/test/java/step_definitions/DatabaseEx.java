package step_definitions;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseEx {

    public static void main(String[] args) {


          //url:ec2-18-189-17-3.us-east-2.compute.amazonaws.com
        //port:1521
        //SID: xe
        //userName : Hr
        //Password:hr

        //String url = "jdbc:oracle:thin:@yoururl:1521:xe";


        String url = "jdbc:oracle:thin:@ec2-18-189-17-3.us-east-2.compute.amazonaws.com:1521:xe";
        String username ="Hr";
        String  password= "hr";


        //connecton ==>creates comunication
        //Statement ==> write query
        //ResultSet = result will be stored =>new datatype


        try {
            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("select first_name, last_name, salary from employees");

            ResultSetMetaData metaData = resultSet.getMetaData();
            int numOfcolums = metaData.getColumnCount();
            List <Map<Object,Object>> data= new ArrayList<>();




//            resultSet.next();
//            resultSet.next();
//            resultSet.next();
//            resultSet.next();


            System.out.println("Number of columns"+numOfcolums);
while (resultSet.next()){

    Map<Object,Object> map = new HashMap<>();

    for (int i= 1; i<=numOfcolums; i++) {
        map.put(metaData.getColumnName(i),resultSet.getObject(i));

    }
    data.add(map);
//    String value1 = (String)resultSet.getObject(1);
//    String value2 = (String)resultSet.getObject(2);
   // String value3 = (String)resultSet.getObject(3);



//   System.out.println(num + " First Name: " +value1+ "," +" Last Name "+ value2);
//    num++;
}
//            System.out.println("Index 1 : "+resultSet.getObject(2));
//            System.out.println("Index 2 : "+resultSet.getObject(3));




            System.out.println("Connection successful");
            connection.close();
            statement.close();
            resultSet.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Connection Failed");
        }

    }
}
