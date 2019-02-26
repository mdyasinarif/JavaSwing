package factoryPattarn;

public class AccountFactory {

    public static Account createInstance(String obj) {
        if (obj.equalsIgnoreCase("SAVINGACCOUNT")) {
            return new SavingAccount();
        }else if (obj.equalsIgnoreCase("InvestmentAccount")) {
            return new InvestmentAccount();
        }else if (obj.equalsIgnoreCase("ShareAccount")) {
            return new ShareAccount();
        }
        return null;
    }
}
