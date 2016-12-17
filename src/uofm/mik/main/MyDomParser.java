package uofm.mik.main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import uofm.mik.entity.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Israt on 2016-12-15.
 */
public class MyDomParser {

    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        String applicationDir = System.getProperty("user.dir");
        System.out.println(applicationDir);

        FlowMonitor flowmonObj = new FlowMonitor();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(applicationDir + File.separator + "sim10flowmon.xml");
            NodeList flowStatList = doc.getElementsByTagName("FlowStats");
            for (int i = 0; i < flowStatList.getLength(); i++) {
                Node flowStatsNode = flowStatList.item(i);
                if (flowStatsNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element flowStatElement = (Element) flowStatsNode;
                    System.out.println(flowStatElement.getTagName());
                    NodeList flowList = flowStatElement.getChildNodes();

                    for (int l = 0; l < flowList.getLength(); l++) {
                        Node flowNode = flowList.item(l);
                        if (flowNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element flowElement = (Element) flowNode;
//                            System.out.println(flowElement.getTagName());

                            Flow flowObj = new Flow();
                            flowObj.setFlowId(flowElement.getAttribute("Id"));
                            flowObj.setTimeFirstTxPacket(flowElement.getAttribute("timeFirstTxPacket"));
                            flowObj.setTimeFirstRxPacket(flowElement.getAttribute("timeFirstRxPacket"));
                            flowObj.setTimeLastTxPacket(flowElement.getAttribute("timeLastTxPacket"));
                            flowObj.setTimeLastRxPacket(flowElement.getAttribute("timeLastRxPacket"));
                            flowObj.setDelaySum(flowElement.getAttribute("delaySum"));
                            flowObj.setJitterSum(flowElement.getAttribute("jitterSum"));
                            flowObj.setLastDelay(flowElement.getAttribute("lastDelay"));
                            flowObj.setTxBytes(flowElement.getAttribute("txBytes"));
                            flowObj.setRxBytes(flowElement.getAttribute("rxBytes"));
                            flowObj.setTxPackets(flowElement.getAttribute("txPackets"));
                            flowObj.setRxPackets(flowElement.getAttribute("rxPackets"));
                            flowObj.setLostPackets(flowElement.getAttribute("lostPackets"));
                            flowObj.setTimesForwarded(flowElement.getAttribute("timesForwarded"));


                            NodeList flowChildList = flowElement.getChildNodes();
                            for (int k = 0; k < flowChildList.getLength(); k++) {
                                Node childNode = flowChildList.item(k);
                                if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                                    Element flowChildElement = (Element) childNode;

//                                    System.out.println(flowChildElement.getTagName());

                                    if (flowChildElement.getTagName() == "delayHistogram") {
                                        DelayHistogram histObj = new DelayHistogram(flowChildElement.getAttribute("nBins"));
                                        NodeList hBinList = flowChildElement.getElementsByTagName("bin");
                                        for (int j = 0; j < hBinList.getLength(); j++) {
                                            Element bin = (Element) hBinList.item(j);
                                            Bin binObjElement = new Bin(bin.getAttribute("index"), bin.getAttribute("start"), bin.getAttribute("width"), bin.getAttribute("count"));
                                            histObj.addToList(binObjElement);
                                        }
                                        flowObj.setDelayHist(histObj);
                                    } else if (flowChildElement.getTagName() == "delayHistogram") {

                                        JitterHistogram jitterObj = new JitterHistogram(flowChildElement.getAttribute("nBins"));
                                        NodeList jitterBinList = flowChildElement.getElementsByTagName("bin");
                                        for (int j = 0; j < jitterBinList.getLength(); j++) {
                                            Element bin = (Element) jitterBinList.item(j);
                                            Bin binObjElement = new Bin(bin.getAttribute("index"), bin.getAttribute("start"), bin.getAttribute("width"), bin.getAttribute("count"));
                                            jitterObj.addToList(binObjElement);
                                        }
                                        flowObj.setJitterHist(jitterObj);
                                    } else {
                                        System.out.println("curretn element--" + flowChildElement.getTagName());
                                    }
                                }
                            }
                            flowmonObj.addToList(flowObj);
                        }
                    }
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
