/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwt.material.design.jscore.client.api.db;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
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



import gwt.material.design.jscore.client.api.Function;
import gwt.material.design.jscore.client.api.JsObject;
import gwt.material.design.jscore.client.api.core.DOMError;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType(isNative = true)
public class IDBRequest<T> {
    
    @JsProperty
    public native void setOnsuccess(Function fn);
    
    @JsProperty
    public native Function getOnsuccess();
    
    @JsProperty
    public native void setSource(JsObject object);
    
    @JsProperty
    public native JsObject getSource();
    
    @JsProperty
    public native DOMError getError();
    
    @JsProperty
    public native void setError(DOMError dom);
    
    @JsProperty
    public native void setOnerror(Function fn);
    
    @JsProperty
    public native Function getOnerror();

    @JsProperty
    public native String getReadyState();
    
    @JsProperty
    public native T getResult();
    
    @JsProperty
    public native  IDBTransaction getTransaction();
    
}