public class Main {
    public static void main(String[] args) {
    BuildingFactory buildingFactory = new BuildingFactory();

    Building house = buildingFactory.createBuilding("House");
    Building high_rise = buildingFactory.createBuilding("High_rise");

    house.construct();
    high_rise.construct();

    }
}