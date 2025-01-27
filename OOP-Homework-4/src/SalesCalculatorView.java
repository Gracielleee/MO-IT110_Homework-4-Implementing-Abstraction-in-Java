import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalesCalculatorView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTotalProdSales;
	private JTextField textProdName;
	private JTextField textProdQty;
	private JTextField textProdPrice;
	private JTextField textServName;
	private JTextField textServPrice;
	private JTextField textServNumHours;
	private JTextField textTotalServSales;
	private JTextField textTotalSales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesCalculatorView frame = new SalesCalculatorView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SalesCalculatorView() {
		double totalSales = 0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 940, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textTotalProdSales = new JTextField();
		textTotalProdSales.setEditable(false);
		textTotalProdSales.setBounds(224, 411, 197, 43);
		contentPane.add(textTotalProdSales);
		textTotalProdSales.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 176, 378, 247);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {30, 30, 80, 30, 0, 0};
		gbl_panel.rowHeights = new int[] {10, 40, 30, 40, 30, 40, 30, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Product Name:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textProdName = new JTextField();
		textProdName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textProdName = new GridBagConstraints();
		gbc_textProdName.fill = GridBagConstraints.BOTH;
		gbc_textProdName.insets = new Insets(0, 0, 5, 0);
		gbc_textProdName.gridx = 4;
		gbc_textProdName.gridy = 1;
		panel.add(textProdName, gbc_textProdName);
		textProdName.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price:");
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.anchor = GridBagConstraints.EAST;
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 2;
		gbc_lblPrice.gridy = 3;
		panel.add(lblPrice, gbc_lblPrice);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textProdPrice = new JTextField();
		textProdPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textProdPrice = new GridBagConstraints();
		gbc_textProdPrice.insets = new Insets(0, 0, 5, 0);
		gbc_textProdPrice.fill = GridBagConstraints.BOTH;
		gbc_textProdPrice.gridx = 4;
		gbc_textProdPrice.gridy = 3;
		panel.add(textProdPrice, gbc_textProdPrice);
		textProdPrice.setColumns(10);
		
		JLabel lblQuantitySold = new JLabel("Quantity Sold:");
		GridBagConstraints gbc_lblQuantitySold = new GridBagConstraints();
		gbc_lblQuantitySold.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuantitySold.gridx = 2;
		gbc_lblQuantitySold.gridy = 5;
		panel.add(lblQuantitySold, gbc_lblQuantitySold);
		lblQuantitySold.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textProdQty = new JTextField();
		textProdQty.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_textProdQty = new GridBagConstraints();
		gbc_textProdQty.insets = new Insets(0, 0, 5, 0);
		gbc_textProdQty.fill = GridBagConstraints.BOTH;
		gbc_textProdQty.gridx = 4;
		gbc_textProdQty.gridy = 5;
		panel.add(textProdQty, gbc_textProdQty);
		textProdQty.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(484, 156, 387, 247);
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[] {30, 40, 30, 40, 30, 40, 30, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblServiceName = new JLabel("Service Name:");
		lblServiceName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblServiceName = new GridBagConstraints();
		gbc_lblServiceName.insets = new Insets(0, 0, 5, 5);
		gbc_lblServiceName.gridx = 2;
		gbc_lblServiceName.gridy = 1;
		panel_1.add(lblServiceName, gbc_lblServiceName);
		
		textServName = new JTextField();
		textServName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textServName.setColumns(10);
		GridBagConstraints gbc_textServName = new GridBagConstraints();
		gbc_textServName.fill = GridBagConstraints.BOTH;
		gbc_textServName.insets = new Insets(0, 0, 5, 0);
		gbc_textServName.gridx = 4;
		gbc_textServName.gridy = 1;
		panel_1.add(textServName, gbc_textServName);
		
		JLabel lblPricePerHour = new JLabel("Price per hour:");
		lblPricePerHour.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblPricePerHour = new GridBagConstraints();
		gbc_lblPricePerHour.anchor = GridBagConstraints.EAST;
		gbc_lblPricePerHour.insets = new Insets(0, 0, 5, 5);
		gbc_lblPricePerHour.gridx = 2;
		gbc_lblPricePerHour.gridy = 3;
		panel_1.add(lblPricePerHour, gbc_lblPricePerHour);
		
		textServPrice = new JTextField();
		textServPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textServPrice.setColumns(10);
		GridBagConstraints gbc_textServPrice = new GridBagConstraints();
		gbc_textServPrice.fill = GridBagConstraints.BOTH;
		gbc_textServPrice.insets = new Insets(0, 0, 5, 0);
		gbc_textServPrice.gridx = 4;
		gbc_textServPrice.gridy = 3;
		panel_1.add(textServPrice, gbc_textServPrice);
		
		JLabel lblNumberOfHours = new JLabel("Number of Hours:");
		lblNumberOfHours.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNumberOfHours = new GridBagConstraints();
		gbc_lblNumberOfHours.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumberOfHours.gridx = 2;
		gbc_lblNumberOfHours.gridy = 5;
		panel_1.add(lblNumberOfHours, gbc_lblNumberOfHours);
		
		textServNumHours = new JTextField();
		textServNumHours.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textServNumHours.setColumns(10);
		GridBagConstraints gbc_textServNumHours = new GridBagConstraints();
		gbc_textServNumHours.fill = GridBagConstraints.BOTH;
		gbc_textServNumHours.insets = new Insets(0, 0, 5, 0);
		gbc_textServNumHours.gridx = 4;
		gbc_textServNumHours.gridy = 5;
		panel_1.add(textServNumHours, gbc_textServNumHours);
		
		JLabel lblNewLabel_1 = new JLabel("Enter PRODUCT details:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(43, 105, 307, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter SERVICE details:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(484, 105, 307, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblTotalSales = new JLabel("TOTAL PRODUCT SALES:");
		lblTotalSales.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalSales.setBounds(43, 426, 155, 16);
		contentPane.add(lblTotalSales);
		
		JLabel lblTotalSales_1 = new JLabel("TOTAL SERVICE SALES:");
		lblTotalSales_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalSales_1.setBounds(502, 426, 146, 16);
		contentPane.add(lblTotalSales_1);
		
		textTotalServSales = new JTextField();
		textTotalServSales.setEditable(false);
		textTotalServSales.setColumns(10);
		textTotalServSales.setBounds(674, 411, 197, 43);
		contentPane.add(textTotalServSales);
		
		JButton btnCalculate = new JButton("Calculate !");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String prodName = getTextProdName().toString();
					double prodPrice = Double.parseDouble(getTextProdPrice().getText());
					double prodQty = Double.parseDouble(getTextProdQty().getText());
					
					String servName = getTextServName().getText();
					double servPrice = Double.parseDouble(getTextServPrice().getText());
					double servNumHours = Double.parseDouble(getTextServNumHours().getText());
					
					Product myProduct = new Product(prodName, prodPrice, prodQty);
					Service myService = new Service(servName, servPrice, servNumHours);
					
					double totalProdSales = myProduct.calculateTotalSale();
					double totalServSales = myService.calculateTotalSale();
					
					JTextField fieldTotalProdSales = getTextTotalProdSales();
					JTextField fieldTotalServSales = getTextTotalServSales();
					JTextField fieldTotalSales = getTextTotalSales();
			
					fieldTotalProdSales.setText(totalProdSales + "");
					fieldTotalServSales.setText(totalServSales + "");
					fieldTotalSales.setText((totalProdSales + totalServSales) + "");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid input. Try again.");
					System.out.println("Invalid input.");
				}
				
			}
		});
		btnCalculate.setFont(new Font("Stencil", Font.PLAIN, 14));
		btnCalculate.setBounds(319, 506, 276, 57);
		contentPane.add(btnCalculate);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 82, 874, 12);
		contentPane.add(separator);
		
		JLabel lblYourTotalSales = new JLabel("Your Total Sales for the day is:");
		lblYourTotalSales.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblYourTotalSales.setBounds(224, 606, 276, 24);
		contentPane.add(lblYourTotalSales);
		
		JLabel lblNewLabel_2 = new JLabel("SALES CALCULATOR");
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(319, 24, 418, 47);
		contentPane.add(lblNewLabel_2);
		
		textTotalSales = new JTextField();
		textTotalSales.setFont(new Font("Tahoma", Font.BOLD, 16));
		textTotalSales.setEditable(false);
		textTotalSales.setBounds(486, 599, 179, 37);
		contentPane.add(textTotalSales);
		textTotalSales.setColumns(10);
	}

	
	private JTextField getTextTotalProdSales() {
		return textTotalProdSales;
	}

	private void setTextTotalProdSales(JTextField textTotalProdSales) {
		this.textTotalProdSales = textTotalProdSales;
	}

	private JTextField getTextProdName() {
		return textProdName;
	}

	private void setTextProdName(JTextField textProdName) {
		this.textProdName = textProdName;
	}

	private JTextField getTextProdQty() {
		return textProdQty;
	}

	private void setTextProdQty(JTextField textProdQty) {
		this.textProdQty = textProdQty;
	}

	private JTextField getTextProdPrice() {
		return textProdPrice;
	}

	private void setTextProdPrice(JTextField textProdPrice) {
		this.textProdPrice = textProdPrice;
	}

	private JTextField getTextServName() {
		return textServName;
	}

	private void setTextServName(JTextField textServName) {
		this.textServName = textServName;
	}

	private JTextField getTextServPrice() {
		return textServPrice;
	}

	private void setTextServPrice(JTextField textServPrice) {
		this.textServPrice = textServPrice;
	}

	private JTextField getTextServNumHours() {
		return textServNumHours;
	}

	private void setTextServNumHours(JTextField textServNumHours) {
		this.textServNumHours = textServNumHours;
	}

	private JTextField getTextTotalServSales() {
		return textTotalServSales;
	}

	private void setTextTotalServSales(JTextField textTotalServSales) {
		this.textTotalServSales = textTotalServSales;
	}

	private JTextField getTextTotalSales() {
		return textTotalSales;
	}

	private void setTotalSales(JTextField textTotalSales) {
		this.textTotalSales = textTotalSales;
	}
}
