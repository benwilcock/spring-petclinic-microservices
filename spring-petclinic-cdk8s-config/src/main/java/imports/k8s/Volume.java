package imports.k8s;

/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.187Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Volume")
@software.amazon.jsii.Jsii.Proxy(Volume.Jsii$Proxy.class)
public interface Volume extends software.amazon.jsii.JsiiSerializable {

    /**
     * Volume's name.
     * <p>
     * Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.AwsElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
        return null;
    }

    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.AzureDiskVolumeSource getAzureDisk() {
        return null;
    }

    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.AzureFileVolumeSource getAzureFile() {
        return null;
    }

    /**
     * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CephFsVolumeSource getCephfs() {
        return null;
    }

    /**
     * Cinder represents a cinder volume attached and mounted on kubelets host machine More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CinderVolumeSource getCinder() {
        return null;
    }

    /**
     * ConfigMap represents a configMap that should populate this volume.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ConfigMapVolumeSource getConfigMap() {
        return null;
    }

    /**
     * CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CsiVolumeSource getCsi() {
        return null;
    }

    /**
     * DownwardAPI represents downward API about the pod that should populate this volume.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.DownwardApiVolumeSource getDownwardApi() {
        return null;
    }

    /**
     * EmptyDir represents a temporary directory that shares a pod's lifetime.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EmptyDirVolumeSource getEmptyDir() {
        return null;
    }

    /**
     * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FcVolumeSource getFc() {
        return null;
    }

    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FlexVolumeSource getFlexVolume() {
        return null;
    }

    /**
     * Flocker represents a Flocker volume attached to a kubelet's host machine.
     * <p>
     * This depends on the Flocker control service being running
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FlockerVolumeSource getFlocker() {
        return null;
    }

    /**
     * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GcePersistentDiskVolumeSource getGcePersistentDisk() {
        return null;
    }

    /**
     * GitRepo represents a git repository at a particular revision.
     * <p>
     * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GitRepoVolumeSource getGitRepo() {
        return null;
    }

    /**
     * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
     * <p>
     * More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GlusterfsVolumeSource getGlusterfs() {
        return null;
    }

    /**
     * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
     * <p>
     * This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HostPathVolumeSource getHostPath() {
        return null;
    }

    /**
     * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://releases.k8s.io/HEAD/examples/volumes/iscsi/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IscsiVolumeSource getIscsi() {
        return null;
    }

    /**
     * NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NfsVolumeSource getNfs() {
        return null;
    }

    /**
     * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
        return null;
    }

    /**
     * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
        return null;
    }

    /**
     * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PortworxVolumeSource getPortworxVolume() {
        return null;
    }

    /**
     * Items for all in one resources secrets, configmaps, and downward API.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ProjectedVolumeSource getProjected() {
        return null;
    }

    /**
     * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.QuobyteVolumeSource getQuobyte() {
        return null;
    }

    /**
     * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
     * <p>
     * More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.RbdVolumeSource getRbd() {
        return null;
    }

    /**
     * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ScaleIoVolumeSource getScaleIo() {
        return null;
    }

    /**
     * Secret represents a secret that should populate this volume.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretVolumeSource getSecret() {
        return null;
    }

    /**
     * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.StorageOsVolumeSource getStorageos() {
        return null;
    }

    /**
     * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Volume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Volume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Volume> {
        private java.lang.String name;
        private imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore;
        private imports.k8s.AzureDiskVolumeSource azureDisk;
        private imports.k8s.AzureFileVolumeSource azureFile;
        private imports.k8s.CephFsVolumeSource cephfs;
        private imports.k8s.CinderVolumeSource cinder;
        private imports.k8s.ConfigMapVolumeSource configMap;
        private imports.k8s.CsiVolumeSource csi;
        private imports.k8s.DownwardApiVolumeSource downwardApi;
        private imports.k8s.EmptyDirVolumeSource emptyDir;
        private imports.k8s.FcVolumeSource fc;
        private imports.k8s.FlexVolumeSource flexVolume;
        private imports.k8s.FlockerVolumeSource flocker;
        private imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk;
        private imports.k8s.GitRepoVolumeSource gitRepo;
        private imports.k8s.GlusterfsVolumeSource glusterfs;
        private imports.k8s.HostPathVolumeSource hostPath;
        private imports.k8s.IscsiVolumeSource iscsi;
        private imports.k8s.NfsVolumeSource nfs;
        private imports.k8s.PersistentVolumeClaimVolumeSource persistentVolumeClaim;
        private imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk;
        private imports.k8s.PortworxVolumeSource portworxVolume;
        private imports.k8s.ProjectedVolumeSource projected;
        private imports.k8s.QuobyteVolumeSource quobyte;
        private imports.k8s.RbdVolumeSource rbd;
        private imports.k8s.ScaleIoVolumeSource scaleIo;
        private imports.k8s.SecretVolumeSource secret;
        private imports.k8s.StorageOsVolumeSource storageos;
        private imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume;

        /**
         * Sets the value of {@link Volume#getName}
         * @param name Volume's name. This parameter is required.
         *             Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getAwsElasticBlockStore}
         * @param awsElasticBlockStore AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                             More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getAzureDisk}
         * @param azureDisk AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureDisk(imports.k8s.AzureDiskVolumeSource azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getAzureFile}
         * @param azureFile AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureFile(imports.k8s.AzureFileVolumeSource azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getCephfs}
         * @param cephfs CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder cephfs(imports.k8s.CephFsVolumeSource cephfs) {
            this.cephfs = cephfs;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getCinder}
         * @param cinder Cinder represents a cinder volume attached and mounted on kubelets host machine More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md.
         * @return {@code this}
         */
        public Builder cinder(imports.k8s.CinderVolumeSource cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getConfigMap}
         * @param configMap ConfigMap represents a configMap that should populate this volume.
         * @return {@code this}
         */
        public Builder configMap(imports.k8s.ConfigMapVolumeSource configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getCsi}
         * @param csi CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
         * @return {@code this}
         */
        public Builder csi(imports.k8s.CsiVolumeSource csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getDownwardApi}
         * @param downwardApi DownwardAPI represents downward API about the pod that should populate this volume.
         * @return {@code this}
         */
        public Builder downwardApi(imports.k8s.DownwardApiVolumeSource downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getEmptyDir}
         * @param emptyDir EmptyDir represents a temporary directory that shares a pod's lifetime.
         *                 More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
         * @return {@code this}
         */
        public Builder emptyDir(imports.k8s.EmptyDirVolumeSource emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getFc}
         * @param fc FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
         * @return {@code this}
         */
        public Builder fc(imports.k8s.FcVolumeSource fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getFlexVolume}
         * @param flexVolume FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
         * @return {@code this}
         */
        public Builder flexVolume(imports.k8s.FlexVolumeSource flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getFlocker}
         * @param flocker Flocker represents a Flocker volume attached to a kubelet's host machine.
         *                This depends on the Flocker control service being running
         * @return {@code this}
         */
        public Builder flocker(imports.k8s.FlockerVolumeSource flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getGcePersistentDisk}
         * @param gcePersistentDisk GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                          More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder gcePersistentDisk(imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getGitRepo}
         * @param gitRepo GitRepo represents a git repository at a particular revision.
         *                DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
         * @return {@code this}
         */
        public Builder gitRepo(imports.k8s.GitRepoVolumeSource gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getGlusterfs}
         * @param glusterfs Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
         *                  More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md
         * @return {@code this}
         */
        public Builder glusterfs(imports.k8s.GlusterfsVolumeSource glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getHostPath}
         * @param hostPath HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
         *                 This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
         * @return {@code this}
         */
        public Builder hostPath(imports.k8s.HostPathVolumeSource hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getIscsi}
         * @param iscsi ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *              More info: https://releases.k8s.io/HEAD/examples/volumes/iscsi/README.md
         * @return {@code this}
         */
        public Builder iscsi(imports.k8s.IscsiVolumeSource iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getNfs}
         * @param nfs NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
         * @return {@code this}
         */
        public Builder nfs(imports.k8s.NfsVolumeSource nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getPersistentVolumeClaim}
         * @param persistentVolumeClaim PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
         *                              More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
         * @return {@code this}
         */
        public Builder persistentVolumeClaim(imports.k8s.PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
            this.persistentVolumeClaim = persistentVolumeClaim;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getPhotonPersistentDisk}
         * @param photonPersistentDisk PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder photonPersistentDisk(imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getPortworxVolume}
         * @param portworxVolume PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder portworxVolume(imports.k8s.PortworxVolumeSource portworxVolume) {
            this.portworxVolume = portworxVolume;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getProjected}
         * @param projected Items for all in one resources secrets, configmaps, and downward API.
         * @return {@code this}
         */
        public Builder projected(imports.k8s.ProjectedVolumeSource projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getQuobyte}
         * @param quobyte Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder quobyte(imports.k8s.QuobyteVolumeSource quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getRbd}
         * @param rbd RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
         *            More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md
         * @return {@code this}
         */
        public Builder rbd(imports.k8s.RbdVolumeSource rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getScaleIo}
         * @param scaleIo ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
         * @return {@code this}
         */
        public Builder scaleIo(imports.k8s.ScaleIoVolumeSource scaleIo) {
            this.scaleIo = scaleIo;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getSecret}
         * @param secret Secret represents a secret that should populate this volume.
         *               More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
         * @return {@code this}
         */
        public Builder secret(imports.k8s.SecretVolumeSource secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getStorageos}
         * @param storageos StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
         * @return {@code this}
         */
        public Builder storageos(imports.k8s.StorageOsVolumeSource storageos) {
            this.storageos = storageos;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getVsphereVolume}
         * @param vsphereVolume VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder vsphereVolume(imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Volume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Volume build() {
            return new Jsii$Proxy(name, awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, csi, downwardApi, emptyDir, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIo, secret, storageos, vsphereVolume);
        }
    }

    /**
     * An implementation for {@link Volume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Volume {
        private final java.lang.String name;
        private final imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore;
        private final imports.k8s.AzureDiskVolumeSource azureDisk;
        private final imports.k8s.AzureFileVolumeSource azureFile;
        private final imports.k8s.CephFsVolumeSource cephfs;
        private final imports.k8s.CinderVolumeSource cinder;
        private final imports.k8s.ConfigMapVolumeSource configMap;
        private final imports.k8s.CsiVolumeSource csi;
        private final imports.k8s.DownwardApiVolumeSource downwardApi;
        private final imports.k8s.EmptyDirVolumeSource emptyDir;
        private final imports.k8s.FcVolumeSource fc;
        private final imports.k8s.FlexVolumeSource flexVolume;
        private final imports.k8s.FlockerVolumeSource flocker;
        private final imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk;
        private final imports.k8s.GitRepoVolumeSource gitRepo;
        private final imports.k8s.GlusterfsVolumeSource glusterfs;
        private final imports.k8s.HostPathVolumeSource hostPath;
        private final imports.k8s.IscsiVolumeSource iscsi;
        private final imports.k8s.NfsVolumeSource nfs;
        private final imports.k8s.PersistentVolumeClaimVolumeSource persistentVolumeClaim;
        private final imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk;
        private final imports.k8s.PortworxVolumeSource portworxVolume;
        private final imports.k8s.ProjectedVolumeSource projected;
        private final imports.k8s.QuobyteVolumeSource quobyte;
        private final imports.k8s.RbdVolumeSource rbd;
        private final imports.k8s.ScaleIoVolumeSource scaleIo;
        private final imports.k8s.SecretVolumeSource secret;
        private final imports.k8s.StorageOsVolumeSource storageos;
        private final imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.awsElasticBlockStore = software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.k8s.AwsElasticBlockStoreVolumeSource.class));
            this.azureDisk = software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.AzureDiskVolumeSource.class));
            this.azureFile = software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.k8s.AzureFileVolumeSource.class));
            this.cephfs = software.amazon.jsii.Kernel.get(this, "cephfs", software.amazon.jsii.NativeType.forClass(imports.k8s.CephFsVolumeSource.class));
            this.cinder = software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.k8s.CinderVolumeSource.class));
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.k8s.ConfigMapVolumeSource.class));
            this.csi = software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.k8s.CsiVolumeSource.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardAPI", software.amazon.jsii.NativeType.forClass(imports.k8s.DownwardApiVolumeSource.class));
            this.emptyDir = software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.k8s.EmptyDirVolumeSource.class));
            this.fc = software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.k8s.FcVolumeSource.class));
            this.flexVolume = software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.FlexVolumeSource.class));
            this.flocker = software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.k8s.FlockerVolumeSource.class));
            this.gcePersistentDisk = software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.GcePersistentDiskVolumeSource.class));
            this.gitRepo = software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.k8s.GitRepoVolumeSource.class));
            this.glusterfs = software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.k8s.GlusterfsVolumeSource.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.k8s.HostPathVolumeSource.class));
            this.iscsi = software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.k8s.IscsiVolumeSource.class));
            this.nfs = software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.k8s.NfsVolumeSource.class));
            this.persistentVolumeClaim = software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.k8s.PersistentVolumeClaimVolumeSource.class));
            this.photonPersistentDisk = software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.PhotonPersistentDiskVolumeSource.class));
            this.portworxVolume = software.amazon.jsii.Kernel.get(this, "portworxVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.PortworxVolumeSource.class));
            this.projected = software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(imports.k8s.ProjectedVolumeSource.class));
            this.quobyte = software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.k8s.QuobyteVolumeSource.class));
            this.rbd = software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.k8s.RbdVolumeSource.class));
            this.scaleIo = software.amazon.jsii.Kernel.get(this, "scaleIO", software.amazon.jsii.NativeType.forClass(imports.k8s.ScaleIoVolumeSource.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretVolumeSource.class));
            this.storageos = software.amazon.jsii.Kernel.get(this, "storageos", software.amazon.jsii.NativeType.forClass(imports.k8s.StorageOsVolumeSource.class));
            this.vsphereVolume = software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.VsphereVirtualDiskVolumeSource.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String name, final imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore, final imports.k8s.AzureDiskVolumeSource azureDisk, final imports.k8s.AzureFileVolumeSource azureFile, final imports.k8s.CephFsVolumeSource cephfs, final imports.k8s.CinderVolumeSource cinder, final imports.k8s.ConfigMapVolumeSource configMap, final imports.k8s.CsiVolumeSource csi, final imports.k8s.DownwardApiVolumeSource downwardApi, final imports.k8s.EmptyDirVolumeSource emptyDir, final imports.k8s.FcVolumeSource fc, final imports.k8s.FlexVolumeSource flexVolume, final imports.k8s.FlockerVolumeSource flocker, final imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk, final imports.k8s.GitRepoVolumeSource gitRepo, final imports.k8s.GlusterfsVolumeSource glusterfs, final imports.k8s.HostPathVolumeSource hostPath, final imports.k8s.IscsiVolumeSource iscsi, final imports.k8s.NfsVolumeSource nfs, final imports.k8s.PersistentVolumeClaimVolumeSource persistentVolumeClaim, final imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk, final imports.k8s.PortworxVolumeSource portworxVolume, final imports.k8s.ProjectedVolumeSource projected, final imports.k8s.QuobyteVolumeSource quobyte, final imports.k8s.RbdVolumeSource rbd, final imports.k8s.ScaleIoVolumeSource scaleIo, final imports.k8s.SecretVolumeSource secret, final imports.k8s.StorageOsVolumeSource storageos, final imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.awsElasticBlockStore = awsElasticBlockStore;
            this.azureDisk = azureDisk;
            this.azureFile = azureFile;
            this.cephfs = cephfs;
            this.cinder = cinder;
            this.configMap = configMap;
            this.csi = csi;
            this.downwardApi = downwardApi;
            this.emptyDir = emptyDir;
            this.fc = fc;
            this.flexVolume = flexVolume;
            this.flocker = flocker;
            this.gcePersistentDisk = gcePersistentDisk;
            this.gitRepo = gitRepo;
            this.glusterfs = glusterfs;
            this.hostPath = hostPath;
            this.iscsi = iscsi;
            this.nfs = nfs;
            this.persistentVolumeClaim = persistentVolumeClaim;
            this.photonPersistentDisk = photonPersistentDisk;
            this.portworxVolume = portworxVolume;
            this.projected = projected;
            this.quobyte = quobyte;
            this.rbd = rbd;
            this.scaleIo = scaleIo;
            this.secret = secret;
            this.storageos = storageos;
            this.vsphereVolume = vsphereVolume;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.k8s.AwsElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public final imports.k8s.AzureDiskVolumeSource getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public final imports.k8s.AzureFileVolumeSource getAzureFile() {
            return this.azureFile;
        }

        @Override
        public final imports.k8s.CephFsVolumeSource getCephfs() {
            return this.cephfs;
        }

        @Override
        public final imports.k8s.CinderVolumeSource getCinder() {
            return this.cinder;
        }

        @Override
        public final imports.k8s.ConfigMapVolumeSource getConfigMap() {
            return this.configMap;
        }

        @Override
        public final imports.k8s.CsiVolumeSource getCsi() {
            return this.csi;
        }

        @Override
        public final imports.k8s.DownwardApiVolumeSource getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final imports.k8s.EmptyDirVolumeSource getEmptyDir() {
            return this.emptyDir;
        }

        @Override
        public final imports.k8s.FcVolumeSource getFc() {
            return this.fc;
        }

        @Override
        public final imports.k8s.FlexVolumeSource getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public final imports.k8s.FlockerVolumeSource getFlocker() {
            return this.flocker;
        }

        @Override
        public final imports.k8s.GcePersistentDiskVolumeSource getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public final imports.k8s.GitRepoVolumeSource getGitRepo() {
            return this.gitRepo;
        }

        @Override
        public final imports.k8s.GlusterfsVolumeSource getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public final imports.k8s.HostPathVolumeSource getHostPath() {
            return this.hostPath;
        }

        @Override
        public final imports.k8s.IscsiVolumeSource getIscsi() {
            return this.iscsi;
        }

        @Override
        public final imports.k8s.NfsVolumeSource getNfs() {
            return this.nfs;
        }

        @Override
        public final imports.k8s.PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
            return this.persistentVolumeClaim;
        }

        @Override
        public final imports.k8s.PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public final imports.k8s.PortworxVolumeSource getPortworxVolume() {
            return this.portworxVolume;
        }

        @Override
        public final imports.k8s.ProjectedVolumeSource getProjected() {
            return this.projected;
        }

        @Override
        public final imports.k8s.QuobyteVolumeSource getQuobyte() {
            return this.quobyte;
        }

        @Override
        public final imports.k8s.RbdVolumeSource getRbd() {
            return this.rbd;
        }

        @Override
        public final imports.k8s.ScaleIoVolumeSource getScaleIo() {
            return this.scaleIo;
        }

        @Override
        public final imports.k8s.SecretVolumeSource getSecret() {
            return this.secret;
        }

        @Override
        public final imports.k8s.StorageOsVolumeSource getStorageos() {
            return this.storageos;
        }

        @Override
        public final imports.k8s.VsphereVirtualDiskVolumeSource getVsphereVolume() {
            return this.vsphereVolume;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getAwsElasticBlockStore() != null) {
                data.set("awsElasticBlockStore", om.valueToTree(this.getAwsElasticBlockStore()));
            }
            if (this.getAzureDisk() != null) {
                data.set("azureDisk", om.valueToTree(this.getAzureDisk()));
            }
            if (this.getAzureFile() != null) {
                data.set("azureFile", om.valueToTree(this.getAzureFile()));
            }
            if (this.getCephfs() != null) {
                data.set("cephfs", om.valueToTree(this.getCephfs()));
            }
            if (this.getCinder() != null) {
                data.set("cinder", om.valueToTree(this.getCinder()));
            }
            if (this.getConfigMap() != null) {
                data.set("configMap", om.valueToTree(this.getConfigMap()));
            }
            if (this.getCsi() != null) {
                data.set("csi", om.valueToTree(this.getCsi()));
            }
            if (this.getDownwardApi() != null) {
                data.set("downwardAPI", om.valueToTree(this.getDownwardApi()));
            }
            if (this.getEmptyDir() != null) {
                data.set("emptyDir", om.valueToTree(this.getEmptyDir()));
            }
            if (this.getFc() != null) {
                data.set("fc", om.valueToTree(this.getFc()));
            }
            if (this.getFlexVolume() != null) {
                data.set("flexVolume", om.valueToTree(this.getFlexVolume()));
            }
            if (this.getFlocker() != null) {
                data.set("flocker", om.valueToTree(this.getFlocker()));
            }
            if (this.getGcePersistentDisk() != null) {
                data.set("gcePersistentDisk", om.valueToTree(this.getGcePersistentDisk()));
            }
            if (this.getGitRepo() != null) {
                data.set("gitRepo", om.valueToTree(this.getGitRepo()));
            }
            if (this.getGlusterfs() != null) {
                data.set("glusterfs", om.valueToTree(this.getGlusterfs()));
            }
            if (this.getHostPath() != null) {
                data.set("hostPath", om.valueToTree(this.getHostPath()));
            }
            if (this.getIscsi() != null) {
                data.set("iscsi", om.valueToTree(this.getIscsi()));
            }
            if (this.getNfs() != null) {
                data.set("nfs", om.valueToTree(this.getNfs()));
            }
            if (this.getPersistentVolumeClaim() != null) {
                data.set("persistentVolumeClaim", om.valueToTree(this.getPersistentVolumeClaim()));
            }
            if (this.getPhotonPersistentDisk() != null) {
                data.set("photonPersistentDisk", om.valueToTree(this.getPhotonPersistentDisk()));
            }
            if (this.getPortworxVolume() != null) {
                data.set("portworxVolume", om.valueToTree(this.getPortworxVolume()));
            }
            if (this.getProjected() != null) {
                data.set("projected", om.valueToTree(this.getProjected()));
            }
            if (this.getQuobyte() != null) {
                data.set("quobyte", om.valueToTree(this.getQuobyte()));
            }
            if (this.getRbd() != null) {
                data.set("rbd", om.valueToTree(this.getRbd()));
            }
            if (this.getScaleIo() != null) {
                data.set("scaleIO", om.valueToTree(this.getScaleIo()));
            }
            if (this.getSecret() != null) {
                data.set("secret", om.valueToTree(this.getSecret()));
            }
            if (this.getStorageos() != null) {
                data.set("storageos", om.valueToTree(this.getStorageos()));
            }
            if (this.getVsphereVolume() != null) {
                data.set("vsphereVolume", om.valueToTree(this.getVsphereVolume()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Volume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Volume.Jsii$Proxy that = (Volume.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.awsElasticBlockStore != null ? !this.awsElasticBlockStore.equals(that.awsElasticBlockStore) : that.awsElasticBlockStore != null) return false;
            if (this.azureDisk != null ? !this.azureDisk.equals(that.azureDisk) : that.azureDisk != null) return false;
            if (this.azureFile != null ? !this.azureFile.equals(that.azureFile) : that.azureFile != null) return false;
            if (this.cephfs != null ? !this.cephfs.equals(that.cephfs) : that.cephfs != null) return false;
            if (this.cinder != null ? !this.cinder.equals(that.cinder) : that.cinder != null) return false;
            if (this.configMap != null ? !this.configMap.equals(that.configMap) : that.configMap != null) return false;
            if (this.csi != null ? !this.csi.equals(that.csi) : that.csi != null) return false;
            if (this.downwardApi != null ? !this.downwardApi.equals(that.downwardApi) : that.downwardApi != null) return false;
            if (this.emptyDir != null ? !this.emptyDir.equals(that.emptyDir) : that.emptyDir != null) return false;
            if (this.fc != null ? !this.fc.equals(that.fc) : that.fc != null) return false;
            if (this.flexVolume != null ? !this.flexVolume.equals(that.flexVolume) : that.flexVolume != null) return false;
            if (this.flocker != null ? !this.flocker.equals(that.flocker) : that.flocker != null) return false;
            if (this.gcePersistentDisk != null ? !this.gcePersistentDisk.equals(that.gcePersistentDisk) : that.gcePersistentDisk != null) return false;
            if (this.gitRepo != null ? !this.gitRepo.equals(that.gitRepo) : that.gitRepo != null) return false;
            if (this.glusterfs != null ? !this.glusterfs.equals(that.glusterfs) : that.glusterfs != null) return false;
            if (this.hostPath != null ? !this.hostPath.equals(that.hostPath) : that.hostPath != null) return false;
            if (this.iscsi != null ? !this.iscsi.equals(that.iscsi) : that.iscsi != null) return false;
            if (this.nfs != null ? !this.nfs.equals(that.nfs) : that.nfs != null) return false;
            if (this.persistentVolumeClaim != null ? !this.persistentVolumeClaim.equals(that.persistentVolumeClaim) : that.persistentVolumeClaim != null) return false;
            if (this.photonPersistentDisk != null ? !this.photonPersistentDisk.equals(that.photonPersistentDisk) : that.photonPersistentDisk != null) return false;
            if (this.portworxVolume != null ? !this.portworxVolume.equals(that.portworxVolume) : that.portworxVolume != null) return false;
            if (this.projected != null ? !this.projected.equals(that.projected) : that.projected != null) return false;
            if (this.quobyte != null ? !this.quobyte.equals(that.quobyte) : that.quobyte != null) return false;
            if (this.rbd != null ? !this.rbd.equals(that.rbd) : that.rbd != null) return false;
            if (this.scaleIo != null ? !this.scaleIo.equals(that.scaleIo) : that.scaleIo != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            if (this.storageos != null ? !this.storageos.equals(that.storageos) : that.storageos != null) return false;
            return this.vsphereVolume != null ? this.vsphereVolume.equals(that.vsphereVolume) : that.vsphereVolume == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.awsElasticBlockStore != null ? this.awsElasticBlockStore.hashCode() : 0);
            result = 31 * result + (this.azureDisk != null ? this.azureDisk.hashCode() : 0);
            result = 31 * result + (this.azureFile != null ? this.azureFile.hashCode() : 0);
            result = 31 * result + (this.cephfs != null ? this.cephfs.hashCode() : 0);
            result = 31 * result + (this.cinder != null ? this.cinder.hashCode() : 0);
            result = 31 * result + (this.configMap != null ? this.configMap.hashCode() : 0);
            result = 31 * result + (this.csi != null ? this.csi.hashCode() : 0);
            result = 31 * result + (this.downwardApi != null ? this.downwardApi.hashCode() : 0);
            result = 31 * result + (this.emptyDir != null ? this.emptyDir.hashCode() : 0);
            result = 31 * result + (this.fc != null ? this.fc.hashCode() : 0);
            result = 31 * result + (this.flexVolume != null ? this.flexVolume.hashCode() : 0);
            result = 31 * result + (this.flocker != null ? this.flocker.hashCode() : 0);
            result = 31 * result + (this.gcePersistentDisk != null ? this.gcePersistentDisk.hashCode() : 0);
            result = 31 * result + (this.gitRepo != null ? this.gitRepo.hashCode() : 0);
            result = 31 * result + (this.glusterfs != null ? this.glusterfs.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            result = 31 * result + (this.iscsi != null ? this.iscsi.hashCode() : 0);
            result = 31 * result + (this.nfs != null ? this.nfs.hashCode() : 0);
            result = 31 * result + (this.persistentVolumeClaim != null ? this.persistentVolumeClaim.hashCode() : 0);
            result = 31 * result + (this.photonPersistentDisk != null ? this.photonPersistentDisk.hashCode() : 0);
            result = 31 * result + (this.portworxVolume != null ? this.portworxVolume.hashCode() : 0);
            result = 31 * result + (this.projected != null ? this.projected.hashCode() : 0);
            result = 31 * result + (this.quobyte != null ? this.quobyte.hashCode() : 0);
            result = 31 * result + (this.rbd != null ? this.rbd.hashCode() : 0);
            result = 31 * result + (this.scaleIo != null ? this.scaleIo.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.storageos != null ? this.storageos.hashCode() : 0);
            result = 31 * result + (this.vsphereVolume != null ? this.vsphereVolume.hashCode() : 0);
            return result;
        }
    }
}
