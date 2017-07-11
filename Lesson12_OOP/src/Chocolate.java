
public class Chocolate {
    // describe state
    String color = "black";
    double cocoaPercentage = 27.65;
    double weight = 100; // grams
    int hardness = 100;
    int minHardness = 40;
    // describe behavior

    void melt() {
	if (hardness <= minHardness) {
	    return;
	}
	hardness -= 5;
    }
}
