/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Province;
import Model.Student;
import View.QLSVView;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author hieud
 */
public class QLSVController implements Action{
    
    public QLSVView View;

    public QLSVController(QLSVView View) {
        this.View = View;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String cmd = e.getActionCommand();
        //JOptionPane.showMessageDialog(View, "You are pressing the button: " + cmd);
        if(cmd.equals("Insert")){
            this.View.deleteForm();
            this.View.model.setChoose("Insert");
        } else if (cmd.equals("Save")) {
            try {
                int stuCode = Integer.valueOf(this.View.TextID.getText());
                String stuName = this.View.TextName.getText();
                int stuHomeTown = this.View.Town_comboBox.getSelectedIndex()-1;
                Province province = Province.getProvinceById(stuHomeTown);
                boolean sex = true;
                String chooseSex = this.View.btn_gioitinh.getSelection()+"";
                if (this.View.RadioButton_Nam.isSelected()) {
                    sex = true;
                }else if (this.View.RadioButton_Nu.isSelected()) {
                    sex = false;
                }
                float maths = Float.valueOf(this.View.TextMath.getText());
                float physics = Float.valueOf(this.View.Textphysics.getText());
                float chemistry = Float.valueOf(this.View.TextChemistry.getText());
                float english = Float.valueOf(this.View.TextEinglish.getText());
                float literature = Float.valueOf(this.View.TextLiterature.getText());
                
                Student student = new Student(stuCode, stuName, province, sex, maths, physics, chemistry, english, literature);
                
                this.View.addOrUpdateStudent(student);
            } catch (IllegalArgumentException d) {
                JOptionPane.showMessageDialog(View, "Error: "+ d);
            } catch  (Exception d){
                JOptionPane.showMessageDialog(View, "Error: " + d);
            }
        }else if (cmd.equals("Update")) {
            this.View.showInfo();
        }else if (cmd.equals("Delete")) {
            this.View.actionDelete();
        }else if(cmd.equals("Remove")) {
            this.View.deleteRow();
            this.View.deleteForm();
	}else if(cmd.equals("Find")) {
            this.View.stuSearch();
        }else if(cmd.equals("SaveFile")) {
            this.View.actionSaveFile();
	}else if(cmd.equals("Open")) {
            this.View.actionOpenFile();
        }else if(cmd.equals("Average")) {
            this.View.tinhTrungBinh();
        }
    }

    @Override
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
