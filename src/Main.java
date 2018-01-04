import anon.database.*;
import anon.database.connect.Connection;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException, DatabaseNotFoundException, ColumnIndexOutOfBoundException {

        Connection.connect("Tublime Text");
        Database mainDB = new Database("mainDB");
        Table studentTB = new Table();
        studentTB.createTable("MainTB",mainDB);
        String[] colName = new String[]{"id", "name","email"};
        String[] rowData = new String[]{"6","sahitya","lucky@gmail.com"};
        studentTB.setColumns(colName);
        studentTB.addRow(rowData);

        AnDatabase anDatabase = new AnDatabase();
        AnDatabase.Settings.setEncryptionKey(467);
        AnDatabase.Settings.setRealTimeEncryption(true);
        AnDatabase.Settings.setCaseSensitivity(false);

        System.out.println(Security.decrypt(Security.encrypt("Anikesh Patel",7864),7864));


    }
}

