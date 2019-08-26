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
public class Triangle extends Shape implements ShapeInterface {

    double e1;
    double e2;
    double e3;

    public Triangle(double e1, double e2, double e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
        System.out.println("day la hinh tam giac co 3 canh bang: " + e1 + " ," + e2 + " ," + e3);
    }

    @Override
    public void tinhChuvi() {
        double p = (e1 + e2 + e3) / 2;
        this.dientich = Math.sqrt(p * (p - e1) * (p - e2) * (p - e3));
    }

    @Override
    public void tinhDientich() {
        this.chuvi = e1 + e2 + e3;
    }

}
