package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault v = new Vault();
	JamesBond jb=new JamesBond();
	

	jb.findCode(v);
	System.out.println(	v.tryCode(863243));
	
}
}
