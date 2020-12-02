package imports.k8s;

/**
 * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.131Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SeLinuxStrategyOptions")
@software.amazon.jsii.Jsii.Proxy(SeLinuxStrategyOptions.Jsii$Proxy.class)
public interface SeLinuxStrategyOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * rule is the strategy that will dictate the allowable labels that may be set.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRule();

    /**
     * seLinuxOptions required to run as;
     * <p>
     * required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SeLinuxOptions getSeLinuxOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SeLinuxStrategyOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SeLinuxStrategyOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SeLinuxStrategyOptions> {
        private java.lang.String rule;
        private imports.k8s.SeLinuxOptions seLinuxOptions;

        /**
         * Sets the value of {@link SeLinuxStrategyOptions#getRule}
         * @param rule rule is the strategy that will dictate the allowable labels that may be set. This parameter is required.
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link SeLinuxStrategyOptions#getSeLinuxOptions}
         * @param seLinuxOptions seLinuxOptions required to run as;.
         *                       required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
         * @return {@code this}
         */
        public Builder seLinuxOptions(imports.k8s.SeLinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SeLinuxStrategyOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SeLinuxStrategyOptions build() {
            return new Jsii$Proxy(rule, seLinuxOptions);
        }
    }

    /**
     * An implementation for {@link SeLinuxStrategyOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SeLinuxStrategyOptions {
        private final java.lang.String rule;
        private final imports.k8s.SeLinuxOptions seLinuxOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.seLinuxOptions = software.amazon.jsii.Kernel.get(this, "seLinuxOptions", software.amazon.jsii.NativeType.forClass(imports.k8s.SeLinuxOptions.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String rule, final imports.k8s.SeLinuxOptions seLinuxOptions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rule = java.util.Objects.requireNonNull(rule, "rule is required");
            this.seLinuxOptions = seLinuxOptions;
        }

        @Override
        public final java.lang.String getRule() {
            return this.rule;
        }

        @Override
        public final imports.k8s.SeLinuxOptions getSeLinuxOptions() {
            return this.seLinuxOptions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rule", om.valueToTree(this.getRule()));
            if (this.getSeLinuxOptions() != null) {
                data.set("seLinuxOptions", om.valueToTree(this.getSeLinuxOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SeLinuxStrategyOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SeLinuxStrategyOptions.Jsii$Proxy that = (SeLinuxStrategyOptions.Jsii$Proxy) o;

            if (!rule.equals(that.rule)) return false;
            return this.seLinuxOptions != null ? this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rule.hashCode();
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            return result;
        }
    }
}
