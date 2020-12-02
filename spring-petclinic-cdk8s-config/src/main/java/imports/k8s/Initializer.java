package imports.k8s;

/**
 * Initializer is information about an initializer that has not yet completed.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.940Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Initializer")
@software.amazon.jsii.Jsii.Proxy(Initializer.Jsii$Proxy.class)
public interface Initializer extends software.amazon.jsii.JsiiSerializable {

    /**
     * name of the process that is responsible for initializing this object.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link Initializer}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Initializer}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Initializer> {
        private java.lang.String name;

        /**
         * Sets the value of {@link Initializer#getName}
         * @param name name of the process that is responsible for initializing this object. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Initializer}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Initializer build() {
            return new Jsii$Proxy(name);
        }
    }

    /**
     * An implementation for {@link Initializer}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Initializer {
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Initializer"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Initializer.Jsii$Proxy that = (Initializer.Jsii$Proxy) o;

            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            return result;
        }
    }
}
