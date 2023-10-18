/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * This file was automatically generated by Autotag.  Please do not edit it manually.
 */
package org.apache.tiles.velocity.template;

import java.io.IOException;
import java.io.Writer;

import org.apache.tiles.autotag.core.runtime.ModelBody;
import org.apache.tiles.autotag.core.runtime.AutotagRuntime;
import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.runtime.directive.Directive;
import org.apache.velocity.runtime.parser.node.Node;

/**
 * <p>
 * Add an element to the surrounding list. Equivalent to 'putAttribute', but for
 * list element.
 * </p>
 * 
 * <p>
 * Add an element to the surrounding list. This tag can only be used inside
 * 'putListAttribute' or 'addListAttribute' tags. Value can come from a direct
 * assignment (value="aValue")
 * </p>
 */
public class AddAttributeDirective extends Directive {

    /**
     * The template model.
     */
    private org.apache.tiles.template.AddAttributeModel model = new org.apache.tiles.template.AddAttributeModel();

    @Override
    public String getName() {
        return "tiles_addAttribute";
    }

    @Override
    public int getType() {
        return BLOCK;
    }

    @Override
    public boolean render(InternalContextAdapter context, Writer writer, Node node) throws IOException {
        AutotagRuntime<org.apache.tiles.request.Request> runtime = new org.apache.tiles.request.velocity.autotag.VelocityAutotagRuntime();
        if (runtime instanceof Directive) {
            ((Directive) runtime).render(context, writer, node);
        }
        org.apache.tiles.request.Request request = runtime.createRequest();
        ModelBody modelBody = runtime.createModelBody();
        model.execute(runtime.getParameter("value", java.lang.Object.class, null),
                runtime.getParameter("expression", java.lang.String.class, null),
                runtime.getParameter("role", java.lang.String.class, null),
                runtime.getParameter("type", java.lang.String.class, null), request, modelBody

        );
        return true;
    }
}