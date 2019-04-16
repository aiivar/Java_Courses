package com.company.Objects;

/**
 * Created by roi on 4/16/2019.
 */
public class Car {

    private Integer id;
   private Integer CarMark_id;
   private Integer CarModel_id;
   private Integer CarColor_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarMark_id() {
        return CarMark_id;
    }

    public void setCarMark_id(Integer carMark_id) {
        CarMark_id = carMark_id;
    }

    public Integer getCarModel_id() {
        return CarModel_id;
    }

    public void setCarModel_id(Integer carModel_id) {
        CarModel_id = carModel_id;
    }

    public Integer getCarColor_id() {
        return CarColor_id;
    }

    public void setCarColor_id(Integer carColor_id) {
        CarColor_id = carColor_id;
    }
}
