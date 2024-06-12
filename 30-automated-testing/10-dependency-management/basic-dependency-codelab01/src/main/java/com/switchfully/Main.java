package com.switchfully;

import com.github.freva.asciitable.AsciiTable;

public class Main {

    public static void main(String[] args) {
      String[] headers = {"Column 1", "Column 2"};
      String[][] data = {
        {"column 1", "column 2"}};


      System.out.println(AsciiTable.getTable(headers, data));

    }
}
