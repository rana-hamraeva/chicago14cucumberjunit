package DataBase;

import utilities.DbUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DataBTest {

    public static void main(String[] args) throws SQLException {

        DbUtils.createConnection();
        List<Map<Object,Object>> data = DbUtils.executeQuery("select * from employees");
        DbUtils.close();

        for (Map<Object,Object>map:data){
            if (map.get("EMPLOYEE_ID").toString().equalsIgnoreCase("175")){
                if (map.get("SALARY").toString().equalsIgnoreCase("8800")){
                    System.out.println("ID: " + map.get("EMPLOYEE_ID") + " Salary: " + map.get("SALARY")+ " is verified");
                }
            }


        }

    }
}
