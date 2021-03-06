package com.example.android.architecture.blueprints.todoapp.mvibase;

import io.reactivex.Observable;

/**
 * Object that will subscribes to a view's intents, process it and emit a state back.
 *
 * @param <I> Top class of the {@link MviIntent} that the {@link MviViewModel} will be subscribing
 *            to.
 * @param <S> Top class of the {@link MviViewState} the {@link MviViewModel} will be emitting.
 */
public interface MviViewModel<I extends MviIntent, S extends MviViewState> {
    void processIntents(Observable<I> intents);

    Observable<S> states();
}
