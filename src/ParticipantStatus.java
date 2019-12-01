import java.util.ArrayList;
import java.util.List;

public class ParticipantStatus {

    String participantID;
    String participantFAName;
    String partyDate;
    String partyEndDate;
    String testId;

    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public String getParticipantFAName() {
        return participantFAName;
    }

    public void setParticipantFAName(String participantFAName) {
        this.participantFAName = participantFAName;
    }

    public String getPartyDate() {
        return partyDate;
    }

    public void setPartyDate(String partyDate) {
        this.partyDate = partyDate;
    }

    public String getPartyEndDate() {
        return partyEndDate;
    }

    public void setPartyEndDate(String partyEndDate) {
        this.partyEndDate = partyEndDate;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public List<ParticipantStatus> getPptStatusList(){
        List<ParticipantStatus> lst= new ArrayList<ParticipantStatus>();
        ParticipantStatus l1=new ParticipantStatus();
        l1.participantFAName="basava";
        l1.participantID="1";
        l1.partyDate="05/12/2019";
        l1.testId="11";
        lst.add(l1);
        ParticipantStatus l2=new ParticipantStatus();
        l2.participantFAName="basava";
        l2.participantID="1";
        l2.partyDate="05/12/2019";
        l2.testId="12";
        lst.add(l2);
        ParticipantStatus l3=new ParticipantStatus();

        l3.participantFAName="basava";
        l3.participantID="1";
        l3.partyDate="05/12/2019";
        l3.testId="13";

        lst.add(l3);
        return lst;
    }
}
