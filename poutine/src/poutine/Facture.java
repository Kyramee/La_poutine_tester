package poutine;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
<<<<<<< HEAD
import java.text.DecimalFormat;
=======
>>>>>>> 227e9bd0419230faeb94e6d57b3622b35d7ac0c7
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Facture {

	private ArrayList<String> listeClients;
	private ArrayList<String> listeNomPlats;
	private ArrayList<String> listePrixPlats;
	private ArrayList<String> listeCommandes;
	private BufferedWriter ficEcriture;
	
	public String ligneFac; //Ligne utile uniquement pour tester

	// Constructeur
	public Facture() {
		this.listeClients = new ArrayList<>();
		this.listeNomPlats = new ArrayList<>();
		this.listePrixPlats = new ArrayList<>();
		this.listeCommandes = new ArrayList<>();
	}

	public ArrayList<String> getListeClients() {
		return this.listeClients;
	}

	public ArrayList<String> getListeNomPlats() {
		return this.listeNomPlats;
	}
<<<<<<< HEAD

	public ArrayList<String> getListePrixPlats() {
		return this.listePrixPlats;
	}

	public ArrayList<String> getListeCommandes() {
		return this.listeCommandes;
	}

	public void addListeClients( String client ) {
		this.listeClients.add( client );
=======
>>>>>>> 227e9bd0419230faeb94e6d57b3622b35d7ac0c7

	public ArrayList<String> getListePrixPlats() {
		return this.listePrixPlats;
	}

	public ArrayList<String> getListeCommandes() {
		return this.listeCommandes;
	}

	public void addListeClients(String client) {
		this.listeClients.add(client);

	}

	public void addListePlats(String plat) {
		String[] platSplit = plat.split(" ");
		this.listeNomPlats.add(platSplit[0]);
		this.listePrixPlats.add(platSplit[1]);
	}

	public void addListeCommandes(String commande) {
		this.listeCommandes.add(commande);
	}

	public void affichageFacture() {

		boolean valide = ecriture();

		String[] comSplit;
		int index = 0;
		double[] facture = new double[this.listeClients.size()];

<<<<<<< HEAD
		System.out.println( "Bienvenue chez Barette!" );
		ecrire( "Bienvenue chez Barette!" );

		if ( valide ) {
			for ( String commande : this.listeCommandes ) {
				comSplit = commande.split( " " );

				if ( comSplit.length != 3 ) {
					System.out.println( "Il y a une commande qui possède un format de commande invalide" );
					ecrire( "Il y a une commande qui possède un format de commande invalide" );

				} else if ( !this.listeClients.contains( comSplit[0] ) ) {
					System.out.println( "Le nom du client " + comSplit[0] + " n'est pas dans la liste" );
					ecrire( "Le nom du client " + comSplit[0] + " n'est pas dans la liste" );

				} else if ( !this.listeNomPlats.contains( comSplit[1] ) ) {
					System.out.println( "Le nom du plat " + comSplit[1] + " pour le client " + comSplit[0]
							+ " n'est pas dans la liste" );
					ecrire( "Le nom du plat " + comSplit[1] + " pour le client " + comSplit[0]
							+ " n'est pas dans la liste" );

				} else if ( Integer.parseInt( comSplit[2] ) < 1 ) {
					System.out.println( "La quantité de nourriture ne peux pas être négative ou égal à 0" );
					ecrire( "La quantité de nourriture ne peux pas être négative ou égal à 0" );

				} else {
					facture[this.listeClients.indexOf( comSplit[0] )] += Double
							.parseDouble( this.listePrixPlats.get( this.listeNomPlats.indexOf( comSplit[1] ) ) )
							* Double.parseDouble( comSplit[2] );
				}
			}

			System.out.println( "\nFactures:" );
			try {
				ficEcriture.newLine();
				ecrire( "Factures:" );
			} catch ( IOException e1 ) {
				e1.printStackTrace();
			}

			for ( String nom : this.listeClients ) {
				if ( facture[index] != 0.0 ) {

					double tps = facture[index] * 0.05, tvq = facture[index] * 0.10;
					DecimalFormat df = new DecimalFormat( "0.##" );

					ligneFac = nom + " " + df.format( facture[index] ) + "$, TPS: " + df.format( tps )
							+ "$ TVQ: " + df.format( tvq ) + "$ Total: "
							+ df.format( ( facture[index++] + tps + tvq ) ) + "$";
					System.out.println( ligneFac );
					ecrire( ligneFac );
=======
		System.out.println("Bienvenue chez Barette!");
		ecrire("Bienvenue chez Barette!");

		if (valide) {
			for (String commande : this.listeCommandes) {
				comSplit = commande.split(" ");

				if (comSplit.length != 3) {
					System.out.println("Il y a une commande qui possède un format de commande invalide");
					ecrire("Il y a une commande qui possède un format de commande invalide");

				} else if (!this.listeClients.contains(comSplit[0])) {
					System.out.println("Le nom du client " + comSplit[0] + " n'est pas dans la liste");
					ecrire("Le nom du client " + comSplit[0] + " n'est pas dans la liste");

				} else if (!this.listeNomPlats.contains(comSplit[1])) {
					System.out.println("Le nom du plat " + comSplit[1] + " pour le client " + comSplit[0] + " n'est pas dans la liste");
					ecrire("Le nom du plat " + comSplit[1] + " pour le client " + comSplit[0] + " n'est pas dans la liste");

				} else if (Integer.parseInt(comSplit[2]) < 1) {
					System.out.println("La quantité de nourriture ne peux pas être négative ou égal à 0");
					ecrire("La quantité de nourriture ne peux pas être négative ou égal à 0");

				} else {
					facture[this.listeClients.indexOf(comSplit[0])] += Double.parseDouble(this.listePrixPlats.get(this.listeNomPlats.indexOf(comSplit[1])))* Double.parseDouble(comSplit[2]);
				}
			}

			System.out.println("\nFactures:");
			try {
				ficEcriture.newLine();
				ecrire("Factures:");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			for (String nom : this.listeClients) {
				if (facture[index] != 0.0) {

					double tps = facture[index] * 0.05, tvq = facture[index] * 0.10;

					String message = nom + " " + facture[index++] + "$, TPS: " + tps + "$ TVQ: " + tvq + "$";
					System.out.println(message);
					ecrire(message);
>>>>>>> 227e9bd0419230faeb94e6d57b3622b35d7ac0c7
				}
			}

			try {
				ficEcriture.close();
<<<<<<< HEAD
			} catch ( IOException e ) {
=======
			} catch (IOException e) {
				// TODO Auto-generated catch block
>>>>>>> 227e9bd0419230faeb94e6d57b3622b35d7ac0c7
				e.printStackTrace();
			}
		}
	}

<<<<<<< HEAD
	private void ecrire( String message ) {
		try {
			ficEcriture.write( message );
			ficEcriture.newLine();
		} catch ( IOException e ) {
=======
	private void ecrire(String message) {
		try {
			ficEcriture.write(message);
			ficEcriture.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
>>>>>>> 227e9bd0419230faeb94e6d57b3622b35d7ac0c7
			e.printStackTrace();
		}
	}

	private boolean ecriture() {
<<<<<<< HEAD
		String timeStamp = new SimpleDateFormat( "dd_MM_yy-HH;mm" ).format( Calendar.getInstance().getTime() );
=======
		String timeStamp = new SimpleDateFormat("dd_MM_yy-HH;mm").format(Calendar.getInstance().getTime());
>>>>>>> 227e9bd0419230faeb94e6d57b3622b35d7ac0c7

		boolean valide = true;
		String filename = "Facture-du-" + timeStamp + ".txt";

		try {
			ficEcriture = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(filename), Charset.defaultCharset()));
		} catch (IOException err) {
			System.out.print(err);
			valide = false;
		}

		return valide;
	}
}
