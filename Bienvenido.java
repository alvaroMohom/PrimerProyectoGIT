
package gui;

import javax.swing.JOptionPane;


public class Bienvenido extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenido
     */
    public Bienvenido() {
        initComponents();
        
    }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonDividir = new javax.swing.JButton();
        etiquetaPrimerNumero = new javax.swing.JLabel();
        campoNumero1 = new javax.swing.JTextField();
        etiquetaSegundoNumero = new javax.swing.JLabel();
        campoNumero2 = new javax.swing.JTextField();
        botonSumar = new javax.swing.JButton();
        etiquetaResultado = new javax.swing.JLabel();
        campoResultado = new javax.swing.JTextField();
        botonRestar = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();

        botonDividir.setText("Dividir");
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });

        etiquetaPrimerNumero.setText("Primer número:");

        etiquetaSegundoNumero.setText("Segundo número:");

        botonSumar.setText("Sumar");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });

        etiquetaResultado.setText("Resultado:");

        campoResultado.setEditable(false);
        campoResultado.setFocusable(false);

        botonRestar.setText("Restar");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });

        botonMultiplicar.setText("Multiplicar");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonSumar)
                                .addGap(18, 18, 18)
                                .addComponent(botonRestar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(etiquetaPrimerNumero))
                                    .addComponent(etiquetaSegundoNumero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(campoNumero1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonMultiplicar)
                                .addGap(18, 18, 18)
                                .addComponent(botonDividir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(etiquetaResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPrimerNumero)
                    .addComponent(campoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSegundoNumero)
                    .addComponent(campoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSumar)
                    .addComponent(botonRestar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMultiplicar)
                    .addComponent(botonDividir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaResultado)
                    .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        String texto1= campoNumero1.getText();
      
try {
            double num1 = Double.parseDouble(texto1);
            double num2 = Double.parseDouble(campoNumero2.getText());
            double resultado = num1 / num2;
            String textoResultado = Double.toString(resultado);
            campoResultado.setText (textoResultado);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Sólo se admiten números");
        }
    }//GEN-LAST:event_botonDividirActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        String texto1 = campoNumero1.getText();
        try {
            int num1 = Integer.parseInt(texto1);
            int num2 = Integer.parseInt(campoNumero2.getText());
            int resultado = num1 + num2;
            String textoResultado = Integer.toString(resultado);
            campoResultado.setText(textoResultado);
        } catch(NumberFormatException nfe ) {
            JOptionPane.showMessageDialog(this, "Sólo se admiten números");
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        String texto1= campoNumero1.getText();
        try {
            int num1 = Integer.parseInt(texto1);
            int num2 = Integer.parseInt(campoNumero2.getText());
            int resultado = num1 - num2;
            String textoResultado = Integer.toString(resultado);
            campoResultado.setText (textoResultado);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Sólo se admiten números");
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        String texto1= campoNumero1.getText();
        try {
            int num1 = Integer.parseInt(texto1);
            int num2 = Integer.parseInt(campoNumero2.getText());
            int resultado = num1 * num2;
            String textoResultado = Integer.toString(resultado);
            campoResultado.setText (textoResultado);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Sólo se admiten números");
        }
    }//GEN-LAST:event_botonMultiplicarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JTextField campoNumero1;
    private javax.swing.JTextField campoNumero2;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JLabel etiquetaPrimerNumero;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel etiquetaSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
