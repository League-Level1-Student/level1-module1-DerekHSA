package _05_vault;

public class Vault {
 int secretCode=863243;
 public boolean tryCode(int code) {
	if (code==secretCode) {
		return true;
	}else {
		return false;
	}
 }
}
