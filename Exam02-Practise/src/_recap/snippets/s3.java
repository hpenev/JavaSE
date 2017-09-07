package _recap.snippets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class s3 {
    public static void main(String[] args) {
	HashMap<String, ArrayList<TreeMap<Integer, LinkedList<String>>>> omg = new HashMap<>();

	omg.put("candle", new ArrayList<TreeMap<Integer, LinkedList<String>>>());
	omg.get("candle").add(new TreeMap<Integer, LinkedList<String>>());
	omg.get("candle").get(0).put(0, new LinkedList<String>());
	omg.get("candle").get(0).get(0).add("ugh");
    }
}
