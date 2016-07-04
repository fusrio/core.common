package io.fusr.core.common.vertx;

import io.vertx.core.AsyncResult;

/**
 * Same as vertx-js. part of common to not have the dependency.
 */
public class FailedResult<T> implements AsyncResult<T> {

    private final Throwable cause;

    public FailedResult(Object cause) {
        this.cause = cause instanceof Throwable ? (Throwable) cause : new Exception(cause.toString());
    }

    @Override
    public T result() {
        return null;
    }

    @Override
    public Throwable cause() {
        return cause;
    }

    @Override
    public boolean succeeded() {
        return false;
    }

    @Override
    public boolean failed() {
        return true;
    }
}