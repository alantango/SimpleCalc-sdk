/**

*/
package examples.aws.apig.simpleCalc.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import examples.aws.apig.simpleCalc.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetApiRootRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetApiRootRequestMarshaller {

    private static final MarshallingInfo<String> A_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("a").build();
    private static final MarshallingInfo<String> B_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("b").build();
    private static final MarshallingInfo<String> OP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("op").build();

    private static final GetApiRootRequestMarshaller instance = new GetApiRootRequestMarshaller();

    public static GetApiRootRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetApiRootRequest getApiRootRequest, ProtocolMarshaller protocolMarshaller) {

        if (getApiRootRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getApiRootRequest.getA(), A_BINDING);
            protocolMarshaller.marshall(getApiRootRequest.getB(), B_BINDING);
            protocolMarshaller.marshall(getApiRootRequest.getOp(), OP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
