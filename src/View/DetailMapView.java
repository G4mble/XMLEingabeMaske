package View;

import Controller.DetailMapController;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class DetailMapView extends JFrame
{
    private JTextField txtfName;
    private JTextArea txtrConsole, txtrPositionen;
    private JSpinner spinnerPosCount;

    public DetailMapView(DetailMapController paramDetailMapController)
    {
/**Spinner*/

        spinnerPosCount = new JSpinner();
        spinnerPosCount.setBounds(238, 28, 36, 20);
        getContentPane().add(spinnerPosCount);

/**Textfield*/

        txtfName = new JTextField();
        txtfName.setBounds(78, 31, 86, 20);
        txtfName.requestFocusInWindow();
        txtfName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtfName);

/**Textarea*/

        txtrPositionen = new JTextArea();
        txtrPositionen.setBounds(194, 86, 80, 182);
        txtrPositionen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtrPositionen);

        txtrConsole = new JTextArea();
        txtrConsole.setBounds(10, 86, 154, 182);
        txtrConsole.setEditable(false);
        txtrConsole.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        getContentPane().add(txtrConsole);

/**Button*/

        JButton btnAdd = new JButton("add");
        btnAdd.setBounds(194, 288, 58, 23);
        btnAdd.addActionListener(paramDetailMapController);
        btnAdd.setActionCommand("add");
        getContentPane().add(btnAdd);

        JButton btnReset = new JButton("reset");
        btnReset.setBounds(100, 288, 64, 23);
        btnReset.addActionListener(paramDetailMapController);
        btnReset.setActionCommand("reset");
        getContentPane().add(btnReset);

        JButton btnBack = new JButton("back");
        btnBack.setBounds(10, 288, 64, 23);
        btnBack.addActionListener(paramDetailMapController);
        btnBack.setActionCommand("back");
        getContentPane().add(btnBack);

/**Label*/

        JLabel lblKonsole = new JLabel("Konsole:");
        lblKonsole.setBounds(10, 62, 58, 14);
        getContentPane().add(lblKonsole);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(10, 31, 58, 14);
        getContentPane().add(lblName);

        JLabel lblPositionen = new JLabel("Positionen");
        lblPositionen.setBounds(194, 11, 70, 14);
        getContentPane().add(lblPositionen);

        JLabel lblDetail = new JLabel("detail_%");
        lblDetail.setBounds(78, 11, 64, 14);
        getContentPane().add(lblDetail);

        JLabel lblAnz = new JLabel("Anz.:");
        lblAnz.setBounds(194, 31, 46, 14);
        getContentPane().add(lblAnz);

        JLabel lblXy = new JLabel("X,Y;\\n");
        lblXy.setBounds(210, 56, 42, 16);
        getContentPane().add(lblXy);

/**Properties*/

        this.setTitle("DetailMap_template");
        this.setSize(new Dimension(292, 350));
        this.getContentPane().setLayout(null);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public JTextField getTxtfName()
    {
        return this.txtfName;
    }

    public JTextArea getTxtrConsole()
    {
        return this.txtrConsole;
    }

    public JTextArea getTxtrPositionen()
    {
        return this.txtrPositionen;
    }

    public JSpinner getSpinnerPosCount()
    {
        return this.spinnerPosCount;
    }
}
