package imports.k8s;

/**
 * Namespace provides a scope for Names.
 * <p>
 * Use of multiple namespaces is optional.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.997Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NamespaceOptions")
@software.amazon.jsii.Jsii.Proxy(NamespaceOptions.Jsii$Proxy.class)
public interface NamespaceOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Spec defines the behavior of the Namespace.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NamespaceSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NamespaceOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NamespaceOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NamespaceOptions> {
        private imports.k8s.ObjectMeta metadata;
        private imports.k8s.NamespaceSpec spec;

        /**
         * Sets the value of {@link NamespaceOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link NamespaceOptions#getSpec}
         * @param spec Spec defines the behavior of the Namespace.
         *             More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
         * @return {@code this}
         */
        public Builder spec(imports.k8s.NamespaceSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NamespaceOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NamespaceOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link NamespaceOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NamespaceOptions {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.NamespaceSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.NamespaceSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.ObjectMeta metadata, final imports.k8s.NamespaceSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.NamespaceSpec getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.NamespaceOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NamespaceOptions.Jsii$Proxy that = (NamespaceOptions.Jsii$Proxy) o;

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
