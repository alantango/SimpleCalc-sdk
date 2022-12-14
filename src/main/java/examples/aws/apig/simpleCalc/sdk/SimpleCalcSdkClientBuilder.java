/**

*/
package examples.aws.apig.simpleCalc.sdk;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Signer;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link examples.aws.apig.simpleCalc.sdk.SimpleCalcSdk}.
 * 
 * @see examples.aws.apig.simpleCalc.sdk.SimpleCalcSdk#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class SimpleCalcSdkClientBuilder extends SdkSyncClientBuilder<SimpleCalcSdkClientBuilder, SimpleCalcSdk> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("u084verqrf.execute-api.us-east-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-east-1";

    /**
     * Package private constructor - builder should be created via {@link SimpleCalcSdk#builder()}
     */
    SimpleCalcSdkClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Specify an implementation of {@link AWSCredentialsProvider} to be used when signing IAM auth'd requests
     *
     * @param iamCredentials
     *        the credential provider
     */
    @Override
    public void setIamCredentials(AWSCredentialsProvider iamCredentials) {
        super.setIamCredentials(iamCredentials);
    }

    /**
     * Specify an implementation of {@link AWSCredentialsProvider} to be used when signing IAM auth'd requests
     *
     * @param iamCredentials
     *        the credential provider
     * @return This object for method chaining.
     */
    public SimpleCalcSdkClientBuilder iamCredentials(AWSCredentialsProvider iamCredentials) {
        setIamCredentials(iamCredentials);
        return this;
    }

    /**
     * Sets the IAM region to use when using IAM auth'd requests against a service in any of it's non-default regions.
     * This is only expected to be used when a custom endpoint has also been set.
     *
     * @param iamRegion
     *        the IAM region string to use when signing
     */
    public void setIamRegion(String iamRegion) {
        super.setIamRegion(iamRegion);
    }

    /**
     * Sets the IAM region to use when using IAM auth'd requests against a service in any of it's non-default regions.
     * This is only expected to be used when a custom endpoint has also been set.
     *
     * @param iamRegion
     *        the IAM region string to use when signing
     * @return This object for method chaining.
     */
    public SimpleCalcSdkClientBuilder iamRegion(String iamRegion) {
        setIamRegion(iamRegion);
        return this;
    }

    /**
     * Construct a synchronous implementation of SimpleCalcSdk using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of SimpleCalcSdk.
     */
    @Override
    protected SimpleCalcSdk build(AwsSyncClientParams params) {
        return new SimpleCalcSdkClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

    @Override
    protected Signer defaultIamSigner() {
        return signerFactory().createSigner();
    }
}
