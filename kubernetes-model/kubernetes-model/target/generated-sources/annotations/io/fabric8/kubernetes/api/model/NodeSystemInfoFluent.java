package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface NodeSystemInfoFluent<A extends NodeSystemInfoFluent<A>> extends Fluent<A>{


    public String getArchitecture();
    public A withArchitecture(String architecture);
    public Boolean hasArchitecture();
    public String getBootID();
    public A withBootID(String bootID);
    public Boolean hasBootID();
    public String getContainerRuntimeVersion();
    public A withContainerRuntimeVersion(String containerRuntimeVersion);
    public Boolean hasContainerRuntimeVersion();
    public String getKernelVersion();
    public A withKernelVersion(String kernelVersion);
    public Boolean hasKernelVersion();
    public String getKubeProxyVersion();
    public A withKubeProxyVersion(String kubeProxyVersion);
    public Boolean hasKubeProxyVersion();
    public String getKubeletVersion();
    public A withKubeletVersion(String kubeletVersion);
    public Boolean hasKubeletVersion();
    public String getMachineID();
    public A withMachineID(String machineID);
    public Boolean hasMachineID();
    public String getOperatingSystem();
    public A withOperatingSystem(String operatingSystem);
    public Boolean hasOperatingSystem();
    public String getOsImage();
    public A withOsImage(String osImage);
    public Boolean hasOsImage();
    public String getSystemUUID();
    public A withSystemUUID(String systemUUID);
    public Boolean hasSystemUUID();



}
