
package cat.institutmvm.applicacio.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import cat.institutmvm.applicacio.entities.Especies;

import static java.lang.Integer.*;

/**
 * Class formulario
 */
public class Formulario extends JFrame{
    private JPanel panelF;
    private JTextField habitat;
    private JTextField nubosidad;
    private JTextField viento;
    private JTextField direcion;
    private JTextField hora;
    private JTextField embarcaciones;
    private JTextField temp;
    private JTextField cebo;
    private JTextField sexo;
    private JTextField parasitos;
    private JTextField presenciaA;
    private JTextField numerosA;
    private JRadioButton si;
    private JRadioButton no;
    private JLabel especieLabel;
    private JTextField name;
    private JLabel profundidadLabel;
    private JTextField profundidad;
    private JLabel habitatLabel;
    private JLabel proSharksLabel;
    private JLabel tiempoDeNavigacionLabel;
    private JTextField tiempoDeNavegacion;
    private JLabel nubosidadLabel;
    private JLabel fuerzaDelVientoLabel;
    private JLabel direccionDelVientoLabel;
    private JLabel horaDeLlegadaALabel;
    private JLabel numeroDeEmbarcacionesLabel;
    private JLabel tempraturaSuperficialLabel;
    private JLabel tipoDeCeboLabel;
    private JLabel sexoLabel;
    private JLabel parásitosLabel;
    private JLabel presenciaDeAnzuelosLabel;
    private JLabel numerosDeAnzuelosLabel;
    private JButton buttonOk;
    private ArrayList<Especies> especie;

    /**
     * constructor
     */
    public Formulario(){
        super("Observaciones del Mar");
        this.setContentPane(this.panelF);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        especie = new ArrayList<Especies>();

        ActionListener alnew = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Especies es = new Especies(
                      name.getText(),
                      habitat.getText(),
                      sexo.getText(),
                      profundidad.getText(),
                      tiempoDeNavegacion.getText(),
                      nubosidad.getText(),
                      viento.getText(),
                      direcion.getText(),
                      hora.getText(),
                      embarcaciones.getText(),
                      temp.getText(),
                      cebo.getText(),
                      presenciaA.getText(),
                      numerosA.getText(),
                      parasitos.getText(),
                      proSharksLabel.getText()
              );
              especie.add(es);
            }
        };
        buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonOkClick(e);
            }
        });
    }

    /**
     * action of the button
     * @param e
     */
    public void buttonOkClick(ActionEvent e){
        Especies es = new Especies(
                name.getText(),
                habitat.getText(),
                sexo.getText(),
                profundidad.getText(),
                tiempoDeNavegacion.getText(),
                nubosidad.getText(),
                viento.getText(),
                direcion.getText(),
                hora.getText(),
                embarcaciones.getText(),
                temp.getText(),
                cebo.getText(),
                presenciaA.getText(),
                numerosA.getText(),
                parasitos.getText(),
                proSharksLabel.getText()
        );
        especie.add(es);
    }

    /**
     * add all the information introduced
     * @param e
     */
    public void addEspecies(Especies e){

        especie.add(e);

    }

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.setVisible(true);
    }

}

