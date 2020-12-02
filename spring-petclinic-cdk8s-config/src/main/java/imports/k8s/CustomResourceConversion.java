package imports.k8s;

/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.867Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceConversion")
@software.amazon.jsii.Jsii.Proxy(CustomResourceConversion.Jsii$Proxy.class)
public interface CustomResourceConversion extends software.amazon.jsii.JsiiSerializable {

    /**
     * `strategy` specifies the conversion strategy.
     * <p>
     * Allowed values are: - <code>None</code>: The converter only change the apiVersion and would not touch any other field in the CR. - <code>Webhook</code>: API Server will call to an external webhook to do the conversion. Additional information
     * is needed for this option. This requires spec.preserveUnknownFields to be false.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStrategy();

    /**
     * ConversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects.
     * <p>
     * API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, conversion will fail for this object. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Default to <code>['v1beta1']</code>.
     * <p>
     * Default: v1beta1']`.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getConversionReviewVersions() {
        return null;
    }

    /**
     * `webhookClientConfig` is the instructions for how to call the webhook if strategy is `Webhook`.
     * <p>
     * This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.WebhookClientConfig getWebhookClientConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceConversion}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceConversion}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CustomResourceConversion> {
        private java.lang.String strategy;
        private java.util.List<java.lang.String> conversionReviewVersions;
        private imports.k8s.WebhookClientConfig webhookClientConfig;

        /**
         * Sets the value of {@link CustomResourceConversion#getStrategy}
         * @param strategy `strategy` specifies the conversion strategy. This parameter is required.
         *                 Allowed values are: - <code>None</code>: The converter only change the apiVersion and would not touch any other field in the CR. - <code>Webhook</code>: API Server will call to an external webhook to do the conversion. Additional information
         *                 is needed for this option. This requires spec.preserveUnknownFields to be false.
         * @return {@code this}
         */
        public Builder strategy(java.lang.String strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceConversion#getConversionReviewVersions}
         * @param conversionReviewVersions ConversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects.
         *                                 API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, conversion will fail for this object. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Default to <code>['v1beta1']</code>.
         * @return {@code this}
         */
        public Builder conversionReviewVersions(java.util.List<java.lang.String> conversionReviewVersions) {
            this.conversionReviewVersions = conversionReviewVersions;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceConversion#getWebhookClientConfig}
         * @param webhookClientConfig `webhookClientConfig` is the instructions for how to call the webhook if strategy is `Webhook`.
         *                            This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.
         * @return {@code this}
         */
        public Builder webhookClientConfig(imports.k8s.WebhookClientConfig webhookClientConfig) {
            this.webhookClientConfig = webhookClientConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceConversion}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CustomResourceConversion build() {
            return new Jsii$Proxy(strategy, conversionReviewVersions, webhookClientConfig);
        }
    }

    /**
     * An implementation for {@link CustomResourceConversion}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceConversion {
        private final java.lang.String strategy;
        private final java.util.List<java.lang.String> conversionReviewVersions;
        private final imports.k8s.WebhookClientConfig webhookClientConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.strategy = software.amazon.jsii.Kernel.get(this, "strategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.conversionReviewVersions = software.amazon.jsii.Kernel.get(this, "conversionReviewVersions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.webhookClientConfig = software.amazon.jsii.Kernel.get(this, "webhookClientConfig", software.amazon.jsii.NativeType.forClass(imports.k8s.WebhookClientConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String strategy, final java.util.List<java.lang.String> conversionReviewVersions, final imports.k8s.WebhookClientConfig webhookClientConfig) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.strategy = java.util.Objects.requireNonNull(strategy, "strategy is required");
            this.conversionReviewVersions = conversionReviewVersions;
            this.webhookClientConfig = webhookClientConfig;
        }

        @Override
        public final java.lang.String getStrategy() {
            return this.strategy;
        }

        @Override
        public final java.util.List<java.lang.String> getConversionReviewVersions() {
            return this.conversionReviewVersions;
        }

        @Override
        public final imports.k8s.WebhookClientConfig getWebhookClientConfig() {
            return this.webhookClientConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("strategy", om.valueToTree(this.getStrategy()));
            if (this.getConversionReviewVersions() != null) {
                data.set("conversionReviewVersions", om.valueToTree(this.getConversionReviewVersions()));
            }
            if (this.getWebhookClientConfig() != null) {
                data.set("webhookClientConfig", om.valueToTree(this.getWebhookClientConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceConversion"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceConversion.Jsii$Proxy that = (CustomResourceConversion.Jsii$Proxy) o;

            if (!strategy.equals(that.strategy)) return false;
            if (this.conversionReviewVersions != null ? !this.conversionReviewVersions.equals(that.conversionReviewVersions) : that.conversionReviewVersions != null) return false;
            return this.webhookClientConfig != null ? this.webhookClientConfig.equals(that.webhookClientConfig) : that.webhookClientConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.strategy.hashCode();
            result = 31 * result + (this.conversionReviewVersions != null ? this.conversionReviewVersions.hashCode() : 0);
            result = 31 * result + (this.webhookClientConfig != null ? this.webhookClientConfig.hashCode() : 0);
            return result;
        }
    }
}
