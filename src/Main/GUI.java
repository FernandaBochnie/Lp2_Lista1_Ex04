

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    private Container cp;
    
    private JPanel pnNorte = new JPanel();
    private JPanel pnCentro = new JPanel();
    private JPanel pnSul = new JPanel();
    
    private JLabel lbIdade = new JLabel("Idade");
    
    private JTextField tfIdadePessoa = new JTextField();
    
    private JLabel lbResultado = new JLabel();
    private JButton btVerificar = new JButton("Verificar");
    
    public GUI() {
        setSize(200, 150);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("GUI");
        
        cp.add(pnNorte, BorderLayout.NORTH);
        cp.add(pnCentro, BorderLayout.CENTER);
        cp.add(pnSul, BorderLayout.SOUTH);
        
        pnNorte.setLayout(new GridLayout(2,1));
        
        pnNorte.add(lbIdade);
        pnNorte.add(tfIdadePessoa);
        
        pnCentro.add(btVerificar);
        
        pnSul.add(lbResultado);
        
        btVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Entidade entidade = new Entidade();
                
                entidade.setIdade(Integer.valueOf(tfIdadePessoa.getText()));
                
                lbResultado.setText(String.valueOf(entidade.getResultado()));
            }
        });
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
