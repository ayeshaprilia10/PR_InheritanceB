/*  Anggota     :   Ayesha Aprilia S. (1906200)
*                   Putri Salma N. (1902999)
*   Kelas       : Pendidikan Ilmu Komputer B 2019
* */

import java.util.Scanner;

public class GameEngine {
    // user interface game
    Scanner sc = new Scanner(System.in);
    Player objPlayer = new Player("Budiwati");
//    Musuh objMusuh = new Musuh();
    Ruangan objRuangan = new Ruangan(); //cuma satu ruangan
    GameInfo objGameInfo = new GameInfo();

    public static void main(String[] args) {
        GameEngine objGameEngine;
        objGameEngine = new GameEngine();
        objGameEngine.mulai();
    }

    //constructor
    public GameEngine() {
        //init ruangannya
        objRuangan.setObjGameInfo(objGameInfo);
        objRuangan.setDeskripsi("Ruangan kecil, dengan satu pintu dan jendela");
        objPlayer.setRuanganAktif(objRuangan);  //set ruangan aktif player
        objPlayer.setObjGameInfo(objGameInfo);
        objGameInfo.setObjPlayer(objPlayer);
        objGameInfo.setObjRuangan(objRuangan);
//        objPlayer.setNama("Budi Martami");
//        objPlayer.setKesehatan(100);
//        objPlayer.setKekuatan(20);
//        objMusuh.setRuanganAktif(objRuangan);  //set ruangan aktif player
//        objMusuh.setObjGameInfo(objGameInfo);
//        objMusuh.setNama("Goblin");
//        objMusuh.setKesehatan(50);
//        objMusuh.setKekuatan(10);
//        objGameInfo.setObjPlayer(objMusuh);
    }


    private void aksi() {
        System.out.println();
        System.out.println("==============================================");
        System.out.println("1. Aksi yang dapat dilakukan di ruangan");
        System.out.println("2. Aksi terhadap player");
        System.out.println("3. Keluar");
        System.out.println("==============================================");
        System.out.print("Pilihan anda?");
        int pil = sc.nextInt();
        System.out.println("--");
        if (pil==3) {
            objGameInfo.setGameOver(true); //keluar
        } else if (pil==1) {
            objRuangan.pilihanAksi(); //
        } else if (pil==2) {
            objPlayer.pilihanAksi();
        }
    }

    public void mulai() {
        while (!objGameInfo.getGameOver()) {
            aksi();
        }
    }
}
