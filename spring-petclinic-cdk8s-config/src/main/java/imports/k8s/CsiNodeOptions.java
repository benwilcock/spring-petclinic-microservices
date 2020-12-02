package imports.k8s;

/**
 * CSINode holds information about all CSI drivers installed on a node.
 * <p>
 * CSI drivers do not need to create the CSINode object directly. As long as they use the node-driver-registrar sidecar container, the kubelet will automatically populate the CSINode object for the CSI driver as part of kubelet plugin registration. CSINode has the same name as a node. If the object is missing, it means either there are no CSI Drivers available on the node, or the Kubelet version is low enough that it doesn't create this object. CSINode has an OwnerReference that points to the corresponding node object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.863Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiNodeOptions")
@software.amazon.jsii.Jsii.Proxy(CsiNodeOptions.Jsii$Proxy.class)
public interface CsiNodeOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * spec is the specification of CSINode.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CsiNodeSpec getSpec();

    /**
     * metadata.name must be the Kubernetes node name.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CsiNodeOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiNodeOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiNodeOptions> {
        private imports.k8s.CsiNodeSpec spec;
        private imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link CsiNodeOptions#getSpec}
         * @param spec spec is the specification of CSINode. This parameter is required.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.CsiNodeSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link CsiNodeOptions#getMetadata}
         * @param metadata metadata.name must be the Kubernetes node name.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiNodeOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiNodeOptions build() {
            return new Jsii$Proxy(spec, metadata);
        }
    }

    /**
     * An implementation for {@link CsiNodeOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiNodeOptions {
        private final imports.k8s.CsiNodeSpec spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.CsiNodeSpec.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.CsiNodeSpec spec, final imports.k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(spec, "spec is required");
            this.metadata = metadata;
        }

        @Override
        public final imports.k8s.CsiNodeSpec getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.CsiNodeOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiNodeOptions.Jsii$Proxy that = (CsiNodeOptions.Jsii$Proxy) o;

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
