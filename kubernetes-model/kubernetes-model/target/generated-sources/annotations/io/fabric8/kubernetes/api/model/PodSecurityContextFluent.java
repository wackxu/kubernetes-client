package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface PodSecurityContextFluent<A extends PodSecurityContextFluent<A>> extends Fluent<A>{


    public Long getFsGroup();
    public A withFsGroup(Long fsGroup);
    public Boolean hasFsGroup();
    public A withNewFsGroup(String arg1);
    public A withNewFsGroup(long arg1);
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
    public PodSecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();
    public PodSecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SELinuxOptions item);
    public PodSecurityContextFluent.SeLinuxOptionsNested<A> editSeLinuxOptions();
    public PodSecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions();
    public PodSecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SELinuxOptions item);
    public A addToSupplementalGroups(int index,Long item);
    public A setToSupplementalGroups(int index,Long item);
    public A addToSupplementalGroups(Long... items);
    public A addAllToSupplementalGroups(Collection<Long> items);
    public A removeFromSupplementalGroups(Long... items);
    public A removeAllFromSupplementalGroups(Collection<Long> items);
    public List<Long> getSupplementalGroups();
    public Long getSupplementalGroup(int index);
    public Long getFirstSupplementalGroup();
    public Long getLastSupplementalGroup();
    public Long getMatchingSupplementalGroup(io.fabric8.kubernetes.api.builder.Predicate<Long> predicate);
    public A withSupplementalGroups(List<Long> supplementalGroups);
    public A withSupplementalGroups(Long... supplementalGroups);
    public Boolean hasSupplementalGroups();
    public A addNewSupplementalGroup(String arg1);
    public A addNewSupplementalGroup(long arg1);
    public A addToSysctls(int index,Sysctl item);
    public A setToSysctls(int index,Sysctl item);
    public A addToSysctls(Sysctl... items);
    public A addAllToSysctls(Collection<Sysctl> items);
    public A removeFromSysctls(Sysctl... items);
    public A removeAllFromSysctls(Collection<Sysctl> items);
    
/**
 * This method has been deprecated, please use method buildSysctls instead.
 * @return The buildable object.
 */
@Deprecated public List<Sysctl> getSysctls();
    public List<Sysctl> buildSysctls();
    public Sysctl buildSysctl(int index);
    public Sysctl buildFirstSysctl();
    public Sysctl buildLastSysctl();
    public Sysctl buildMatchingSysctl(io.fabric8.kubernetes.api.builder.Predicate<SysctlBuilder> predicate);
    public A withSysctls(List<Sysctl> sysctls);
    public A withSysctls(Sysctl... sysctls);
    public Boolean hasSysctls();
    public A addNewSysctl(String name,String value);
    public PodSecurityContextFluent.SysctlsNested<A> addNewSysctl();
    public PodSecurityContextFluent.SysctlsNested<A> addNewSysctlLike(Sysctl item);
    public PodSecurityContextFluent.SysctlsNested<A> setNewSysctlLike(int index,Sysctl item);
    public PodSecurityContextFluent.SysctlsNested<A> editSysctl(int index);
    public PodSecurityContextFluent.SysctlsNested<A> editFirstSysctl();
    public PodSecurityContextFluent.SysctlsNested<A> editLastSysctl();
    public PodSecurityContextFluent.SysctlsNested<A> editMatchingSysctl(io.fabric8.kubernetes.api.builder.Predicate<SysctlBuilder> predicate);

    public interface SeLinuxOptionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxOptionsFluent<PodSecurityContextFluent.SeLinuxOptionsNested<N>>{

        
    public N and();    public N endSeLinuxOptions();
}
    public interface SysctlsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SysctlFluent<PodSecurityContextFluent.SysctlsNested<N>>{

        
    public N and();    public N endSysctl();
}


}
