package ru.maksimov.hibernate.example.inheritance_strategy.model.enum_type;

public enum ChannelType {
    BA ("BA"),
    CA ("CA"),
    OD ("OD");
    private String name;

    ChannelType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
