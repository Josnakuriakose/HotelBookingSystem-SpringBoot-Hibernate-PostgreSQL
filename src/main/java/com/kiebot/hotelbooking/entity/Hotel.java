package com.kiebot.hotelbooking.entity;

import javax.persistence.*;

@Entity
@Table(name="hotel",schema="hotelreservation")
public class Hotel {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int hotelId;
    @Column
    private String hotelName;
    @Column
    private String cityName;
    @Column
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }



    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }


}
