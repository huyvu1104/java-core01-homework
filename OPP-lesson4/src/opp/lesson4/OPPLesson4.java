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
public class OPPLesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square s=new Square(8);
        s.tinhChuvi();
        s.tinhDientich();
        s.print();
        Triangle t=new Triangle(4, 8, 7);
        t.tinhChuvi();
        t.tinhDientich();
        t.print();
    }
    
}
