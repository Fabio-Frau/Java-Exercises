import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScacchiGUI extends JFrame {
    private JButton[][] scacchiera = new JButton[8][8];
    private JButton pezzoSelezionato = null;

    public ScacchiGUI() {
        setTitle("Scacchi");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();

                if (pezzoSelezionato == null) {
                    pezzoSelezionato = button;
                } else {
                    // Sposta il pezzo
                    button.setIcon(pezzoSelezionato.getIcon());
                    pezzoSelezionato.setIcon(null);
                    pezzoSelezionato = null;
                }
            }
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                scacchiera[i][j] = new JButton();
                scacchiera[i][j].setOpaque(true);
                scacchiera[i][j].setFocusPainted(false);
                scacchiera[i][j].addActionListener(listener);

                if ((i + j) % 2 == 0) {
                    scacchiera[i][j].setBackground(Color.WHITE);
                } else {
                    scacchiera[i][j].setBackground(Color.BLACK);
                }

                add(scacchiera[i][j]);
            }
        }

        // Imposta le immagini per le pedine (immagini non fornite in questo esempio)
        // Esempio: scacchiera[0][0].setIcon(new ImageIcon("torre.png"));
        // ...

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScacchiGUI();
            }
        });
    }
}
