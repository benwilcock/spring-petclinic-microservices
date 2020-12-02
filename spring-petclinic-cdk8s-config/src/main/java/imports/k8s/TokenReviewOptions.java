package imports.k8s;

/**
 * TokenReview attempts to authenticate a token to a known user.
 * <p>
 * Note: TokenReview requests may be cached by the webhook token authenticator plugin in the kube-apiserver.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.177Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.TokenReviewOptions")
@software.amazon.jsii.Jsii.Proxy(TokenReviewOptions.Jsii$Proxy.class)
public interface TokenReviewOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Spec holds information about the request being evaluated.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.TokenReviewSpec getSpec();

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TokenReviewOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TokenReviewOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TokenReviewOptions> {
        private imports.k8s.TokenReviewSpec spec;
        private imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link TokenReviewOptions#getSpec}
         * @param spec Spec holds information about the request being evaluated. This parameter is required.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.TokenReviewSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link TokenReviewOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TokenReviewOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TokenReviewOptions build() {
            return new Jsii$Proxy(spec, metadata);
        }
    }

    /**
     * An implementation for {@link TokenReviewOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TokenReviewOptions {
        private final imports.k8s.TokenReviewSpec spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.TokenReviewSpec.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.TokenReviewSpec spec, final imports.k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(spec, "spec is required");
            this.metadata = metadata;
        }

        @Override
        public final imports.k8s.TokenReviewSpec getSpec() {
            return this.spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("spec", om.valueToTree(this.getSpec()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TokenReviewOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TokenReviewOptions.Jsii$Proxy that = (TokenReviewOptions.Jsii$Proxy) o;

            if (!spec.equals(that.spec)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.spec.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
