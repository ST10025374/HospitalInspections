/*
Objects storage
 */
package progexamq1;

public class hospitalData {

    private String hospitalName;
    private String hospitalLocation;
    private String years;

    //Constructor
    public hospitalData() {

    }

    /**
     * @return the hospitalName
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName the hospitalName to set
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * @return the hospitalLocation
     */
    public String getHospitalLocation() {
        return hospitalLocation;
    }

    /**
     * @param hospitalLocation the hospitalLocation to set
     */
    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    /**
     * @return the years
     */
    public String getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(String years) {
        this.years = years;
    }
}
