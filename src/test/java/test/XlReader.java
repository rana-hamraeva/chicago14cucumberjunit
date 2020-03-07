package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class XlReader {

    public static void main(String[] args)throws Exception {

        File file = new File("src/SampleData.xlsx");

        System.out.println(file.exists());

        //Load thefile into java memory usind fileInputStrea
        FileInputStream fileInputStream =new FileInputStream(file);

        //load the excel workbook into java class

        XSSFWorkbook workbook =new XSSFWorkbook(fileInputStream);

        //getting the sheet from the workBook

        XSSFSheet sheet = workbook.getSheet("Employees");

        //how to get Martin from the xcell sheet
        //sheet.getRow(2).getCell(1);

        System.out.println(sheet.getRow(2).getCell(1));

        int  usedRows = sheet.getPhysicalNumberOfRows();
        //Will count only the used cells ,if they are not used cells they will not be counted
    int lastUsedRow = sheet.getLastRowNum();
    //will count from top to buttom does not care if cell used or not

        //TODO: 1- create logic that prints out neenas name dynamicly

        for (int rowNum =0; rowNum<usedRows;rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Neena")){

                System.out.println("Neenas Name: " + sheet.getRow(rowNum).getCell(0));
            }
        }


        //TODO 2 - creat a logic that prints rickys name dynamic

        for (int rowNum = 0 ; rowNum<usedRows;rowNum++){

            if (sheet.getRow(rowNum).getCell(1).toString().equalsIgnoreCase("Martin")){
                System.out.println("Rickys last name : " + sheet.getRow(rowNum).getCell(1) );
            }
        }

    }
}
