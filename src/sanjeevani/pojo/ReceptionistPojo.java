
package sanjeevani.pojo;

/**
 *
 * @author USER
 */
public class ReceptionistPojo {    

    public ReceptionistPojo() {
    }

    public ReceptionistPojo(String receptionistName, String receptionistId, String gender) {
        this.receptionistName = receptionistName;
        this.receptionistId = receptionistId;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ReceptionistPojo{" + "receptionistName=" + receptionistName + ", receptionistId=" + receptionistId + ", gender=" + gender + '}';
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public void setReceptionistName(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    public String getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(String receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String receptionistName;
    private String receptionistId;
    private String gender;
            
 
    
}
