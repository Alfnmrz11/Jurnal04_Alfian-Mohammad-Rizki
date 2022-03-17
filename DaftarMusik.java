package com.company;

public class DaftarMusik {
    private final String music;
    private final String vokalis;

    public DaftarMusik(String Music, String vokalis) {
        this.music = Music;
        this.vokalis = vokalis;

    }
    public String nama() {
        return music;
    }

    @Override
    public String toString() {
        return music + " - Vokalis " + vokalis;
    }
}
