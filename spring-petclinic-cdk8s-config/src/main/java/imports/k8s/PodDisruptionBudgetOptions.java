package imports.k8s;

/**
 * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.040Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodDisruptionBudgetOptions")
@software.amazon.jsii.Jsii.Proxy(PodDisruptionBudgetOptions.Jsii$Proxy.class)
public interface PodDisruptionBudgetOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Specification of the desired behavior of the PodDisruptionBudget.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodDisruptionBudgetSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodDisruptionBudgetOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodDisruptionBudgetOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodDisruptionBudgetOptions> {
        private imports.k8s.ObjectMeta metadata;
        private imports.k8s.PodDisruptionBudgetSpec spec;

        /**
         * Sets the value of {@link PodDisruptionBudgetOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link PodDisruptionBudgetOptions#getSpec}
         * @param spec Specification of the desired behavior of the PodDisruptionBudget.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.PodDisruptionBudgetSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodDisruptionBudgetOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodDisruptionBudgetOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link PodDisruptionBudgetOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodDisruptionBudgetOptions {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.PodDisruptionBudgetSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.PodDisruptionBudgetSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.ObjectMeta metadata, final imports.k8s.PodDisruptionBudgetSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.PodDisruptionBudgetSpec getSpec() {
            return this.spec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodDisruptionBudgetOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodDisruptionBudgetOptions.Jsii$Proxy that = (PodDisruptionBudgetOptions.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
