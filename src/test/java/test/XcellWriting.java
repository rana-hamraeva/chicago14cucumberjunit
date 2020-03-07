package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class XcellWriting {

    public static void main(String[] args)throws Exception {


        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFCell cell;

        XSSFRow row;
        String path = "src/SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");
        row = sheet.getRow(1);
        cell = row.getCell(1);
        int usedRows = sheet.getPhysicalNumberOfRows();
        // create adams cell

        XSSFCell adamscell = sheet.getRow(3).getCell(0);
        System.out.println("Before:" + adamscell);
        adamscell.setCellValue("Madam");
        System.out.println("After : " + adamscell);


        //TODO change stevans name to Tom


        for (int rowNom = 0; rowNom < usedRows; rowNom++) {

            if (sheet.getRow(rowNom).getCell(0).toString().equals("Steve")) {

                sheet.getRow(rowNom).getCell(0).setCellValue("Tom");
            }
        }

        //TODO change neenas jobId to deveoper

        for (int rowNom = 0; rowNom < usedRows; rowNom++) {

            if (sheet.getRow(rowNom).getCell(0).toString().equalsIgnoreCase("Madam")) {

                sheet.getRow(rowNom).getCell(2).setCellValue("Developer");
            }

        }


            FileOutputStream fileOutputStream = new FileOutputStream(path);
            workbook.write(fileOutputStream);
            fileInputStream.close();
            fileOutputStream.close();
            workbook.close();


        }
    }
