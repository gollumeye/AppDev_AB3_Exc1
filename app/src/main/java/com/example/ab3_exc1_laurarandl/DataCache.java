package com.example.ab3_exc1_laurarandl;

public class DataCache {
    private static final DataCache data = new DataCache();
    private String adress_cache;

    private DataCache() {
    }

    public static DataCache getInstance(){
        return data;
    }

    public String getAdress_cache() {
        return adress_cache;
    }

    public void setAdress_cache(String adress_cache) {
        this.adress_cache = adress_cache;
    }
}
