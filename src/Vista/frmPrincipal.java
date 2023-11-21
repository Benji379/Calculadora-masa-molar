package Vista;

import Modelo.CompuestoQuimico;
import Modelo.TablaPeriodica;
import Modelo.UIController;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        configInit();
        detectarCambiostxtCantidad();
    }

    private void configInit() {
        this.setLocationRelativeTo(null);
        UIController.removerBordeBlanco(jScrollPane1);
        txtDesBreve.setText("<html><br>" + "La masa molar de la sustancia (M) es la masa de un mol de la sustancia. La unidad SI para la masa molar es kg/mol, pero en general se utiliza la unidad decimal g/mol.</html>");
        comboCantidad.setSelectedItem("mol");
        comboMasa.setSelectedItem("g");
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/quimico.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new Modelo.PanelRound();
        jPanel2 = new javax.swing.JPanel();
        txtFormula = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMasaMolar = new Modelo.TableDark();
        jPanel3 = new javax.swing.JPanel();
        txtDesBreve = new javax.swing.JLabel();
        pictureBox1 = new Modelo.PictureBox();
        panelRound2 = new Modelo.PanelRound();
        jPanel4 = new javax.swing.JPanel();
        comboCantidad = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        comboMasa = new javax.swing.JComboBox<>();
        txtMasa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        panelRound3 = new Modelo.PanelRound();
        txtComposicionElemental = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaComposicion = new Modelo.TableDark();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroAtomos = new javax.swing.JLabel();
        txtTotalMasaAtomicaRelativa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotalMasaCompuesto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalFraccionMasica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Masa Molar");

        jPanel1.setBackground(new java.awt.Color(20, 20, 20));
        jPanel1.setToolTipText("Calculadora de Masa Molar");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA DE MASA MOLAR");

        panelRound1.setBackground(new java.awt.Color(30, 30, 30));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));

        txtFormula.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtFormula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFormulaKeyTyped(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setFocusPainted(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Formula:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(txtFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tablaMasaMolar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Formula quimica", "notacion de Hill", "Masa molar(g/mol)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaMasaMolar);

        jPanel3.setBackground(new java.awt.Color(20, 20, 20));

        txtDesBreve.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtDesBreve.setForeground(new java.awt.Color(255, 255, 255));

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/imgFormula.png"))); // NOI18N

        panelRound2.setBackground(new java.awt.Color(30, 30, 30));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);

        jPanel4.setBackground(new java.awt.Color(30, 30, 30));

        comboCantidad.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "umol", "mmol", "mol", "kmol" }));
        comboCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCantidadActionPerformed(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(30, 30, 30));

        comboMasa.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboMasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "g" }));

        txtMasa.setEditable(false);
        txtMasa.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Masa:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(comboMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(txtDesBreve, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                .addGap(119, 119, 119))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtDesBreve, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelRound3.setBackground(new java.awt.Color(30, 30, 30));
        panelRound3.setRoundBottomLeft(15);
        panelRound3.setRoundBottomRight(15);
        panelRound3.setRoundTopLeft(15);
        panelRound3.setRoundTopRight(15);

        txtComposicionElemental.setFont(new java.awt.Font("Century Gothic", 2, 17)); // NOI18N
        txtComposicionElemental.setForeground(new java.awt.Color(255, 255, 255));
        txtComposicionElemental.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tablaComposicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Elemento", "Simbolo del elemento", "Numero de atomos", "Masa Atomica Relativa", "Masa del compuesto (g)", "Fraccion Masica (%)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaComposicion);

        jPanel6.setBackground(new java.awt.Color(30, 30, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Número de Atomos");

        txtNumeroAtomos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNumeroAtomos.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroAtomos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumeroAtomos.setText("0.0");

        txtTotalMasaAtomicaRelativa.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtTotalMasaAtomicaRelativa.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalMasaAtomicaRelativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalMasaAtomicaRelativa.setText("0.0");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Masa Atomica Relativa");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Masa del Compuesto");

        txtTotalMasaCompuesto.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtTotalMasaCompuesto.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalMasaCompuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalMasaCompuesto.setText("0.0");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Fraccion Masica (%)");

        txtTotalFraccionMasica.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtTotalFraccionMasica.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalFraccionMasica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalFraccionMasica.setText("0.0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumeroAtomos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalMasaAtomicaRelativa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalMasaCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalFraccionMasica, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroAtomos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalMasaCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalFraccionMasica, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalMasaAtomicaRelativa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(txtComposicionElemental, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtComposicionElemental, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane2)
                .addGap(125, 125, 125))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(114, 114, 114))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel modelo;
    String FORMULA;
    String urlJson = "src\\Data\\TablaPeriodica.json";
    TablaPeriodica tabla = new TablaPeriodica(urlJson);

    double TOTAL_MASA_COMPUESTO;
    double CANTIDAD = 1;
    double MASA = 1;

    private double getTotalColumna(JLabel label, int NColumna) {
        double total = 0;
        for (int i = 0; i < tablaComposicion.getRowCount(); i++) {
            double valores = Double.parseDouble(tablaComposicion.getValueAt(i, NColumna).toString());
            total += valores;
        }
        label.setText("" + total);
        return redondearNumero(total, 8);
    }

    private void rellenarTablaMasaMolar() {
        CompuestoQuimico compuesto = new CompuestoQuimico(FORMULA, tabla);
        String formulaQuimica = compuesto.getFormulaQuimica();
        double masaMolar = Double.parseDouble(String.format("%.2f", compuesto.getMasaMolar()).replace(',', '.'));
        tablaMasaMolar.setValueAt(FORMULA, 0, 0);
        tablaMasaMolar.setValueAt(formulaQuimica, 0, 1);
        tablaMasaMolar.setValueAt(masaMolar, 0, 2);
        txtMasa.setText("" + masaMolar);
        txtComposicionElemental.setText("Composición elemental de " + FORMULA);
    }

    private void rellenarTablaComposicion() {
        CompuestoQuimico compuesto = new CompuestoQuimico(FORMULA, tabla);
        List<String> listaElementos = compuesto.getSimbolosElementos();
        List<Integer> listaNAtomos = compuesto.getNumerosAtomosElementos();
        Object datos[] = new Object[6];
        modelo = (DefaultTableModel) tablaComposicion.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < listaElementos.size(); i++) {
            String simboloElemento = listaElementos.get(i);
            String nombreElemento = tabla.getValorPorSimbolo(listaElementos.get(i), "Nombre");
            int NAtomos = listaNAtomos.get(i);
            double masaElemento = Double.parseDouble(tabla.getValorPorSimbolo(listaElementos.get(i), "Masa").replace(',', '.'));
            double masaTotalElemento = masaElemento * NAtomos;
            datos[1] = simboloElemento;
            datos[0] = nombreElemento;
            datos[2] = NAtomos;
            datos[3] = masaElemento;
            datos[4] = masaTotalElemento;
            datos[5] = 0; // no importa lo que ponga ahí porque luego voy a hacer los respectivos calculos para rellenarlo
            modelo.addRow(datos);
        }
        tablaComposicion.setModel(modelo);
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            FORMULA = txtFormula.getText();
            rellenarTablaMasaMolar();
            rellenarTablaComposicion();
            getTotalColumna(txtNumeroAtomos, 2);
            getTotalColumna(txtTotalMasaAtomicaRelativa, 3);
            TOTAL_MASA_COMPUESTO = getTotalColumna(txtTotalMasaCompuesto, 4);
            rellenarFraccionMasica();
            txtTotalFraccionMasica.setText("" + Math.round(getTotalColumna(txtTotalFraccionMasica, 5)));
            txtMasa.setText("" + TOTAL_MASA_COMPUESTO);
            txtCantidad.setText("1");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rellenarFraccionMasica() {
        for (int i = 0; i < tablaComposicion.getRowCount(); i++) {
            double cantidadAtomos = Double.parseDouble(tablaComposicion.getValueAt(i, 2).toString());
            double masaAtomo = Double.parseDouble(tablaComposicion.getValueAt(i, 3).toString());
            double fraccionMasica = ((cantidadAtomos * masaAtomo) / TOTAL_MASA_COMPUESTO) * 100;
            double redondear = redondearNumero(fraccionMasica, 2);
            tablaComposicion.setValueAt(redondear, i, 5);
        }
    }

    private double redondearNumero(double numero, int decimales) {
        return Double.parseDouble(String.format("%." + decimales + "f", numero).replace(',', '.'));
    }

    private void detectarCambiostxtCantidad() {
        txtCantidad.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarCantidad(CANTIDAD);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarCantidad(CANTIDAD);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }

    private void actualizarCantidad(double medidaCantidad) {
        try {
            medidaCantidad = Double.parseDouble(txtCantidad.getText());
        } catch (NumberFormatException e) {
            medidaCantidad = 0;
        }
        actualizarMasaTabla(medidaCantidad);
        TOTAL_MASA_COMPUESTO = getTotalColumna(txtTotalMasaCompuesto, 4);
        txtMasa.setText("" + TOTAL_MASA_COMPUESTO);
        txtTotalMasaCompuesto.setText("" + TOTAL_MASA_COMPUESTO);
        System.out.println(medidaCantidad);
    }

    private void actualizarCantidadMendida(double medidaCantidad) {
        actualizarMasaTabla(medidaCantidad);
        TOTAL_MASA_COMPUESTO = getTotalColumna(txtTotalMasaCompuesto, 4);
        txtMasa.setText("" + TOTAL_MASA_COMPUESTO);
        txtTotalMasaCompuesto.setText("" + TOTAL_MASA_COMPUESTO);
    }

    private void actualizarMasaTabla(double medidaCantidad) {
        for (int i = 0; i < tablaComposicion.getRowCount(); i++) {
            double cantidad = Double.parseDouble(tablaComposicion.getValueAt(i, 2).toString());
            double masaAtomo = Double.parseDouble(tablaComposicion.getValueAt(i, 3).toString());
            double nuevoMasaTotal = redondearNumero(cantidad * masaAtomo * medidaCantidad, 10);
            tablaComposicion.setValueAt(nuevoMasaTotal, i, 4);
        }
    }

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        UIController.limitacionNumeros(txtCantidad, evt, 1000, ".");
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void comboCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCantidadActionPerformed
        String medidaCantidad = (String) comboCantidad.getSelectedItem();
        double CantidadSegunMedida = 1000;
        try {
            CANTIDAD = Double.parseDouble(txtCantidad.getText());
        } catch (NumberFormatException e) {
            CANTIDAD = 0;
        }
        switch (medidaCantidad) {
            case "umol":
                CantidadSegunMedida = 0.000001 * CANTIDAD;
                break;
            case "mmol":
                CantidadSegunMedida = 0.001 * CANTIDAD;
                break;
            case "mol":
                CantidadSegunMedida = 1 * CANTIDAD;
                break;
            case "kmol":
                CantidadSegunMedida = 1000 * CANTIDAD;
                break;
        }
        actualizarCantidadMendida(CantidadSegunMedida);
    }//GEN-LAST:event_comboCantidadActionPerformed

    private void txtFormulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFormulaKeyTyped
        UIController.limitacionEspacio(txtFormula, evt);
    }//GEN-LAST:event_txtFormulaKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> comboCantidad;
    private javax.swing.JComboBox<String> comboMasa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private Modelo.PanelRound panelRound1;
    private Modelo.PanelRound panelRound2;
    private Modelo.PanelRound panelRound3;
    private Modelo.PictureBox pictureBox1;
    private Modelo.TableDark tablaComposicion;
    private Modelo.TableDark tablaMasaMolar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtComposicionElemental;
    private javax.swing.JLabel txtDesBreve;
    private javax.swing.JTextField txtFormula;
    private javax.swing.JTextField txtMasa;
    private javax.swing.JLabel txtNumeroAtomos;
    private javax.swing.JLabel txtTotalFraccionMasica;
    private javax.swing.JLabel txtTotalMasaAtomicaRelativa;
    private javax.swing.JLabel txtTotalMasaCompuesto;
    // End of variables declaration//GEN-END:variables
}
