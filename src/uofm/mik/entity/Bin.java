package uofm.mik.entity;

/**
 * Created by Israt on 2016-12-15.
 */
public class Bin {

    private String index;
    private String start;
    private String width;
    private String count;

    public Bin() {
    }

    public Bin(String index, String start, String width, String count) {
        this.index = index;
        this.start = start;
        this.width = width;
        this.count = count;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void print(){
        System.out.println("index="+ this.index+ " start="+ this.start+" width="+this.width+" count="+ this.count );

    }

}
