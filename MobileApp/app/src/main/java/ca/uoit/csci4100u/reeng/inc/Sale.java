package ca.uoit.csci4100u.reeng.inc;

import java.util.Date;

/**
 * Created by Bashini on 2018-07-28.
 */

public class Sale {
    private String saleStore;
    private String saleDescription;
    private String saleName;
    private Date saleDate;
    private long saleTime;

    public Sale(String saleStore,String saleDescription,String saleName, Date saleDate,long saleTime){
        this.saleStore= saleStore;
        this.saleDescription=saleDescription;
        this.saleName=saleName;
        this.saleDate=saleDate;
        this.saleTime=saleTime;
    }

    public String getSaleStore() {
        return saleStore;
    }

    public void setSaleStore(String saleStore) {
        this.saleStore = saleStore;
    }

    public String getSaleDescription() {
        return saleDescription;
    }

    public void setSaleDescription(String saleDescription) {
        this.saleDescription = saleDescription;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public long getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(long saleTime) {
        this.saleTime = saleTime;
    }
}
