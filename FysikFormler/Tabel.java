	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
public class  Tabel extends JFrame implements ActionListener{
		private JButton b1 = new JButton ("SolidTable");
		private	JButton b2 = new JButton ("LiqudTable");
		private JButton b3 = new JButton ("GasTable");
		private JButton b4 = new JButton ("Exit");
		private JPanel p5 = new JPanel();
		public Tabel(){
			p5.setBackground(Color.white);
			p5.setPreferredSize(new Dimension(70,20));
			setLayout(new FlowLayout());
			add(b1);add(b2);add(b3);add(b4);add(p5);
			b1.setBorderPainted(false);b1.addActionListener(this);
			b2.setBorderPainted(false);b2.addActionListener(this);
			b3.setBorderPainted(false);b3.addActionListener(this);
			b4.setBorderPainted(false);b4.addActionListener(this);
			setSize(350,250);
			setVisible(true);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}		
			public void actionPerformed (ActionEvent e){

			if (e.getSource() == b1);{

				 SolidTablePage STP = new SolidTablePage();

				 setVisible(false);

				dispose();
			}
			if(e.getSource() == b2);{

				LiqudTablePage LTP = new LiqudTablePage();
			
				setVisible(false);

				dispose();
			
			}		
			if(e.getSource() == b3);{

				GasTablePage GTP = new GasTablePage();
			
				setVisible(false);

				dispose();
			}
			if(e.getSource() == b4);{
			
				VisaBild start = new VisaBild();
				
				setVisible(false);

				dispose();
			}
		}
		}