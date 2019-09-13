package numberconverter;

public class HexadecimalConverter implements NumberConverter {

	@Override
	public String convert(Integer integer) {
		return Integer.toHexString(integer).toUpperCase();
	}

}
