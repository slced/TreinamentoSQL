import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ScreenMain {

    public ScreenMain() {
        JFrame screenMain = new JFrame("Treinamento de SQL");
        screenMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screenMain.setLocationRelativeTo(null);
        screenMain.setSize(800, 600);


        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Criação do contentPanel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        JLabel titletraining = new JLabel();
        titletraining.setText("COMANDOS SQL");
        titletraining.setFont(new Font("Arial", Font.BOLD, 60));
        titletraining.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPanel.add(titletraining);

        // Adicionando JEditorPane para exibir HTML
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false); // Não permitir edição
        editorPane.setContentType("text/html"); // Definir tipo de conteúdo como HTML
        editorPane.setPreferredSize(new Dimension(600, 9000)); // Definir tamanho preferido
        contentPanel.add(editorPane);

        // Carregar conteúdo HTML
        try {
            editorPane.setPage(getClass().getResource("comandossql.html")); // Substitua "comandos_sql.html" pelo nome do seu arquivo HTML
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Adicionando o contentPanel a um JScrollPane
        JScrollPane scrollPane = new JScrollPane();
        JViewport viewport = new JViewport();
        viewport.setView(contentPanel);
        scrollPane.setViewport(viewport);
        panelMain.add(scrollPane);

        JButton buttonTreining = new JButton();
        buttonTreining.setText("Praticar");
        panelMain.add(buttonTreining);

        buttonTreining.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ScreenPratica();
            }
        });


        screenMain.add(panelMain);
        screenMain.setVisible(true);
    }
}
