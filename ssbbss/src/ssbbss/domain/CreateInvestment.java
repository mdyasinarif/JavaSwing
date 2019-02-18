/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss.pojo;

/**
 *
 * @author User
 */
public class CreateInvestment {

    String AccountNo;
    String FromNO;
    String CardNo;
    String ProjectName;
    String ProjectLocation;
    String Name;
    String MotherName;
    String FatherHusbendName;
    String PresentAddress;
    String ParmanetAddress;
    String StartDate;
    String InvestedAmount;
    String ProjectDuration;
    String NIDNo;
    String MobileNo;

    public CreateInvestment() {
    }

    public CreateInvestment(String AccountNo, String FromNO, String CardNo, String ProjectName, String ProjectLocation, String Name, String MotherName, String FatherHusbendName, String PresentAddress, String ParmanetAddress, String StartDate, String InvestedAmount, String ProjectDuration, String NIDNo, String MobileNo) {
        this.AccountNo = AccountNo;
        this.FromNO = FromNO;
        this.CardNo = CardNo;
        this.ProjectName = ProjectName;
        this.ProjectLocation = ProjectLocation;
        this.Name = Name;
        this.MotherName = MotherName;
        this.FatherHusbendName = FatherHusbendName;
        this.PresentAddress = PresentAddress;
        this.ParmanetAddress = ParmanetAddress;
        this.StartDate = StartDate;
        this.InvestedAmount = InvestedAmount;
        this.ProjectDuration = ProjectDuration;
        this.NIDNo = NIDNo;
        this.MobileNo = MobileNo;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    public String getFromNO() {
        return FromNO;
    }

    public void setFromNO(String FromNO) {
        this.FromNO = FromNO;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getProjectLocation() {
        return ProjectLocation;
    }

    public void setProjectLocation(String ProjectLocation) {
        this.ProjectLocation = ProjectLocation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String MotherName) {
        this.MotherName = MotherName;
    }

    public String getFatherHusbendName() {
        return FatherHusbendName;
    }

    public void setFatherHusbendName(String FatherHusbendName) {
        this.FatherHusbendName = FatherHusbendName;
    }

    public String getPresentAddress() {
        return PresentAddress;
    }

    public void setPresentAddress(String PresentAddress) {
        this.PresentAddress = PresentAddress;
    }

    public String getParmanetAddress() {
        return ParmanetAddress;
    }

    public void setParmanetAddress(String ParmanetAddress) {
        this.ParmanetAddress = ParmanetAddress;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getInvestedAmount() {
        return InvestedAmount;
    }

    public void setInvestedAmount(String InvestedAmount) {
        this.InvestedAmount = InvestedAmount;
    }

    public String getProjectDuration() {
        return ProjectDuration;
    }

    public void setProjectDuration(String ProjectDuration) {
        this.ProjectDuration = ProjectDuration;
    }

    public String getNIDNo() {
        return NIDNo;
    }

    public void setNIDNo(String NIDNo) {
        this.NIDNo = NIDNo;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }

    @Override
    public String toString() {
        return "CreateInvestment{" + "AccountNo=" + AccountNo + ", FromNO=" + FromNO + ", CardNo=" + CardNo + ", ProjectName=" + ProjectName + ", ProjectLocation=" + ProjectLocation + ", Name=" + Name + ", MotherName=" + MotherName + ", FatherHusbendName=" + FatherHusbendName + ", PresentAddress=" + PresentAddress + ", ParmanetAddress=" + ParmanetAddress + ", StartDate=" + StartDate + ", InvestedAmount=" + InvestedAmount + ", ProjectDuration=" + ProjectDuration + ", NIDNo=" + NIDNo + ", MobileNo=" + MobileNo + '}';
    }

}
