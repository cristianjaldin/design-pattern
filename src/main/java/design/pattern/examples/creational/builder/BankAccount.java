package design.pattern.examples.creational.builder;

public class BankAccount {

	private final long accountNumber;
	private final String owner;
	private final String type;
	private final double balance;
	private final double interestRate;

	private BankAccount(BankAccountBuilder builder) {
		this.accountNumber = builder.accountNumber;
		this.owner = builder.owner;
		this.type = builder.type;
		this.balance = builder.balance;
		this.interestRate = builder.interestRate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", owner=" + owner + ", type=" + type + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}

	public static class BankAccountBuilder {

		private long accountNumber;
		private String owner;
		private String type;
		private double balance;
		private double interestRate;

		public BankAccountBuilder(long accountNumber, String owner) {
			this.accountNumber = accountNumber;
			this.owner = owner;
		}

		public BankAccountBuilder withType(String type) {
			this.type = type;
			return this;
		}

		public BankAccountBuilder withBalance(double balance) {
			this.balance = balance;
			return this;
		}

		public BankAccountBuilder withInterestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}

	}

}