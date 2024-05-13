import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class ScreenPratica {

    public ScreenPratica(){
        JFrame ScreenPratica = new JFrame("Área de treinamento");
        ScreenPratica.setSize(500,500);
        ScreenPratica.setLocationRelativeTo(null);


        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS)); // Alterado para BoxLayout.Y_AXIS
        panelMain.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10));
        ScreenPratica.add(panelMain);

        JLabel titleLabel = new JLabel("PRATICAR CONHECIMENTOS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panelMain.add(titleLabel);

        JLabel createdbText = new JLabel();
        createdbText.setText("CRIE UM DATABASE");
        createdbText.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centraliza o JLabel horizontalmente
        panelMain.add(createdbText);

        JTextField createdbField = new JTextField();
        createdbField.setPreferredSize(new Dimension(100, 30));
        createdbField.setAlignmentX(JTextField.CENTER_ALIGNMENT); // Centraliza o JTextField horizontalmente
        panelMain.add(createdbField);

        JButton enviarCreate = new JButton();
        enviarCreate.setText("Enviar");
        enviarCreate.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        panelMain.add(enviarCreate);

        JLabel createtbText = new JLabel();
        createtbText.setText("CRIE UMA TABELA");
        createtbText.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centraliza o JLabel horizontalmente
        panelMain.add(createtbText);

        JTextField createtbField = new JTextField();
        createtbField.setPreferredSize(new Dimension(100, 30));
        createtbField.setAlignmentX(JTextField.CENTER_ALIGNMENT); // Centraliza o JTextField horizontalmente
        panelMain.add(createtbField);

        JButton enviarCreatetb = new JButton();
        enviarCreatetb.setText("Enviar");
        enviarCreatetb.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        panelMain.add(enviarCreatetb);

        JLabel mostrartbText = new JLabel();
        mostrartbText.setText("MOSTRE A TABELA QUE CRIOU");
        mostrartbText.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Centraliza o JLabel horizontalmente
        panelMain.add(mostrartbText);

        JTextField mostrartbField = new JTextField();
        mostrartbField.setPreferredSize(new Dimension(100, 30));
        mostrartbField.setAlignmentX(JTextField.CENTER_ALIGNMENT); // Centraliza o JTextField horizontalmente
        panelMain.add(mostrartbField);

        JButton enviarMostrar = new JButton();
        enviarMostrar.setText("Enviar");
        enviarMostrar.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        panelMain.add(enviarMostrar);

        ScreenPratica.setVisible(true);
    }

    public static void main(String[] args) {
        new ScreenPratica();
    }
}
