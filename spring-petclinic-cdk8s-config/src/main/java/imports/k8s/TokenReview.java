package imports.k8s;

/**
 * TokenReview attempts to authenticate a token to a known user.
 * <p>
 * Note: TokenReview requests may be cached by the webhook token authenticator plugin in the kube-apiserver.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.176Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.TokenReview")
public class TokenReview extends org.cdk8s.ApiObject {

    protected TokenReview(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TokenReview(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.authentication.v1.TokenReview" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public TokenReview(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.TokenReviewOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.TokenReview}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.TokenReview> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private final imports.k8s.TokenReviewOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.TokenReviewOptions.Builder();
        }

        /**
         * Spec holds information about the request being evaluated.
         * <p>
         * @return {@code this}
         * @param spec Spec holds information about the request being evaluated. This parameter is required.
         */
        public Builder spec(final imports.k8s.TokenReviewSpec spec) {
            this.options.spec(spec);
            return this;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.TokenReview}.
         */
        @Override
        public imports.k8s.TokenReview build() {
            return new imports.k8s.TokenReview(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
