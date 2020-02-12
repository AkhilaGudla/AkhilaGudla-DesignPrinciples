package com.epam.Akhila_DesignPrinciples;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_DesignPrinciples {
	double firstnum,secondnum,result;
	String operations,answer;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_DesignPrinciples window = new Calculator_DesignPrinciples();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator_DesignPrinciples() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 277, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 241, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnplusminus = new JButton("+-");
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(textField.getText());
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplusminus.setBounds(10, 309, 60, 60);
		frame.getContentPane().add(btnplusminus);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(70, 309, 60, 60);
		frame.getContentPane().add(btn0);
		
		final JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+ btndot.getText();
				textField.setText(num);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(130, 309, 60, 60);
		frame.getContentPane().add(btndot);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				   secondnum=Double.parseDouble(textField.getText());
				   if(operations=="+")
				   {
					   result=firstnum+secondnum;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				   }
				   else if(operations=="-")
				   {
					   result=firstnum-secondnum;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				   }
				   else if(operations=="*")
				   {
					   result=firstnum*secondnum;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				   }
				   else if(operations=="/")
				   {
					   result=firstnum/secondnum;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				   }
				   else if(operations=="%")
				   {
					   result=firstnum%secondnum;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				   }
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(190, 309, 60, 60);
		frame.getContentPane().add(btnequal);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+ btn1.getText();
				textField.setText(num);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 249, 60, 60);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+ btn2.getText();
				textField.setText(num);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(70, 249, 60, 60);
		frame.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String num=textField.getText()+ btn3.getText();
			textField.setText(num);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(130, 249, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBounds(190, 249, 60, 60);
		frame.getContentPane().add(btndiv);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+ btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 189, 60, 60);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn5.getText();
				textField.setText(num);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(70, 189, 60, 60);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+ btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(130, 189, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBounds(190, 189, 60, 60);
		frame.getContentPane().add(btnmul);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+ btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 129, 60, 60);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String num=textField.getText()+ btn8.getText();
			textField.setText(num);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(70, 129, 60, 60);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+ btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(130, 129, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBounds(190, 129, 60, 60);
		frame.getContentPane().add(btnminus);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclear.setBounds(10, 69, 60, 60);
		frame.getContentPane().add(btnclear);
		
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String bks=null;
				 if(textField.getText().length()>0)
				 {
					 StringBuilder strB=new StringBuilder(textField.getText());
					 strB.deleteCharAt(textField.getText().length()-1);
					 bks=strB.toString();
					 textField.setText(bks);
				 }
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackSpace.setBounds(70, 69, 60, 60);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnpercentile = new JButton("%");
		btnpercentile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btnpercentile.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpercentile.setBounds(130, 69, 60, 60);
		frame.getContentPane().add(btnpercentile);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(190, 69, 60, 60);
		frame.getContentPane().add(btnplus);
	}
}
