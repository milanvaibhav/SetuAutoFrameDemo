package com.jira.utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

    /**
     *
     * @param fileName : Excel File Name
     * @param sheetName : Sheet Name
     * @return : Sheet Data
     */

    static FileInputStream excelFile=null;
    static Workbook wb;
    static Sheet sheet;

    public static Object[][] getExcelData(String fileName, String sheetName){

        Object[][] excelData = null;
        try {
            excelFile = new FileInputStream(fileName);
            wb = WorkbookFactory.create(excelFile);
            wb.getSheet(sheetName);
            int noOfRows=sheet.getLastRowNum();
            int noOfColumns = sheet.getRow(0).getLastCellNum();
            excelData = new Object[noOfRows][noOfColumns];
            for(int i=1; i< noOfRows; i++ ){
                for(int j =0; i< noOfColumns; j++ ){
                    excelData[i-1][j]=sheet.getRow(i+j).getCell(j).toString();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return excelData;

    }
}
