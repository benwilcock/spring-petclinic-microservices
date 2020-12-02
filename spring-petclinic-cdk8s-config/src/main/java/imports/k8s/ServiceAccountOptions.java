package imports.k8s;

/**
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.143Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServiceAccountOptions")
@software.amazon.jsii.Jsii.Proxy(ServiceAccountOptions.Jsii$Proxy.class)
public interface ServiceAccountOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted.
     * <p>
     * Can be overridden at the pod level.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutomountServiceAccountToken() {
        return null;
    }

    /**
     * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount.
     * <p>
     * ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.LocalObjectReference> getImagePullSecrets() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/configuration/secret
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ObjectReference> getSecrets() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceAccountOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceAccountOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceAccountOptions> {
        private java.lang.Boolean automountServiceAccountToken;
        private java.util.List<imports.k8s.LocalObjectReference> imagePullSecrets;
        private imports.k8s.ObjectMeta metadata;
        private java.util.List<imports.k8s.ObjectReference> secrets;

        /**
         * Sets the value of {@link ServiceAccountOptions#getAutomountServiceAccountToken}
         * @param automountServiceAccountToken AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted.
         *                                     Can be overridden at the pod level.
         * @return {@code this}
         */
        public Builder automountServiceAccountToken(java.lang.Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountOptions#getImagePullSecrets}
         * @param imagePullSecrets ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount.
         *                         ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder imagePullSecrets(java.util.List<? extends imports.k8s.LocalObjectReference> imagePullSecrets) {
            this.imagePullSecrets = (java.util.List<imports.k8s.LocalObjectReference>)imagePullSecrets;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountOptions#getSecrets}
         * @param secrets Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount.
         *                More info: https://kubernetes.io/docs/concepts/configuration/secret
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder secrets(java.util.List<? extends imports.k8s.ObjectReference> secrets) {
            this.secrets = (java.util.List<imports.k8s.ObjectReference>)secrets;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceAccountOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceAccountOptions build() {
            return new Jsii$Proxy(automountServiceAccountToken, imagePullSecrets, metadata, secrets);
        }
    }

    /**
     * An implementation for {@link ServiceAccountOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceAccountOptions {
        private final java.lang.Boolean automountServiceAccountToken;
        private final java.util.List<imports.k8s.LocalObjectReference> imagePullSecrets;
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<imports.k8s.ObjectReference> secrets;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.automountServiceAccountToken = software.amazon.jsii.Kernel.get(this, "automountServiceAccountToken", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.imagePullSecrets = software.amazon.jsii.Kernel.get(this, "imagePullSecrets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.LocalObjectReference.class)));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.secrets = software.amazon.jsii.Kernel.get(this, "secrets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectReference.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.Boolean automountServiceAccountToken, final java.util.List<? extends imports.k8s.LocalObjectReference> imagePullSecrets, final imports.k8s.ObjectMeta metadata, final java.util.List<? extends imports.k8s.ObjectReference> secrets) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.automountServiceAccountToken = automountServiceAccountToken;
            this.imagePullSecrets = (java.util.List<imports.k8s.LocalObjectReference>)imagePullSecrets;
            this.metadata = metadata;
            this.secrets = (java.util.List<imports.k8s.ObjectReference>)secrets;
        }

        @Override
        public final java.lang.Boolean getAutomountServiceAccountToken() {
            return this.automountServiceAccountToken;
        }

        @Override
        public final java.util.List<imports.k8s.LocalObjectReference> getImagePullSecrets() {
            return this.imagePullSecrets;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.List<imports.k8s.ObjectReference> getSecrets() {
            return this.secrets;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAutomountServiceAccountToken() != null) {
                data.set("automountServiceAccountToken", om.valueToTree(this.getAutomountServiceAccountToken()));
            }
            if (this.getImagePullSecrets() != null) {
                data.set("imagePullSecrets", om.valueToTree(this.getImagePullSecrets()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSecrets() != null) {
                data.set("secrets", om.valueToTree(this.getSecrets()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceAccountOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceAccountOptions.Jsii$Proxy that = (ServiceAccountOptions.Jsii$Proxy) o;

            if (this.automountServiceAccountToken != null ? !this.automountServiceAccountToken.equals(that.automountServiceAccountToken) : that.automountServiceAccountToken != null) return false;
            if (this.imagePullSecrets != null ? !this.imagePullSecrets.equals(that.imagePullSecrets) : that.imagePullSecrets != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.secrets != null ? this.secrets.equals(that.secrets) : that.secrets == null;
        }

        @Override
        public final int hashCode() {
            int result = this.automountServiceAccountToken != null ? this.automountServiceAccountToken.hashCode() : 0;
            result = 31 * result + (this.imagePullSecrets != null ? this.imagePullSecrets.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.secrets != null ? this.secrets.hashCode() : 0);
            return result;
        }
    }
}
