
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class ConfigSingleton implements Serializable{
    
    private static ConfigSingleton instance = null;
    
    private int score;
    private int deltaTime;
    private int specialVisibleTime;
    private static final int NUM_ROWS = 30;
    private static final int NUM_COLS = 30;
    private int numRows;
    private int numCols;
    private int countFoods;
    private int foods;
    
    private ConfigSingleton(){
        score = 0;
        deltaTime = 200;
        numRows = NUM_ROWS;
        numCols = NUM_COLS;
        countFoods = 0;
        specialVisibleTime = 10000;
        foods = 5;
    }
    
    public int getFoods() {
        return foods;
    }

    public void setFoods(int foods) {
        this.foods = foods;
    }

    public int getSpecialVisibleTime() {
        return specialVisibleTime;
    }

    public void setSpecialVisibleTime(int specialVisibleTime) {
        this.specialVisibleTime = specialVisibleTime * 1000;
    }

    public int getCountFoods() {
        return countFoods;
    }

    public void setCountFoods(int countFoods) {
        this.countFoods = countFoods;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows){
        this.numRows = numRows;
        try {
            saveInstance();
        } catch (IOException ex ) {
            ex.printStackTrace();
        }  
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols){
        this.numCols = numCols;
        try {
            saveInstance();
        } catch (IOException ex ) {
            ex.printStackTrace();
        }
    }

    public int getDeltaTime() {
        return deltaTime;
    }

    public void setDeltaTime(int deltaTime){
        this.deltaTime = deltaTime;
        try {
            saveInstance();
        } catch (IOException ex ) {
            ex.printStackTrace();
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score){
        this.score = score;
        try {
            saveInstance();
        } catch (IOException ex ) {
            ex.printStackTrace();
        }
    }

    public static ConfigSingleton getInstance() {
        if(instance == null) {
            instance = new ConfigSingleton();
        }
        return instance;
    }
    
    public void saveInstance() throws IOException {
        ObjectOutputStream obj = null;
        
        try {
            obj = new ObjectOutputStream(new FileOutputStream("ConfigSave.dat"));
            obj.writeObject(this);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
