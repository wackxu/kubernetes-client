package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface SecurityContextFluent<A extends SecurityContextFluent<A>> extends Fluent<A>{


    public Boolean isAllowPrivilegeEscalation();
    public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation);
    public Boolean hasAllowPrivilegeEscalation();
    public A withNewAllowPrivilegeEscalation(String arg1);
    public A withNewAllowPrivilegeEscalation(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildCapabilities instead.
 * @return The buildable object.
 */
@Deprecated public Capabilities getCapabilities();
    public Capabilities buildCapabilities();
    public A withCapabilities(Capabilities capabilities);
    public Boolean hasCapabilities();
    public SecurityContextFluent.CapabilitiesNested<A> withNewCapabilities();
    public SecurityContextFluent.CapabilitiesNested<A> withNewCapabilitiesLike(Capabilities item);
    public SecurityContextFluent.CapabilitiesNested<A> editCapabilities();
    public SecurityContextFluent.CapabilitiesNested<A> editOrNewCapabilities();
    public SecurityContextFluent.CapabilitiesNested<A> editOrNewCapabilitiesLike(Capabilities item);
    public Boolean isPrivileged();
    public A withPrivileged(Boolean privileged);
    public Boolean hasPrivileged();
    public A withNewPrivileged(String arg1);
    public A withNewPrivileged(boolean arg1);
    public String getProcMount();
    public A withProcMount(String procMount);
    public Boolean hasProcMount();
    public Boolean isReadOnlyRootFilesystem();
    public A withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem);
    public Boolean hasReadOnlyRootFilesystem();
    public A withNewReadOnlyRootFilesystem(String arg1);
    public A withNewReadOnlyRootFilesystem(boolean arg1);
    public Long getRunAsGroup();
    public A withRunAsGroup(Long runAsGroup);
    public Boolean hasRunAsGroup();
    public A withNewRunAsGroup(String arg1);
    public A withNewRunAsGroup(long arg1);
    public Boolean isRunAsNonRoot();
    public A withRunAsNonRoot(Boolean runAsNonRoot);
    public Boolean hasRunAsNonRoot();
    public A withNewRunAsNonRoot(String arg1);
    public A withNewRunAsNonRoot(boolean arg1);
    public Long getRunAsUser();
    public A withRunAsUser(Long runAsUser);
    public Boolean hasRunAsUser();
    public A withNewRunAsUser(String arg1);
    public A withNewRunAsUser(long arg1);
    
/**
 * This method has been deprecated, please use method buildSeLinuxOptions instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxOptions getSeLinuxOptions();
    public SELinuxOptions buildSeLinuxOptions();
    public A withSeLinuxOptions(SELinuxOptions seLinuxOptions);
    public Boolean hasSeLinuxOptions();
    public A withNewSeLinuxOptions(String level,String role,String type,String user);
    public SecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();
    public SecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SELinuxOptions item);
    public SecurityContextFluent.SeLinuxOptionsNested<A> editSeLinuxOptions();
    public SecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions();
    public SecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SELinuxOptions item);

    public interface CapabilitiesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CapabilitiesFluent<SecurityContextFluent.CapabilitiesNested<N>>{

        
    public N and();    public N endCapabilities();
}
    public interface SeLinuxOptionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxOptionsFluent<SecurityContextFluent.SeLinuxOptionsNested<N>>{

        
    public N and();    public N endSeLinuxOptions();
}


}
