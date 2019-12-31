package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

public class SecurityContextFluentImpl<A extends SecurityContextFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SecurityContextFluent<A>{

    private Boolean allowPrivilegeEscalation;
    private CapabilitiesBuilder capabilities;
    private Boolean privileged;
    private String procMount;
    private Boolean readOnlyRootFilesystem;
    private Long runAsGroup;
    private Boolean runAsNonRoot;
    private Long runAsUser;
    private SELinuxOptionsBuilder seLinuxOptions;

    public SecurityContextFluentImpl(){
    }
    public SecurityContextFluentImpl(SecurityContext instance){
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withCapabilities(instance.getCapabilities()); 
            this.withPrivileged(instance.getPrivileged()); 
            this.withProcMount(instance.getProcMount()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
    }

    public Boolean isAllowPrivilegeEscalation(){
            return this.allowPrivilegeEscalation;
    }

    public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation){
            this.allowPrivilegeEscalation=allowPrivilegeEscalation; return (A) this;
    }

    public Boolean hasAllowPrivilegeEscalation(){
            return this.allowPrivilegeEscalation != null;
    }

    public A withNewAllowPrivilegeEscalation(String arg1){
            return (A)withAllowPrivilegeEscalation(new Boolean(arg1));
    }

    public A withNewAllowPrivilegeEscalation(boolean arg1){
            return (A)withAllowPrivilegeEscalation(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildCapabilities instead.
 * @return The buildable object.
 */
@Deprecated public Capabilities getCapabilities(){
            return this.capabilities!=null?this.capabilities.build():null;
    }

    public Capabilities buildCapabilities(){
            return this.capabilities!=null?this.capabilities.build():null;
    }

    public A withCapabilities(Capabilities capabilities){
            _visitables.remove(this.capabilities);
            if (capabilities!=null){ this.capabilities= new CapabilitiesBuilder(capabilities); _visitables.add(this.capabilities);} return (A) this;
    }

    public Boolean hasCapabilities(){
            return this.capabilities != null;
    }

    public SecurityContextFluent.CapabilitiesNested<A> withNewCapabilities(){
            return new CapabilitiesNestedImpl();
    }

    public SecurityContextFluent.CapabilitiesNested<A> withNewCapabilitiesLike(Capabilities item){
            return new CapabilitiesNestedImpl(item);
    }

    public SecurityContextFluent.CapabilitiesNested<A> editCapabilities(){
            return withNewCapabilitiesLike(getCapabilities());
    }

    public SecurityContextFluent.CapabilitiesNested<A> editOrNewCapabilities(){
            return withNewCapabilitiesLike(getCapabilities() != null ? getCapabilities(): new CapabilitiesBuilder().build());
    }

    public SecurityContextFluent.CapabilitiesNested<A> editOrNewCapabilitiesLike(Capabilities item){
            return withNewCapabilitiesLike(getCapabilities() != null ? getCapabilities(): item);
    }

    public Boolean isPrivileged(){
            return this.privileged;
    }

    public A withPrivileged(Boolean privileged){
            this.privileged=privileged; return (A) this;
    }

    public Boolean hasPrivileged(){
            return this.privileged != null;
    }

    public A withNewPrivileged(String arg1){
            return (A)withPrivileged(new Boolean(arg1));
    }

    public A withNewPrivileged(boolean arg1){
            return (A)withPrivileged(new Boolean(arg1));
    }

    public String getProcMount(){
            return this.procMount;
    }

    public A withProcMount(String procMount){
            this.procMount=procMount; return (A) this;
    }

    public Boolean hasProcMount(){
            return this.procMount != null;
    }

    public Boolean isReadOnlyRootFilesystem(){
            return this.readOnlyRootFilesystem;
    }

    public A withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem){
            this.readOnlyRootFilesystem=readOnlyRootFilesystem; return (A) this;
    }

    public Boolean hasReadOnlyRootFilesystem(){
            return this.readOnlyRootFilesystem != null;
    }

    public A withNewReadOnlyRootFilesystem(String arg1){
            return (A)withReadOnlyRootFilesystem(new Boolean(arg1));
    }

    public A withNewReadOnlyRootFilesystem(boolean arg1){
            return (A)withReadOnlyRootFilesystem(new Boolean(arg1));
    }

    public Long getRunAsGroup(){
            return this.runAsGroup;
    }

    public A withRunAsGroup(Long runAsGroup){
            this.runAsGroup=runAsGroup; return (A) this;
    }

    public Boolean hasRunAsGroup(){
            return this.runAsGroup != null;
    }

    public A withNewRunAsGroup(String arg1){
            return (A)withRunAsGroup(new Long(arg1));
    }

    public A withNewRunAsGroup(long arg1){
            return (A)withRunAsGroup(new Long(arg1));
    }

    public Boolean isRunAsNonRoot(){
            return this.runAsNonRoot;
    }

    public A withRunAsNonRoot(Boolean runAsNonRoot){
            this.runAsNonRoot=runAsNonRoot; return (A) this;
    }

    public Boolean hasRunAsNonRoot(){
            return this.runAsNonRoot != null;
    }

    public A withNewRunAsNonRoot(String arg1){
            return (A)withRunAsNonRoot(new Boolean(arg1));
    }

    public A withNewRunAsNonRoot(boolean arg1){
            return (A)withRunAsNonRoot(new Boolean(arg1));
    }

    public Long getRunAsUser(){
            return this.runAsUser;
    }

    public A withRunAsUser(Long runAsUser){
            this.runAsUser=runAsUser; return (A) this;
    }

    public Boolean hasRunAsUser(){
            return this.runAsUser != null;
    }

    public A withNewRunAsUser(String arg1){
            return (A)withRunAsUser(new Long(arg1));
    }

    public A withNewRunAsUser(long arg1){
            return (A)withRunAsUser(new Long(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildSeLinuxOptions instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxOptions getSeLinuxOptions(){
            return this.seLinuxOptions!=null?this.seLinuxOptions.build():null;
    }

    public SELinuxOptions buildSeLinuxOptions(){
            return this.seLinuxOptions!=null?this.seLinuxOptions.build():null;
    }

    public A withSeLinuxOptions(SELinuxOptions seLinuxOptions){
            _visitables.remove(this.seLinuxOptions);
            if (seLinuxOptions!=null){ this.seLinuxOptions= new SELinuxOptionsBuilder(seLinuxOptions); _visitables.add(this.seLinuxOptions);} return (A) this;
    }

    public Boolean hasSeLinuxOptions(){
            return this.seLinuxOptions != null;
    }

    public A withNewSeLinuxOptions(String level,String role,String type,String user){
            return (A)withSeLinuxOptions(new SELinuxOptions(level, role, type, user));
    }

    public SecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions(){
            return new SeLinuxOptionsNestedImpl();
    }

    public SecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SELinuxOptions item){
            return new SeLinuxOptionsNestedImpl(item);
    }

    public SecurityContextFluent.SeLinuxOptionsNested<A> editSeLinuxOptions(){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions());
    }

    public SecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions(){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): new SELinuxOptionsBuilder().build());
    }

    public SecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SELinuxOptions item){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecurityContextFluentImpl that = (SecurityContextFluentImpl) o;
            if (allowPrivilegeEscalation != null ? !allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation) :that.allowPrivilegeEscalation != null) return false;
            if (capabilities != null ? !capabilities.equals(that.capabilities) :that.capabilities != null) return false;
            if (privileged != null ? !privileged.equals(that.privileged) :that.privileged != null) return false;
            if (procMount != null ? !procMount.equals(that.procMount) :that.procMount != null) return false;
            if (readOnlyRootFilesystem != null ? !readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem) :that.readOnlyRootFilesystem != null) return false;
            if (runAsGroup != null ? !runAsGroup.equals(that.runAsGroup) :that.runAsGroup != null) return false;
            if (runAsNonRoot != null ? !runAsNonRoot.equals(that.runAsNonRoot) :that.runAsNonRoot != null) return false;
            if (runAsUser != null ? !runAsUser.equals(that.runAsUser) :that.runAsUser != null) return false;
            if (seLinuxOptions != null ? !seLinuxOptions.equals(that.seLinuxOptions) :that.seLinuxOptions != null) return false;
            return true;
    }


    public class CapabilitiesNestedImpl<N> extends CapabilitiesFluentImpl<SecurityContextFluent.CapabilitiesNested<N>> implements SecurityContextFluent.CapabilitiesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CapabilitiesBuilder builder;
    
            CapabilitiesNestedImpl(Capabilities item){
                    this.builder = new CapabilitiesBuilder(this, item);
            }
            CapabilitiesNestedImpl(){
                    this.builder = new CapabilitiesBuilder(this);
            }
    
    public N and(){
            return (N) SecurityContextFluentImpl.this.withCapabilities(builder.build());
    }
    public N endCapabilities(){
            return and();
    }

}
    public class SeLinuxOptionsNestedImpl<N> extends SELinuxOptionsFluentImpl<SecurityContextFluent.SeLinuxOptionsNested<N>> implements SecurityContextFluent.SeLinuxOptionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxOptionsBuilder builder;
    
            SeLinuxOptionsNestedImpl(SELinuxOptions item){
                    this.builder = new SELinuxOptionsBuilder(this, item);
            }
            SeLinuxOptionsNestedImpl(){
                    this.builder = new SELinuxOptionsBuilder(this);
            }
    
    public N and(){
            return (N) SecurityContextFluentImpl.this.withSeLinuxOptions(builder.build());
    }
    public N endSeLinuxOptions(){
            return and();
    }

}


}
