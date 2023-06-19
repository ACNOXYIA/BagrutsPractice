import HelperClasses.CameraInfo;
import HelperClasses.CarInfo;

public class Bagrut2023_Q3 {
    public static int legalCities(CameraInfo[] cameras) {
        int count = 0;
        for (int i = 0; i < cameras.length; i++) {
            if (cameras[i].allGood()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
