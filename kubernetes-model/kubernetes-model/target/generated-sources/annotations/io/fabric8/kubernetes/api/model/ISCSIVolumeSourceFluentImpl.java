package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ISCSIVolumeSourceFluentImpl<A extends ISCSIVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ISCSIVolumeSourceFluent<A>{

    private Boolean chapAuthDiscovery;
    private Boolean chapAuthSession;
    private String fsType;
    private String initiatorName;
    private String iqn;
    private String iscsiInterface;
    private Integer lun;
    private List<String> portals;
    private Boolean readOnly;
    private LocalObjectReferenceBuilder secretRef;
    private String targetPortal;

    public ISCSIVolumeSourceFluentImpl(){
    }
    public ISCSIVolumeSourceFluentImpl(ISCSIVolumeSource instance){
            this.withChapAuthDiscovery(instance.getChapAuthDiscovery()); 
            this.withChapAuthSession(instance.getChapAuthSession()); 
            this.withFsType(instance.getFsType()); 
            this.withInitiatorName(instance.getInitiatorName()); 
            this.withIqn(instance.getIqn()); 
            this.withIscsiInterface(instance.getIscsiInterface()); 
            this.withLun(instance.getLun()); 
            this.withPortals(instance.getPortals()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withTargetPortal(instance.getTargetPortal()); 
    }

    public Boolean isChapAuthDiscovery(){
            return this.chapAuthDiscovery;
    }

    public A withChapAuthDiscovery(Boolean chapAuthDiscovery){
            this.chapAuthDiscovery=chapAuthDiscovery; return (A) this;
    }

    public Boolean hasChapAuthDiscovery(){
            return this.chapAuthDiscovery != null;
    }

    public A withNewChapAuthDiscovery(String arg1){
            return (A)withChapAuthDiscovery(new Boolean(arg1));
    }

    public A withNewChapAuthDiscovery(boolean arg1){
            return (A)withChapAuthDiscovery(new Boolean(arg1));
    }

    public Boolean isChapAuthSession(){
            return this.chapAuthSession;
    }

    public A withChapAuthSession(Boolean chapAuthSession){
            this.chapAuthSession=chapAuthSession; return (A) this;
    }

    public Boolean hasChapAuthSession(){
            return this.chapAuthSession != null;
    }

    public A withNewChapAuthSession(String arg1){
            return (A)withChapAuthSession(new Boolean(arg1));
    }

    public A withNewChapAuthSession(boolean arg1){
            return (A)withChapAuthSession(new Boolean(arg1));
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

    public String getInitiatorName(){
            return this.initiatorName;
    }

    public A withInitiatorName(String initiatorName){
            this.initiatorName=initiatorName; return (A) this;
    }

    public Boolean hasInitiatorName(){
            return this.initiatorName != null;
    }

    public String getIqn(){
            return this.iqn;
    }

    public A withIqn(String iqn){
            this.iqn=iqn; return (A) this;
    }

    public Boolean hasIqn(){
            return this.iqn != null;
    }

    public String getIscsiInterface(){
            return this.iscsiInterface;
    }

    public A withIscsiInterface(String iscsiInterface){
            this.iscsiInterface=iscsiInterface; return (A) this;
    }

    public Boolean hasIscsiInterface(){
            return this.iscsiInterface != null;
    }

    public Integer getLun(){
            return this.lun;
    }

    public A withLun(Integer lun){
            this.lun=lun; return (A) this;
    }

    public Boolean hasLun(){
            return this.lun != null;
    }

    public A addToPortals(int index,String item){
            if (this.portals == null) {this.portals = new ArrayList<String>();}
            this.portals.add(index, item);
            return (A)this;
    }

    public A setToPortals(int index,String item){
            if (this.portals == null) {this.portals = new ArrayList<String>();}
            this.portals.set(index, item); return (A)this;
    }

    public A addToPortals(String... items){
            if (this.portals == null) {this.portals = new ArrayList<String>();}
            for (String item : items) {this.portals.add(item);} return (A)this;
    }

    public A addAllToPortals(Collection<String> items){
            if (this.portals == null) {this.portals = new ArrayList<String>();}
            for (String item : items) {this.portals.add(item);} return (A)this;
    }

    public A removeFromPortals(String... items){
            for (String item : items) {if (this.portals!= null){ this.portals.remove(item);}} return (A)this;
    }

    public A removeAllFromPortals(Collection<String> items){
            for (String item : items) {if (this.portals!= null){ this.portals.remove(item);}} return (A)this;
    }

    public List<String> getPortals(){
            return this.portals;
    }

    public String getPortal(int index){
            return this.portals.get(index);
    }

    public String getFirstPortal(){
            return this.portals.get(0);
    }

    public String getLastPortal(){
            return this.portals.get(portals.size() - 1);
    }

    public String getMatchingPortal(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: portals) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withPortals(List<String> portals){
            if (this.portals != null) { _visitables.removeAll(this.portals);}
            if (portals != null) {this.portals = new ArrayList<String>(); for (String item : portals){this.addToPortals(item);}} else { this.portals = new ArrayList<String>();} return (A) this;
    }

    public A withPortals(String... portals){
            if (this.portals != null) {this.portals.clear();}
            if (portals != null) {for (String item :portals){ this.addToPortals(item);}} return (A) this;
    }

    public Boolean hasPortals(){
            return portals != null && !portals.isEmpty();
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

    public ISCSIVolumeSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public ISCSIVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item){
            return new SecretRefNestedImpl(item);
    }

    public ISCSIVolumeSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public ISCSIVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new LocalObjectReferenceBuilder().build());
    }

    public ISCSIVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
    }

    public String getTargetPortal(){
            return this.targetPortal;
    }

    public A withTargetPortal(String targetPortal){
            this.targetPortal=targetPortal; return (A) this;
    }

    public Boolean hasTargetPortal(){
            return this.targetPortal != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ISCSIVolumeSourceFluentImpl that = (ISCSIVolumeSourceFluentImpl) o;
            if (chapAuthDiscovery != null ? !chapAuthDiscovery.equals(that.chapAuthDiscovery) :that.chapAuthDiscovery != null) return false;
            if (chapAuthSession != null ? !chapAuthSession.equals(that.chapAuthSession) :that.chapAuthSession != null) return false;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (initiatorName != null ? !initiatorName.equals(that.initiatorName) :that.initiatorName != null) return false;
            if (iqn != null ? !iqn.equals(that.iqn) :that.iqn != null) return false;
            if (iscsiInterface != null ? !iscsiInterface.equals(that.iscsiInterface) :that.iscsiInterface != null) return false;
            if (lun != null ? !lun.equals(that.lun) :that.lun != null) return false;
            if (portals != null ? !portals.equals(that.portals) :that.portals != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            if (targetPortal != null ? !targetPortal.equals(that.targetPortal) :that.targetPortal != null) return false;
            return true;
    }


    public class SecretRefNestedImpl<N> extends LocalObjectReferenceFluentImpl<ISCSIVolumeSourceFluent.SecretRefNested<N>> implements ISCSIVolumeSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            SecretRefNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ISCSIVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
