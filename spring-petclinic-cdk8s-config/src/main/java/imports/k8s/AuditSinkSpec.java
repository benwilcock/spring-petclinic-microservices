package imports.k8s;

/**
 * AuditSinkSpec holds the spec for the audit sink.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.804Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.AuditSinkSpec")
@software.amazon.jsii.Jsii.Proxy(AuditSinkSpec.Jsii$Proxy.class)
public interface AuditSinkSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Policy defines the policy for selecting which events should be sent to the webhook required.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.Policy getPolicy();

    /**
     * Webhook to send events required.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.Webhook getWebhook();

    /**
     * @return a {@link Builder} of {@link AuditSinkSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AuditSinkSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AuditSinkSpec> {
        private imports.k8s.Policy policy;
        private imports.k8s.Webhook webhook;

        /**
         * Sets the value of {@link AuditSinkSpec#getPolicy}
         * @param policy Policy defines the policy for selecting which events should be sent to the webhook required. This parameter is required.
         * @return {@code this}
         */
        public Builder policy(imports.k8s.Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link AuditSinkSpec#getWebhook}
         * @param webhook Webhook to send events required. This parameter is required.
         * @return {@code this}
         */
        public Builder webhook(imports.k8s.Webhook webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AuditSinkSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AuditSinkSpec build() {
            return new Jsii$Proxy(policy, webhook);
        }
    }

    /**
     * An implementation for {@link AuditSinkSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AuditSinkSpec {
        private final imports.k8s.Policy policy;
        private final imports.k8s.Webhook webhook;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(imports.k8s.Policy.class));
            this.webhook = software.amazon.jsii.Kernel.get(this, "webhook", software.amazon.jsii.NativeType.forClass(imports.k8s.Webhook.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.Policy policy, final imports.k8s.Webhook webhook) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.policy = java.util.Objects.requireNonNull(policy, "policy is required");
            this.webhook = java.util.Objects.requireNonNull(webhook, "webhook is required");
        }

        @Override
        public final imports.k8s.Policy getPolicy() {
            return this.policy;
        }

        @Override
        public final imports.k8s.Webhook getWebhook() {
            return this.webhook;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("policy", om.valueToTree(this.getPolicy()));
            data.set("webhook", om.valueToTree(this.getWebhook()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AuditSinkSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AuditSinkSpec.Jsii$Proxy that = (AuditSinkSpec.Jsii$Proxy) o;

            if (!policy.equals(that.policy)) return false;
            return this.webhook.equals(that.webhook);
        }

        @Override
        public final int hashCode() {
            int result = this.policy.hashCode();
            result = 31 * result + (this.webhook.hashCode());
            return result;
        }
    }
}
