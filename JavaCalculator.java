import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;



public class Calculator implements ActionListener{
	boolean IsOperatorClicked=false;
boolean dotpressed=false;
	float floatdiv;
	float floatmin;
	float floatmulti;
	float floatplus;
	String NewValue;
	JFrame jf;
	JLabel displaylabel;
	JButton Buttonseven;
	JButton Buttoneight;
	JButton Buttonnine;
	JButton Buttonsix;
	JButton Buttonfour;
	JButton Buttonthree;
	JButton Buttontwo;
	JButton Buttonone;
	JButton Buttonfive;
	JButton Buttonzero;
	JButton Buttondot;
	JButton Buttondiv;
	JButton Buttonmulti;
	JButton Buttonplusmin;
	JButton Buttonplus;
	JButton Buttonmin;
	JButton Buttonback;
	JButton Buttonper;
	JButton Buttonc;
	JButton Buttonequal;
	String OldValuePlus;
	String OldValueMulti;
	String OldValueMin;
	String OldValueDiv;
	int operator;

	
	
	public Calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(280,470);
		jf.setLocation(450,200);
		jf.getContentPane().setBackground(Color.black);
		displaylabel=new JLabel("");
		displaylabel.setForeground(Color.white);
		displaylabel.setBackground(Color.black);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setVerticalAlignment(SwingConstants.BOTTOM);
		displaylabel.setFont(new Font("Arial",Font.PLAIN,50));
		
		displaylabel.setBounds(0,0,265,100);
		jf.add(displaylabel);
		
		Buttonper=new JButton("%");
		Buttonper.addActionListener(this);
		Buttonper.setBounds(5,105,60,60);
		Buttonper.setBackground(Color.lightGray);
		Buttonper.setForeground(Color.black);
		Buttonper.setFont(new Font("Arial",Font.BOLD,18));
		Buttonper.setFocusPainted(false);
		Buttonper.setBorderPainted(false);
		jf.add(Buttonper);
		
		Buttonplusmin=new JButton("+/-");
		Buttonplusmin.addActionListener(this);
		Buttonplusmin.setBounds(70,105,60,60);
		Buttonplusmin.setBackground(Color.LIGHT_GRAY);
		Buttonplusmin.setForeground(Color.black);
		Buttonplusmin.setFont(new Font("arial",Font.BOLD,20));
		Buttonplusmin.setFocusPainted(false);
		Buttonplusmin.setBorderPainted(false);
		jf.add(Buttonplusmin);
		
		Buttonc=new JButton("C");
		Buttonc.addActionListener(this);
		Buttonc.setBounds(135,105,60,60);
		Buttonc.setBackground(Color.LIGHT_GRAY);
		Buttonc.setForeground(Color.black);
		Buttonc.setFont(new Font("sanserif",Font.BOLD,20));
		Buttonc.setFocusPainted(false);
		Buttonc.setBorderPainted(false);
		jf.add(Buttonc);
		
		Buttonseven=new JButton("7");
		Buttonseven.addActionListener(this);
		Buttonseven.setBounds(5,170,60,60);
		Buttonseven.setBackground(Color.DARK_GRAY);
		Buttonseven.setForeground(Color.white);
		Buttonseven.setFont(new Font("sanserif",Font.BOLD,25));
		Buttonseven.setFocusPainted(false);
		Buttonseven.setBorderPainted(false);
		jf.add(Buttonseven);
		
		Buttoneight=new JButton("8");
		Buttoneight.addActionListener(this);
		Buttoneight.setBounds(70,170,60,60);
		Buttoneight.setBackground(Color.DARK_GRAY);
		Buttoneight.setForeground(Color.white);
		Buttoneight.setFont(new Font("sanserif",Font.BOLD,25));
		Buttoneight.setFocusPainted(false);
		Buttoneight.setBorderPainted(false);
		jf.add(Buttoneight);
		
		Buttonnine=new JButton("9");
		Buttonnine.addActionListener(this);
		Buttonnine.setBounds(135,170,60,60);
		Buttonnine.setBackground(Color.DARK_GRAY);
		Buttonnine.setForeground(Color.white);
		Buttonnine.setFont(new Font("sanserif",Font.BOLD,25));
		Buttonnine.setFocusPainted(false);
		Buttonnine.setBorderPainted(false);
		jf.add(Buttonnine);
		
		Buttonsix=new JButton("6");
		Buttonsix.addActionListener(this);
		Buttonsix.setBounds(5,235,60,60);
		Buttonsix.setBackground(Color.DARK_GRAY);
		Buttonsix.setForeground(Color.white);
		Buttonsix.setFont(new Font("sanserif",Font.BOLD,25));
		Buttonsix.setFocusPainted(false);
		Buttonsix.setBorderPainted(false);
		jf.add(Buttonsix);
		
		Buttonfive=new JButton("5");
		Buttonfive.addActionListener(this);
		Buttonfive.setBounds(70,235,60,60);
		Buttonfive.setBackground(Color.darkGray);
		Buttonfive.setForeground(Color.white);
		Buttonfive.setFont(new Font("sanserif",Font.BOLD,25));
		Buttonfive.setFocusPainted(false);
		Buttonfive.setBorderPainted(false);
		jf.add(Buttonfive);
		
		Buttonfour=new JButton("4");
		Buttonfour.addActionListener(this);
		Buttonfour.setBounds(135,235,60,60);
		Buttonfour.setBackground(Color.DARK_GRAY);
		Buttonfour.setForeground(Color.white);
		Buttonfour.setFont(new Font("sanserif",Font.BOLD,25));
		Buttonfour.setFocusPainted(false);
		Buttonfour.setBorderPainted(false);
		jf.add(Buttonfour);
		
		Buttonthree=new JButton("3");
		Buttonthree.addActionListener(this);
		Buttonthree.setBounds(5,300,60,60);
		Buttonthree.setBackground(Color.darkGray);
		Buttonthree.setForeground(Color.white);
		Buttonthree.setFont(new Font("sanserif",Font.BOLD,25));
		Buttonthree.setFocusPainted(false);
		Buttonthree.setBorderPainted(false);
		jf.add(Buttonthree);
		
		Buttontwo=new JButton("2");
		Buttontwo.addActionListener(this);
		Buttontwo.setBounds(70,300,60,60);
		Buttontwo.setBackground(Color.darkGray);
		Buttontwo.setForeground(Color.white);
		Buttontwo.setFont(new Font("sanserif",Font.BOLD,25));
		Buttontwo.setFocusPainted(false);
		Buttontwo.setBorderPainted(false);
		jf.add(Buttontwo);
				

		Buttonone=new JButton("1");
		Buttonone.addActionListener(this);
		Buttonone.setBounds(135,300,60,60);
		Buttonone.setBackground(Color.darkGray);
		Buttonone.setForeground(Color.white);
		Buttonone.setFont(new Font("sanserif",Font.BOLD,25));
		Buttonone.setFocusPainted(false);
		Buttonone.setBorderPainted(false);
		jf.add(Buttonone);
		

		Buttondot=new JButton(".");
		Buttondot.addActionListener(this);
		Buttondot.setBounds(5,365,60,60);
		Buttondot.setBackground(Color.darkGray);
		Buttondot.setForeground(Color.WHITE);
		Buttondot.setFont(new Font("sanserif",Font.BOLD,30));
		Buttondot.setFocusPainted(false);
		Buttondot.setBorderPainted(false);
		jf.add(Buttondot);
		

		Buttonzero=new JButton("0");
		Buttonzero.addActionListener(this);
		Buttonzero.setBounds(70,365,60,60);
		Buttonzero.setBackground(Color.darkGray);
		Buttonzero.setForeground(Color.white);
		Buttonzero.setFont(new Font("sanserif",Font.BOLD,25));
		Buttonzero.setFocusPainted(false);
		Buttonzero.setBorderPainted(false);
		jf.add(Buttonzero);
		
		
		

		Buttonequal=new JButton("=");
		Buttonequal.addActionListener(this);
		Buttonequal.setBounds(135,365,60,60);
		Buttonequal.setBackground(Color.orange);
		Buttonequal.setForeground(Color.WHITE);
		Buttonequal.setFont(new Font("Arial",Font.BOLD,20));
		Buttonequal.setFocusPainted(false);
		Buttonequal.setBorderPainted(false);
		jf.add(Buttonequal);
		
		Buttonplus=new JButton("+");
		Buttonplus.addActionListener(this);
		Buttonplus.setBounds(200,170,60,60);
		Buttonplus.setBackground(Color.orange);
		Buttonplus.setForeground(Color.WHITE);
		Buttonplus.setFont(new Font("Arial",Font.BOLD,25));
		Buttonplus.setFocusPainted(false);
		Buttonplus.setBorderPainted(false);
		jf.add(Buttonplus);
		
	
		
		Buttonmin=new JButton("-");
		Buttonmin.addActionListener(this);
		Buttonmin.setBounds(200,235,60,60);
		Buttonmin.setBackground(Color.orange);
		Buttonmin.setForeground(Color.WHITE);
		Buttonmin.setFont(new Font("Arial",Font.BOLD,30));
		Buttonmin.setFocusPainted(false);
		Buttonmin.setBorderPainted(false);
		jf.add(Buttonmin);
	
		
		
		
		Buttonmulti=new JButton("x");
		Buttonmulti.addActionListener(this);
		Buttonmulti.setBounds(200,300,60,60);
		Buttonmulti.setBackground(Color.orange);
		Buttonmulti.setForeground(Color.WHITE);
		Buttonmulti.setFont(new Font("Arial",Font.BOLD,22));
		Buttonmulti.setFocusPainted(false);
		Buttonmulti.setBorderPainted(false);
		jf.add(Buttonmulti);
	
	   
	    Buttondiv=new JButton();
	    Buttondiv.addActionListener(this);
	    Image imgdiv=new ImageIcon(this.getClass().getResource("divide.png")).getImage().getScaledInstance(14, 14, java.awt.Image.SCALE_SMOOTH);
		Buttondiv.setIcon(new ImageIcon(imgdiv));
		Buttondiv.setBounds(200,365,60,60);
		Buttondiv.setBackground(Color.orange);
		Buttondiv.setFocusPainted(false);
		Buttondiv.setBorderPainted(false);
		jf.add(Buttondiv);
	
	
	

		Buttonback=new JButton("");
		Buttonback.addActionListener(this);
		Image imgback=new ImageIcon(this.getClass().getResource("clee.png")).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		Buttonback.setIcon(new ImageIcon(imgback));
		Buttonback.setBounds(200,105,60,60);
		Buttonback.setBackground(Color.DARK_GRAY);
		Buttonback.setForeground(Color.white);
		Buttonback.setFont(new Font("serif",Font.PLAIN,20));
		Buttonback.setFocusPainted(false);
		Buttonback.setBorderPainted(false);
		jf.add(Buttonback);
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String a[])
{
	new Calculator();
}
@Override
public void actionPerformed(ActionEvent e)
{

	if(e.getSource()==Buttonseven) {
		if(IsOperatorClicked) {
			displaylabel.setText("7");
			IsOperatorClicked=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"7");
	}
	}
		else if(e.getSource()==Buttoneight) {
			if(IsOperatorClicked) {
				displaylabel.setText("8");
				IsOperatorClicked=false;
				}else {
			displaylabel.setText(displaylabel.getText()+"8");
			}
	
		}else if(e.getSource()==Buttonnine) {
			if(IsOperatorClicked) {
				displaylabel.setText("9");
				IsOperatorClicked=false;}
			else {
		displaylabel.setText(displaylabel.getText()+"9");
		}
		}		
	else if(e.getSource()==Buttonsix) {
		if(IsOperatorClicked) {
			displaylabel.setText("6");
			IsOperatorClicked=false;}
		else {
			displaylabel.setText(displaylabel.getText()+"6");
			}
	}
	else if(e.getSource()==Buttonfive) {
		if(IsOperatorClicked) {
			displaylabel.setText("5");
			IsOperatorClicked=false;}
		else {
		displaylabel.setText(displaylabel.getText()+"5");
		}
	}
	else if(e.getSource()==Buttonfour) {
		if(IsOperatorClicked) {
			displaylabel.setText("4");
			IsOperatorClicked=false;}
		else {
		displaylabel.setText(displaylabel.getText()+"4");
		}
	}
	else if(e.getSource()==Buttonthree) {
		if(IsOperatorClicked) {
			displaylabel.setText("3");
			IsOperatorClicked=false;}
		else {
		displaylabel.setText(displaylabel.getText()+"3");
		}
	}
	else if(e.getSource()==Buttontwo) {
		if(IsOperatorClicked) {
			displaylabel.setText("2");
			IsOperatorClicked=false;}
		else {
		displaylabel.setText(displaylabel.getText()+"2");
		}
	}
	else if(e.getSource()==Buttonone) {
		if(IsOperatorClicked) {
			displaylabel.setText("1");
			IsOperatorClicked=false;}
		else {
		displaylabel.setText(displaylabel.getText()+"1");
		}
	}
	else if(e.getSource()==Buttonzero) {
		if(IsOperatorClicked) {
			displaylabel.setText("0");
			IsOperatorClicked=false;}
		else {
		displaylabel.setText(displaylabel.getText()+"0");
		}	
	}
	else if(e.getSource()==Buttondot) 
		
	{
		if(IsOperatorClicked) {
		displaylabel.setText(".");
		IsOperatorClicked=false;
		}
		
	else{
		displaylabel.setText(displaylabel.getText()+".");
		
		}
		
	}
	else if(e.getSource()==Buttonc) {
		displaylabel.setText("");
		}
	else if(e.getSource()==Buttonback) {
		String backspace=null;
		StringBuilder sb=new StringBuilder(displaylabel.getText());
		sb.deleteCharAt(displaylabel.getText().length()-1);
		backspace=sb.toString();
		displaylabel.setText(backspace);
	}
	else if(e.getSource()==Buttonplus) {
		operator=1;
		IsOperatorClicked=true;
		OldValuePlus=displaylabel.getText();
		floatplus=Float.parseFloat(OldValuePlus);
	} 
	else if(e.getSource()==Buttonmulti) {
		operator=3;
		IsOperatorClicked=true;
		OldValueMulti=displaylabel.getText();
		floatmulti=Float.parseFloat(OldValueMulti);
		
	}
	else if(e.getSource()==Buttonmin) {
		operator=2;
		IsOperatorClicked=true;
		OldValueMin=displaylabel.getText();
		floatmin=Float.parseFloat(OldValueMin);
		
	}
	else if(e.getSource()==Buttondiv) {
		operator=4;
		IsOperatorClicked=true;
		OldValueDiv=displaylabel.getText();
		floatdiv=Float.parseFloat(OldValueDiv);}
	
	
	else if(e.getSource()==Buttonper) {
		String per=displaylabel.getText();
		float perfloat=Float.parseFloat(per);
		float perres=perfloat/100;
		displaylabel.setText(perres+"");
	}
		
		
		
		else if(e.getSource()==Buttonplusmin) {
		String	plusmin=displaylabel.getText();
			float plusminfloat=Float.parseFloat(plusmin);
			float res=plusminfloat*=-1;
			displaylabel.setText(res+"");
			
		}
	
	
		
				
	
	
		
	else if(e.getSource()==Buttonequal) {
		NewValue=displaylabel.getText();
	float floatequal=Float.parseFloat(NewValue);
	
	switch(operator) {
	case 1:
	float Result=floatplus+floatequal;
	displaylabel.setText(Result+"");
	break;
	case 2:
		Result=floatmin-floatequal;
		displaylabel.setText(Result+"");
		break;
	case 3:
		Result=floatmulti*floatequal;
		displaylabel.setText(Result+"");
		break;
	case 4:
		Result=floatdiv/floatequal;
		displaylabel.setText(Result+"");
		break;
	default:
			System.out.println("Invalid Operation");
			break;
	
	}
}

}
}






