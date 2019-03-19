package ssbbss.domain;
public class OpenSavingAccount {
    int accountNo;
    String fromNO;
    String cardNo;
    
    String name;
    String motherName;
    String fatherHusbendName;
    String presentAddress;
    String parmanetAddress;
    String dateOfBirth;
    String admisionDate;
    String nIDNo;
    String mobileNo;
    String savingType;
    int savingAmount;
    String nomineName;
    String relations;
    int share;

    public OpenSavingAccount() {
    }

    public OpenSavingAccount(int accountNo, String fromNO, String cardNo, String name, String motherName, String fatherHusbendName, String presentAddress, String parmanetAddress, String dateOfBirth, String admisionDate, String nIDNo, String mobileNo, String savingType, int savingAmount, String nomineName, String relations, int share) {
        this.accountNo = accountNo;
        this.fromNO = fromNO;
        this.cardNo = cardNo;
        this.name = name;
        this.motherName = motherName;
        this.fatherHusbendName = fatherHusbendName;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        this.dateOfBirth = dateOfBirth;
        this.admisionDate = admisionDate;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.savingType = savingType;
        this.savingAmount = savingAmount;
        this.nomineName = nomineName;
        this.relations = relations;
        this.share = share;
    }

    @Override
    public String toString() {
        return "OpenSavingAccount{" + "accountNo=" + accountNo + ", fromNO=" + fromNO + ", cardNo=" + cardNo + ", name=" + name + ", motherName=" + motherName + ", fatherHusbendName=" + fatherHusbendName + ", presentAddress=" + presentAddress + ", parmanetAddress=" + parmanetAddress + ", dateOfBirth=" + dateOfBirth + ", admisionDate=" + admisionDate + ", nIDNo=" + nIDNo + ", mobileNo=" + mobileNo + ", savingType=" + savingType + ", savingAmount=" + savingAmount + ", nomineName=" + nomineName + ", relations=" + relations + ", share=" + share + '}';
    }
    
    
}
