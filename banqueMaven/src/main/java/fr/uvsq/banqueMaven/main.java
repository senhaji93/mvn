package fr.uvsq.banqueMaven;
//fr.uvsq.banqueMaven.main

public class main {

	public static void main(String[] args) throws ExceptionDecouvert, ExceptionMontantNegatif {
		System.out.println("--------------------------------------------------------------");
		CompteBancaire cmp1=new CompteBancaire(2000);
		CompteBancaire cmp2=new CompteBancaire(2000);
		System.out.println("compte 1"+cmp1.getsolde());
		System.out.println("compte 2"+cmp2.getsolde());
		cmp1.crediteSolde(200);
		System.out.println("compte 1"+cmp1.getsolde());
		cmp1.virement(300, cmp2);
		
		System.out.println("compte 1"+cmp1.getsolde());
		System.out.println("compte 2"+cmp2.getsolde());

	}

}

