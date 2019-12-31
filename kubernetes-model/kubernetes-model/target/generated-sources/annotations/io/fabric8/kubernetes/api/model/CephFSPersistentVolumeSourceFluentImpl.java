package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class CephFSPersistentVolumeSourceFluentImpl<A extends CephFSPersistentVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CephFSPersistentVolumeSourceFluent<A>{

    private List<String> monitors;
    private String path;
    private Boolean readOnly;
    private String secretFile;
    private SecretReferenceBuilder secretRef;
    private String user;

    public CephFSPersistentVolumeSourceFluentImpl(){
    }
    public CephFSPersistentVolumeSourceFluentImpl(CephFSPersistentVolumeSource instance){
            this.withMonitors(instance.getMonitors()); 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretFile(instance.getSecretFile()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withUser(instance.getUser()); 
    }

    public A addToMonitors(int index,String item){
            if (this.monitors == null) {this.monitors = new ArrayList<String>();}
            this.monitors.add(index, item);
            return (A)this;
    }

    public A setToMonitors(int index,String item){
            if (this.monitors == null) {this.monitors = new ArrayList<String>();}
            this.monitors.set(index, item); return (A)this;
    }

    public A addToMonitors(String... items){
            if (this.monitors == null) {this.monitors = new ArrayList<String>();}
            for (String item : items) {this.monitors.add(item);} return (A)this;
    }

    public A addAllToMonitors(Collection<String> items){
            if (this.monitors == null) {this.monitors = new ArrayList<String>();}
            for (String item : items) {this.monitors.add(item);} return (A)this;
    }

    public A removeFromMonitors(String... items){
            for (String item : items) {if (this.monitors!= null){ this.monitors.remove(item);}} return (A)this;
    }

    public A removeAllFromMonitors(Collection<String> items){
            for (String item : items) {if (this.monitors!= null){ this.monitors.remove(item);}} return (A)this;
    }

    public List<String> getMonitors(){
            return this.monitors;
    }

    public String getMonitor(int index){
            return this.monitors.get(index);
    }

    public String getFirstMonitor(){
            return this.monitors.get(0);
    }

    public String getLastMonitor(){
            return this.monitors.get(monitors.size() - 1);
    }

    public String getMatchingMonitor(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: monitors) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withMonitors(List<String> monitors){
            if (this.monitors != null) { _visitables.removeAll(this.monitors);}
            if (monitors != null) {this.monitors = new ArrayList<String>(); for (String item : monitors){this.addToMonitors(item);}} else { this.monitors = new ArrayList<String>();} return (A) this;
    }

    public A withMonitors(String... monitors){
            if (this.monitors != null) {this.monitors.clear();}
            if (monitors != null) {for (String item :monitors){ this.addToMonitors(item);}} return (A) this;
    }

    public Boolean hasMonitors(){
            return monitors != null && !monitors.isEmpty();
    }

    public String getPath(){
            return this.path;
    }

    public A withPath(String path){
            this.path=path; return (A) this;
    }

    public Boolean hasPath(){
            return this.path != null;
    }

    public Boolean isReadOnly(){
            return this.readOnly;
    }

    public A withReadOnly(Boolean readOnly){
            this.readOnly=readOnly; return (A) this;
    }

    public Boolean hasReadOnly(){
            return this.readOnly != null;
    }

    public A withNewReadOnly(String arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public A withNewReadOnly(boolean arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public String getSecretFile(){
            return this.secretFile;
    }

    public A withSecretFile(String secretFile){
            this.secretFile=secretFile; return (A) this;
    }

    public Boolean hasSecretFile(){
            return this.secretFile != null;
    }

    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretReference getSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public SecretReference buildSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public A withSecretRef(SecretReference secretRef){
            _visitables.remove(this.secretRef);
            if (secretRef!=null){ this.secretRef= new SecretReferenceBuilder(secretRef); _visitables.add(this.secretRef);} return (A) this;
    }

    public Boolean hasSecretRef(){
            return this.secretRef != null;
    }

    public A withNewSecretRef(String name,String namespace){
            return (A)withSecretRef(new SecretReference(name, namespace));
    }

    public CephFSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public CephFSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(SecretReference item){
            return new SecretRefNestedImpl(item);
    }

    public CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new SecretReferenceBuilder().build());
    }

    public CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(SecretReference item){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
    }

    public String getUser(){
            return this.user;
    }

    public A withUser(String user){
            this.user=user; return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CephFSPersistentVolumeSourceFluentImpl that = (CephFSPersistentVolumeSourceFluentImpl) o;
            if (monitors != null ? !monitors.equals(that.monitors) :that.monitors != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretFile != null ? !secretFile.equals(that.secretFile) :that.secretFile != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            return true;
    }


    public class SecretRefNestedImpl<N> extends SecretReferenceFluentImpl<CephFSPersistentVolumeSourceFluent.SecretRefNested<N>> implements CephFSPersistentVolumeSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretReferenceBuilder builder;
    
            SecretRefNestedImpl(SecretReference item){
                    this.builder = new SecretReferenceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new SecretReferenceBuilder(this);
            }
    
    public N and(){
            return (N) CephFSPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
