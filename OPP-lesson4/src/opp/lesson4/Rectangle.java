/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp.lesson4;

/**
 *
 * @author Vu Huy
 */
public class Rectangle extends Shape implements ShapeInterface {

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        System.out.println("day la hinh chu nhat co chieu dai va chieu rong la : " + height + " ," + width);
    }

    @Override
    public void tinhChuvi() {
        this.dientich = height * width;
    }

    @Override
    public void tinhDientich() {
        this.chuvi = (height + width) * 2;
    }

}
