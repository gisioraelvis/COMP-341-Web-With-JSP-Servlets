package utils;

public class Utils {

    public static String databasePath = "/home/ojay/dev/web/COMP-341-Web-With-JSP-Servlets/src/main/database/";
    public static String iDGenerator() {
        String id = "";
        for (int i = 0; i < 10; ++i) {
            id += (int) (Math.random() * 10);
        }
        return id;
    }

}
