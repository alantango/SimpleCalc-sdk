/**

*/
package examples.aws.apig.simpleCalc.sdk;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import examples.aws.apig.simpleCalc.sdk.model.*;
import examples.aws.apig.simpleCalc.sdk.model.transform.*;

/**
 * Client for accessing SimpleCalcSdk. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class SimpleCalcSdkClient implements SimpleCalcSdk {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(examples.aws.apig.simpleCalc.sdk.model.SimpleCalcSdkException.class));

    /**
     * Constructs a new client to invoke service methods on SimpleCalcSdk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    SimpleCalcSdkClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param getABOpRequest
     * @return Result of the GetABOp operation returned by the service.
     * @sample SimpleCalcSdk.GetABOp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/u084verqrf-2016-09-29T20:27:30Z/GetABOp" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetABOpResult getABOp(GetABOpRequest getABOpRequest) {
        HttpResponseHandler<GetABOpResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetABOpResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetABOpRequest, GetABOpResult>()
                .withMarshaller(new GetABOpRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getABOpRequest));
    }

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample SimpleCalcSdk.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/u084verqrf-2016-09-29T20:27:30Z/GetApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest) {
        HttpResponseHandler<GetApiRootResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetApiRootResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetApiRootRequest, GetApiRootResult>()
                .withMarshaller(new GetApiRootRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getApiRootRequest));
    }

    /**
     * @param postApiRootRequest
     * @return Result of the PostApiRoot operation returned by the service.
     * @sample SimpleCalcSdk.PostApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/u084verqrf-2016-09-29T20:27:30Z/PostApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostApiRootResult postApiRoot(PostApiRootRequest postApiRootRequest) {
        HttpResponseHandler<PostApiRootResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostApiRootResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostApiRootRequest, PostApiRootResult>()
                .withMarshaller(new PostApiRootRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postApiRootRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
