package mygitpackage;

public class Replace {

	public static void main(String[] args) {
		// Q #1) replace() methodu kullanmadan bir String'deki bosluklari kaldiran Java kodunu yaziniz
		method();
		
	}

	private static void method() {
		String cumle="Te  cc h pro Educati   on'in Full Sta ck Kurslari baslamisti           r";
		String cumle2="";
		for (int i = 0; i < cumle.length(); i++) {
			if (!cumle.substring(i,i+1).equals(" ")) {
				cumle2=cumle2+cumle.substring(i,i+1);
				
			}
		}System.out.println(cumle2);
		
	}

}
