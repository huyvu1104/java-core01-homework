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
public class NhaBao {
    String name;
    private int postNumber;
    int flag=0;
    public NhaBao(String name, int postNumber) {
        this.name = name;
        this.postNumber = postNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
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
            System.out.println("PostNumber: "+this.postNumber);
        }
        else{
            System.out.println("nhap sai ten!!");}
}
}
