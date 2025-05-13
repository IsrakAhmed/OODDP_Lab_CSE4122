
//Facade class
class BankServiceFacade {
    private CheckingAccount checking;
    private SavingAccount saving;
    private InvestmentAccount investment;

    public BankServiceFacade() {
        checking = new CheckingAccount();
        saving = new SavingAccount();
        investment = new InvestmentAccount();
    }

    public void openCheckingService() {
        checking.openCheckingAccount();
    }

    public void openSavingService() {
        saving.openSavingAccount();
    }

    public void openInvestmentService() {
        investment.openInvestmentAccount();
    }

    public void openAllServices() {
        checking.openCheckingAccount();
        saving.openSavingAccount();
        investment.openInvestmentAccount();
    }
}
