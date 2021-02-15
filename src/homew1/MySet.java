package homew1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */ //method to add element to array without using loop 
public class MySet {
    
    public int set[];
    private int size = 0;

    public MySet(int size) {
        this.set = new int[size];
    }

    public boolean add(int item) {
        for (int i = 0; i < this.size(); i++) {
            if (this.set[i] != 0) {
                // add to array
            }
        }
        this.size++;
        return true;
    }

    public int size()
    {
        return this.size;
    }
}
