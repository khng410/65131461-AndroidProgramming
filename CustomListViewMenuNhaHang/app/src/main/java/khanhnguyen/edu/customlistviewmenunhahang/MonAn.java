package khanhnguyen.edu.customlistviewmenunhahang;

public class MonAn {
    private String tenMonAn;
    private double gia;
    private  String moTa;
    private int imgID;
    //Contructor

    public MonAn(String tenMonAn, double gia, String moTa, int imgID) {
        this.tenMonAn = tenMonAn;
        this.gia = gia;
        this.moTa = moTa;
        this.imgID = imgID;
    }
    //getter, setter

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }
}

