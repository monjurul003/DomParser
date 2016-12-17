package uofm.mik.entity;

import java.util.ArrayList;

/**
 * Created by Israt on 2016-12-15.
 */
public class DelayHistogram {
    private String nBins;
    private ArrayList<Bin> bins;

    public DelayHistogram() {
    }

    public DelayHistogram(String nBins) {
        this.nBins = nBins;
        this.bins = new ArrayList<>();
    }

    public void addToList(Bin obj){
        final boolean add = this.bins.add(obj);
        if (add == false){
            System.out.println("Could not be added");
        }
    }
    public void printBinArray(){
        for (int i = 0; i < this.bins.size() ; i++) {
            System.out.println(this.bins.get(i).getIndex());
        }
    }
}
