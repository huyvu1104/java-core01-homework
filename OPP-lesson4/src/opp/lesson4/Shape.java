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
abstract public class Shape {

    double chuvi;
    double dientich;
    double thetich;
    int dimenson;

    public void print() {
        System.out.println("chu vi: " + chuvi + " dien tich: " + dientich);
    }
}
