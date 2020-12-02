package imports.k8s;

/**
 * Handler defines a specific action that should be taken.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.921Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Handler")
@software.amazon.jsii.Jsii.Proxy(Handler.Jsii$Proxy.class)
public interface Handler extends software.amazon.jsii.JsiiSerializable {

    /**
     * One and only one of the following should be specified.
     * <p>
     * Exec specifies the action to take.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ExecAction getExec() {
        return null;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HttpGetAction getHttpGet() {
        return null;
    }

    /**
     * TCPSocket specifies an action involving a TCP port.
     * <p>
     * TCP hooks not yet supported
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.TcpSocketAction getTcpSocket() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Handler}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Handler}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Handler> {
        private imports.k8s.ExecAction exec;
        private imports.k8s.HttpGetAction httpGet;
        private imports.k8s.TcpSocketAction tcpSocket;

        /**
         * Sets the value of {@link Handler#getExec}
         * @param exec One and only one of the following should be specified.
         *             Exec specifies the action to take.
         * @return {@code this}
         */
        public Builder exec(imports.k8s.ExecAction exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link Handler#getHttpGet}
         * @param httpGet HTTPGet specifies the http request to perform.
         * @return {@code this}
         */
        public Builder httpGet(imports.k8s.HttpGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * Sets the value of {@link Handler#getTcpSocket}
         * @param tcpSocket TCPSocket specifies an action involving a TCP port.
         *                  TCP hooks not yet supported
         * @return {@code this}
         */
        public Builder tcpSocket(imports.k8s.TcpSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Handler}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Handler build() {
            return new Jsii$Proxy(exec, httpGet, tcpSocket);
        }
    }

    /**
     * An implementation for {@link Handler}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Handler {
        private final imports.k8s.ExecAction exec;
        private final imports.k8s.HttpGetAction httpGet;
        private final imports.k8s.TcpSocketAction tcpSocket;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.k8s.ExecAction.class));
            this.httpGet = software.amazon.jsii.Kernel.get(this, "httpGet", software.amazon.jsii.NativeType.forClass(imports.k8s.HttpGetAction.class));
            this.tcpSocket = software.amazon.jsii.Kernel.get(this, "tcpSocket", software.amazon.jsii.NativeType.forClass(imports.k8s.TcpSocketAction.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.ExecAction exec, final imports.k8s.HttpGetAction httpGet, final imports.k8s.TcpSocketAction tcpSocket) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = exec;
            this.httpGet = httpGet;
            this.tcpSocket = tcpSocket;
        }

        @Override
        public final imports.k8s.ExecAction getExec() {
            return this.exec;
        }

        @Override
        public final imports.k8s.HttpGetAction getHttpGet() {
            return this.httpGet;
        }

        @Override
        public final imports.k8s.TcpSocketAction getTcpSocket() {
            return this.tcpSocket;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExec() != null) {
                data.set("exec", om.valueToTree(this.getExec()));
            }
            if (this.getHttpGet() != null) {
                data.set("httpGet", om.valueToTree(this.getHttpGet()));
            }
            if (this.getTcpSocket() != null) {
                data.set("tcpSocket", om.valueToTree(this.getTcpSocket()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Handler"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Handler.Jsii$Proxy that = (Handler.Jsii$Proxy) o;

            if (this.exec != null ? !this.exec.equals(that.exec) : that.exec != null) return false;
            if (this.httpGet != null ? !this.httpGet.equals(that.httpGet) : that.httpGet != null) return false;
            return this.tcpSocket != null ? this.tcpSocket.equals(that.tcpSocket) : that.tcpSocket == null;
        }

        @Override
        public final int hashCode() {
            int result = this.exec != null ? this.exec.hashCode() : 0;
            result = 31 * result + (this.httpGet != null ? this.httpGet.hashCode() : 0);
            result = 31 * result + (this.tcpSocket != null ? this.tcpSocket.hashCode() : 0);
            return result;
        }
    }
}
