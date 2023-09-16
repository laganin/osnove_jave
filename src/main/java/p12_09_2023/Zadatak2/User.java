package p12_09_2023.Zadatak2;

public class User {

    private String fullName;
    private String licenseType;

    public User() {
        this.licenseType = "basic";
    }

    public User(String fullName) {
        this.fullName = fullName;
        this.licenseType = "basic";
    }

    public void subscription(int paid) {
        if (paid == 100) {
            this.licenseType = "pro";
        }
        else if (paid == 150) {
            this.licenseType = "premium";
        }
    }

    public void voidSubscription() {
        this.licenseType = "basic";
    }

    public int maxCallLength() {
        if (this.licenseType.equals("basic")) {
            return 40;
        }
        if (this.licenseType.equals("pro")) {
            return 240;
        }
        if (this.licenseType.equals("premium")) {
            return 1440;
        }
        return 0;
    }

    public void print() {
        System.out.println("User: " + this.fullName);
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

//    public String getLicenseType() {
//        return this.licenseType;
//    }
//
//    public void setLicenseType(String licenseType) {
//        this.licenseType = licenseType;
//    }
}
