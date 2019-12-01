import java.util.ArrayList;
import java.util.List;

public class LeadStage {

    String participantFAName;
    String testId;
    String partyName;
    List<LeadStage> lstLeadStage;

    public String getParticipantFAName() {
        return participantFAName;
    }

    public void setParticipantFAName(String participantFAName) {
        this.participantFAName = participantFAName;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }
    public List<LeadStage> getLeadStg(){
        List<LeadStage> lst= new ArrayList<LeadStage>();
        LeadStage l1=new LeadStage();
        l1.participantFAName="basava";
        l1.partyName="suvina";
        lst.add(l1);
        LeadStage l2=new LeadStage();
        l2.participantFAName="prabhu";
        l2.partyName="suma";
        lst.add(l2);
        LeadStage l3=new LeadStage();
        l3.participantFAName="dhammur";
        l3.partyName="surname";
        lst.add(l3);
        return lst;
    }
}
