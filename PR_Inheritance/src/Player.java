
/*  Anggota     :   Ayesha Aprilia S. (1906200)
 *                   Putri Salma N. (1902999)
 *   Kelas       : Pendidikan Ilmu Komputer B 2019
 * */
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.format;

public class Player extends Character {

    //item defulat yang dimiliki player
     //ruangan tempat player saat ini berada
    private ArrayList<Item> arrItem;
    private Ruangan ruanganAktif;
    private Scanner sc = new Scanner(System.in);
    public GameInfo objGameInfo;
    private Item objCincin= new Item("Cincin Emas");;




    public GameInfo getObjGameInfo() {
        return objGameInfo;
    }
    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
        objCincin.setObjGameInfo(objGameInfo);
    }


    //cari item yang dimiliki oleh player, return TRUE jika ada
    //salah satu yg menggunakan: pintu untuk mengecek apakah player sudah punya kunci
    public boolean cariItem(String namaItem) {
        for (Item objItem:arrItem) {
            if (namaItem.equals(objItem.getNama())) {
                return (true);
            }
        }
        return(false); //tidak ketemu
    }

    public void printPlayer() {
        System.out.println("Nama Player:"+this.getNama());
        System.out.println("Kesehatan Player:"+this.getKesehatan());
    }
    public Player(String nama){
        super(nama);
        super.setKekuatan(50);
        arrItem = new ArrayList<>();
        objCincin.setDeskripsi("Cincin Emas bertuliskan kalimat...");
        arrItem.add(objCincin);

    }

    public void printItem() {
        System.out.println("Item milik player");
        int cc = 0;
        for (Item objItem:arrItem) {
            cc++;
            System.out.printf("%d. %s%n",cc,objItem.getNama());
            System.out.println(objItem.getDeskripsi());
        }
    }

    // hapus item di ruangan berdasarkan namanya
    // digunakan saat suatu item diambil oleh player misalnya
    public void hapusItem(Item objItem) {
        arrItem.remove(objItem);  //buang item
    }
    public void addItem(Item objItem) {
        arrItem.add(objItem);
    }

//    public void serang(Player objTarget){
//        int total= objTarget.kesehatan-this.kekuatan;
//        objTarget.setKesehatan(total);
//        System.out.println(this.nama+"telah menyerang"+objTarget.nama);
//
//
//    }

    public void pilihanAksi() {
        System.out.println("**** Pilihan Aksi pada Player *** ");
        //disamakan dengan  ruangan
        //bisa direfactoring nanti supaya tdk duplikasi

        //aksi2 item yang dimiliki player
        int urutPil = 0;  //item
        int subPil;   //aksinya
        System.out.println("Item yang dimiliki player");
        for (Item objItem:arrItem) {
            urutPil++;
            subPil = 0;   //sistem penomorannya 11  12  13 dst
            System.out.println(objItem.getNama());
            //ambil pilihannya
            ArrayList <String> arrPil = objItem.getAksi();
            //print pilihan
            for (String strPil:arrPil) {
                subPil++;
                System.out.printf("%d%d. %s %n", urutPil, subPil, strPil);
            }
        }
        //info seputar player
        urutPil++;
        subPil = 0;
        int pilInfoPlayer  = urutPil; //catat untuk pintu
        System.out.println("Info Player");
        //hanya satu
        subPil++;
        System.out.printf("%d%d. info player%n", urutPil, subPil);

        System.out.print("Pilihan anda?");
        String strPil = sc.next();
        System.out.println("--");

        int pil    =  Integer.parseInt(strPil.substring(0,1)); //ambil digit pertama, asumsikan jumlah tidak lebih dari 10
        subPil     =  Integer.parseInt(strPil.substring(1,2)); //ambil digit kedua, asumsikan jumlah tidak lebih dari 10

        if (pil == pilInfoPlayer) {
            printPlayer();
        } else {
            Item objItemPilih = arrItem.get(pil-1);
            objItemPilih.prosesAksi(subPil); //aksi item
        }


//        System.out.println("2. Item milik player");
//        System.out.print("Pilihan anda?");
//        int pil = sc.nextInt();
//        System.out.println("--");
//        if (pil==1) {
//            printPlayer();
//        } else if (pil==2) {
//            printItem();
//        }
    }

    public void setRuanganAktif(Ruangan ruanganAktif) {
        this.ruanganAktif = ruanganAktif;
    }
    public Ruangan getRuanganAktif() {
        return ruanganAktif;
    }

    public  static void main(String[]args){
//        objGameInfo.
//        p1.kesehatan = 100;
//        p1.nama = "Budi";
//        p1.setRuanganAktif(p1.getRuanganAktif());  //set ruangan aktif player






    }

}
