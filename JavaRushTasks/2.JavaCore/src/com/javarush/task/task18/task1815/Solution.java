package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        String HeaderText = "";
        TableInterface tt;

        public TableInterfaceWrapper(TableInterface t){
            this.tt = t;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tt.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tt.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
             tt.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}