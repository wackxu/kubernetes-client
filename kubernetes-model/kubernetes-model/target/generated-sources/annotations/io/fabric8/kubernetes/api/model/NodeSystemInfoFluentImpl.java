package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class NodeSystemInfoFluentImpl<A extends NodeSystemInfoFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeSystemInfoFluent<A>{

    private String architecture;
    private String bootID;
    private String containerRuntimeVersion;
    private String kernelVersion;
    private String kubeProxyVersion;
    private String kubeletVersion;
    private String machineID;
    private String operatingSystem;
    private String osImage;
    private String systemUUID;

    public NodeSystemInfoFluentImpl(){
    }
    public NodeSystemInfoFluentImpl(NodeSystemInfo instance){
            this.withArchitecture(instance.getArchitecture()); 
            this.withBootID(instance.getBootID()); 
            this.withContainerRuntimeVersion(instance.getContainerRuntimeVersion()); 
            this.withKernelVersion(instance.getKernelVersion()); 
            this.withKubeProxyVersion(instance.getKubeProxyVersion()); 
            this.withKubeletVersion(instance.getKubeletVersion()); 
            this.withMachineID(instance.getMachineID()); 
            this.withOperatingSystem(instance.getOperatingSystem()); 
            this.withOsImage(instance.getOsImage()); 
            this.withSystemUUID(instance.getSystemUUID()); 
    }

    public String getArchitecture(){
            return this.architecture;
    }

    public A withArchitecture(String architecture){
            this.architecture=architecture; return (A) this;
    }

    public Boolean hasArchitecture(){
            return this.architecture != null;
    }

    public String getBootID(){
            return this.bootID;
    }

    public A withBootID(String bootID){
            this.bootID=bootID; return (A) this;
    }

    public Boolean hasBootID(){
            return this.bootID != null;
    }

    public String getContainerRuntimeVersion(){
            return this.containerRuntimeVersion;
    }

    public A withContainerRuntimeVersion(String containerRuntimeVersion){
            this.containerRuntimeVersion=containerRuntimeVersion; return (A) this;
    }

    public Boolean hasContainerRuntimeVersion(){
            return this.containerRuntimeVersion != null;
    }

    public String getKernelVersion(){
            return this.kernelVersion;
    }

    public A withKernelVersion(String kernelVersion){
            this.kernelVersion=kernelVersion; return (A) this;
    }

    public Boolean hasKernelVersion(){
            return this.kernelVersion != null;
    }

    public String getKubeProxyVersion(){
            return this.kubeProxyVersion;
    }

    public A withKubeProxyVersion(String kubeProxyVersion){
            this.kubeProxyVersion=kubeProxyVersion; return (A) this;
    }

    public Boolean hasKubeProxyVersion(){
            return this.kubeProxyVersion != null;
    }

    public String getKubeletVersion(){
            return this.kubeletVersion;
    }

    public A withKubeletVersion(String kubeletVersion){
            this.kubeletVersion=kubeletVersion; return (A) this;
    }

    public Boolean hasKubeletVersion(){
            return this.kubeletVersion != null;
    }

    public String getMachineID(){
            return this.machineID;
    }

    public A withMachineID(String machineID){
            this.machineID=machineID; return (A) this;
    }

    public Boolean hasMachineID(){
            return this.machineID != null;
    }

    public String getOperatingSystem(){
            return this.operatingSystem;
    }

    public A withOperatingSystem(String operatingSystem){
            this.operatingSystem=operatingSystem; return (A) this;
    }

    public Boolean hasOperatingSystem(){
            return this.operatingSystem != null;
    }

    public String getOsImage(){
            return this.osImage;
    }

    public A withOsImage(String osImage){
            this.osImage=osImage; return (A) this;
    }

    public Boolean hasOsImage(){
            return this.osImage != null;
    }

    public String getSystemUUID(){
            return this.systemUUID;
    }

    public A withSystemUUID(String systemUUID){
            this.systemUUID=systemUUID; return (A) this;
    }

    public Boolean hasSystemUUID(){
            return this.systemUUID != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSystemInfoFluentImpl that = (NodeSystemInfoFluentImpl) o;
            if (architecture != null ? !architecture.equals(that.architecture) :that.architecture != null) return false;
            if (bootID != null ? !bootID.equals(that.bootID) :that.bootID != null) return false;
            if (containerRuntimeVersion != null ? !containerRuntimeVersion.equals(that.containerRuntimeVersion) :that.containerRuntimeVersion != null) return false;
            if (kernelVersion != null ? !kernelVersion.equals(that.kernelVersion) :that.kernelVersion != null) return false;
            if (kubeProxyVersion != null ? !kubeProxyVersion.equals(that.kubeProxyVersion) :that.kubeProxyVersion != null) return false;
            if (kubeletVersion != null ? !kubeletVersion.equals(that.kubeletVersion) :that.kubeletVersion != null) return false;
            if (machineID != null ? !machineID.equals(that.machineID) :that.machineID != null) return false;
            if (operatingSystem != null ? !operatingSystem.equals(that.operatingSystem) :that.operatingSystem != null) return false;
            if (osImage != null ? !osImage.equals(that.osImage) :that.osImage != null) return false;
            if (systemUUID != null ? !systemUUID.equals(that.systemUUID) :that.systemUUID != null) return false;
            return true;
    }




}
