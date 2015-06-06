/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-06-05 at 17:09:58 UTC 
 * Modify at your own risk.
 */

package com.appspot.observador_electoral.backend.model;

/**
 * Response to all clasificaciones request. Contains the URL safe keys of the clasificaciones ok:
 * (Boolean) Location creation successful or failed clasificacion (String): A clasificacion error:
 * (String) If creation failed, contains the reason, otherwise empty.
 * <p/>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the backend. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagesGetAllClasificacionesResponse extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> clasificacion;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String error;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean ok;

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion clasificacion or {@code null} for none
     */
    public MessagesGetAllClasificacionesResponse setClasificacion(java.util.List<java.lang.String> clasificacion) {
        this.clasificacion = clasificacion;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getError() {
        return error;
    }

    /**
     * @param error error or {@code null} for none
     */
    public MessagesGetAllClasificacionesResponse setError(java.lang.String error) {
        this.error = error;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getOk() {
        return ok;
    }

    /**
     * @param ok ok or {@code null} for none
     */
    public MessagesGetAllClasificacionesResponse setOk(java.lang.Boolean ok) {
        this.ok = ok;
        return this;
    }

    @Override
    public MessagesGetAllClasificacionesResponse set(String fieldName, Object value) {
        return (MessagesGetAllClasificacionesResponse) super.set(fieldName, value);
    }

    @Override
    public MessagesGetAllClasificacionesResponse clone() {
        return (MessagesGetAllClasificacionesResponse) super.clone();
    }

}
