/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Hukum Ohm
 */
class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println(
                "Kuat arus yang mengalir pada suatu kawan penghantar\n"
                + "akan berbanding lurus dengan beda potensial\n"
                + "pada ujung-ujung kawat penghantar tersebut\n"
                + "asalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus() {
        return kuatArus;
    }
    
    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
    
}