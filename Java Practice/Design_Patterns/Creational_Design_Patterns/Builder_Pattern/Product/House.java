package Creational_Design_Patterns.Builder_Pattern.Product;

public class House {
    private String basementType;
    private String structureType;
    private String rootType;
    private String interiorType;

    public String getBasementType() {
        return basementType;
    }

    public void setBasementType(String basementType) {
        this.basementType = basementType;
    }

    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    public String getRootType() {
        return rootType;
    }

    public void setRootType(String rootType) {
        this.rootType = rootType;
    }

    public String getInteriorType() {
        return interiorType;
    }

    public void setInteriorType(String interiorType) {
        this.interiorType = interiorType;
    }

    public String getHouseInfo() {
        return "Basement: " + this.getBasementType() + "\nStructure: " + this.getStructureType() + "\nRoot: "
                + this.getRootType() + "\nInterior: " + this.getInteriorType() + "\n";
    }

}
