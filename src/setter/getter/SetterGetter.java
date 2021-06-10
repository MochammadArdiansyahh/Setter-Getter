/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setter.getter;

/**
 *
 * @author Moch Ardiansyah
 */
public class SetterGetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kedua data = new kedua();
        data.setNama("Susiono");
        data.setAlamat("Jl Kertosari");
        
        String nama = data.getNama();
        String alamat = data.getAlamat();
        
        System.out.println("Nama Orang Tua : "+nama);
        System.out.println("Alamat : "+alamat);
    }
    
}
