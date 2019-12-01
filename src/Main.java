import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! Started");
        ParticipantStatus p1=new ParticipantStatus();
        List<ParticipantStatus> lstPPT=p1.getPptStatusList();

        LeadStage lSG=new LeadStage();
        List<LeadStage> l1=lSG.getLeadStg();

        l1.forEach(System.out::println);

    }
}
