package imports.k8s;

/**
 * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.200Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.WindowsSecurityContextOptions")
@software.amazon.jsii.Jsii.Proxy(WindowsSecurityContextOptions.Jsii$Proxy.class)
public interface WindowsSecurityContextOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGmsaCredentialSpec() {
        return null;
    }

    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * <p>
     * This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGmsaCredentialSpecName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WindowsSecurityContextOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WindowsSecurityContextOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WindowsSecurityContextOptions> {
        private java.lang.String gmsaCredentialSpec;
        private java.lang.String gmsaCredentialSpecName;

        /**
         * Sets the value of {@link WindowsSecurityContextOptions#getGmsaCredentialSpec}
         * @param gmsaCredentialSpec GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
         * @return {@code this}
         */
        public Builder gmsaCredentialSpec(java.lang.String gmsaCredentialSpec) {
            this.gmsaCredentialSpec = gmsaCredentialSpec;
            return this;
        }

        /**
         * Sets the value of {@link WindowsSecurityContextOptions#getGmsaCredentialSpecName}
         * @param gmsaCredentialSpecName GMSACredentialSpecName is the name of the GMSA credential spec to use.
         *                               This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
         * @return {@code this}
         */
        public Builder gmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName) {
            this.gmsaCredentialSpecName = gmsaCredentialSpecName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WindowsSecurityContextOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WindowsSecurityContextOptions build() {
            return new Jsii$Proxy(gmsaCredentialSpec, gmsaCredentialSpecName);
        }
    }

    /**
     * An implementation for {@link WindowsSecurityContextOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WindowsSecurityContextOptions {
        private final java.lang.String gmsaCredentialSpec;
        private final java.lang.String gmsaCredentialSpecName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.gmsaCredentialSpec = software.amazon.jsii.Kernel.get(this, "gmsaCredentialSpec", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gmsaCredentialSpecName = software.amazon.jsii.Kernel.get(this, "gmsaCredentialSpecName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String gmsaCredentialSpec, final java.lang.String gmsaCredentialSpecName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gmsaCredentialSpec = gmsaCredentialSpec;
            this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        }

        @Override
        public final java.lang.String getGmsaCredentialSpec() {
            return this.gmsaCredentialSpec;
        }

        @Override
        public final java.lang.String getGmsaCredentialSpecName() {
            return this.gmsaCredentialSpecName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGmsaCredentialSpec() != null) {
                data.set("gmsaCredentialSpec", om.valueToTree(this.getGmsaCredentialSpec()));
            }
            if (this.getGmsaCredentialSpecName() != null) {
                data.set("gmsaCredentialSpecName", om.valueToTree(this.getGmsaCredentialSpecName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.WindowsSecurityContextOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WindowsSecurityContextOptions.Jsii$Proxy that = (WindowsSecurityContextOptions.Jsii$Proxy) o;

            if (this.gmsaCredentialSpec != null ? !this.gmsaCredentialSpec.equals(that.gmsaCredentialSpec) : that.gmsaCredentialSpec != null) return false;
            return this.gmsaCredentialSpecName != null ? this.gmsaCredentialSpecName.equals(that.gmsaCredentialSpecName) : that.gmsaCredentialSpecName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.gmsaCredentialSpec != null ? this.gmsaCredentialSpec.hashCode() : 0;
            result = 31 * result + (this.gmsaCredentialSpecName != null ? this.gmsaCredentialSpecName.hashCode() : 0);
            return result;
        }
    }
}
