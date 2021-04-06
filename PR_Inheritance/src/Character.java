/*  Anggota     :   Ayesha Aprilia S. (1906200)
 *                   Putri Salma N. (1902999)
 *   Kelas       : Pendidikan Ilmu Komputer B 2019
 * */
import java.util.ArrayList;

public class Character {

    private String nama;
    private  int kesehatan;
    private  int kekuatan;

    public GameInfo getObjGameInfo() {
        return objGameInfo;
    }

    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
    }

    private GameInfo objGameInfo;
    private ArrayList<String> arrayAksi = new ArrayList<>();

    public Character(String nama){
        this.nama = nama;
        this.kekuatan = 20;
        this.kesehatan =100;

    }
    public void serang(Character objTarget){
        int jumlah = objTarget.kesehatan-this.kekuatan;
        objTarget.setKesehatan(jumlah);
        System.out.println(this.nama+ " Menyerang "+objTarget.nama);


    }

    public ArrayList<String> getArrayAksi() {
        return arrayAksi;
    }

    public void setArrayAksi(ArrayList<String> arrayAksi) {
        this.arrayAksi = arrayAksi;
    }




    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }



}
