/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW4;

/**
 *
 * @author Vu Huy
 */
public class Test {

    public static void main(String[] args) {
        NhaBao nb=new NhaBao("Huy", 5);
        VanPhong vp=new VanPhong("Minh", "editor");
        ToaBao tb=new ToaBao("Dan tri");
        tb.addVanphong(vp);
        tb.NBtoVP(nb);
        tb.listVP();
    }
}
