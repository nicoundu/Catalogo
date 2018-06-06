package cl.pingon.catalogo.models;

import android.database.sqlite.SQLiteDatabase;

import com.orm.SugarRecord;

public class Favorite extends SugarRecord {

    private String model;
    private int capacity;


    public Favorite() {
    }

    public Favorite(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
