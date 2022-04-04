public class Property {
    private String property_type;
    private String property_location;

    public Property(String property_type, String property_location) {
        setProperty_type(property_type);
        setProperty_location(property_location);
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    @Override
    public String toString() {
        return "\nProperty location = " + property_location + "\nProperty type = " + property_type;
    }

    public String getProperty_location() {
        return property_location;
    }

    public void setProperty_location(String property_location) {
        this.property_location = property_location;
    }
}
