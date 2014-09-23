
public class Client {


	
			private int numClient;
			private String nomClient;
			private String civilite;
			private String adresseClient;
			private String mailClient;
			private int telClient;
			
			
			public Client(int unNumClient, String unNomClient, String uneCivilite, String uneAdresseClient, String unMailClient, int leTelClient){
				this.numClient = unNumClient;
				this.nomClient = unNomClient;
				this.civilite = uneCivilite;
				this.adresseClient = uneAdresseClient;
				this.mailClient = unMailClient;
				this.telClient = leTelClient;
				
				
				
				
			}


			public int getNumClient() {
				return numClient;
			}


			public void setNumClient(int numClient) {
				this.numClient = numClient;
			}


			public String getNomClient() {
				return nomClient;
			}


			public void setNomClient(String nomClient) {
				this.nomClient = nomClient;
			}


			public String getCivilite() {
				return civilite;
			}


			public void setCivilite(String civilite) {
				this.civilite = civilite;
			}


			public String getAdresseClient() {
				return adresseClient;
			}


			public void setAdresseClient(String adresseClient) {
				this.adresseClient = adresseClient;
			}


			public String getMailClient() {
				return mailClient;
			}


			public void setMailClient(String mailClient) {
				this.mailClient = mailClient;
			}


			public int getTelClient() {
				return telClient;
			}


			public void setTelClient(int telClient) {
				this.telClient = telClient;
			}
}
