public class InsuranceInfo {
    private Property insurance_property;
    private double value_insured;

    public InsuranceInfo(Property insurance_property, double value_insured) {
        setInsurance_property(insurance_property);
        setValue_insured(value_insured);
    }

    public Property getInsurance_property() {
        return insurance_property;
    }

    public void setInsurance_property(Property insurance_property) {
        this.insurance_property = insurance_property;
    }

    public double getValue_insured() {
        return value_insured;
    }

    public void setValue_insured(double value_insured) {
        this.value_insured = value_insured;
    }

    @Override
    public String toString() {
        return "\n" + insurance_property + "\nValue insured = " + value_insured;
    }

}
