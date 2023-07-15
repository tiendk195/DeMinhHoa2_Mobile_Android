package com.example.deminhhoa2;

public class User {
    private int id;
    private String ten;
    private String luong;
    private String gioiTinh;
    private String chucVu;

    public User(int id, String ten, String luong, String gioiTinh, String chucVu) {
        this.id = id;
        this.ten = ten;
        this.luong = luong;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
