package eu.valev.dev.view;

import java.io.IOException;

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
	
	public AbstractView() {
		final String name = getClass().getSimpleName() + ".fxml";
		if (name != null) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
						name));
				fxmlLoader.setRoot(this);
				fxmlLoader.setController(this);
				fxmlLoader.load();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public AbstractView(String name) {
		if (name != null) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
						name));
				fxmlLoader.setRoot(this);
				fxmlLoader.setController(this);
				fxmlLoader.load();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public T getPresenter() {
		return presenter;
	}

	public void setPresenter(T presenter) {
		this.presenter = presenter;
	}
	
	
}
