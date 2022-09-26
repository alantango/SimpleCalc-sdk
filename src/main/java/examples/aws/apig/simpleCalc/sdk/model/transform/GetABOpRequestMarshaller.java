/**

*/
package examples.aws.apig.simpleCalc.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import examples.aws.apig.simpleCalc.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetABOpRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetABOpRequestMarshaller {

    private static final MarshallingInfo<String> A_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("a").build();
    private static final MarshallingInfo<String> B_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("b").build();
    private static final MarshallingInfo<String> OP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("op").build();

    private static final GetABOpRequestMarshaller instance = new GetABOpRequestMarshaller();

    public static GetABOpRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetABOpRequest getABOpRequest, ProtocolMarshaller protocolMarshaller) {

        if (getABOpRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getABOpRequest.getA(), A_BINDING);
            protocolMarshaller.marshall(getABOpRequest.getB(), B_BINDING);
            protocolMarshaller.marshall(getABOpRequest.getOp(), OP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
