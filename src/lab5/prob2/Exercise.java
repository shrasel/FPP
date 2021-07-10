package lab5.prob2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 * 
 * @author Md Shahjahan Rasel
 * @ID 612395
 * 
 *     <p>
 *     This class will show the input and output functionality using event
 *     listener
 *     </p>
 */
public class Exercise extends JFrame {

	/**
	 * Serial Version ID added
	 */
	private static final long serialVersionUID = 1L;
	private JPanel cPane;
	private JTextField txtInput;
	private JTextField txtOutput;

	public static void main(String[] args) {

		try {
			Exercise frame = new Exercise();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Here create the frame using constructor
	 */
	public Exercise() {

		setResizable(false);
		setTitle("Swing Utility");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		cPane = new JPanel();
		cPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cPane);
		cPane.setLayout(null);

		JButton btnCountLetters = new JButton("Count Letters");
		btnCountLetters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtVal = txtInput.getText();
				int count = txtVal.length();
				txtOutput.setText("Count of Input:" + count);
			}
		});
		btnCountLetters.setBounds(32, 41, 150, 32);
		cPane.add(btnCountLetters);

		JButton btnReveredLetters = new JButton("Revered Letters");

		btnReveredLetters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String txtVal = txtInput.getText();
				StringBuilder sb = new StringBuilder(txtVal);
				txtOutput.setText(sb.reverse().toString());

			}
		});
		btnReveredLetters.setBounds(32, 114, 150, 32);
		cPane.add(btnReveredLetters);

		JButton btnRemoveDuplicates = new JButton("Remove Duplicates");
		btnRemoveDuplicates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * remove duplicates here
				 */
				String txt = txtInput.getText();
				if (txt != null) {
					String sb = new String();
					for (int i = 0; i < txt.length(); i++)
						if (!sb.contains(txt.charAt(i) + ""))
							sb += txt.charAt(i);

					txtOutput.setText(sb);
				}
			}
		});

		btnRemoveDuplicates.setBounds(32, 187, 150, 32);
		cPane.add(btnRemoveDuplicates);

		txtInput = new JTextField();
		txtInput.setBounds(244, 99, 158, 32);
		cPane.add(txtInput);
		txtInput.setColumns(10);

		txtOutput = new JTextField();
		txtOutput.setColumns(10);
		txtOutput.setBounds(244, 168, 158, 32);
		cPane.add(txtOutput);

		JLabel labelInput = new JLabel("Input");
		labelInput.setBounds(244, 70, 46, 14);
		cPane.add(labelInput);

		JLabel labelOutput = new JLabel("Output");
		labelOutput.setBounds(244, 142, 46, 14);
		cPane.add(labelOutput);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInput.setText("");
				txtOutput.setText("");
			}
		});

		btnClear.setBounds(323, 35, 79, 23);
		cPane.add(btnClear);
	}
}