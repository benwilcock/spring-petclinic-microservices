package imports.k8s;

/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod.
 * <p>
 * RBD volumes support ownership management and SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.078Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RbdVolumeSource")
@software.amazon.jsii.Jsii.Proxy(RbdVolumeSource.Jsii$Proxy.class)
public interface RbdVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * The rados image name.
     * <p>
     * More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     */
    @org.jetbrains.annotations.NotNull java.lang.String getImage();

    /**
     * A collection of Ceph monitors.
     * <p>
     * More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMonitors();

    /**
     * Filesystem type of the volume that you want to mount.
     * <p>
     * Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Keyring is the path to key ring for RBDUser.
     * <p>
     * Default is /etc/ceph/keyring. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: etc/ceph/keyring. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKeyring() {
        return null;
    }

    /**
     * The rados pool name.
     * <p>
     * Default is rbd. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: rbd. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPool() {
        return null;
    }

    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Defaults to false. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: false. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * SecretRef is name of the authentication secret for RBDUser.
     * <p>
     * If provided overrides keyring. Default is nil. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: nil. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LocalObjectReference getSecretRef() {
        return null;
    }

    /**
     * The rados user name.
     * <p>
     * Default is admin. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: admin. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RbdVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RbdVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RbdVolumeSource> {
        private java.lang.String image;
        private java.util.List<java.lang.String> monitors;
        private java.lang.String fsType;
        private java.lang.String keyring;
        private java.lang.String pool;
        private java.lang.Boolean readOnly;
        private imports.k8s.LocalObjectReference secretRef;
        private java.lang.String user;

        /**
         * Sets the value of {@link RbdVolumeSource#getImage}
         * @param image The rados image name. This parameter is required.
         *              More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link RbdVolumeSource#getMonitors}
         * @param monitors A collection of Ceph monitors. This parameter is required.
         *                 More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder monitors(java.util.List<java.lang.String> monitors) {
            this.monitors = monitors;
            return this;
        }

        /**
         * Sets the value of {@link RbdVolumeSource#getFsType}
         * @param fsType Filesystem type of the volume that you want to mount.
         *               Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link RbdVolumeSource#getKeyring}
         * @param keyring Keyring is the path to key ring for RBDUser.
         *                Default is /etc/ceph/keyring. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder keyring(java.lang.String keyring) {
            this.keyring = keyring;
            return this;
        }

        /**
         * Sets the value of {@link RbdVolumeSource#getPool}
         * @param pool The rados pool name.
         *             Default is rbd. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder pool(java.lang.String pool) {
            this.pool = pool;
            return this;
        }

        /**
         * Sets the value of {@link RbdVolumeSource#getReadOnly}
         * @param readOnly ReadOnly here will force the ReadOnly setting in VolumeMounts.
         *                 Defaults to false. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link RbdVolumeSource#getSecretRef}
         * @param secretRef SecretRef is name of the authentication secret for RBDUser.
         *                  If provided overrides keyring. Default is nil. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder secretRef(imports.k8s.LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link RbdVolumeSource#getUser}
         * @param user The rados user name.
         *             Default is admin. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RbdVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RbdVolumeSource build() {
            return new Jsii$Proxy(image, monitors, fsType, keyring, pool, readOnly, secretRef, user);
        }
    }

    /**
     * An implementation for {@link RbdVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RbdVolumeSource {
        private final java.lang.String image;
        private final java.util.List<java.lang.String> monitors;
        private final java.lang.String fsType;
        private final java.lang.String keyring;
        private final java.lang.String pool;
        private final java.lang.Boolean readOnly;
        private final imports.k8s.LocalObjectReference secretRef;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.image = software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.monitors = software.amazon.jsii.Kernel.get(this, "monitors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyring = software.amazon.jsii.Kernel.get(this, "keyring", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pool = software.amazon.jsii.Kernel.get(this, "pool", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.LocalObjectReference.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String image, final java.util.List<java.lang.String> monitors, final java.lang.String fsType, final java.lang.String keyring, final java.lang.String pool, final java.lang.Boolean readOnly, final imports.k8s.LocalObjectReference secretRef, final java.lang.String user) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.image = java.util.Objects.requireNonNull(image, "image is required");
            this.monitors = java.util.Objects.requireNonNull(monitors, "monitors is required");
            this.fsType = fsType;
            this.keyring = keyring;
            this.pool = pool;
            this.readOnly = readOnly;
            this.secretRef = secretRef;
            this.user = user;
        }

        @Override
        public final java.lang.String getImage() {
            return this.image;
        }

        @Override
        public final java.util.List<java.lang.String> getMonitors() {
            return this.monitors;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.String getKeyring() {
            return this.keyring;
        }

        @Override
        public final java.lang.String getPool() {
            return this.pool;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final imports.k8s.LocalObjectReference getSecretRef() {
            return this.secretRef;
        }

        @Override
        public final java.lang.String getUser() {
            return this.user;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("image", om.valueToTree(this.getImage()));
            data.set("monitors", om.valueToTree(this.getMonitors()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getKeyring() != null) {
                data.set("keyring", om.valueToTree(this.getKeyring()));
            }
            if (this.getPool() != null) {
                data.set("pool", om.valueToTree(this.getPool()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RbdVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RbdVolumeSource.Jsii$Proxy that = (RbdVolumeSource.Jsii$Proxy) o;

            if (!image.equals(that.image)) return false;
            if (!monitors.equals(that.monitors)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.keyring != null ? !this.keyring.equals(that.keyring) : that.keyring != null) return false;
            if (this.pool != null ? !this.pool.equals(that.pool) : that.pool != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.secretRef != null ? !this.secretRef.equals(that.secretRef) : that.secretRef != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public final int hashCode() {
            int result = this.image.hashCode();
            result = 31 * result + (this.monitors.hashCode());
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.keyring != null ? this.keyring.hashCode() : 0);
            result = 31 * result + (this.pool != null ? this.pool.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
