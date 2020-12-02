package imports.k8s;

/**
 * specification of a horizontal pod autoscaler.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.928Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HorizontalPodAutoscalerSpec")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerSpec.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * upper limit for the number of pods that can be set by the autoscaler;
     * <p>
     * cannot be smaller than MinReplicas.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxReplicas();

    /**
     * reference to scaled resource;
     * <p>
     * horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CrossVersionObjectReference getScaleTargetRef();

    /**
     * lower limit for the number of pods that can be set by the autoscaler, default 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReplicas() {
        return null;
    }

    /**
     * target average CPU utilization (represented as a percentage of requested CPU) over all the pods;
     * <p>
     * if not specified the default autoscaling policy will be used.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTargetCpuUtilizationPercentage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerSpec> {
        private java.lang.Number maxReplicas;
        private imports.k8s.CrossVersionObjectReference scaleTargetRef;
        private java.lang.Number minReplicas;
        private java.lang.Number targetCpuUtilizationPercentage;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpec#getMaxReplicas}
         * @param maxReplicas upper limit for the number of pods that can be set by the autoscaler;. This parameter is required.
         *                    cannot be smaller than MinReplicas.
         * @return {@code this}
         */
        public Builder maxReplicas(java.lang.Number maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpec#getScaleTargetRef}
         * @param scaleTargetRef reference to scaled resource;. This parameter is required.
         *                       horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
         * @return {@code this}
         */
        public Builder scaleTargetRef(imports.k8s.CrossVersionObjectReference scaleTargetRef) {
            this.scaleTargetRef = scaleTargetRef;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpec#getMinReplicas}
         * @param minReplicas lower limit for the number of pods that can be set by the autoscaler, default 1.
         * @return {@code this}
         */
        public Builder minReplicas(java.lang.Number minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpec#getTargetCpuUtilizationPercentage}
         * @param targetCpuUtilizationPercentage target average CPU utilization (represented as a percentage of requested CPU) over all the pods;.
         *                                       if not specified the default autoscaling policy will be used.
         * @return {@code this}
         */
        public Builder targetCpuUtilizationPercentage(java.lang.Number targetCpuUtilizationPercentage) {
            this.targetCpuUtilizationPercentage = targetCpuUtilizationPercentage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerSpec build() {
            return new Jsii$Proxy(maxReplicas, scaleTargetRef, minReplicas, targetCpuUtilizationPercentage);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerSpec {
        private final java.lang.Number maxReplicas;
        private final imports.k8s.CrossVersionObjectReference scaleTargetRef;
        private final java.lang.Number minReplicas;
        private final java.lang.Number targetCpuUtilizationPercentage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxReplicas = software.amazon.jsii.Kernel.get(this, "maxReplicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.scaleTargetRef = software.amazon.jsii.Kernel.get(this, "scaleTargetRef", software.amazon.jsii.NativeType.forClass(imports.k8s.CrossVersionObjectReference.class));
            this.minReplicas = software.amazon.jsii.Kernel.get(this, "minReplicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.targetCpuUtilizationPercentage = software.amazon.jsii.Kernel.get(this, "targetCPUUtilizationPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number maxReplicas, final imports.k8s.CrossVersionObjectReference scaleTargetRef, final java.lang.Number minReplicas, final java.lang.Number targetCpuUtilizationPercentage) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxReplicas = java.util.Objects.requireNonNull(maxReplicas, "maxReplicas is required");
            this.scaleTargetRef = java.util.Objects.requireNonNull(scaleTargetRef, "scaleTargetRef is required");
            this.minReplicas = minReplicas;
            this.targetCpuUtilizationPercentage = targetCpuUtilizationPercentage;
        }

        @Override
        public final java.lang.Number getMaxReplicas() {
            return this.maxReplicas;
        }

        @Override
        public final imports.k8s.CrossVersionObjectReference getScaleTargetRef() {
            return this.scaleTargetRef;
        }

        @Override
        public final java.lang.Number getMinReplicas() {
            return this.minReplicas;
        }

        @Override
        public final java.lang.Number getTargetCpuUtilizationPercentage() {
            return this.targetCpuUtilizationPercentage;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxReplicas", om.valueToTree(this.getMaxReplicas()));
            data.set("scaleTargetRef", om.valueToTree(this.getScaleTargetRef()));
            if (this.getMinReplicas() != null) {
                data.set("minReplicas", om.valueToTree(this.getMinReplicas()));
            }
            if (this.getTargetCpuUtilizationPercentage() != null) {
                data.set("targetCPUUtilizationPercentage", om.valueToTree(this.getTargetCpuUtilizationPercentage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HorizontalPodAutoscalerSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerSpec.Jsii$Proxy that = (HorizontalPodAutoscalerSpec.Jsii$Proxy) o;

            if (!maxReplicas.equals(that.maxReplicas)) return false;
            if (!scaleTargetRef.equals(that.scaleTargetRef)) return false;
            if (this.minReplicas != null ? !this.minReplicas.equals(that.minReplicas) : that.minReplicas != null) return false;
            return this.targetCpuUtilizationPercentage != null ? this.targetCpuUtilizationPercentage.equals(that.targetCpuUtilizationPercentage) : that.targetCpuUtilizationPercentage == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxReplicas.hashCode();
            result = 31 * result + (this.scaleTargetRef.hashCode());
            result = 31 * result + (this.minReplicas != null ? this.minReplicas.hashCode() : 0);
            result = 31 * result + (this.targetCpuUtilizationPercentage != null ? this.targetCpuUtilizationPercentage.hashCode() : 0);
            return result;
        }
    }
}
