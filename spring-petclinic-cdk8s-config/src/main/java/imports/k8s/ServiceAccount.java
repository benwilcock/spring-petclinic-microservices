package imports.k8s;

/**
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.141Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServiceAccount")
public class ServiceAccount extends org.cdk8s.ApiObject {

    protected ServiceAccount(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ServiceAccount(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.core.v1.ServiceAccount" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public ServiceAccount(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable imports.k8s.ServiceAccountOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.core.v1.ServiceAccount" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public ServiceAccount(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.ServiceAccount}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.ServiceAccount> {
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
        private imports.k8s.ServiceAccountOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted.
         * <p>
         * Can be overridden at the pod level.
         * <p>
         * @return {@code this}
         * @param automountServiceAccountToken AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. This parameter is required.
         */
        public Builder automountServiceAccountToken(final java.lang.Boolean automountServiceAccountToken) {
            this.options().automountServiceAccountToken(automountServiceAccountToken);
            return this;
        }

        /**
         * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount.
         * <p>
         * ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
         * <p>
         * @return {@code this}
         * @param imagePullSecrets ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. This parameter is required.
         */
        public Builder imagePullSecrets(final java.util.List<? extends imports.k8s.LocalObjectReference> imagePullSecrets) {
            this.options().imagePullSecrets(imagePullSecrets);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount.
         * <p>
         * More info: https://kubernetes.io/docs/concepts/configuration/secret
         * <p>
         * @return {@code this}
         * @param secrets Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. This parameter is required.
         */
        public Builder secrets(final java.util.List<? extends imports.k8s.ObjectReference> secrets) {
            this.options().secrets(secrets);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.ServiceAccount}.
         */
        @Override
        public imports.k8s.ServiceAccount build() {
            return new imports.k8s.ServiceAccount(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private imports.k8s.ServiceAccountOptions.Builder options() {
            if (this.options == null) {
                this.options = new imports.k8s.ServiceAccountOptions.Builder();
            }
            return this.options;
        }
    }
}
