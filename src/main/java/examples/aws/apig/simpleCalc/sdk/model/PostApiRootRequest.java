/**

*/
package examples.aws.apig.simpleCalc.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.auth.RequestSigner;
import com.amazonaws.opensdk.protect.auth.RequestSignerAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/u084verqrf-2016-09-29T20:27:30Z/PostApiRoot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostApiRootRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable, RequestSignerAware {

    private Input input;

    /**
     * @param input
     */

    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * @return
     */

    public Input getInput() {
        return this.input;
    }

    /**
     * @param input
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostApiRootRequest input(Input input) {
        setInput(input);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInput() != null)
            sb.append("Input: ").append(getInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostApiRootRequest == false)
            return false;
        PostApiRootRequest other = (PostApiRootRequest) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        return hashCode;
    }

    @Override
    public PostApiRootRequest clone() {
        return (PostApiRootRequest) super.clone();
    }

    @Override
    public Class<? extends RequestSigner> signerType() {
        return com.amazonaws.opensdk.protect.auth.IamRequestSigner.class;
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostApiRootRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
