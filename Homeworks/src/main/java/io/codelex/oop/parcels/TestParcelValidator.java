package io.codelex.oop.parcels;

public class TestParcelValidator {
    public static void main(String[] args) {
        Parcel goodParcel = new Parcel(35,35,35,20f, false);
        if (goodParcel.validate()){
            System.out.println("GOOD ONE");
        }
        Parcel badParcel = new Parcel(100, 40, 80, 35.0f, true);
        if (badParcel.validate()) {
            System.out.println("GOOD ONE");
        } else {
            System.out.println("BAD ONE");
        }

    }
}
