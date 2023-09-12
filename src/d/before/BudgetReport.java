package d.before;

import java.sql.Date;

public class BudgetReport {
    private MySQLDatabase db;

    public BudgetReport() {
        this.db = new MySQLDatabase("127.0.0.1", 5432, "root", "root");
    }

    void open(Date date){
    }

    void save(){
        db.insert();
    }
}
