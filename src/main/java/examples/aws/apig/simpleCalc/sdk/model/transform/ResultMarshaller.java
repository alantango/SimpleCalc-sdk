/**

*/
package examples.aws.apig.simpleCalc.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import examples.aws.apig.simpleCalc.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("input").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("output").build();

    private static final ResultMarshaller instance = new ResultMarshaller();

    public static ResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Result result, ProtocolMarshaller protocolMarshaller) {

        if (result == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(result.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(result.getOutput(), OUTPUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
