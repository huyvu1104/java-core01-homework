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
    
}
