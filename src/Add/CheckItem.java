package Add;

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

	public static int KeysNumberID(String KeyName) {
		int KeyIndex = 0;
		if (KeyName.equals("-")) {
			KeyIndex = 0;
		} else if (KeyName.equals("F1")) {
			KeyIndex = 112;
		} else if (KeyName.equals("F2")) {
			KeyIndex = 113;
		} else if (KeyName.equals("F3")) {
			KeyIndex = 114;
		} else if (KeyName.equals("F4")) {
			KeyIndex = 115;
		} else if (KeyName.equals("F5")) {
			KeyIndex = 116;
		} else if (KeyName.equals("F6")) {
			KeyIndex = 117;
		} else if (KeyName.equals("F7")) {
			KeyIndex = 118;
		}else if (KeyName.equals("F8")) {
			KeyIndex = 119;
		}else if (KeyName.equals("F9")) {
			KeyIndex = 120;
		}else if (KeyName.equals("F0")) {
			KeyIndex = 121;
		}else if (KeyName.equals("F11")) {
			KeyIndex = 122;
		}else if (KeyName.equals("F12")) {
			KeyIndex = 123;
		}

		return KeyIndex;
	}

}

// 59-68 Ключи f1-f10 (нельзя использовать клавиши с изменяемой функцией)
// 84-93 f11-f20 (shift-f1 - shift-f10)
// 94-103 f21-f30 (ctrl-f1 - ctrl-f10)
//
// 104-113 f31-f40 (alt-f1 - alt-f10)
//
// 133 f11
// 134 f12