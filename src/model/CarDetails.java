/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author rutvi patel
 */
public class CarDetails {
    
    private String Company;
    private String CarModel;
    private Boolean Availability;
    private int ManYear;
    private int NoOfSeats;
    private int SerialNo;
    private String City;
    private String ManExYear;
    private String updatedDate;

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }

    public Boolean getAvailability() {
        return Availability;
    }

    public void setAvailability(Boolean Availability) {
        this.Availability = Availability;
    }


    public int getManYear() {
        return ManYear;
    }

    public void setManYear(int ManYear) {
        this.ManYear = ManYear;
    }

    public int getNoOfSeats() {
        return NoOfSeats;
    }

    public void setNoOfSeats(int NoOfSeats) {
        this.NoOfSeats = NoOfSeats;
    }

    public int getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(int SerialNo) {
        this.SerialNo = SerialNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getManExYear() {
        return ManExYear;
    }

    public void setManExYear(String ManExYear) {
        this.ManExYear = ManExYear;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
    

   @Override
   public String toString()
    {
       return Company;
    }
}
