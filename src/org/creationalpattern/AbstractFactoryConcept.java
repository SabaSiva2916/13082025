package org.creationalpattern;

interface Button {
	void paint();
}

interface Checkbox {
	void paint();
}

class LightButton implements Button {

	public void paint() {
		System.out.println("Rendering Light Button");
	}

}

class LightCheckBox implements Checkbox {

	public void paint() {
		System.out.println("Rendering Light Checkbox");

	}

}

class DarkButton implements Button {

	public void paint() {
		System.out.println("Rendering Dark Button");

	}

}

class DarkCheckbox implements Checkbox {

	public void paint() {
		System.out.println("Rendering Drak Checkbox");

	}

}

interface GUIFactory {
	Button createButton();

	Checkbox createcheckbox();
}

class LightTheamFactory implements GUIFactory {

	public Button createButton() {

		return new LightButton();
	}

	public Checkbox createcheckbox() {

		return new LightCheckBox();
	}

}

class DarkTheamFactory implements GUIFactory {

	public Button createButton() {

		return new DarkButton();
	}

	public Checkbox createcheckbox() {

		return new DarkCheckbox();
	}

}

public class AbstractFactoryConcept {

	private Button button;
	private Checkbox checkbox;

	public AbstractFactoryConcept(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createcheckbox();
	}

	public void renderUI() {
		button.paint();
		checkbox.paint();

	}

	public static void main(String[] args) {
		GUIFactory factory;

		String them = "dark";
		if (them.equals("dark")) {
			factory = new DarkTheamFactory();
		} else {
			factory = new LightTheamFactory();
		}

		AbstractFactoryConcept concept = new AbstractFactoryConcept(factory);
		concept.renderUI();
	}
}
