package Lab6_JesúsMeraz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Principal extends javax.swing.JFrame {

    private int sec = 0;
    private int seg;
    // funcion del hilo
    Thread Barrita = new Thread() {
        public void run() {
            try {
                for (sec = 0; sec < CL.size();) {
                    barrita.setValue(sec);
                    tiempo.sleep(50);
                }
            } catch (Exception e) {
            }
        }
    };
    Thread tiempo = new Thread() {
        public void run() {
            try {
                for (seg = 0; seg < 20; seg++) {
                    barrita.setValue(seg);
                    tiempo.sleep(10);
                    if (seg == 60) {
                        JOptionPane.showMessageDialog(null, "Recuerde que tiene que crear una nueva ClaudiList si quiere ver avanzar la barrita");
                    }
                }
            } catch (Exception e) {
            }
        }
    };

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClaudiList_crear = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jc_Seres = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Crear_programa = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        puntuacion = new javax.swing.JSpinner();
        Años = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox<>();
        Genero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Modificar = new javax.swing.JDialog();
        jButton4 = new javax.swing.JButton();
        GG1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Name1 = new javax.swing.JTextField();
        puntuacion1 = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        Años1 = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Tipo1 = new javax.swing.JComboBox<>();
        Genero1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JDialog();
        GG2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        GG = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        barrita = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese nombre:");

        nombre.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jc_Seres.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jc_Seres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,200));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel6.setText("ClaudiList");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(91, 91, 91))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setText("Ingrese programa:");

        javax.swing.GroupLayout ClaudiList_crearLayout = new javax.swing.GroupLayout(ClaudiList_crear.getContentPane());
        ClaudiList_crear.getContentPane().setLayout(ClaudiList_crearLayout);
        ClaudiList_crearLayout.setHorizontalGroup(
            ClaudiList_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClaudiList_crearLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClaudiList_crearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ClaudiList_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClaudiList_crearLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClaudiList_crearLayout.createSequentialGroup()
                        .addGroup(ClaudiList_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ClaudiList_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jc_Seres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );
        ClaudiList_crearLayout.setVerticalGroup(
            ClaudiList_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClaudiList_crearLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(ClaudiList_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ClaudiList_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_Seres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(ClaudiList_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(75, 75, 75))
        );

        jButton3.setText("Guardar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,200));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel18.setText("ClaudiList");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(132, 132, 132))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(35, 35, 35))
        );

        Name.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel19.setText("Ingrese nombre:");

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel20.setText("Ingrese puntuación:");

        puntuacion.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        puntuacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        Años.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel21.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel21.setText("Ingrese año de lanzamiento:");

        jLabel22.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel22.setText("Ingrese tipo:");

        Tipo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anime", "Serie", "Documental", "Película" }));

        Genero.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedia", "Romance", "Terror", "SyFy", "Suspenso", "accion" }));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel5.setText("Ingrese genero:");

        javax.swing.GroupLayout Crear_programaLayout = new javax.swing.GroupLayout(Crear_programa.getContentPane());
        Crear_programa.getContentPane().setLayout(Crear_programaLayout);
        Crear_programaLayout.setHorizontalGroup(
            Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_programaLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Crear_programaLayout.createSequentialGroup()
                        .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Años, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_programaLayout.createSequentialGroup()
                        .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Crear_programaLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_programaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
            .addGroup(Crear_programaLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Crear_programaLayout.setVerticalGroup(
            Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Crear_programaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(38, 38, 38)
                .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(Crear_programaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
        );

        jButton4.setText("Modificar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        GG1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        GG1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        GG1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GG1ItemStateChanged(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 0,200));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel7.setText("ClaudiList");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel23.setText("Ingrese nombre:");

        Name1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        puntuacion1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        puntuacion1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel24.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel24.setText("Ingrese puntuación:");

        Años1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel25.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel25.setText("Ingrese año de lanzamiento:");

        jLabel26.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel26.setText("Ingrese tipo:");

        Tipo1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anime", "Serie", "Documental", "Película" }));

        Genero1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Genero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedia", "Romance", "Terror", "SyFy", "Suspenso", "accion" }));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel14.setText("Ingrese genero:");

        jLabel27.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel27.setText("Elija una ClaudiList");

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar.getContentPane());
        Modificar.getContentPane().setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(52, 52, 52)
                        .addComponent(GG1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ModificarLayout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ModificarLayout.createSequentialGroup()
                            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25)
                                .addComponent(jLabel26)
                                .addComponent(jLabel14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Tipo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Años1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24))
                            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ModificarLayout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(puntuacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(106, Short.MAX_VALUE)))
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(87, 87, 87))
            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ModificarLayout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addGap(38, 38, 38)
                    .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(puntuacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Años1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(Tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(42, 42, 42)
                    .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(Genero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(192, Short.MAX_VALUE)))
        );

        GG2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        GG2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        GG2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GG2ItemStateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel13.setText("Programa a Eliminar");

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0,200));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel8.setText("ClaudiList");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(88, 88, 88))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EliminarLayout = new javax.swing.GroupLayout(Eliminar.getContentPane());
        Eliminar.getContentPane().setLayout(EliminarLayout);
        EliminarLayout.setHorizontalGroup(
            EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(GG2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        EliminarLayout.setVerticalGroup(
            EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(36, 36, 36)
                .addComponent(jButton5)
                .addGap(79, 79, 79))
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GG.setColumns(20);
        GG.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        GG.setRows(5);
        jScrollPane1.setViewportView(GG);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,200));

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel16.setText("ClaudiList");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel16)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel17.setText("Datos");

        jMenu1.setText("Crear");
        jMenu1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem1.setText("PlayList");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem2.setText("Canciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem3.setText("Abrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");
        jMenu2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem4.setText("Modificar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem5.setText("Eliminar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(barrita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                .addGap(62, 62, 62))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(360, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addContainerGap(361, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barrita, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ClaudiList U = new ClaudiList();
        String Nombre = nombre.getText();
        if (CL.size() < 1 || nombre.getText() == "") {
            JOptionPane.showMessageDialog(ClaudiList_crear, "TODOS LOS CAMPOS SON OBLIGATORIOS");
        } else {
            try {
                U.setNombre(Nombre);
                U.setCanciones(CL);
                JFileChooser jfc = new JFileChooser();
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
                jfc.addChoosableFileFilter(filtro);
                jfc.setSelectedFile(new File(Nombre + ".txt"));
                int seleccion = jfc.showSaveDialog(this);
                // jfc.setSelectedFile(new File(PlayListActual.getNombre() + ".txt"));
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    CL = new ArrayList();
                    U.creararchivo(jfc.getSelectedFile().getPath());
                    U.escribirArchivo();
                    CLA = U;
                    JOptionPane.showMessageDialog(Crear_programa, "Se ha guardado su archivo, tenga buen dia :)");
                }

            } catch (IOException e) {
                JOptionPane.showMessageDialog(Crear_programa, "Lo sentimos pero el archivo no se guardo :c");
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        CL.add(((Programas) jc_Seres.getSelectedItem()));
        JOptionPane.showMessageDialog(ClaudiList_crear, "Muchas gracias por haber agregado una Claudilist, tenga buen dia :)");
        nombre.setText("");
        tiempo.start();

        Barrita.start();
        sec++;
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (Name.getText() == "" || (Integer) puntuacion.getValue() == 0 || Integer.parseInt(Años.getText()) == 0 || Genero.getSelectedItem().toString() == "" || Tipo.getSelectedItem().toString() == "") {
            JOptionPane.showMessageDialog(ClaudiList_crear, "NO DEJE ESPACIOS EN BLANCO");
        } else {
            try {

                String nombre, tipo, genero;
                int Puntuacion, años;
                nombre = Name.getText();
                Puntuacion = (Integer) puntuacion.getValue();
                años = Integer.parseInt(Años.getText());
                tipo = Tipo.getSelectedItem().toString();
                genero = Genero.getSelectedItem().toString();
                DefaultComboBoxModel Modelo = (DefaultComboBoxModel) jc_Seres.getModel();
                CLA.getCanciones().add(new Programas(nombre, tipo, genero, Puntuacion, años));
                Modelo.addElement(CLA.getCanciones().get(CLA.getCanciones().size() - 1));
                jc_Seres.setModel(Modelo);
                GG1.setModel(Modelo);
                GG2.setModel(Modelo);

                JOptionPane.showMessageDialog(ClaudiList_crear, "Se ha creado correctamente tu programa, tenga un buen dia");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(ClaudiList_crear, "Oh no, ocurrio un error, revise de nuevo a ver si todo esta bien");
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ClaudiList_crear.show();
        ClaudiList_crear.pack();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Crear_programa.show();
        Crear_programa.pack();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ClaudiList u = new ClaudiList();
        GG.setText(u.Abrir());
        u.cargarArchivo();
        CLA = u;
        DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
        for (int i = 0; i < CLA.getCanciones().size(); i++) {
            Modelo.addElement(CLA.getCanciones().get(i));
        }
        jc_Seres.setModel(Modelo);
        GG1.setModel(Modelo);
        GG2.setModel(Modelo);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        int Pos = GG1.getSelectedIndex();
        if (Name1.getText() == "" || (Integer) puntuacion1.getValue() == 0 || Integer.parseInt(Años1.getText()) == 0 || Genero1.getSelectedItem().toString() == "" || Tipo1.getSelectedItem().toString() == "") {
            JOptionPane.showMessageDialog(Modificar, "TODOS LOS CAMPOS SON OBLIGATORIOS");
        } else {
            try {
                String nombre, tipo, genero;
                int Puntuacion, años;
                nombre = Name1.getText();
                Puntuacion = (Integer) puntuacion1.getValue();
                años = Integer.parseInt(Años1.getText());
                tipo = Tipo1.getSelectedItem().toString();
                genero = Genero1.getSelectedItem().toString();
                CLA.getCanciones().get(Pos).setNombre(nombre);
                CLA.getCanciones().get(Pos).setAños(años);
                CLA.getCanciones().get(Pos).setPuntuacion(Puntuacion);
                CLA.getCanciones().get(Pos).setGenero(genero);
                CLA.getCanciones().get(Pos).setTipo(tipo);
                CLA.escribirArchivo();
                JOptionPane.showMessageDialog(Modificar, "Se ha Modificado el ser correctamente, tenga un buen dia :)");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(ClaudiList_crear, "Oh no, ocurrio un error, revise de nuevo a ver si todo esta bien");
            }

        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Modificar.show();
        Modificar.pack();
        DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
        for (int i = 0; i < CLA.getCanciones().size(); i++) {
            Modelo.addElement(CLA.getCanciones().get(i));
        }
        GG1.setModel(Modelo);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Eliminar.show();
        Eliminar.pack();
        DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
        for (int i = 0; i < CLA.getCanciones().size(); i++) {
            Modelo.addElement(CLA.getCanciones().get(i));
        }
        GG2.setModel(Modelo);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void GG1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GG1ItemStateChanged
        Programa = ((Programas) GG1.getSelectedItem());
        Pos = GG1.getSelectedIndex();
        try {
            Name1.setText(Programa.getNombre());
            puntuacion1.setValue(Programa.getPuntuacion());
            Años1.setValue(Programa.getAños());
            Genero1.setSelectedItem(Programa.getGenero());
            Tipo1.setSelectedItem(Programa.getTipo());

        } catch (Exception e) {

        }
    }//GEN-LAST:event_GG1ItemStateChanged

    private void GG2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GG2ItemStateChanged
        Pos = GG2.getSelectedIndex();

    }//GEN-LAST:event_GG2ItemStateChanged

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
            CLA.getCanciones().remove(Pos);

            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            for (int i = 0; i < CLA.getCanciones().size(); i++) {
                Modelo.addElement(CLA.getCanciones().get(i));
            }
            GG1.setModel(Modelo);
            GG2.setModel(Modelo);
            jc_Seres.setModel(Modelo);

            CLA.escribirArchivo();
            JOptionPane.showMessageDialog(Eliminar, "El elemento se ha eliminado adecuadamente");
        } catch (IOException e) {

        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Años;
    private javax.swing.JFormattedTextField Años1;
    private javax.swing.JDialog ClaudiList_crear;
    private javax.swing.JDialog Crear_programa;
    private javax.swing.JDialog Eliminar;
    private javax.swing.JTextArea GG;
    private javax.swing.JComboBox<String> GG1;
    private javax.swing.JComboBox<String> GG2;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JComboBox<String> Genero1;
    private javax.swing.JDialog Modificar;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Name1;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JComboBox<String> Tipo1;
    private javax.swing.JProgressBar barrita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jc_Seres;
    private javax.swing.JTextField nombre;
    private javax.swing.JSpinner puntuacion;
    private javax.swing.JSpinner puntuacion1;
    // End of variables declaration//GEN-END:variables
   private ArrayList<Programas> CL = new ArrayList();
    private ClaudiList CLA = new ClaudiList();
    private Programas Programa;
    private int Pos;

}
