
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.*;



public class Sravnivaniesum extends JFrame{
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	JTextField t1;
	int n,n2;
	int c1=0;
	int c2=0;
	int[]z1=new int[1500];
	int[]z2=new int[1500];
	Klik klick1 = new Klik();
	
	public Sravnivaniesum(){
	    super("Задача на равновесие"); //Заголовок окна
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при закрытии окна закрывалась и программа, иначе она останется висеть в процессах
	    setVisible(true);
	    setResizable(true);
	    setLocationRelativeTo(null);
	    b1=new JButton("Введите количесво грузов.");
		b2=new JButton("Сбалансировать");
		b3=new JButton("Можно ли из грузов собрать число сто");
		l1=new JLabel("здесь будет массив");
		l2=new JLabel("здесь балланс");
		l3=new JLabel("здесь ответ на вопрос про 100");
		t1=new JTextField();
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		b2.setEnabled(false);
		b3.setEnabled(false);
		add(t1);
		add(b1);
		add(l1);
		add(b2);
		add(l2);
		add(b3);
		add(l3);
		b1.addActionListener(klick1);
		b2.addActionListener(klick1);
		b3.addActionListener(klick1);
	}
	
	public class Klik implements ActionListener{
		
		
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource()==b1){

					
					if (c1>1&&c1!=n+1){ 
						int i = Integer.parseInt(t1.getText());
						t1.setText(null);
						b1.setText("Введите элемент №"+c1);
						l1.setText(l1.getText()+", "+i);
						z1[c1-1]=i;
						z2[c1-1]=i;
						 c1++;
						 if(c1==n+1){b1.setText("Ввод элементов закончен");
						 b1.setEnabled(false);
						 b2.setEnabled(true);
						 b3.setEnabled(true);}
						 };

					if (c1==1){ 
						int i = Integer.parseInt(t1.getText());
						t1.setText(null);
						b1.setText("Введите элемент №"+c1);
						l1.setText(""+i);
						z1[c1-1]=i;
						z2[c1-1]=i;
						c1++;
						if(c1==n+1){b1.setText("Ввод элементов закончен");
						 b1.setEnabled(false);
						 b2.setEnabled(true);
						 b3.setEnabled(true);}
						 };	
					if (c1==0){ 
					 n = Integer.parseInt(t1.getText());
					 n2 = Integer.parseInt(t1.getText());
					 t1.setText(null);
					 l1.setText(" ");
					 c1++;
					 b1.setText("Введите элемент №"+c1);
					 
					 };
				
					
					
				}
				if(e.getSource()==b2){l2.setText("");
					if (c1>n){Sravnivaniesumvichisleniya vich= new Sravnivaniesumvichisleniya(n,z1);
					l2.setText(vich.text1);b2.setEnabled(false);}
				}
				if(e.getSource()==b3){
					if (c1>n){Sravnivaniesumvichisleniya vich= new Sravnivaniesumvichisleniya(n2,z2);
					l3.setText(vich.text2);b3.setEnabled(false);vich.sum = new int[1500];
					vich.b1=new int[1500][1500];}
				}
				
			}catch(Exception ex){JOptionPane.showMessageDialog(null,"введите цифры");}
					
		}
		
	}
}
