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

public class RBDVolumeSourceFluentImpl<A extends RBDVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RBDVolumeSourceFluent<A>{

    private String fsType;
    private String image;
    private String keyring;
    private List<String> monitors;
    private String pool;
    private Boolean readOnly;
    private LocalObjectReferenceBuilder secretRef;
    private String user;

    public RBDVolumeSourceFluentImpl(){
    }
    public RBDVolumeSourceFluentImpl(RBDVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withImage(instance.getImage()); 
            this.withKeyring(instance.getKeyring()); 
            this.withMonitors(instance.getMonitors()); 
            this.withPool(instance.getPool()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withUser(instance.getUser()); 
    }

    public String getFsType(){
            return this.fsType;
    }

    public A withFsType(String fsType){
            this.fsType=fsType; return (A) this;
    }

    public Boolean hasFsType(){
            return this.fsType != null;
    }

    public String getImage(){
            return this.image;
    }

    public A withImage(String image){
            this.image=image; return (A) this;
    }

    public Boolean hasImage(){
            return this.image != null;
    }

    public String getKeyring(){
            return this.keyring;
    }

    public A withKeyring(String keyring){
            this.keyring=keyring; return (A) this;
    }

    public Boolean hasKeyring(){
            return this.keyring != null;
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

    public String getPool(){
            return this.pool;
    }

    public A withPool(String pool){
            this.pool=pool; return (A) this;
    }

    public Boolean hasPool(){
            return this.pool != null;
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

    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public LocalObjectReference buildSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public A withSecretRef(LocalObjectReference secretRef){
            _visitables.remove(this.secretRef);
            if (secretRef!=null){ this.secretRef= new LocalObjectReferenceBuilder(secretRef); _visitables.add(this.secretRef);} return (A) this;
    }

    public Boolean hasSecretRef(){
            return this.secretRef != null;
    }

    public A withNewSecretRef(String name){
            return (A)withSecretRef(new LocalObjectReference(name));
    }

    public RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item){
            return new SecretRefNestedImpl(item);
    }

    public RBDVolumeSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public RBDVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new LocalObjectReferenceBuilder().build());
    }

    public RBDVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item){
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
            RBDVolumeSourceFluentImpl that = (RBDVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (image != null ? !image.equals(that.image) :that.image != null) return false;
            if (keyring != null ? !keyring.equals(that.keyring) :that.keyring != null) return false;
            if (monitors != null ? !monitors.equals(that.monitors) :that.monitors != null) return false;
            if (pool != null ? !pool.equals(that.pool) :that.pool != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            return true;
    }


    public class SecretRefNestedImpl<N> extends LocalObjectReferenceFluentImpl<RBDVolumeSourceFluent.SecretRefNested<N>> implements RBDVolumeSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            SecretRefNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) RBDVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
