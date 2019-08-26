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
        NhaBao nb1=new NhaBao("Huy", 5);
        NhaBao nb2=new NhaBao("Nam", 2);
        NhaBao nb3=new NhaBao("Lan", 1);
        
        VanPhong vp1=new VanPhong("Minh", "editor");
        VanPhong vp2=new VanPhong("Huy", "tech support");
        ToaBao tb=new ToaBao("Dan tri");
        tb.addNhabao(nb2);
        tb.addNhabao(nb3);
        tb.addVanphong(vp1);
        tb.NBtoVP(nb1);
        tb.addVanphong(vp2);
        tb.listVP();
        tb.searchVanphong("HuY");
        tb.removeVP("HuY");
        tb.listVP();
        tb.searchNhabao("Huy");
        tb.searchNhabao("Lan");
    }
}
