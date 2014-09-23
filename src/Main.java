import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	/**
	 * @param args
	 */
	public class Main extends JFrame implements ActionListener {
		// TODO Auto-generated method stub
		
			/**
			 * @param args
			 */
			private JButton ajouter,supprimer,consulter,rechercher,solde;
			private JLabel title;
		
				
				this.p = p;
				
				void setTitle ("Menu");
				setSize (p.getLargeur(), p.getHauteur());
				setLocationRelativeTo(null);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible (true);
				setResizable(false);
				
				Container contentPane = getContentPane ();
				contentPane.setLayout(null);
				
				titre = new JLabel ("Ma Banque");
				titre.setBounds(310, 100, 200, 100);
				titre.setFont((new Font("Impact",Font.PLAIN,00)));
				
				ajout= new JButton("Ajouter un compte");
				ajout.setBounds(300, 350, 190, 50);
				
				supprimer= new JButton("Supprimer un compte");
				supprimer.setBounds(300, 350, 190, 50);
				
				voir= new JButton("Voir un compte");
				voir.setBounds(300, 350, 190, 50);
				
				rechercher= new JButton("Rechercher un compte");
				rechercher.setBounds(300, 350, 190, 50);
				
				solde= new JButton("Voir solde");
				solde.setBounds(300, 350, 190, 50);
				
				contentPane.add(titre);
				contentPane.add(ajout);
				contentPane.add(supprimer);
				contentPane.add(voir);
				contentPane.add(rechercher);
				contentPane.add(solde);
				
				ajout.addActionListner(this);
				supprimer.addActionListner(this);
				voir.addActionListner(this);
				rechercher.addActionListner(this);
				solde.addActionListner(this);
			}
			
			public void actionPerformed(ActionEvent e){
				
				
				
			}
			
			
		}


	


