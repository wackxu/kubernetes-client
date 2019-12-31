package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.model.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.StatusFluentImpl;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.StatusBuilder;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public class AdmissionResponseFluentImpl<A extends AdmissionResponseFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AdmissionResponseFluent<A>{

    private Boolean allowed;
    private Map<String,String> auditAnnotations;
    private String patch;
    private String patchType;
    private StatusBuilder status;
    private String uid;

    public AdmissionResponseFluentImpl(){
    }
    public AdmissionResponseFluentImpl(AdmissionResponse instance){
            this.withAllowed(instance.getAllowed()); 
            this.withAuditAnnotations(instance.getAuditAnnotations()); 
            this.withPatch(instance.getPatch()); 
            this.withPatchType(instance.getPatchType()); 
            this.withStatus(instance.getStatus()); 
            this.withUid(instance.getUid()); 
    }

    public Boolean isAllowed(){
            return this.allowed;
    }

    public A withAllowed(Boolean allowed){
            this.allowed=allowed; return (A) this;
    }

    public Boolean hasAllowed(){
            return this.allowed != null;
    }

    public A withNewAllowed(String arg1){
            return (A)withAllowed(new Boolean(arg1));
    }

    public A withNewAllowed(boolean arg1){
            return (A)withAllowed(new Boolean(arg1));
    }

    public A addToAuditAnnotations(String key,String value){
            if(this.auditAnnotations == null && key != null && value != null) { this.auditAnnotations = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.auditAnnotations.put(key, value);} return (A)this;
    }

    public A addToAuditAnnotations(Map<String,String> map){
            if(this.auditAnnotations == null && map != null) { this.auditAnnotations = new LinkedHashMap<String,String>(); }
            if(map != null) { this.auditAnnotations.putAll(map);} return (A)this;
    }

    public A removeFromAuditAnnotations(String key){
            if(this.auditAnnotations == null) { return (A) this; }
            if(key != null && this.auditAnnotations != null) {this.auditAnnotations.remove(key);} return (A)this;
    }

    public A removeFromAuditAnnotations(Map<String,String> map){
            if(this.auditAnnotations == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.auditAnnotations != null){this.auditAnnotations.remove(key);}}} return (A)this;
    }

    public Map<String,String> getAuditAnnotations(){
            return this.auditAnnotations;
    }

    public A withAuditAnnotations(Map<String,String> auditAnnotations){
            if (auditAnnotations == null) { this.auditAnnotations =  new LinkedHashMap<String,String>();} else {this.auditAnnotations = new LinkedHashMap<String,String>(auditAnnotations);} return (A) this;
    }

    public Boolean hasAuditAnnotations(){
            return this.auditAnnotations != null;
    }

    public String getPatch(){
            return this.patch;
    }

    public A withPatch(String patch){
            this.patch=patch; return (A) this;
    }

    public Boolean hasPatch(){
            return this.patch != null;
    }

    public String getPatchType(){
            return this.patchType;
    }

    public A withPatchType(String patchType){
            this.patchType=patchType; return (A) this;
    }

    public Boolean hasPatchType(){
            return this.patchType != null;
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public Status getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public Status buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(Status status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new StatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public AdmissionResponseFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public AdmissionResponseFluent.StatusNested<A> withNewStatusLike(Status item){
            return new StatusNestedImpl(item);
    }

    public AdmissionResponseFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public AdmissionResponseFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new StatusBuilder().build());
    }

    public AdmissionResponseFluent.StatusNested<A> editOrNewStatusLike(Status item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public String getUid(){
            return this.uid;
    }

    public A withUid(String uid){
            this.uid=uid; return (A) this;
    }

    public Boolean hasUid(){
            return this.uid != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AdmissionResponseFluentImpl that = (AdmissionResponseFluentImpl) o;
            if (allowed != null ? !allowed.equals(that.allowed) :that.allowed != null) return false;
            if (auditAnnotations != null ? !auditAnnotations.equals(that.auditAnnotations) :that.auditAnnotations != null) return false;
            if (patch != null ? !patch.equals(that.patch) :that.patch != null) return false;
            if (patchType != null ? !patchType.equals(that.patchType) :that.patchType != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
            return true;
    }


    public class StatusNestedImpl<N> extends StatusFluentImpl<AdmissionResponseFluent.StatusNested<N>> implements AdmissionResponseFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusBuilder builder;
    
            StatusNestedImpl(Status item){
                    this.builder = new StatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new StatusBuilder(this);
            }
    
    public N and(){
            return (N) AdmissionResponseFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
