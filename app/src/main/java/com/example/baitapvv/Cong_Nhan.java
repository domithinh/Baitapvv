package com.example.baitapvv;

public class Cong_Nhan {
    private String tencn;
    private float luong;

    public Cong_Nhan(String tencn, Float luong) {
        this.tencn = tencn;
        this.luong = luong;
    }

    public void setTencn(String tencn) {
        this.tencn = tencn;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public String getTencn() {
        return tencn;
    }

    public Float getLuong() {
        return luong;
    }
    @Override
    public String toString() {
        return "tencn: " + tencn + ", luong: " + luong;
    }
}
