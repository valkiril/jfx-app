package eu.valev.dev.presenter;

import javafx.stage.Stage;
import eu.valev.dev.view.AbstractView;

/**
 * 
 * @author Kiril Valev
 *
 * @param <T>
 */
public abstract class AbstractPresenter<T extends AbstractView<?>> {
	
	private T view;
	
	private AbstractPresenter<?> presenter;
	
	private Stage stage;
	
	public AbstractPresenter() {
	}

	public T getView() {
		return view;
	}

	public void setView(T view) {
		this.view = view;
	}

	public AbstractPresenter<?> getPresenter() {
		return presenter;
	}

	public void setPresenter(AbstractPresenter<?> presenter) {
		this.presenter = presenter;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
