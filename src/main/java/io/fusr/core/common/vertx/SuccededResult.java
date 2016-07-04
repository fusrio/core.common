package io.fusr.core.common.vertx;

import io.vertx.core.AsyncResult;

/**
 * Same as vertx-js. part of common to not have the dependency.
 */
public final class SuccededResult<T> implements AsyncResult<T> {

    private final T result;

    public SuccededResult(T result) {
        this.result = result;
    }

    @Override
    public T result() {
        return result;
    }

    @Override
    public Throwable cause() {
        return null;
    }

    @Override
    public boolean succeeded() {
        return true;
    }

    @Override
    public boolean failed() {
        return false;
    }
}