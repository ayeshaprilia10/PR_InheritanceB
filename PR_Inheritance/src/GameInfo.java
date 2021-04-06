/*  Anggota     :   Ayesha Aprilia S. (1906200)
 *                   Putri Salma N. (1902999)
 *   Kelas       : Pendidikan Ilmu Komputer B 2019
 * */
public class GameInfo {
    private Boolean isGameOver = false;
    private Player objPlayer;
    private Ruangan objRuangan; //ruangan aktif

    public Ruangan getObjRuangan() {
        return objRuangan;
    }
    public void setObjRuangan(Ruangan objRuangan) {
        this.objRuangan = objRuangan;
    }

    public Player getObjPlayer() {
        return objPlayer;
    }
    public void setObjPlayer(Player objPlayer) {
        this.objPlayer = objPlayer;
    }

    public Boolean getGameOver() {
        return isGameOver;
    }
    public void setGameOver(Boolean gameOver) {
        isGameOver = gameOver;
    }
}
