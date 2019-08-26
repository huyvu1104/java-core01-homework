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
public class Round extends Shape implements ShapeInterface {

    double round;

    public Round(double round) {
        this.round = round;
        System.out.println("day la hinh tron co ban kinh: " + round);
    }

    @Override
    public void tinhChuvi() {
        this.chuvi = round * 2 * Math.PI;
    }

    @Override
    public void tinhDientich() {
        this.dientich = Math.pow(round, 2) * Math.PI;
    }

}
