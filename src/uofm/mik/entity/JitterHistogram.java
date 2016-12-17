package uofm.mik.entity;

import java.util.ArrayList;

/**
 * Created by Israt on 2016-12-15.
 */
public class JitterHistogram {
    private String nBins;
    private ArrayList<Bin> bins;

    public JitterHistogram() {
    }

    public JitterHistogram(String nBins) {
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
        for (Bin i: bins) {
                i.print();
        }
    }
}
