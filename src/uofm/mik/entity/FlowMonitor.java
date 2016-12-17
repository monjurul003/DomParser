package uofm.mik.entity;

import java.util.ArrayList;

/**
 * Created by Israt on 2016-12-16.
 */
public class FlowMonitor {

    private ArrayList<Flow> flowStat;

    public FlowMonitor() {
        this.flowStat = new ArrayList<Flow>();
    }

    public void addToList(Flow obj) {
        this.flowStat.add(obj);
    }


}
