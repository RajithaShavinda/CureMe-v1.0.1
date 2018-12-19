/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Rajitha Shavinda
 */
public class Drugs {
    private int id;
     private String name;
    private String company;
    private float pprice;
    private float sprice;
    private float quantity;
    private String des;
    private String date;
    private String unit;
    private float unitsPerDay;
    
    
    public Drugs(int i, String n,String c,float p,float s, float q,String des1,String d,String u,float ud){
        id=i;
    name=n;
    company=c;
    pprice=p;
    sprice=s;
    quantity=q;
    des=des1;
    date=d;
    unit=u;
    unitsPerDay=ud;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the pprice
     */
    public float getPprice() {
        return pprice;
    }

    /**
     * @param pprice the pprice to set
     */
    public void setPprice(float pprice) {
        this.pprice = pprice;
    }

    /**
     * @return the sprice
     */
    public float getSprice() {
        return sprice;
    }

    /**
     * @param sprice the sprice to set
     */
    public void setSprice(float sprice) {
        this.sprice = sprice;
    }

    /**
     * @return the quantity
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the des
     */
    public String getDes() {
        return des;
    }

    /**
     * @param des the des to set
     */
    public void setDes(String des) {
        this.des = des;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the unitsPerDay
     */
    public float getUnitsPerDay() {
        return unitsPerDay;
    }

    /**
     * @param unitsPerDay the unitsPerDay to set
     */
    public void setUnitsPerDay(float unitsPerDay) {
        this.unitsPerDay = unitsPerDay;
    }

    
    
    
    
    
    
    
    
    
    
}
