package examenpdf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PDF extends JFrame {

    private JPanel panel;
    private JButton boton;
    private JTextField nombre;
    private JTextField domicilio;
    private JTextField clave;
    private JTextField curp;
    private JTextField estado;
    private JTextField mun;
    private JTextField localidad;
    private JTextField emision;
    private JTextField vigencia;

    public PDF() {

        super("Credencial de lector"); //Creacion de ventana
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(90, 241, 211));
        Image icono = new ImageIcon(getClass().getResource("imagenes/credencial.jpg")).getImage();
        setIconImage(icono);
        setVisible(true);

        Ejecutar();
    }

    private void Ejecutar() {
        Paneles();
        Etiquetas();
        Datos();
    }

    private void Paneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

    }

    private void Etiquetas() {

        //ETIQUETA PARA EL TITULO       
        JLabel et = new JLabel();
        et.setText("INSERTAR DATOS");        
        et.setBounds(200, 1, 600, 100);
        et.setForeground(Color.MAGENTA);
        et.setFont(new Font("cooper black", 100, 40));
        panel.add(et);
        
        // ETIQUETA PARA EL NOMBRE
        JLabel et1 = new JLabel();
        et1.setText("Nombre Completo: ");
        et1.setBounds(60, 50, 600, 100);
        et1.setForeground(Color.BLACK);
        et1.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et1);

        //ETIQUETA PARA EL DOMICILIO
        JLabel et2 = new JLabel();
        et2.setText("Domicilio: ");
        et2.setBounds(60, 80, 600, 100);
        et2.setForeground(Color.BLACK);
        et2.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et2);

        //ETIQUETA PARA LA CLAVE DE ELECTOR
        JLabel et3 = new JLabel();
        et3.setText("Clave de elector: ");
        et3.setBounds(60, 110, 600, 100);
        et3.setForeground(Color.BLACK);
        et3.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et3);

        //ETIQUETA DE LA CURP
        JLabel et4 = new JLabel();
        et4.setText("CURP: ");
        et4.setBounds(60, 140, 600, 100);
        et4.setForeground(Color.BLACK);
        et4.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et4);

        //ETIQUETA PARA EL ESTADO
        JLabel et5 = new JLabel();
        et5.setText("Estado: ");
        et5.setBounds(60, 170, 600, 100);
        et5.setForeground(Color.BLACK);
        et5.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et5);

        //ETIQUETA PARA EL MUNICIPIO
        JLabel et6 = new JLabel();
        et6.setText("Municipio: ");
        et6.setBounds(60, 200, 600, 100);
        et6.setForeground(Color.BLACK);
        et6.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et6);

        //ETIQUETA PARA LA LOCALIDAD
        JLabel et7 = new JLabel();
        et7.setText("Localidad ");
        et7.setBounds(60, 230, 600, 100);
        et7.setForeground(Color.BLACK);
        et7.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et7);

        //ETIQUETA DE EMISION
        JLabel et8 = new JLabel();
        et8.setText("Emision: ");
        et8.setBounds(60, 260, 600, 100);
        et8.setForeground(Color.BLACK);
        et8.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et8);

        //ETIQUETA PARA LA VIGENCIA
        JLabel et9 = new JLabel();
        et9.setText("Vigencia: ");
        et9.setBounds(60, 290, 600, 100);
        et9.setForeground(Color.BLACK);
        et9.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(et9);

    }

    private void Datos() {

        //NOMBRE
        nombre = new JTextField();
        nombre.setBounds(220, 90, 500, 20);
        panel.add(nombre);
        
        //DOMICILIO
        domicilio = new JTextField();
        domicilio.setBounds(160, 120, 500, 20);
        panel.add(domicilio);
        
        //CLAVE DE ELECTOR
        clave = new JTextField();
        clave.setBounds(210, 150, 500, 20);
        panel.add(clave);
        
        //CURP
        curp = new JTextField();
        curp.setBounds(120, 180, 500, 20);
        panel.add(curp);
        
        //ESTADO
        estado = new JTextField();
        estado.setBounds(130, 210, 500, 20);
        panel.add(estado);
        
        //MUNICIPIO
        mun = new JTextField();
        mun.setBounds(150, 240, 500, 20);
        panel.add(mun);
        
        //LOCALIDAD
        localidad = new JTextField();
        localidad.setBounds(150, 270, 500, 20);
        panel.add(localidad);
        
        //EMISION
        emision = new JTextField();
        emision.setBounds(140, 300, 500, 20);
        panel.add(emision);
        
        //VIGENCIA
        vigencia = new JTextField();
        vigencia.setBounds(140, 330, 500, 20);
        panel.add(vigencia);
    }
    
    
}
