package com.example.busapp;

public class Tickets {


    String busno;
    String deptime;
    String date;
    String dept;


    public Tickets(String busno, String deptime, String date, String dept) {

        this.busno = busno;
        this.deptime = deptime;
        this.date = date;
        this.dept = dept;
    }


    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getDeptime() {
        return deptime;
    }

    public void setDeptime(String deptime) {
        this.deptime = deptime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
