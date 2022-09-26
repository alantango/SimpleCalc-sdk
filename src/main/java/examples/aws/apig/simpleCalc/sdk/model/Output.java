/**

*/
package examples.aws.apig.simpleCalc.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/u084verqrf-2016-09-29T20:27:30Z/Output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Output implements Serializable, Cloneable, StructuredPojo {

    private Double c;

    /**
     * @param c
     */

    public void setC(Double c) {
        this.c = c;
    }

    /**
     * @return
     */

    public Double getC() {
        return this.c;
    }

    /**
     * @param c
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output c(Double c) {
        setC(c);
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
        if (getC() != null)
            sb.append("C: ").append(getC());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;
        if (other.getC() == null ^ this.getC() == null)
            return false;
        if (other.getC() != null && other.getC().equals(this.getC()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getC() == null) ? 0 : getC().hashCode());
        return hashCode;
    }

    @Override
    public Output clone() {
        try {
            return (Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        examples.aws.apig.simpleCalc.sdk.model.transform.OutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
