package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dueData;
    private Double amount;

    public Installment(Date dueData, Double amount) {
        this.dueData = dueData;
        this.amount = amount;
    }

    public Date getDueData() {
        return dueData;
    }

    public void setDueData(Date dueData) {
        this.dueData = dueData;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return sdf.format(dueData) + " - " + String.format("%.2f", amount);
    }

}
