public class Name {
    private String firstName;
    private String middleInitial;
    private String lastName;

    public Name(String firstName, String middleInitial, String lastName) {
        this.firstName = capitalize(firstName);
        this.middleInitial = middleInitial != null ? middleInitial.toUpperCase() : "";
        this.lastName = capitalize(lastName);
    }

    // Helper method to capitalize first letter and lower the rest
    private String capitalize(String name) {
        if (name == null || name.isEmpty()) return "";
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        if (middleInitial.isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleInitial + ". " + lastName;
    }
}