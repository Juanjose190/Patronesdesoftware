/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facade;

/**
 *
 * @author JUAN JOSE
 */
public interface Inventory {

    static boolean search(String name, boolean make) {
        String action = make ? "make" : "improve";
        if (Math.random() > 0.5) {
            System.out.println("you have the necessary materials to " + action + " the " + name);
            return true;
        } else {
            System.out.println("you don't have the necessary materials to " + action + " the " + name);
            return false;
        }
    }

    static void remove(String name, boolean make) {
        String action = make ? "make" : "improve";
        System.out.println("removing from your inventory the materials used to " + action + " the " + name);
    }
}
