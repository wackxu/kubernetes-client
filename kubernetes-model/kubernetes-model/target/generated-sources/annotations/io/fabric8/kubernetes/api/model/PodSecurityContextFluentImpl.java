package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

public class PodSecurityContextFluentImpl<A extends PodSecurityContextFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodSecurityContextFluent<A>{

    private Long fsGroup;
    private Long runAsGroup;
    private Boolean runAsNonRoot;
    private Long runAsUser;
    private SELinuxOptionsBuilder seLinuxOptions;
    private List<Long> supplementalGroups;
    private List<SysctlBuilder> sysctls;

    public PodSecurityContextFluentImpl(){
    }
    public PodSecurityContextFluentImpl(PodSecurityContext instance){
            this.withFsGroup(instance.getFsGroup()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withSysctls(instance.getSysctls()); 
    }

    public Long getFsGroup(){
            return this.fsGroup;
    }

    public A withFsGroup(Long fsGroup){
            this.fsGroup=fsGroup; return (A) this;
    }

    public Boolean hasFsGroup(){
            return this.fsGroup != null;
    }

    public A withNewFsGroup(String arg1){
            return (A)withFsGroup(new Long(arg1));
    }

    public A withNewFsGroup(long arg1){
            return (A)withFsGroup(new Long(arg1));
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

    public PodSecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions(){
            return new SeLinuxOptionsNestedImpl();
    }

    public PodSecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SELinuxOptions item){
            return new SeLinuxOptionsNestedImpl(item);
    }

    public PodSecurityContextFluent.SeLinuxOptionsNested<A> editSeLinuxOptions(){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions());
    }

    public PodSecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions(){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): new SELinuxOptionsBuilder().build());
    }

    public PodSecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SELinuxOptions item){
            return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): item);
    }

    public A addToSupplementalGroups(int index,Long item){
            if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
            this.supplementalGroups.add(index, item);
            return (A)this;
    }

    public A setToSupplementalGroups(int index,Long item){
            if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
            this.supplementalGroups.set(index, item); return (A)this;
    }

    public A addToSupplementalGroups(Long... items){
            if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
            for (Long item : items) {this.supplementalGroups.add(item);} return (A)this;
    }

    public A addAllToSupplementalGroups(Collection<Long> items){
            if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
            for (Long item : items) {this.supplementalGroups.add(item);} return (A)this;
    }

    public A removeFromSupplementalGroups(Long... items){
            for (Long item : items) {if (this.supplementalGroups!= null){ this.supplementalGroups.remove(item);}} return (A)this;
    }

    public A removeAllFromSupplementalGroups(Collection<Long> items){
            for (Long item : items) {if (this.supplementalGroups!= null){ this.supplementalGroups.remove(item);}} return (A)this;
    }

    public List<Long> getSupplementalGroups(){
            return this.supplementalGroups;
    }

    public Long getSupplementalGroup(int index){
            return this.supplementalGroups.get(index);
    }

    public Long getFirstSupplementalGroup(){
            return this.supplementalGroups.get(0);
    }

    public Long getLastSupplementalGroup(){
            return this.supplementalGroups.get(supplementalGroups.size() - 1);
    }

    public Long getMatchingSupplementalGroup(io.fabric8.kubernetes.api.builder.Predicate<Long> predicate){
            for (Long item: supplementalGroups) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withSupplementalGroups(List<Long> supplementalGroups){
            if (this.supplementalGroups != null) { _visitables.removeAll(this.supplementalGroups);}
            if (supplementalGroups != null) {this.supplementalGroups = new ArrayList<Long>(); for (Long item : supplementalGroups){this.addToSupplementalGroups(item);}} else { this.supplementalGroups = new ArrayList<Long>();} return (A) this;
    }

    public A withSupplementalGroups(Long... supplementalGroups){
            if (this.supplementalGroups != null) {this.supplementalGroups.clear();}
            if (supplementalGroups != null) {for (Long item :supplementalGroups){ this.addToSupplementalGroups(item);}} return (A) this;
    }

    public Boolean hasSupplementalGroups(){
            return supplementalGroups != null && !supplementalGroups.isEmpty();
    }

    public A addNewSupplementalGroup(String arg1){
            return (A)addToSupplementalGroups(new Long(arg1));
    }

    public A addNewSupplementalGroup(long arg1){
            return (A)addToSupplementalGroups(new Long(arg1));
    }

    public A addToSysctls(int index,Sysctl item){
            if (this.sysctls == null) {this.sysctls = new ArrayList<SysctlBuilder>();}
            SysctlBuilder builder = new SysctlBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.sysctls.add(index >= 0 ? index : sysctls.size(), builder); return (A)this;
    }

    public A setToSysctls(int index,Sysctl item){
            if (this.sysctls == null) {this.sysctls = new ArrayList<SysctlBuilder>();}
            SysctlBuilder builder = new SysctlBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= sysctls.size()) { sysctls.add(builder); } else { sysctls.set(index, builder);}
             return (A)this;
    }

    public A addToSysctls(Sysctl... items){
            if (this.sysctls == null) {this.sysctls = new ArrayList<SysctlBuilder>();}
            for (Sysctl item : items) {SysctlBuilder builder = new SysctlBuilder(item);_visitables.add(builder);this.sysctls.add(builder);} return (A)this;
    }

    public A addAllToSysctls(Collection<Sysctl> items){
            if (this.sysctls == null) {this.sysctls = new ArrayList<SysctlBuilder>();}
            for (Sysctl item : items) {SysctlBuilder builder = new SysctlBuilder(item);_visitables.add(builder);this.sysctls.add(builder);} return (A)this;
    }

    public A removeFromSysctls(Sysctl... items){
            for (Sysctl item : items) {SysctlBuilder builder = new SysctlBuilder(item);_visitables.remove(builder);if (this.sysctls != null) {this.sysctls.remove(builder);}} return (A)this;
    }

    public A removeAllFromSysctls(Collection<Sysctl> items){
            for (Sysctl item : items) {SysctlBuilder builder = new SysctlBuilder(item);_visitables.remove(builder);if (this.sysctls != null) {this.sysctls.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSysctls instead.
 * @return The buildable object.
 */
@Deprecated public List<Sysctl> getSysctls(){
            return build(sysctls);
    }

    public List<Sysctl> buildSysctls(){
            return build(sysctls);
    }

    public Sysctl buildSysctl(int index){
            return this.sysctls.get(index).build();
    }

    public Sysctl buildFirstSysctl(){
            return this.sysctls.get(0).build();
    }

    public Sysctl buildLastSysctl(){
            return this.sysctls.get(sysctls.size() - 1).build();
    }

    public Sysctl buildMatchingSysctl(io.fabric8.kubernetes.api.builder.Predicate<SysctlBuilder> predicate){
            for (SysctlBuilder item: sysctls) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSysctls(List<Sysctl> sysctls){
            if (this.sysctls != null) { _visitables.removeAll(this.sysctls);}
            if (sysctls != null) {this.sysctls = new ArrayList<SysctlBuilder>(); for (Sysctl item : sysctls){this.addToSysctls(item);}} else { this.sysctls = new ArrayList<SysctlBuilder>();} return (A) this;
    }

    public A withSysctls(Sysctl... sysctls){
            if (this.sysctls != null) {this.sysctls.clear();}
            if (sysctls != null) {for (Sysctl item :sysctls){ this.addToSysctls(item);}} return (A) this;
    }

    public Boolean hasSysctls(){
            return sysctls != null && !sysctls.isEmpty();
    }

    public A addNewSysctl(String name,String value){
            return (A)addToSysctls(new Sysctl(name, value));
    }

    public PodSecurityContextFluent.SysctlsNested<A> addNewSysctl(){
            return new SysctlsNestedImpl();
    }

    public PodSecurityContextFluent.SysctlsNested<A> addNewSysctlLike(Sysctl item){
            return new SysctlsNestedImpl(-1, item);
    }

    public PodSecurityContextFluent.SysctlsNested<A> setNewSysctlLike(int index,Sysctl item){
            return new SysctlsNestedImpl(index, item);
    }

    public PodSecurityContextFluent.SysctlsNested<A> editSysctl(int index){
            if (sysctls.size() <= index) throw new RuntimeException("Can't edit sysctls. Index exceeds size.");
            return setNewSysctlLike(index, buildSysctl(index));
    }

    public PodSecurityContextFluent.SysctlsNested<A> editFirstSysctl(){
            if (sysctls.size() == 0) throw new RuntimeException("Can't edit first sysctls. The list is empty.");
            return setNewSysctlLike(0, buildSysctl(0));
    }

    public PodSecurityContextFluent.SysctlsNested<A> editLastSysctl(){
            int index = sysctls.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last sysctls. The list is empty.");
            return setNewSysctlLike(index, buildSysctl(index));
    }

    public PodSecurityContextFluent.SysctlsNested<A> editMatchingSysctl(io.fabric8.kubernetes.api.builder.Predicate<SysctlBuilder> predicate){
            int index = -1;
            for (int i=0;i<sysctls.size();i++) { 
            if (predicate.apply(sysctls.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching sysctls. No match found.");
            return setNewSysctlLike(index, buildSysctl(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodSecurityContextFluentImpl that = (PodSecurityContextFluentImpl) o;
            if (fsGroup != null ? !fsGroup.equals(that.fsGroup) :that.fsGroup != null) return false;
            if (runAsGroup != null ? !runAsGroup.equals(that.runAsGroup) :that.runAsGroup != null) return false;
            if (runAsNonRoot != null ? !runAsNonRoot.equals(that.runAsNonRoot) :that.runAsNonRoot != null) return false;
            if (runAsUser != null ? !runAsUser.equals(that.runAsUser) :that.runAsUser != null) return false;
            if (seLinuxOptions != null ? !seLinuxOptions.equals(that.seLinuxOptions) :that.seLinuxOptions != null) return false;
            if (supplementalGroups != null ? !supplementalGroups.equals(that.supplementalGroups) :that.supplementalGroups != null) return false;
            if (sysctls != null ? !sysctls.equals(that.sysctls) :that.sysctls != null) return false;
            return true;
    }


    public class SeLinuxOptionsNestedImpl<N> extends SELinuxOptionsFluentImpl<PodSecurityContextFluent.SeLinuxOptionsNested<N>> implements PodSecurityContextFluent.SeLinuxOptionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxOptionsBuilder builder;
    
            SeLinuxOptionsNestedImpl(SELinuxOptions item){
                    this.builder = new SELinuxOptionsBuilder(this, item);
            }
            SeLinuxOptionsNestedImpl(){
                    this.builder = new SELinuxOptionsBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityContextFluentImpl.this.withSeLinuxOptions(builder.build());
    }
    public N endSeLinuxOptions(){
            return and();
    }

}
    public class SysctlsNestedImpl<N> extends SysctlFluentImpl<PodSecurityContextFluent.SysctlsNested<N>> implements PodSecurityContextFluent.SysctlsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SysctlBuilder builder;
        private final int index;
    
            SysctlsNestedImpl(int index,Sysctl item){
                    this.index = index;
                    this.builder = new SysctlBuilder(this, item);
            }
            SysctlsNestedImpl(){
                    this.index = -1;
                    this.builder = new SysctlBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityContextFluentImpl.this.setToSysctls(index, builder.build());
    }
    public N endSysctl(){
            return and();
    }

}


}
