package fr.uvsq.banqueMaven;

public class CompteBancaire {
	private int solde ;
	public CompteBancaire(int m) throws ExceptionDecouvert
	{
		
		if (m>0)
		this.solde = m;
		else throw new ExceptionDecouvert();
	}
	public int getsolde()
	{
		return this.solde;
	}
	
	
	
	public void crediteSolde(int montant) throws ExceptionMontantNegatif {
		if (montant < 0) throw new ExceptionMontantNegatif();
		this.solde += montant;
	}
	public void debiteSolde(int montant) throws ExceptionMontantNegatif, ExceptionDecouvert {
		if (montant < 0) throw new ExceptionMontantNegatif ();
		if (this.solde - montant < 0) throw new ExceptionDecouvert();
		this.solde -= montant;
	}
	
	public void virement(int montant, CompteBancaire receveur) throws ExceptionMontantNegatif, ExceptionDecouvert {
		if (montant < 0) throw new ExceptionMontantNegatif ();
		if (this.solde - montant < 0) throw new ExceptionDecouvert();
		receveur.crediteSolde(montant);
		this.debiteSolde(montant);
	}
}
