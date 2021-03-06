/*
 * Copyright 2014 Cristian Rinaldi & Andres Testi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gwt.material.design.jquery.client.api;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Represent a JQuery Promise
 *
 * @author Cristian Rinaldi
 */
@JsType(name = "Promise", isNative = true)
public interface Promise {

    Promise then(Functions.FuncRet1<Object> f);

    Promise then(Functions.EventFunc1<Object> f);

    Promise done(Functions.EventFunc1<Object> f);

    Promise when(Functions.EventFunc1<Object> f);

    @JsMethod(name = "catch")
    Promise fail(Functions.EventFunc1<Object> f);

    Promise always(Functions.EventFunc1<Object> f);
}
