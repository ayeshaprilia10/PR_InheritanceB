/*  Anggota     :   Ayesha Aprilia S. (1906200)
 *                   Putri Salma N. (1902999)
 *   Kelas       : Pendidikan Ilmu Komputer B 2019
 * */
import java.util.ArrayList;

public class Musuh extends Character{
    GameInfo objGameinfo;
    private boolean tau = false;



    public ArrayList<String> getAksi(){
        ArrayList<String> arrAksi = new ArrayList<>();
        arrAksi.add("dekati musuh");
        arrAksi.add("lawan");
        return (arrAksi);
    }
    public  Musuh(String nama){
        super(nama);
    }

    public boolean cekKesehatan(){
        boolean mati = false;
        if(this.getKesehatan()<=0){
            mati=true;
        }return mati;
    }

    public void aksi(int pil, Player objPlayer){
        if(pil==1){
            System.out.println("Musuh didekati");
        }else if(pil==2){
            objPlayer.setKekuatan(50);
            System.out.println("Player menyerang musuh");

        }
        objPlayer.serang(this);
        if(this.cekKesehatan()){
            System.out.println("Musuh anda telah mati");
        }

    }
    public GameInfo getObjGameinfo() {
        return objGameinfo;
    }

    public void setObjGameinfo(GameInfo objGameinfo) {
        this.objGameinfo = objGameinfo;
    }











}
