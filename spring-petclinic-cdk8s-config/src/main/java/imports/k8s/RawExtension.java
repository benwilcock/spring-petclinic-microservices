package imports.k8s;

/**
 * RawExtension is used to hold extensions in external versions.
 * <p>
 * To use this, make a field which has RawExtension as its type in your external, versioned struct, and Object in your internal struct. You also need to register your various plugin types.
 * <p>
 * // Internal package: type MyAPIObject struct {
 * runtime.TypeMeta <code>json:",inline"</code>
 * MyPlugin runtime.Object <code>json:"myPlugin"</code>
 * } type PluginA struct {
 * AOption string <code>json:"aOption"</code>
 * }
 * <p>
 * // External package: type MyAPIObject struct {
 * runtime.TypeMeta <code>json:",inline"</code>
 * MyPlugin runtime.RawExtension <code>json:"myPlugin"</code>
 * } type PluginA struct {
 * AOption string <code>json:"aOption"</code>
 * }
 * <p>
 * // On the wire, the JSON will look something like this: {
 * "kind":"MyAPIObject",
 * "apiVersion":"v1",
 * "myPlugin": {
 * "kind":"PluginA",
 * "aOption":"foo",
 * },
 * }
 * <p>
 * So what happens? Decode first uses json or yaml to unmarshal the serialized data into your external MyAPIObject. That causes the raw JSON to be stored, but not unpacked. The next step is to copy (using pkg/conversion) into the internal struct. The runtime package's DefaultScheme has conversion functions installed which will unpack the JSON stored in RawExtension, turning it into the correct object type, and storing it in the Object. (TODO: In the case where the object is of an unknown type, a runtime.Unknown object will be created and stored.)
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.075Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RawExtension")
@software.amazon.jsii.Jsii.Proxy(RawExtension.Jsii$Proxy.class)
public interface RawExtension extends software.amazon.jsii.JsiiSerializable {

    /**
     * Raw is the underlying serialization of this object.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRaw() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RawExtension}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RawExtension}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RawExtension> {
        private java.lang.String raw;

        /**
         * Sets the value of {@link RawExtension#getRaw}
         * @param raw Raw is the underlying serialization of this object.
         * @return {@code this}
         */
        public Builder raw(java.lang.String raw) {
            this.raw = raw;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RawExtension}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RawExtension build() {
            return new Jsii$Proxy(raw);
        }
    }

    /**
     * An implementation for {@link RawExtension}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RawExtension {
        private final java.lang.String raw;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.raw = software.amazon.jsii.Kernel.get(this, "raw", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String raw) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.raw = raw;
        }

        @Override
        public final java.lang.String getRaw() {
            return this.raw;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRaw() != null) {
                data.set("raw", om.valueToTree(this.getRaw()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RawExtension"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RawExtension.Jsii$Proxy that = (RawExtension.Jsii$Proxy) o;

            return this.raw != null ? this.raw.equals(that.raw) : that.raw == null;
        }

        @Override
        public final int hashCode() {
            int result = this.raw != null ? this.raw.hashCode() : 0;
            return result;
        }
    }
}
