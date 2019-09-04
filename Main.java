import javax.swing.*;  
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.lang.*;
public class Main implements ActionListener{  
	JLabel l1,l2,l3;   
	JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;  
	Main(String st, String st2) {  
		JFrame fr= new JFrame();  
		l1=new JLabel();  
		l1.setBounds(50,25,100,30);
		l2=new JLabel();  
		l2.setBounds(160,25,100,30); 
		l3=new JLabel();  
		l3.setBounds(250,25,100,30);  

		a=new JButton("A");  
		a.setBounds(50,300,45,30);  
		a.addActionListener(this);

		b=new JButton("B");
		b.setBounds(100,300,45,30);  
		b.addActionListener(this);

		c=new JButton("C");  
		c.setBounds(150,300,45,30);  
		c.addActionListener(this);

		d=new JButton("D");  
		d.setBounds(200,300,45,30);  
		d.addActionListener(this);

		e=new JButton("E");  
		e.setBounds(250,300,45,30);  
		e.addActionListener(this);

		f=new JButton("F");  
		f.setBounds(300,300,45,30);  
		f.addActionListener(this);

		g=new JButton("G");
		g.setBounds(350,300,45,30);  
		g.addActionListener(this);

		h=new JButton("H");  
		h.setBounds(400,300,45,30);  
		h.addActionListener(this);

		i=new JButton("I");  
		i.setBounds(450,300,45,30);  
		i.addActionListener(this);

		j=new JButton("J");  
		j.setBounds(500,300,45,30);  
		j.addActionListener(this);

		k=new JButton("K");  
		k.setBounds(550,300,45,30);  
		k.addActionListener(this);

		l=new JButton("L");
		l.setBounds(600,300,45,30);  
		l.addActionListener(this);

		m=new JButton("M");  
		m.setBounds(650,300,45,30);  
		m.addActionListener(this);

		n=new JButton("N");  
		n.setBounds(700,300,45,30);  
		n.addActionListener(this);

		o=new JButton("O");  
		o.setBounds(750,300,45,30);  
		o.addActionListener(this);

		p=new JButton("P");  
		p.setBounds(800,300,45,30);  
		p.addActionListener(this);

		q=new JButton("Q");
		q.setBounds(850,300,45,30);  
		q.addActionListener(this);

		r=new JButton("R");  
		r.setBounds(900,300,45,30);  
		r.addActionListener(this);

		s=new JButton("S");  
		s.setBounds(950,300,45,30);  
		s.addActionListener(this);

		t=new JButton("T");  
		t.setBounds(1000,300,45,30);  
		t.addActionListener(this);

		u=new JButton("U");  
		u.setBounds(1050,300,45,30);  
		u.addActionListener(this);

		v=new JButton("V");
		v.setBounds(1100,300,45,30);  
		v.addActionListener(this);

		w=new JButton("W");  
		w.setBounds(1150,300,46,30);  
		w.addActionListener(this);

		x=new JButton("X");  
		x.setBounds(1200,300,45,30);  
		x.addActionListener(this);

		y=new JButton("Y");  
		y.setBounds(1250,300,45,30);  
		y.addActionListener(this);

		z=new JButton("Z");  
		z.setBounds(1300,300,45,30);  
		z.addActionListener(this);

		fr.add(l1);fr.add(l2);fr.add(l3);
		fr.add(a);fr.add(b);fr.add(c);fr.add(d);fr.add(e);fr.add(f);fr.add(g);fr.add(h);fr.add(i);fr.add(j);fr.add(k);fr.add(l);fr.add(m);
		fr.add(n);fr.add(o);fr.add(p);fr.add(q);fr.add(r);fr.add(s);fr.add(t);fr.add(u);fr.add(v);fr.add(w);fr.add(x);fr.add(y);fr.add(z);
		fr.setSize(450,450);  
		fr.setLayout(null);  
		fr.setVisible(true);
		l1.setText(st);
		l3.setText(st2);
	}  
	public void actionPerformed(ActionEvent e){ 
		String word="";
		if(e.getSource()==a){ 
			word =l1.getText();
			charcheck(word,'a');
		}
		else
			if(e.getSource()==b){ 
				word =l1.getText();
				charcheck(word,'b');
			}
			else
				if(e.getSource()==c){ 
					word =l1.getText();
					charcheck(word,'c');
				}
				else
					if(e.getSource()==d){ 
						word =l1.getText();
						charcheck(word,'d');
					}
					else
						if(e.getSource()==e){ 
							word =l1.getText();
							charcheck(word,'e');
						}
						else
							if(e.getSource()==f){ 
								word =l1.getText();
								charcheck(word,'f');
							}
							else
								if(e.getSource()==g){ 
									word =l1.getText();
									charcheck(word,'g');
								}
								else
									if(e.getSource()==h){ 
										word =l1.getText();
										charcheck(word,'h');
									}
									else
										if(e.getSource()==i){ 
											word =l1.getText();
											charcheck(word,'i');
										}
										else
											if(e.getSource()==j){ 
												word =l1.getText();
												charcheck(word,'j');
											}
											else
												if(e.getSource()==k){ 
													word =l1.getText();
													charcheck(word,'k');
												}
												else
													if(e.getSource()==l){ 
														word =l1.getText();
														charcheck(word,'l');
													}
													else
														if(e.getSource()==m){ 
															word =l1.getText();
															charcheck(word,'m');
														}
														else
															if(e.getSource()==n){ 
																word =l1.getText();
																charcheck(word,'n');
															}
															else
																if(e.getSource()==o){ 
																	word =l1.getText();
																	charcheck(word,'o');
																}
																else
																	if(e.getSource()==p){ 
																		word =l1.getText();
																		charcheck(word,'p');
																	}
																	else
																		if(e.getSource()==q){ 
																			word =l1.getText();
																			charcheck(word,'q');
																		}
																		else
																			if(e.getSource()==r){ 
																				word =l1.getText();
																				charcheck(word,'r');
																			}
																			else
																				if(e.getSource()==s){ 
																					word =l1.getText();
																					charcheck(word,'s');
																				}
																				else
																					if(e.getSource()==t){ 
																						word =l1.getText();
																						charcheck(word,'t');
																					}
																					else
																						if(e.getSource()==u){ 
																							word =l1.getText();
																							charcheck(word,'u');
																						}
																						else
																							if(e.getSource()==v){ 
																								word =l1.getText();
																								charcheck(word,'v');;
																							}
																							else
																								if(e.getSource()==w){ 
																									word =l1.getText();
																									charcheck(word,'w');
																								}
																								else
																									if(e.getSource()==x){ 
																										word =l1.getText();
																										charcheck(word,'x');
																									}
																									else
																										if(e.getSource()==y){ 
																											word =l1.getText();
																											charcheck(word,'y');
																										}
																										else
																											if(e.getSource()==z){ 
																												word =l1.getText();
																												charcheck(word,'z');
																											}

	}  
	private void charcheck(String d2, char ch) {
		// TODO Auto-generated method stub
		int ij;
		boolean c=false;
		for(ij=0;ij<=d2.length()-1;ij++)
			if(d2.charAt(ij)==ch)
			{
				c=true;
			}
		if(c==true)
		{
			l2.setText("present" +d2);
		}
		else
		{
			l2.setText("not present" +d2);
		}
	}
	public static void main(String[] args) {
		String text="",text2="",text1="";
		int randno;
		Random rand =new Random();
		randno=rand.nextInt(9);
		try {
			text = Files.readAllLines(Paths.get("src/a.txt")).get(randno);
			text1=text;
			text2=blankgen(text1);
		} catch (IOException er) {
			er.printStackTrace();
		}
		new Main(text,text2);
	}
	private static String blankgen(String text2) {
		int i;
		StringBuilder sb=new StringBuilder(text2);
		char[] t2= text2.toCharArray();
		for(i=0;i<=text2.length()-1;i=i+2)
			t2[i]='-';
		String c=String.valueOf(t2);
		return c;
		// TODO Auto-generated method stub
		
	}  
}  