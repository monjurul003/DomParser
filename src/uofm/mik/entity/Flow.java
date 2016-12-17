package uofm.mik.entity;

/**
 * Created by Israt on 2016-12-15.
 */
public class Flow {
    private String flowId;
    private String timeFirstTxPacket;
    private String timeFirstRxPacket;
    private String timeLastTxPacket;
    private String timeLastRxPacket;
    private String delaySum;
    private String jitterSum;
    private String lastDelay;
    private String txBytes;
    private String rxBytes;
    private String txPackets;
    private String rxPackets;
    private String lostPackets;
    private String timesForwarded;
    private DelayHistogram delayHist;
    private JitterHistogram jitterHist;

    public Flow() {
    }

    public Flow(String flowId, String timeFirstTxPacket, String timeFirstRxPacket, String timeLastTxPacket, String timeLastRxPacket, String delaySum, String jitterSum, String lastDelay, String txBytes, String rxBytes, String txPackets, String rxPackets, String lostPackets, String timesForwarded, DelayHistogram delayHist, JitterHistogram jitterHist) {
        this.flowId = flowId;
        this.timeFirstTxPacket = timeFirstTxPacket;
        this.timeFirstRxPacket = timeFirstRxPacket;
        this.timeLastTxPacket = timeLastTxPacket;
        this.timeLastRxPacket = timeLastRxPacket;
        this.delaySum = delaySum;
        this.jitterSum = jitterSum;
        this.lastDelay = lastDelay;
        this.txBytes = txBytes;
        this.rxBytes = rxBytes;
        this.txPackets = txPackets;
        this.rxPackets = rxPackets;
        this.lostPackets = lostPackets;
        this.timesForwarded = timesForwarded;
        this.delayHist = delayHist;
        this.jitterHist = jitterHist;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getTimeFirstTxPacket() {
        return timeFirstTxPacket;
    }

    public void setTimeFirstTxPacket(String timeFirstTxPacket) {
        this.timeFirstTxPacket = timeFirstTxPacket;
    }

    public String getTimeFirstRxPacket() {
        return timeFirstRxPacket;
    }

    public void setTimeFirstRxPacket(String timeFirstRxPacket) {
        this.timeFirstRxPacket = timeFirstRxPacket;
    }

    public String getTimeLastTxPacket() {
        return timeLastTxPacket;
    }

    public void setTimeLastTxPacket(String timeLastTxPacket) {
        this.timeLastTxPacket = timeLastTxPacket;
    }

    public String getTimeLastRxPacket() {
        return timeLastRxPacket;
    }

    public void setTimeLastRxPacket(String timeLastRxPacket) {
        this.timeLastRxPacket = timeLastRxPacket;
    }

    public String getDelaySum() {
        return delaySum;
    }

    public void setDelaySum(String delaySum) {
        this.delaySum = delaySum;
    }

    public String getJitterSum() {
        return jitterSum;
    }

    public void setJitterSum(String jitterSum) {
        this.jitterSum = jitterSum;
    }

    public String getLastDelay() {
        return lastDelay;
    }

    public void setLastDelay(String lastDelay) {
        this.lastDelay = lastDelay;
    }

    public String getTxBytes() {
        return txBytes;
    }

    public void setTxBytes(String txBytes) {
        this.txBytes = txBytes;
    }

    public String getRxBytes() {
        return rxBytes;
    }

    public void setRxBytes(String rxBytes) {
        this.rxBytes = rxBytes;
    }

    public String getTxPackets() {
        return txPackets;
    }

    public void setTxPackets(String txPackets) {
        this.txPackets = txPackets;
    }

    public String getRxPackets() {
        return rxPackets;
    }

    public void setRxPackets(String rxPackets) {
        this.rxPackets = rxPackets;
    }

    public String getLostPackets() {
        return lostPackets;
    }

    public void setLostPackets(String lostPackets) {
        this.lostPackets = lostPackets;
    }

    public String getTimesForwarded() {
        return timesForwarded;
    }

    public void setTimesForwarded(String timesForwarded) {
        this.timesForwarded = timesForwarded;
    }

    public DelayHistogram getDelayHist() {
        return delayHist;
    }

    public void setDelayHist(DelayHistogram delayHist) {
        this.delayHist = delayHist;
    }

    public JitterHistogram getJitterHist() {
        return jitterHist;
    }

    public void setJitterHist(JitterHistogram jitterHist) {
        this.jitterHist = jitterHist;
    }
    public void printFlow(){

        System.out.println("Test" +this.lastDelay);
    }
}
