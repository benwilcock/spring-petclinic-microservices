package imports.k8s;

/**
 * Pod is a collection of containers that can run on a host.
 * <p>
 * This resource is created by clients and scheduled onto hosts.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.043Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodOptions")
@software.amazon.jsii.Jsii.Proxy(PodOptions.Jsii$Proxy.class)
public interface PodOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Specification of the desired behavior of the pod.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodOptions> {
        private imports.k8s.ObjectMeta metadata;
        private imports.k8s.PodSpec spec;

        /**
         * Sets the value of {@link PodOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link PodOptions#getSpec}
         * @param spec Specification of the desired behavior of the pod.
         *             More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
         * @return {@code this}
         */
        public Builder spec(imports.k8s.PodSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link PodOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodOptions {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.PodSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.PodSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.ObjectMeta metadata, final imports.k8s.PodSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.PodSpec getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.PodOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodOptions.Jsii$Proxy that = (PodOptions.Jsii$Proxy) o;

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
