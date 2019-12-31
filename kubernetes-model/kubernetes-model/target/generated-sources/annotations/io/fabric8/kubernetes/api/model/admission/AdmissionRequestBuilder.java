package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AdmissionRequestBuilder extends AdmissionRequestFluentImpl<AdmissionRequestBuilder> implements VisitableBuilder<AdmissionRequest,AdmissionRequestBuilder>{

    AdmissionRequestFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AdmissionRequestBuilder(){
            this(true);
    }
    public AdmissionRequestBuilder(Boolean validationEnabled){
            this(new AdmissionRequest(), validationEnabled);
    }
    public AdmissionRequestBuilder(AdmissionRequestFluent<?> fluent){
            this(fluent, true);
    }
    public AdmissionRequestBuilder(AdmissionRequestFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AdmissionRequest(), validationEnabled);
    }
    public AdmissionRequestBuilder(AdmissionRequestFluent<?> fluent,AdmissionRequest instance){
            this(fluent, instance, true);
    }
    public AdmissionRequestBuilder(AdmissionRequestFluent<?> fluent,AdmissionRequest instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDryRun(instance.getDryRun()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withObject(instance.getObject()); 
            fluent.withOldObject(instance.getOldObject()); 
            fluent.withOperation(instance.getOperation()); 
            fluent.withResource(instance.getResource()); 
            fluent.withSubResource(instance.getSubResource()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUserInfo(instance.getUserInfo()); 
            this.validationEnabled = validationEnabled; 
    }
    public AdmissionRequestBuilder(AdmissionRequest instance){
            this(instance,true);
    }
    public AdmissionRequestBuilder(AdmissionRequest instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDryRun(instance.getDryRun()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withObject(instance.getObject()); 
            this.withOldObject(instance.getOldObject()); 
            this.withOperation(instance.getOperation()); 
            this.withResource(instance.getResource()); 
            this.withSubResource(instance.getSubResource()); 
            this.withUid(instance.getUid()); 
            this.withUserInfo(instance.getUserInfo()); 
            this.validationEnabled = validationEnabled; 
    }
    public AdmissionRequestBuilder(Validator validator){
            this(new AdmissionRequest(), true);
    }
    public AdmissionRequestBuilder(AdmissionRequestFluent<?> fluent,AdmissionRequest instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDryRun(instance.getDryRun()); 
            fluent.withKind(instance.getKind()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withObject(instance.getObject()); 
            fluent.withOldObject(instance.getOldObject()); 
            fluent.withOperation(instance.getOperation()); 
            fluent.withResource(instance.getResource()); 
            fluent.withSubResource(instance.getSubResource()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUserInfo(instance.getUserInfo()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AdmissionRequestBuilder(AdmissionRequest instance,Validator validator){
            this.fluent = this; 
            this.withDryRun(instance.getDryRun()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withObject(instance.getObject()); 
            this.withOldObject(instance.getOldObject()); 
            this.withOperation(instance.getOperation()); 
            this.withResource(instance.getResource()); 
            this.withSubResource(instance.getSubResource()); 
            this.withUid(instance.getUid()); 
            this.withUserInfo(instance.getUserInfo()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AdmissionRequest build(){
            AdmissionRequest buildable = new AdmissionRequest(fluent.isDryRun(),fluent.getKind(),fluent.getName(),fluent.getNamespace(),fluent.getObject(),fluent.getOldObject(),fluent.getOperation(),fluent.getResource(),fluent.getSubResource(),fluent.getUid(),fluent.getUserInfo());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AdmissionRequestBuilder that = (AdmissionRequestBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
