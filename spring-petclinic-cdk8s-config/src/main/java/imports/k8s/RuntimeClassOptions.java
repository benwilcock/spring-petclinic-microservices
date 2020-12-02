package imports.k8s;

/**
 * RuntimeClass defines a class of container runtime supported in the cluster.
 * <p>
 * The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.124Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RuntimeClassOptions")
@software.amazon.jsii.Jsii.Proxy(RuntimeClassOptions.Jsii$Proxy.class)
public interface RuntimeClassOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class.
     * <p>
     * The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getHandler();

    /**
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RuntimeClassOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RuntimeClassOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RuntimeClassOptions> {
        private java.lang.String handler;
        private imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link RuntimeClassOptions#getHandler}
         * @param handler Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. This parameter is required.
         *                The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
         * @return {@code this}
         */
        public Builder handler(java.lang.String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * Sets the value of {@link RuntimeClassOptions#getMetadata}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RuntimeClassOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RuntimeClassOptions build() {
            return new Jsii$Proxy(handler, metadata);
        }
    }

    /**
     * An implementation for {@link RuntimeClassOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RuntimeClassOptions {
        private final java.lang.String handler;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.handler = software.amazon.jsii.Kernel.get(this, "handler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String handler, final imports.k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.handler = java.util.Objects.requireNonNull(handler, "handler is required");
            this.metadata = metadata;
        }

        @Override
        public final java.lang.String getHandler() {
            return this.handler;
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

            data.set("handler", om.valueToTree(this.getHandler()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RuntimeClassOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RuntimeClassOptions.Jsii$Proxy that = (RuntimeClassOptions.Jsii$Proxy) o;

            if (!handler.equals(that.handler)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.handler.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
