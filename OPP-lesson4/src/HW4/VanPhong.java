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
public class VanPhong {

    String name;
    private String position;
    int flag = 0;
    public VanPhong(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public int search(String name) {
        
        if (name.equalsIgnoreCase(this.name)) {
            System.out.println("tim thay nhan vien " + this.name);
            return flag = 1;
        } else {
            System.out.println("nhap sai ten!!");
            return flag = 0;
        }
    }
    void  showInfo(String name){
        if (search(name)>0) {
            System.out.println("Name: "+this.name);
            System.out.println("Position: "+this.position);
        }
        else{
            System.out.println("nhap sai ten!!");}
}
}
