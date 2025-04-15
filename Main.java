import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();
        String filePath = "data/ZomatoDataset.csv";
        List<Restaurant> restaurants = csvReader.readCSV(filePath);

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }
    }
}