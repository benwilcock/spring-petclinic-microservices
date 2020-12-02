package imports.k8s;

/**
 * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
 * <p>
 * VolumeAttachment objects are non-namespaced.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.191Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.VolumeAttachment")
public class VolumeAttachment extends org.cdk8s.ApiObject {

    protected VolumeAttachment(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VolumeAttachment(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.storage.v1.VolumeAttachment" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public VolumeAttachment(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.VolumeAttachmentOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.VolumeAttachment}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.VolumeAttachment> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private final imports.k8s.VolumeAttachmentOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.VolumeAttachmentOptions.Builder();
        }

        /**
         * Specification of the desired attach/detach volume behavior.
         * <p>
         * Populated by the Kubernetes system.
         * <p>
         * @return {@code this}
         * @param spec Specification of the desired attach/detach volume behavior. This parameter is required.
         */
        public Builder spec(final imports.k8s.VolumeAttachmentSpec spec) {
            this.options.spec(spec);
            return this;
        }

        /**
         * Standard object metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.VolumeAttachment}.
         */
        @Override
        public imports.k8s.VolumeAttachment build() {
            return new imports.k8s.VolumeAttachment(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
