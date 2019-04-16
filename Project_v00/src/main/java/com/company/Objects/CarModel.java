package com.company.Objects;

/**
 * Created by roi on 4/16/2019.
 */
public class CarModel {
   private Integer id;
   private String name;
   private String bodyType;
   private Integer seatsNum;
   private char carClass;
   private String Country;
   private Integer carRelease;
   private String gearbox;
   private Integer HPower;
   private Integer MaxSpeed;
   private String color;
   private Integer mark_id;

    public Integer getMark_id() {
        return mark_id;
    }

    public void setMark_id(Integer mark_id) {
        this.mark_id = mark_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(Integer seatsNum) {
        this.seatsNum = seatsNum;
    }

    public char getCarClass() {
        return carClass;
    }

    public void setCarClass(char carClass) {
        this.carClass = carClass;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Integer getCarRelease() {
        return carRelease;
    }

    public void setCarRelease(Integer carRelease) {
        this.carRelease = carRelease;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public Integer getHPower() {
        return HPower;
    }

    public void setHPower(Integer HPower) {
        this.HPower = HPower;
    }

    public Integer getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
