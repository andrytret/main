public class CheckItem {

	public static String checkKeys(final String keyName, final String[] keyNames) {

		String result = null;
		
		if (keyNames != null && keyNames.length > 0 && keyName != null) {
			for (int i = 0; i < keyNames.length; i++) {
				if (keyName == keyNames[i]) {
					result = keyNames[i];
					break;
				}
			}
			if (result == null) {
				result = "error";
			}
		}
		return result;
	}
}
	

/*public static boolean isStringInArray (final String value, final String[] array) {

		boolean result = false;
		if (array != null && array.length > 0 && value != null) {
			for (int i = 0; i < array.length; i++) {
				if (value.equals(array[i])) {
					result = true;
					break;
				}
			}
		}
		return result;
	}

}

/*
 * public static String check2 (String item1, String items[]){ String znach1 =
 * null; if (item1 == items[0]) {znach1 = items[0];} else { if (item1 ==
 * items[1]) {znach1 = items[1];} else { if (item1 == items[2]) {znach1 =
 * items[2];} else { if (item1 == items[3]) {znach1 = items[3];} else { if
 * (item1 == items[4]) {znach1 = items[4];} else { if (item1 == items[5])
 * {znach1 = items[5];} else { if (item1 == items[6]) {znach1 = items[6];} else
 * { if (item1 == items[7]) {znach1 = items[7];} else { };};};};};};};};
 * 
 * return znach1;}
 * 
 * }
 * 
 * 
 * /*if (item1 == items[0]) {znach1 = items[0];} else { if (item1 == items[1])
 * {znach1 = items[1];} else { if (item1 == items[2]) {znach1 = items[2];} else
 * { if (item1 == items[3]) {znach1 = items[3];} else { if (item1 == items[4])
 * {znach1 = items[4];} else { if (item1 == items[5]) {znach1 = items[5];} else
 * { if (item1 == items[6]) {znach1 = items[6];} else { if (item1 == items[7])
 * {znach1 = items[7];} else { };};};};};};};}; if (item2 == items[0]) {znach2 =
 * items[0];} else { if (item2 == items[1]) {znach2 = items[1];} else { if
 * (item2 == items[2]) {znach2 = items[2];} else { if (item2 == items[3])
 * {znach2 = items[3];} else { if (item2 == items[4]) {znach2 = items[4];} else
 * { if (item2 == items[5]) {znach2 = items[5];} else { if (item2 == items[6])
 * {znach2 = items[6];} else { if (item2 == items[7]) {znach2 = items[7];} else
 * { };};};};};};};};
 * 
 * if (item3 == items[0]) {znach3 = items[0];} else { if (item3 == items[1])
 * {znach3 = items[1];} else { if (item3 == items[2]) {znach3 = items[2];} else
 * { if (item3 == items[3]) {znach3 = items[3];} else { if (item3 == items[4])
 * {znach3 = items[4];} else { if (item3 == items[5]) {znach3 = items[5];} else
 * { if (item3 == items[6]) {znach3 = items[6];} else { if (item3 == items[7])
 * {znach3 = items[7];} else { };};};};};};};}; if (item4 == items[0]) {znach4 =
 * items[0];} else { if (item4 == items[1]) {znach4 = items[1];} else { if
 * (item4 == items[2]) {znach4 = items[2];} else { if (item4 == items[3])
 * {znach4 = items[3];} else { if (item4 == items[4]) {znach4 = items[4];} else
 * { if (item4 == items[5]) {znach4 = items[5];} else { if (item4 == items[6])
 * {znach4 = items[6];} else { if (item4 == items[7]) {znach4 = items[7];} else
 * { };};};};};};};};
 * 
 * if (item5 == items[0]) {znach5 = items[0];} else { if (item5 == items[1])
 * {znach5 = items[1];} else { if (item5 == items[2]) {znach5 = items[2];} else
 * { if (item5 == items[3]) {znach5 = items[3];} else { if (item5 == items[4])
 * {znach5 = items[4];} else { if (item5 == items[5]) {znach5 = items[5];} else
 * { if (item5 == items[6]) {znach5 = items[6];} else { if (item5 == items[7])
 * {znach5 = items[7];} else { };};};};};};};};
 */
