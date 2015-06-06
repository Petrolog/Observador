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
 * Response to Casilla detail request. ok: (Boolean) Casilla (String): List of urlsafe casilla keys
 * error: (String) If request failed, contains the reason, otherwise empty.
 * <p/>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the backend. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagesGetCasillasAssignedToObservadorResponse extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> casillas;

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
    public java.util.List<java.lang.String> getCasillas() {
        return casillas;
    }

    /**
     * @param casillas casillas or {@code null} for none
     */
    public MessagesGetCasillasAssignedToObservadorResponse setCasillas(java.util.List<java.lang.String> casillas) {
        this.casillas = casillas;
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
    public MessagesGetCasillasAssignedToObservadorResponse setError(java.lang.String error) {
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
    public MessagesGetCasillasAssignedToObservadorResponse setOk(java.lang.Boolean ok) {
        this.ok = ok;
        return this;
    }

    @Override
    public MessagesGetCasillasAssignedToObservadorResponse set(String fieldName, Object value) {
        return (MessagesGetCasillasAssignedToObservadorResponse) super.set(fieldName, value);
    }

    @Override
    public MessagesGetCasillasAssignedToObservadorResponse clone() {
        return (MessagesGetCasillasAssignedToObservadorResponse) super.clone();
    }

}
