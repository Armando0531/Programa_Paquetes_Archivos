import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

import javax.swing.*;
import edu.tecjerez.topicos.figuras.dosDimensiones.*;
import edu.tecjerez.topicos.figuras.tresDimensiones.*;

class Paquetes extends JFrame implements ActionListener{

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	JComboBox<String> comboTipo = new JComboBox<String>();
	JButton area,perimetro,volumen;
	JLabel parametro1, parametro2;
	JTextField caja1, caja2,txtbArea,txtbPerimetro,txtbVolumen;

	public Paquetes() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("GUI-GridBagLayout");
		gbc.fill=GridBagConstraints.BOTH;
		setVisible(true);

		String tipos[] = {"Rombo","Circulo","Elipse","Piramide","Cono"};
		comboTipo = new JComboBox(tipos);
		inst(comboTipo, 0, 0, 4, 1, GridBagConstraints.NONE);
		comboTipo.addActionListener(this);

		parametro1 = new JLabel("Parametro 1");
		inst(parametro1, 0, 1, 2, 1, GridBagConstraints.NONE);
		caja1 = new JTextField(5);
		inst(caja1, 2, 1, 2, 1, GridBagConstraints.NONE);
		
		caja1.addKeyListener((KeyListener) new KeyAdapter() {//validacion
			public void keyPressed(KeyEvent ke) {
				String value = caja1.getText();
				int code=ke.getKeyCode();
				if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')	||	(!value.contains(".")&&ke.getKeyChar()=='.') || (code==KeyEvent.VK_BACK_SPACE)) {
					caja1.setEditable(true);
				}else{
					caja1.setEditable(false);
				}
			}
		});


		parametro2 = new JLabel("Parametro 2");
		inst(parametro2, 0, 2, 2, 1, GridBagConstraints.NONE);
		caja2 = new JTextField(5);
		inst(caja2, 2, 2, 2, 1, GridBagConstraints.NONE);
		
		caja2.addKeyListener(new KeyAdapter() {//validacion
			public void keyPressed(KeyEvent ke) {
				String value = caja2.getText();
				int code=ke.getKeyCode();
				if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')	||	(!value.contains(".")&&ke.getKeyChar()=='.') || (code==KeyEvent.VK_BACK_SPACE)) {
					caja2.setEditable(true);
				}else{
					caja2.setEditable(false);
				}
			}
		});

		inst(new JLabel("Calcular"), 4, 0, 1, 3, GridBagConstraints.NONE);

		area = new JButton("Area");
		inst(area, 5, 0, 2, 1, GridBagConstraints.NONE);
		area.addActionListener(this);

		txtbArea = new JTextField(5);
		inst(txtbArea, 7, 0, 2, 1, GridBagConstraints.NONE);

		perimetro = new JButton("Perimetro");
		inst(perimetro, 5, 1, 2, 1, GridBagConstraints.NONE);
		perimetro.addActionListener(this);

		txtbPerimetro = new JTextField(5);
		inst(txtbPerimetro, 7, 1, 2, 1, GridBagConstraints.NONE);

		volumen = new JButton("Volumen");
		inst(volumen, 5, 2, 2, 1, GridBagConstraints.NONE);
		volumen.addActionListener(this);

		txtbVolumen = new JTextField(5);
		inst(txtbVolumen, 7, 2, 2, 1, GridBagConstraints.NONE);


		pack();
	}

	public void inst(Component cmp,int gridx, int gridy, int gridwidth, int gridheight, int fill) {
		gbc.gridx=gridx;
		gbc.gridy=gridy;
		gbc.gridwidth=gridwidth;
		gbc.gridheight=gridheight;
		gbc.fill=fill;
		gbl.setConstraints(cmp, gbc);
		add(cmp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DecimalFormat df = new DecimalFormat("#.00");
		String txt="";
		double num1=0.0;
		double num2=0.0;

		if (!caja1.getText().isEmpty()) {
			num1=Double.parseDouble(caja1.getText());
		}
		if (!caja2.getText().isEmpty()) {
			num2=Double.parseDouble(caja2.getText());
		}

		if (e.getSource()==comboTipo) {
			if (comboTipo.getSelectedItem()=="Rombo") {
				parametro1.setText("Base");
				parametro2.setText("Altura");
				caja2.enable();
				perimetro.enable();
				txtbVolumen.setText("");
				volumen.disable();
			}else if (comboTipo.getSelectedItem()=="Circulo") {
				parametro1.setText("Radio");
				parametro2.setText("Parametro 2");
				caja2.disable();
				perimetro.enable();
				txtbVolumen.setText("");
				volumen.disable();
			}else if (comboTipo.getSelectedItem()=="Elipse") {
				parametro1.setText("Radio 1");
				parametro2.setText("Radio 2");
				caja2.enable();
				perimetro.enable();
				txtbVolumen.setText("");
				volumen.disable();
			}else if (comboTipo.getSelectedItem()=="Piramide") {
				parametro1.setText("Lado base");
				parametro2.setText("Altura");
				caja2.enable();
				txtbPerimetro.setText("");
				perimetro.disable();
				volumen.enable();
			}else if (comboTipo.getSelectedItem()=="Cono") {
				parametro1.setText("Radio");
				parametro2.setText("Altura");
				caja2.enable();
				txtbPerimetro.setText("");
				perimetro.disable();
				volumen.enable();
			}
		}else if (e.getSource()==area) {
			if (comboTipo.getSelectedItem()=="Rombo") {
				Rombo rmb = new Rombo(num1, num2);
				txt = df.format(rmb.obtenerArea());
			}else if (comboTipo.getSelectedItem()=="Circulo") {
				Circulo crc = new Circulo(num1);
				txt = df.format(crc.obtenerArea());
			}else if (comboTipo.getSelectedItem()=="Elipse") {
				Elipse elp = new Elipse(num1, num2);
				txt = df.format(elp.obtenerArea());
			}else if (comboTipo.getSelectedItem()=="Piramide") {
				Piramide prm = new Piramide(num1, num2);
				txt  = df.format(prm.obtenerArea());
			}else if (comboTipo.getSelectedItem()=="Cono") {
				Cono cn = new Cono(num1, num2);
				txt  = df.format(cn.obtenerArea());
			}
			txtbArea.setText(txt);

		}else if (e.getSource()==perimetro) {
			if (comboTipo.getSelectedItem()=="Rombo") {
				Rombo rmb = new Rombo(num1, num2);
				txt = df.format(rmb.obtenerPerimetro());
			}else if (comboTipo.getSelectedItem()=="Circulo") {
				Circulo crc = new Circulo(num1);
				txt = df.format(crc.obtenerPerimetro());
			}else if (comboTipo.getSelectedItem()=="Elipse") {
				Elipse elp = new Elipse(num1, num2);
				txt = df.format(elp.obtenerPerimetro());
			}
			txtbPerimetro.setText(txt);
		}else if (e.getSource()==volumen) {
			if (comboTipo.getSelectedItem()=="Piramide") {
				Piramide prm = new Piramide(num1, num2);
				txt  = df.format(prm.obtenerVolumen());
			}else if (comboTipo.getSelectedItem()=="Cono") {
				Cono cn = new Cono(num1, num2);
				txt  = df.format(cn.obtenerVolumen());
			}
			txtbVolumen.setText(txt);
		}// if else


	}

	

}


public class PruebaPaquetes {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Paquetes();
			}
		});

	}

}
