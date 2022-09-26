/**

*/
package examples.aws.apig.simpleCalc.sdk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import examples.aws.apig.simpleCalc.sdk.model.*;

/**
 * Interface for accessing SimpleCalcSdk.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface SimpleCalcSdk {

    /**
     * @param getABOpRequest
     * @return Result of the GetABOp operation returned by the service.
     * @sample SimpleCalcSdk.GetABOp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/u084verqrf-2016-09-29T20:27:30Z/GetABOp" target="_top">AWS
     *      API Documentation</a>
     */
    GetABOpResult getABOp(GetABOpRequest getABOpRequest);

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample SimpleCalcSdk.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/u084verqrf-2016-09-29T20:27:30Z/GetApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest);

    /**
     * @param postApiRootRequest
     * @return Result of the PostApiRoot operation returned by the service.
     * @sample SimpleCalcSdk.PostApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/u084verqrf-2016-09-29T20:27:30Z/PostApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    PostApiRootResult postApiRoot(PostApiRootRequest postApiRootRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static SimpleCalcSdkClientBuilder builder() {
        return new SimpleCalcSdkClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
