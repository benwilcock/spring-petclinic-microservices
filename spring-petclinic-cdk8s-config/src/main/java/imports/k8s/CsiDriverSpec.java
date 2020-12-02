package imports.k8s;

/**
 * CSIDriverSpec is the specification of a CSIDriver.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.860Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiDriverSpec")
@software.amazon.jsii.Jsii.Proxy(CsiDriverSpec.Jsii$Proxy.class)
public interface CsiDriverSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting.
     * <p>
     * The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachRequired() {
        return null;
    }

    /**
     * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID).
     * <p>
     * Default: false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID)
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPodInfoOnMount() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CsiDriverSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiDriverSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiDriverSpec> {
        private java.lang.Boolean attachRequired;
        private java.lang.Boolean podInfoOnMount;

        /**
         * Sets the value of {@link CsiDriverSpec#getAttachRequired}
         * @param attachRequired attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting.
         *                       The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
         * @return {@code this}
         */
        public Builder attachRequired(java.lang.Boolean attachRequired) {
            this.attachRequired = attachRequired;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverSpec#getPodInfoOnMount}
         * @param podInfoOnMount If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID).
         * @return {@code this}
         */
        public Builder podInfoOnMount(java.lang.Boolean podInfoOnMount) {
            this.podInfoOnMount = podInfoOnMount;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiDriverSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiDriverSpec build() {
            return new Jsii$Proxy(attachRequired, podInfoOnMount);
        }
    }

    /**
     * An implementation for {@link CsiDriverSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiDriverSpec {
        private final java.lang.Boolean attachRequired;
        private final java.lang.Boolean podInfoOnMount;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attachRequired = software.amazon.jsii.Kernel.get(this, "attachRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.podInfoOnMount = software.amazon.jsii.Kernel.get(this, "podInfoOnMount", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Boolean attachRequired, final java.lang.Boolean podInfoOnMount) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attachRequired = attachRequired;
            this.podInfoOnMount = podInfoOnMount;
        }

        @Override
        public final java.lang.Boolean getAttachRequired() {
            return this.attachRequired;
        }

        @Override
        public final java.lang.Boolean getPodInfoOnMount() {
            return this.podInfoOnMount;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAttachRequired() != null) {
                data.set("attachRequired", om.valueToTree(this.getAttachRequired()));
            }
            if (this.getPodInfoOnMount() != null) {
                data.set("podInfoOnMount", om.valueToTree(this.getPodInfoOnMount()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CsiDriverSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiDriverSpec.Jsii$Proxy that = (CsiDriverSpec.Jsii$Proxy) o;

            if (this.attachRequired != null ? !this.attachRequired.equals(that.attachRequired) : that.attachRequired != null) return false;
            return this.podInfoOnMount != null ? this.podInfoOnMount.equals(that.podInfoOnMount) : that.podInfoOnMount == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attachRequired != null ? this.attachRequired.hashCode() : 0;
            result = 31 * result + (this.podInfoOnMount != null ? this.podInfoOnMount.hashCode() : 0);
            return result;
        }
    }
}
