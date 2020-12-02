package imports.k8s;

/**
 * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.791Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.AllowedCsiDriver")
@software.amazon.jsii.Jsii.Proxy(AllowedCsiDriver.Jsii$Proxy.class)
public interface AllowedCsiDriver extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is the registered name of the CSI driver.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link AllowedCsiDriver}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AllowedCsiDriver}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AllowedCsiDriver> {
        private java.lang.String name;

        /**
         * Sets the value of {@link AllowedCsiDriver#getName}
         * @param name Name is the registered name of the CSI driver. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AllowedCsiDriver}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AllowedCsiDriver build() {
            return new Jsii$Proxy(name);
        }
    }

    /**
     * An implementation for {@link AllowedCsiDriver}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AllowedCsiDriver {
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
            struct.set("fqn", om.valueToTree("k8s.AllowedCsiDriver"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AllowedCsiDriver.Jsii$Proxy that = (AllowedCsiDriver.Jsii$Proxy) o;

            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            return result;
        }
    }
}
