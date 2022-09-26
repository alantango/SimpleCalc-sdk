/**

*/
package examples.aws.apig.simpleCalc.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import examples.aws.apig.simpleCalc.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutputMarshaller {

    private static final MarshallingInfo<Double> C_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("c").build();

    private static final OutputMarshaller instance = new OutputMarshaller();

    public static OutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Output output, ProtocolMarshaller protocolMarshaller) {

        if (output == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(output.getC(), C_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
