package eu.valev.dev.view;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import eu.valev.dev.presenter.AbstractPresenter;

/**
 * 
 * @author Kiril Valev
 * 
 * @param <T>
 */
public class AbstractView<T extends AbstractPresenter<?>> extends BorderPane {

	private T presenter;
	
	private ResourceBundle bundle;

	public AbstractView() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
					getClass().getSimpleName() + ".fxml"));
			fxmlLoader.setRoot(this);
			fxmlLoader.setController(this);
			bundle = ResourceBundle.getBundle(getClass().getName());
			fxmlLoader.setResources(bundle);
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public T getPresenter() {
		return presenter;
	}

	public void setPresenter(T presenter) {
		this.presenter = presenter;
	}

	public ResourceBundle getBundle() {
		return bundle;
	}

	public void setBundle(ResourceBundle bundle) {
		this.bundle = bundle;
	}

}
