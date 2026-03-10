package composicao.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerHour;
    private int hours;

    public HourContract(){}

    public HourContract(Date date, double valuePerHour, int hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }
}
