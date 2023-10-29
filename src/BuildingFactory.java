class BuildingFactory {
    public Building createBuilding(String buildingType) {
        if (buildingType == null) {
            return null;
        }
        if (buildingType.equalsIgnoreCase("House")) {
            return new House();
        } else if (buildingType.equalsIgnoreCase("High_rise")) {
            return new High_rise();
        }
        return null;
    }
}
