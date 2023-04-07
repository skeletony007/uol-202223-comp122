public class ResearchCouncil implements Billable, Emailable{
    private String name;
    private String email;

    public void sendEmail() {
        System.out.println("email");
    }
    public void payBill(int amount) {
        System.out.println(amount);
    }
}