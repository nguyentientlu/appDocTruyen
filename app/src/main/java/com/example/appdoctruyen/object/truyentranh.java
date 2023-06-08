package com.example.appdoctruyen.object;

public class truyentranh {
    private String tentruyen,tenchap,linkanh;

    public truyentranh(String tentruyen, String tenhcap, String linkanh) {
        this.tentruyen = tentruyen;
        this.tenchap = tenhcap;
        this.linkanh = linkanh;
    }

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public String getTenchap() {
        return tenchap;
    }

    public void setTenchap(String tenhcap) {
        this.tenchap = tenhcap;
    }

    public String getLinkanh() {
        return linkanh;
    }

    public void setLinkanh(String linkanh) {
        this.linkanh = linkanh;
    }
}
