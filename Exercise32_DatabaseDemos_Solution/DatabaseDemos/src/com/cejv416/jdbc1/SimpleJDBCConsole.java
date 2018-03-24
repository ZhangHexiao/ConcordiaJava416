package com.cejv416.jdbc1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SimpleJDBCConsole {

    private final FishDAOImpl_01 fishDAO;

    public SimpleJDBCConsole() {
        super();
        fishDAO = new FishDAOImpl_01();
    }

    private void perform() {
        String data;
        try {
           // data = fishDAO.retrieveData();
           // data = fishDAO.retrieveLatinName();
            data = fishDAO.retrievSspeciesOrigin("Asia");
        } catch (SQLException ex) {
            Logger.getLogger(SimpleJDBCConsole.class.getName()).log(Level.SEVERE, null, ex);
            data = "Error loading data";
        }
        System.out.println(data);
    }

    public static void main(String[] args) {
        SimpleJDBCConsole simple = new SimpleJDBCConsole();
        simple.perform();
        System.exit(0);

    }

}
