import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class inteface extends JFrame{
	JButton b1;
	JLabel l1,l2,l4,l5;
	JTextField t1,t2,t3;
	JTextArea vyvod,nazv,l3;
	Klik klick1 = new Klik(); 
	public inteface(String s){
			super(s);
			setLayout(new GridLayout(4,3));
			b1=new JButton("вычислить");
			b1.setPreferredSize(new Dimension(40,40));
			l1=new JLabel("Вместимость в Кувшине №1:");
			l2=new JLabel("Вместимость в Кувшине №2:");
			l3=new JTextArea("Количество воды, которое\nнадо получить переливанием\n из одного кувшина в другой");
			l3.disable();
			l3.setDisabledTextColor(Color.black);
			l3.setBackground(l1.getBackground());
			l4=new JLabel("");
			l5=new JLabel("");
			nazv=new JTextArea("Количество воды в Кувшин №1 :\nКоличество воды в Кувшин №1 :");
			nazv.disable();
			nazv.setDisabledTextColor(Color.BLACK);
			nazv.setBackground(l1.getBackground());
			vyvod=new JTextArea ("");
			vyvod.disable();
			vyvod.setDisabledTextColor(Color.BLACK);
			vyvod.setBorder(BorderFactory.createLineBorder(Color.black));
			t1=new JTextField(10);
			t2=new JTextField(10);
			t3=new JTextField(10);
			add(l1);
			add(t1);
			add(b1);
			add(l2);
			add(t2);
			add(l4);
			add(l3);
			add(t3);
			add(l5);
			add(nazv);
			add(vyvod);
			b1.addActionListener(klick1);
			}
		public class Klik implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				try{
					if(e.getSource()==b1){
						vyvod.setText("");
						int a1,a2,a3,n1,n2;
						a1=Integer.parseInt(t1.getText());
						a2=Integer.parseInt(t2.getText());
						a3=Integer.parseInt(t3.getText());
						vychisleniya vych = new vychisleniya();
						vych.perelivaniyaizodnogo(a1, a2, a3);
						n1=vych.n;
						vych.perelivaniyaizodnogo(a2, a1, a3);
						n2=vych.n;
					if (n1<n2){
						vych.perelivaniyaizodnogo(a1, a2, a3);
						for (int i=1;i<=2;i++){
							for (int j=1;j<vych.n;j++){
								vyvod.setText(vyvod.getText()+vych.array1[i][j]);
							}vyvod.setText(vyvod.getText()+"\n");
						}
					}
					else{		
						vych.perelivaniyaizodnogo(a2, a1, a3);
						for (int i=1;i<=2;i++){
							for (int j=1;j<vych.n;j++){
								vyvod.setText(vyvod.getText()+vych.array1[i][j]);
							}vyvod.setText(vyvod.getText()+"\n");
						}
					}
					}
							
					
				}catch(Exception ex){JOptionPane.showMessageDialog(null,"Вычисления невозможны.");}
				
			}
			
		}
	}


