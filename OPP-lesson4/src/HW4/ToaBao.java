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
public class ToaBao extends Employee {

    ArrayList<NhaBao> listNhaBao = new ArrayList<>();
    ArrayList<VanPhong> listVanPhong = new ArrayList<>();
    int index = -1;
    Scanner sc = new Scanner(System.in);

    public ToaBao(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void InfoNhabao(String name) {
        if (searchNhabao(name) > 0) {
            System.out.println("Name: " + listNhaBao.get(index).getName());
            System.out.println("PostNumber: " + listNhaBao.get(index).getPostNumber());

        } else {
            System.out.println("Nhap sai ten!");
        }

    }

    int searchNhabao(String name) {

        for (int i = 0; i < listNhaBao.size(); i++) {
            if (name.equalsIgnoreCase(listNhaBao.get(i).getName())) {
                System.out.println("Tim thay!");
                return index = i;
            }
        }
        System.out.println("Nhap sai ten!");
        return index = -1;

    }

    void InfoVanphong(String name) {
        if (searchVanphong(name) > -1) {
            System.out.println("Name: " + listVanPhong.get(index).getName());
            System.out.println("Position: " + listVanPhong.get(index).getPosition());

        } else {
            System.out.println("Nhap sai ten!");
        }

    }

    int searchVanphong(String name) {

        for (int i = 0; i < listVanPhong.size(); i++) {
            if (name.equalsIgnoreCase(listVanPhong.get(i).getName())) {
                System.out.println("Tim thay!");
                return index = i;
            }
        }
        System.out.println("Nhap sai ten!");
        return -1;

    }

    void addNhabao(NhaBao nb) {
        listNhaBao.add(nb);
    }

    void addVanphong(VanPhong vp) {
        listVanPhong.add(vp);
    }

    void removeNB(String name) {
        if (searchNhabao(name) > -1) {
            listNhaBao.remove(index);
        }
    }

    void removeVP(String name) {
        if (searchVanphong(name) > -1) {
            listVanPhong.remove(index);
        }
    }

    void listNB() {
        System.out.println("danh sach nha bao");
        for (int i = 0; i < listNhaBao.size(); i++) {
            System.out.println("Name: " + listNhaBao.get(i).getName());
            System.out.println("PostNumber: " + listNhaBao.get(i).getPostNumber());
            System.out.println("===========");
        }
    }

    void listVP() {
        System.out.println("danh sach van phong");
        for (int i = 0; i < listVanPhong.size(); i++) {
            System.out.println("Name: " + listVanPhong.get(i).getName());
            System.out.println("Position: " + listVanPhong.get(i).getPosition());
            System.out.println("===========");
        }
    }

    void NBtoVP(NhaBao nb) {
        listNhaBao.remove(nb);
        String name = nb.getName();
        System.out.println("Nhap chuc vu: ");
        String position = sc.nextLine();
        VanPhong vp = new VanPhong(name, position);
        listVanPhong.add(vp);
    }

    void VPtoNB(VanPhong vp) {
        listVanPhong.remove(vp);
        String name = vp.getName();
        System.out.println("Nhap so bai viet: ");
        int number = sc.nextInt();
        NhaBao nb = new NhaBao(name, number);
        listNhaBao.add(nb);
    }

    void updateNB(String name) {
        if (searchNhabao(name) > -1) {
            System.out.println("nhap ten: ");
            listNhaBao.get(index).setName(sc.next());
            System.out.println("nhap so bai viet: ");
            listNhaBao.get(index).setPostNumber(sc.nextInt());

        } else {
            System.out.println("nhap sai ten!!");
        }
    }

    void updateVP(String name) {
        if (searchVanphong(name) > -1) {
            System.out.println("nhap ten: ");
            listVanPhong.get(index).setName(sc.next());
            System.out.println("nhap chuc vu: ");
            listVanPhong.get(index).setPosition(sc.next());
        } else {
            System.out.println("nhap sai ten!!");
        }
    }
}
