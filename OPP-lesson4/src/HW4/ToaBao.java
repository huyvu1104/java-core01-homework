/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vu Huy
 */
public class ToaBao {

    String name;
    ArrayList<NhaBao> a1 = new ArrayList<>();
    ArrayList<VanPhong> a2 = new ArrayList<>();
    int index = 0;
    Scanner sc = new Scanner(System.in);

    public ToaBao(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void InfoNhabao(String name) {
        if (searchNhabao(name) > 0) {
            System.out.println("Name: " + a1.get(index).getName());
            System.out.println("PostNumber: " + a1.get(index).getPostNumber());

        } else {
            System.out.println("Nhap sai ten!");
        }

    }

    int searchNhabao(String name) {

        for (int i = 0; i < a1.size(); i++) {
            if (name.equalsIgnoreCase(a1.get(i).getName())) {
                System.out.println("Tim thay!");
                return index = i;
            } else {
                System.out.println("Nhap sai ten!");
                return index = 0;
            }
        }
        return index = 0;
    }

    void InfoVanphong(String name) {
        if (searchVanphong(name) > 0) {
            System.out.println("Name: " + a2.get(index).getName());
            System.out.println("Position: " + a2.get(index).getPosition());

        } else {
            System.out.println("Nhap sai ten!");
        }

    }

    int searchVanphong(String name) {

        for (int i = 0; i < a2.size(); i++) {
            if (name.equalsIgnoreCase(a2.get(i).getName())) {
                System.out.println("Tim thay!");
                return index = i;
            } else {
                System.out.println("Nhap sai ten!");
                return index = 0;
            }
        }
        return index = 0;
    }

    void addNhabao(NhaBao nb) {
        a1.add(nb);
    }

    void addVanphong(VanPhong vp) {
        a2.add(vp);
    }

    void removeNB(String name) {
        if (searchNhabao(name) > 0) {
            a1.remove(index);
        }
    }

    void removeVP(String name) {
        if (searchVanphong(name) > 0) {
            a2.remove(index);
        }
    }

    void listNB() {
        for (int i = 0; i < a1.size(); i++) {
            System.out.println("Name: " + a1.get(i).getName());
            System.out.println("PostNumber: " + a1.get(i).getPostNumber());
            System.out.println("===========");
        }
    }

    void list() {
        for (int i = 0; i < a1.size(); i++) {
            System.out.println("Name: " + a1.get(i).getName());
            System.out.println("PostNumber: " + a1.get(i).getPostNumber());
            System.out.println("===========");
        }
    }

    void listVP() {
        for (int i = 0; i < a2.size(); i++) {
            System.out.println("Name: " + a2.get(i).getName());
            System.out.println("Position: " + a2.get(i).getPosition());
            System.out.println("===========");
        }
    }

    void NBtoVP(NhaBao nb) {
        a1.remove(nb);
        String name = nb.getName();
        System.out.println("Nhap chuc vu: ");
        String position = sc.nextLine();
        VanPhong vp = new VanPhong(name, position);
        a2.add(vp);
    }

    void VPtoNB(VanPhong vp) {
        a2.remove(vp);
        String name = vp.getName();
        System.out.println("Nhap so bai viet: ");
        int number = sc.nextInt();
        NhaBao nb = new NhaBao(name, number);
        a1.add(nb);
    }

    void updateNB(String name) {
        if (searchNhabao(name) > 0) {
            System.out.println("nhap ten: ");
            a1.get(index).setName(sc.next());
            System.out.println("nhap so bai viet: ");
            a1.get(index).setPostNumber(sc.nextInt());

        } else {
            System.out.println("nhap sai ten!!");
        }
    }

    void updateVP(String name) {
        if (searchVanphong(name) > 0) {
            System.out.println("nhap ten: ");
            a2.get(index).setName(sc.next());
            System.out.println("nhap chuc vu: ");
            a2.get(index).setPosition(sc.next());
        } else {
            System.out.println("nhap sai ten!!");
        }
    }
}
