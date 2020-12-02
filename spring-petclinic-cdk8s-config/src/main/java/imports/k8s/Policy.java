package imports.k8s;

/**
 * Policy defines the configuration of how audit events are logged.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.068Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Policy")
@software.amazon.jsii.Jsii.Proxy(Policy.Jsii$Proxy.class)
public interface Policy extends software.amazon.jsii.JsiiSerializable {

    /**
     * The Level that all requests are recorded at.
     * <p>
     * available options: None, Metadata, Request, RequestResponse required
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLevel();

    /**
     * Stages is a list of stages for which events are created.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStages() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Policy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Policy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Policy> {
        private java.lang.String level;
        private java.util.List<java.lang.String> stages;

        /**
         * Sets the value of {@link Policy#getLevel}
         * @param level The Level that all requests are recorded at. This parameter is required.
         *              available options: None, Metadata, Request, RequestResponse required
         * @return {@code this}
         */
        public Builder level(java.lang.String level) {
            this.level = level;
            return this;
        }

        /**
         * Sets the value of {@link Policy#getStages}
         * @param stages Stages is a list of stages for which events are created.
         * @return {@code this}
         */
        public Builder stages(java.util.List<java.lang.String> stages) {
            this.stages = stages;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Policy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Policy build() {
            return new Jsii$Proxy(level, stages);
        }
    }

    /**
     * An implementation for {@link Policy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Policy {
        private final java.lang.String level;
        private final java.util.List<java.lang.String> stages;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.level = software.amazon.jsii.Kernel.get(this, "level", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stages = software.amazon.jsii.Kernel.get(this, "stages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String level, final java.util.List<java.lang.String> stages) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.level = java.util.Objects.requireNonNull(level, "level is required");
            this.stages = stages;
        }

        @Override
        public final java.lang.String getLevel() {
            return this.level;
        }

        @Override
        public final java.util.List<java.lang.String> getStages() {
            return this.stages;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("level", om.valueToTree(this.getLevel()));
            if (this.getStages() != null) {
                data.set("stages", om.valueToTree(this.getStages()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Policy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Policy.Jsii$Proxy that = (Policy.Jsii$Proxy) o;

            if (!level.equals(that.level)) return false;
            return this.stages != null ? this.stages.equals(that.stages) : that.stages == null;
        }

        @Override
        public final int hashCode() {
            int result = this.level.hashCode();
            result = 31 * result + (this.stages != null ? this.stages.hashCode() : 0);
            return result;
        }
    }
}
