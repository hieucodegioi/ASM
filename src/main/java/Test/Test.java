/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Test;

import View.QLSVView;
import javax.swing.UIManager;

/**
 *
 * @author hieud
 */
public class Test {
	public static void main(String[] args) {
            try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new QLSVView();
        } catch (Exception e) {
            e.printStackTrace();
        }
		 
	}
}
