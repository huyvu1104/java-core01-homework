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
public class Square extends Shape implements ShapeInterface {

    double edge;

    public Square(double edge) {
        this.edge = edge;
        System.out.println("day la hinh vuong co canh bang: " + edge);
    }

    @Override
    public void tinhChuvi() {
        this.dientich = Math.pow(edge, 2);
    }

    @Override
    public void tinhDientich() {
        this.chuvi=edge*4;
    }
}


