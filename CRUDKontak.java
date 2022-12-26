/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudkontak;

import com.mycompany.crudkontak.newpackage.frame.frameKontak;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS
 */
public class CRUDKontak {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
     
            frameKontak form = new frameKontak();
            form.setLocationRelativeTo (null);
            form.setVisible(true);
            }
        });
    }
}

