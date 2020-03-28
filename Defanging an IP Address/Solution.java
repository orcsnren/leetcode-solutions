class Solution {
	public String defangIPaddr(String address) {
		if (address == null) {
			throw new IllegalArgumentException("Wrong Format");
		} else
			return address.replace(".", "[.]");
	}
}