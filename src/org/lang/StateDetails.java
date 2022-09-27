package org.lang;

public class StateDetails {

	private void southIndian() {
		
		System.out.println("Traditional states");

	}
		
		
	private void northIndian() {
		
		System.out.println("Influence from foreign");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StateDetails s = new StateDetails();
		s.southIndian();
		s.northIndian();
		LanguageInfo ruban=new LanguageInfo();
		ruban.tamilLanguage();
		ruban.hindiLanguage();
		ruban.englishLanguage();
	
	}

}
