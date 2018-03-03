/*
 * Copyright 2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.particleframework.retry.event;

import org.particleframework.context.event.ApplicationEvent;
import org.particleframework.inject.ExecutableMethod;
import org.particleframework.retry.RetryState;

/**
 * An event fired when the Circuit is {@link org.particleframework.retry.CircuitState#OPEN} and
 * requests are no longer being accepted
 *
 * @author graemerocher
 * @since 1.0
 */
public class CircuitOpenEvent extends ApplicationEvent {
    private final RetryState retryState;
    private final Throwable throwable;

    public CircuitOpenEvent(
            ExecutableMethod<?,?> source,
            RetryState retryState,
            Throwable throwable) {
        super(source);
        this.retryState = retryState;
        this.throwable = throwable;
    }

    /**
     * @return The retry context
     */
    public RetryState getRetryState() {
        return retryState;
    }

    /**
     * @return The original exception that will be rethrown to the user
     */
    public Throwable getThrowable() {
        return throwable;
    }

    /**
     * @return The method that represents the circuit
     */
    @Override
    public ExecutableMethod<?,?> getSource() {
        return (ExecutableMethod<?, ?>) super.getSource();
    }
}
