/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ardel
 */
@Stateless
@LocalBean
public class jualsempolan {
    
    double jumlah;
    String res;
    
    public String harga(double jumlah) {
        return res = String.valueOf(jumlah*625) ;
    }

}
