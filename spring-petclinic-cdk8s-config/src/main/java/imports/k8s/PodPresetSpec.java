package imports.k8s;

/**
 * PodPresetSpec is a description of a pod preset.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.047Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodPresetSpec")
@software.amazon.jsii.Jsii.Proxy(PodPresetSpec.Jsii$Proxy.class)
public interface PodPresetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Env defines the collection of EnvVar to inject into containers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EnvVar> getEnv() {
        return null;
    }

    /**
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EnvFromSource> getEnvFrom() {
        return null;
    }

    /**
     * Selector is a label query over a set of resources, in this case pods.
     * <p>
     * Required.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.VolumeMount> getVolumeMounts() {
        return null;
    }

    /**
     * Volumes defines the collection of Volume to inject into the pod.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.Volume> getVolumes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodPresetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodPresetSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodPresetSpec> {
        private java.util.List<imports.k8s.EnvVar> env;
        private java.util.List<imports.k8s.EnvFromSource> envFrom;
        private imports.k8s.LabelSelector selector;
        private java.util.List<imports.k8s.VolumeMount> volumeMounts;
        private java.util.List<imports.k8s.Volume> volumes;

        /**
         * Sets the value of {@link PodPresetSpec#getEnv}
         * @param env Env defines the collection of EnvVar to inject into containers.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder env(java.util.List<? extends imports.k8s.EnvVar> env) {
            this.env = (java.util.List<imports.k8s.EnvVar>)env;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetSpec#getEnvFrom}
         * @param envFrom EnvFrom defines the collection of EnvFromSource to inject into containers.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder envFrom(java.util.List<? extends imports.k8s.EnvFromSource> envFrom) {
            this.envFrom = (java.util.List<imports.k8s.EnvFromSource>)envFrom;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetSpec#getSelector}
         * @param selector Selector is a label query over a set of resources, in this case pods.
         *                 Required.
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetSpec#getVolumeMounts}
         * @param volumeMounts VolumeMounts defines the collection of VolumeMount to inject into containers.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder volumeMounts(java.util.List<? extends imports.k8s.VolumeMount> volumeMounts) {
            this.volumeMounts = (java.util.List<imports.k8s.VolumeMount>)volumeMounts;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetSpec#getVolumes}
         * @param volumes Volumes defines the collection of Volume to inject into the pod.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder volumes(java.util.List<? extends imports.k8s.Volume> volumes) {
            this.volumes = (java.util.List<imports.k8s.Volume>)volumes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodPresetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodPresetSpec build() {
            return new Jsii$Proxy(env, envFrom, selector, volumeMounts, volumes);
        }
    }

    /**
     * An implementation for {@link PodPresetSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodPresetSpec {
        private final java.util.List<imports.k8s.EnvVar> env;
        private final java.util.List<imports.k8s.EnvFromSource> envFrom;
        private final imports.k8s.LabelSelector selector;
        private final java.util.List<imports.k8s.VolumeMount> volumeMounts;
        private final java.util.List<imports.k8s.Volume> volumes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.env = software.amazon.jsii.Kernel.get(this, "env", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EnvVar.class)));
            this.envFrom = software.amazon.jsii.Kernel.get(this, "envFrom", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EnvFromSource.class)));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.volumeMounts = software.amazon.jsii.Kernel.get(this, "volumeMounts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.VolumeMount.class)));
            this.volumes = software.amazon.jsii.Kernel.get(this, "volumes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Volume.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.k8s.EnvVar> env, final java.util.List<? extends imports.k8s.EnvFromSource> envFrom, final imports.k8s.LabelSelector selector, final java.util.List<? extends imports.k8s.VolumeMount> volumeMounts, final java.util.List<? extends imports.k8s.Volume> volumes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.env = (java.util.List<imports.k8s.EnvVar>)env;
            this.envFrom = (java.util.List<imports.k8s.EnvFromSource>)envFrom;
            this.selector = selector;
            this.volumeMounts = (java.util.List<imports.k8s.VolumeMount>)volumeMounts;
            this.volumes = (java.util.List<imports.k8s.Volume>)volumes;
        }

        @Override
        public final java.util.List<imports.k8s.EnvVar> getEnv() {
            return this.env;
        }

        @Override
        public final java.util.List<imports.k8s.EnvFromSource> getEnvFrom() {
            return this.envFrom;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.util.List<imports.k8s.VolumeMount> getVolumeMounts() {
            return this.volumeMounts;
        }

        @Override
        public final java.util.List<imports.k8s.Volume> getVolumes() {
            return this.volumes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEnv() != null) {
                data.set("env", om.valueToTree(this.getEnv()));
            }
            if (this.getEnvFrom() != null) {
                data.set("envFrom", om.valueToTree(this.getEnvFrom()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getVolumeMounts() != null) {
                data.set("volumeMounts", om.valueToTree(this.getVolumeMounts()));
            }
            if (this.getVolumes() != null) {
                data.set("volumes", om.valueToTree(this.getVolumes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodPresetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodPresetSpec.Jsii$Proxy that = (PodPresetSpec.Jsii$Proxy) o;

            if (this.env != null ? !this.env.equals(that.env) : that.env != null) return false;
            if (this.envFrom != null ? !this.envFrom.equals(that.envFrom) : that.envFrom != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.volumeMounts != null ? !this.volumeMounts.equals(that.volumeMounts) : that.volumeMounts != null) return false;
            return this.volumes != null ? this.volumes.equals(that.volumes) : that.volumes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.env != null ? this.env.hashCode() : 0;
            result = 31 * result + (this.envFrom != null ? this.envFrom.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.volumeMounts != null ? this.volumeMounts.hashCode() : 0);
            result = 31 * result + (this.volumes != null ? this.volumes.hashCode() : 0);
            return result;
        }
    }
}
