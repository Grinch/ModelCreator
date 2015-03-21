package com.mrcrayfish.modelcreator.panels;

import java.awt.Dimension;

import javax.swing.JPanel;

import com.mrcrayfish.modelcreator.ModelCreator;

public class TabPanel extends JPanel
{
	private static final long serialVersionUID = 1L;

	public JPanel panel;

	public TabPanel(ModelCreator creator, Type type)
	{
		setSize(new Dimension(190, 300));
		initialize(creator, type);
	}

	public void initialize(ModelCreator creator, Type type)
	{
		switch (type)
		{
		case ELEMENT:
			panel = new PropertiesPanel(creator);
			break;
		case ROTATION:
			panel = new RotationPanel(creator);
			break;
		case TEXTURE:
			panel = new FacePanel(creator);
			break;
		}
		add(panel);
	}

	public JPanel getPanel()
	{
		return panel;
	}

	public static enum Type
	{
		ELEMENT, ROTATION, TEXTURE;
	}
}