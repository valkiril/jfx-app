package eu.valev.dev.presenter;

import eu.valev.dev.view.AbstractView;

/**
 * 
 * @author Kiril Valev
 *
 * @param <T>
 */
public abstract class AbstractPresenter<T extends AbstractView<?>> {
	
	private T view;

	public T getView() {
		return view;
	}

	public void setView(T view) {
		this.view = view;
	}
}
