/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana caranya menghitung gaji beserta bunga
 *  dengan target yang sudah ditentukan
 */
public class PBO210118067Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    double saldo = 3500000.0;
    double target = 6000000.0;
    int i=1;
    
    while(saldo <= target) {
            saldo += saldo * 0.08;
            System.out.println("Saldo di bulan ke-" +i
                + " Rp." + PBO210118067Latihan20TargetSaldoTabungan.formatter
                (saldo));
            i++;
        }
    }
    
    public static String formatter(Double saldo) {
        DecimalFormat kursIDR = (DecimalFormat) DecimalFormat
                .getIntegerInstance();
        DecimalFormatSymbols formatIDR = new DecimalFormatSymbols();
        
        formatIDR.setGroupingSeparator('.');
        
        kursIDR.setDecimalFormatSymbols(formatIDR);
        
        return kursIDR.format(saldo);
    }
}
