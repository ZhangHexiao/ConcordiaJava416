package com.cejv416.jdbc1;

import java.sql.SQLException;


public interface FishDAO_01 {

    /**
     *
     * @return
     * @throws SQLException
     */
    public String retrieveData() throws SQLException;
    public String retrieveLatinName() throws SQLException;
    public String retrievSspeciesOrigin(String s) throws SQLException;
}
