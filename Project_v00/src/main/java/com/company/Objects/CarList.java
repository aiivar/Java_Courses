package com.company.Objects;

/**
 * Created by roi on 4/23/2019.
 */
public class CarList {
    private Integer id;
    private String Mark;
    private String Model;
    private String Color;
    private String bodyType;
    private Integer seatsNum;
    private String carClass;
    private String Country;
    private Integer carRelease;
    private String gearbox;
    private Integer HPower;
    private Integer MaxSpeed;
    private String CarImage;
    private Long Cost;

    public String getCarImage() {
        return CarImage;
    }

    public void setCarImage(String carImage) {
        CarImage = carImage;
    }

    public Long getCost() {
        return Cost;
    }

    public void setCost(Long cost) {
        Cost = cost;
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

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
