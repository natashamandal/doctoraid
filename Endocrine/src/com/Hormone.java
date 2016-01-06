package com;

import java.awt.event.*;
import javax.swing.*;

public class Hormone extends JPanel
implements ItemListener {
JLabel jl;

public Hormone() {
// Get content pane
/*Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());*/
// Create a combo box and add it
// to the panel
	
	
JComboBox<String> jc = new JComboBox<String>();
jc.addItem("Oxytocin");
jc.addItem("Antidiuretic hormone");
jc.addItem("Thyrotropin-releasing hormone");
jc.addItem("Dopamine");
jc.addItem("Somatostatin");
jc.addItem("Gonadotropin-releasing hormone");
jc.addItem("Corticotropin-releasing hormone");
jc.addItem("Beta-endorphin");
jc.addItem("Melanocyte-stimulating hormone");
jc.addItem("Histamine");
jc.addItem("Gastrin");
jc.addItem("Ghrelin");
jc.addItem("Neuropeptide Y");
jc.addItem("Endothelin");
jc.addItem("Secretin");
jc.addItem("Cholecystokinin");
jc.addItem("Insulin-like growth factor");
jc.addItem("Angiotensinogen and Angiotensin");
jc.addItem("Hepcidin");
jc.addItem("Pancreatic polypeptide");
jc.addItem("Renin");
jc.addItem("Erythropoietin (EPO)");
jc.addItem("Calcitriol (1,25-dihydroxyvitamin D3)");
jc.addItem("Thrombopoietin");
jc.addItem("Adrenaline");
jc.addItem("Noradrenaline");
jc.addItem("Enkephalin");
jc.addItem("Estradiol");
jc.addItem("Inhibin");
jc.addItem("Androstenedione");
jc.addItem("Human chorionic gonadotropin");
jc.addItem("Human placental lactogen");
jc.addItem("Relaxin");
jc.addItem("Calcidiol (25-hydroxyvitamin D3)");
jc.addItem("Atrial-natriuretic peptide");
jc.addItem("Brain natriuretic peptide");
jc.addItem("Leptin");
jc.addItem("Growth Hormone");
jc.addItem("Prolactin");
jc.addItem("Follicle-Stimulating Hormone (FSH)");
jc.addItem("Luteinizing Hormone (LH)");
jc.addItem("Thyroid-Stimulating Hormone (TSH)");
jc.addItem("Adenocorticotropic Hormone");
jc.addItem("Triiodothyronine (T3)");
jc.addItem("Thyroxine (T4)");
jc.addItem("Calcitonin");
jc.addItem("Parathyroid Hormone (PTH)");
jc.addItem("Insulin");
jc.addItem("Glucagon");
jc.addItem("Glucocorticoids");
jc.addItem("Mineralocorticoids");
jc.addItem("Androgens");
jc.addItem("Estrogens");
jc.addItem("Progesterone");
jc.addItem("Melatonin");
jc.addItem("Thymosin");
jc.addItemListener(this);
add(jc);
// Create label
jl = new JLabel(new ImageIcon("Oxytocin.jpg"));
/*contentPane.add(jl);*/
add(jl);
}
@Override
public void itemStateChanged(ItemEvent ie) {
String s = (String)ie.getItem();
jl.setIcon(new ImageIcon(s+".jpg"));

}
}