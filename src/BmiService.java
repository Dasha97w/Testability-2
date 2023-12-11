public class BmiService {
    public int index(int weight, double height) {
        int total;
        total = (int) (weight / Math.pow(height, 2));
        return total;
    }
}
