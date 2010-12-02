package com.nepxion.swing.panel;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.nepxion.swing.layout.filed.FiledLayout;
import com.nepxion.swing.layout.table.TableLayout;
import com.nepxion.swing.locale.SwingLocale;
import com.nepxion.swing.optionpane.IValidation;
import com.nepxion.swing.optionpane.JBasicOptionPane;
import com.nepxion.swing.textfield.JBasicPasswordField;

public class JPasswordPanel
	extends JPanel implements IValidation
{
	private JBasicPasswordField oldPasswordTextField;
	private JBasicPasswordField newPasswordTextField;
	private JBasicPasswordField newPasswordConfirmTextField;
	
	public JPasswordPanel()
	{
		oldPasswordTextField = new JBasicPasswordField();
		newPasswordTextField = new JBasicPasswordField();
		newPasswordConfirmTextField = new JBasicPasswordField();
		
		double[][] size = 
		{ 
			{TableLayout.PREFERRED, 160}, 
			{22, 22, 22}
		};
		
		TableLayout tableLayout = new TableLayout(size);
		tableLayout.setVGap(10);
		tableLayout.setHGap(10);
		
		JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(tableLayout);
		passwordPanel.add(new JLabel(SwingLocale.getString("old_password")), "0, 0");
		passwordPanel.add(oldPasswordTextField, "1, 0");
		passwordPanel.add(new JLabel(SwingLocale.getString("new_password")), "0, 1");
		passwordPanel.add(newPasswordTextField, "1, 1");
		passwordPanel.add(new JLabel(SwingLocale.getString("new_password_confirm")), "0, 2");
		passwordPanel.add(newPasswordConfirmTextField, "1, 2");
		
		setLayout(new FiledLayout(FiledLayout.COLUMN, FiledLayout.LEFT, 5));
		add(passwordPanel);
	}
	
	public JBasicPasswordField getOldPasswordTextField()
	{
		return oldPasswordTextField;
	}

	public JBasicPasswordField getNewPasswordTextField()
	{
		return newPasswordTextField;
	}

	public JBasicPasswordField getNewPasswordConfirmTextField()
	{
		return newPasswordConfirmTextField;
	}
	
	public boolean verify()
	{
		String oldPassword = oldPasswordTextField.getPasswordText().toString();
		if (oldPassword.equals(""))
		{
			JBasicOptionPane.showMessageDialog(this, SwingLocale.getString("old_password_not_null"), SwingLocale.getString("error"), JBasicOptionPane.ERROR_MESSAGE);
			return false;
		}	
		
		String newPassword = newPasswordTextField.getPasswordText().toString();
		if (newPassword.equals(""))
		{
			JBasicOptionPane.showMessageDialog(this, SwingLocale.getString("new_password_not_null"), SwingLocale.getString("error"), JBasicOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		String newPasswordConfirm = newPasswordConfirmTextField.getPasswordText().toString();
		if (newPasswordConfirm.equals(""))
		{
			JBasicOptionPane.showMessageDialog(this, SwingLocale.getString("new_password_confirm_not_null"), SwingLocale.getString("error"), JBasicOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		if (!newPassword.equals(newPasswordConfirm))
		{
			JBasicOptionPane.showMessageDialog(this, SwingLocale.getString("new_password_not_matched"), SwingLocale.getString("error"), JBasicOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		return true;
	}	
}