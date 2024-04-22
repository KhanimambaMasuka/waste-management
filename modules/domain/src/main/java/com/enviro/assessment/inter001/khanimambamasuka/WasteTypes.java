package com.enviro.assessment.inter001.khanimambamasuka;

public enum WasteTypes {
    PAPER("PAPER", "Newspapers, Magazines, Office paper, Cardboard"),
    GLASS("GLASS", "Glass bottles, Glass jars"),
    PLASTIC("PLASTIC", "Water bottles (PET), Soda bottles (PET), Milk jugs (HDPE), Shampoo bottles (HDPE and PET), Yogurt containers (PP), Plastic bags (LDPE)"),
    METALS("METALS", "Aluminum cans, Tin cans, Steel cans, Aluminum foil"),
    TEXTILES("TEXTILES", "Clothing, Bedding, Towels, Curtains"),
    ELECTRONICS("ELECTRONICS", "Computers, Mobile phones, TVs, Printers"),
    ORGANIC_WASTE("ORGANIC_WASTE", "Food scraps, Yard waste (grass clippings, leaves), Compostable materials"),
    BATTERIES("BATTERIES", "Rechargeable batteries, Single-use batteries"),
    TIRES("TIRES", "Car tires, Bicycle tires"),
    CONSTRUCTION_MATERIALS("CONSTRUCTION_MATERIALS", "Bricks, Concrete, Wood"),
    CERAMICS("CERAMICS", "Windows, Dishes, Tiles, Porcelain");

    private final String id;
    private final String description;

    WasteTypes(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
