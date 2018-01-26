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
package org.particleframework.runtime.server.event;

import org.particleframework.context.event.ApplicationEvent;
import org.particleframework.runtime.server.EmbeddedServer;

/**
 * An abstract event for events specific to server applications
 * @author Graeme Rocher
 * @since 1.0
 */
public abstract class AbstractServerApplicationEvent extends ApplicationEvent {


    /**
     * Constructs a prototypical Event.
     *
     * @param embeddedServer The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AbstractServerApplicationEvent(EmbeddedServer embeddedServer) {
        super(embeddedServer);
    }

    @Override
    public EmbeddedServer getSource() {
        return (EmbeddedServer) super.getSource();
    }
}
