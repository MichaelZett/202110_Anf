package de.feu.tagzwei.student;

public abstract class AbstractPerson implements HasName {
	protected String name;
	protected Address address;

	public AbstractPerson(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void updateName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address.toString();
	}

	private class Address {
		private String street;
		private String city;

		public Address(String street, String city) {
			super();
			this.street = street;
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public String getCity() {
			return city;
		}

		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + "]";
		}

	}

}