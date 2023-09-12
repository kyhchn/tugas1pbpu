package d.after;

import java.sql.Date;

public class BudgetReport {
    private Database db;

    public BudgetReport(Database db) {
        this.db = db;
    }

    void open(Date date){
    }

    void save(){
        db.insert();
    }
}
