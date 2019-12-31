package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ObjectMetaBuilder extends ObjectMetaFluentImpl<ObjectMetaBuilder> implements VisitableBuilder<ObjectMeta,ObjectMetaBuilder>{

    ObjectMetaFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ObjectMetaBuilder(){
            this(true);
    }
    public ObjectMetaBuilder(Boolean validationEnabled){
            this(new ObjectMeta(), validationEnabled);
    }
    public ObjectMetaBuilder(ObjectMetaFluent<?> fluent){
            this(fluent, true);
    }
    public ObjectMetaBuilder(ObjectMetaFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ObjectMeta(), validationEnabled);
    }
    public ObjectMetaBuilder(ObjectMetaFluent<?> fluent,ObjectMeta instance){
            this(fluent, instance, true);
    }
    public ObjectMetaBuilder(ObjectMetaFluent<?> fluent,ObjectMeta instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAnnotations(instance.getAnnotations()); 
            fluent.withClusterName(instance.getClusterName()); 
            fluent.withCreationTimestamp(instance.getCreationTimestamp()); 
            fluent.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds()); 
            fluent.withDeletionTimestamp(instance.getDeletionTimestamp()); 
            fluent.withFinalizers(instance.getFinalizers()); 
            fluent.withGenerateName(instance.getGenerateName()); 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withInitializers(instance.getInitializers()); 
            fluent.withLabels(instance.getLabels()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withOwnerReferences(instance.getOwnerReferences()); 
            fluent.withResourceVersion(instance.getResourceVersion()); 
            fluent.withSelfLink(instance.getSelfLink()); 
            fluent.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectMetaBuilder(ObjectMeta instance){
            this(instance,true);
    }
    public ObjectMetaBuilder(ObjectMeta instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAnnotations(instance.getAnnotations()); 
            this.withClusterName(instance.getClusterName()); 
            this.withCreationTimestamp(instance.getCreationTimestamp()); 
            this.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds()); 
            this.withDeletionTimestamp(instance.getDeletionTimestamp()); 
            this.withFinalizers(instance.getFinalizers()); 
            this.withGenerateName(instance.getGenerateName()); 
            this.withGeneration(instance.getGeneration()); 
            this.withInitializers(instance.getInitializers()); 
            this.withLabels(instance.getLabels()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withOwnerReferences(instance.getOwnerReferences()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withSelfLink(instance.getSelfLink()); 
            this.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectMetaBuilder(Validator validator){
            this(new ObjectMeta(), true);
    }
    public ObjectMetaBuilder(ObjectMetaFluent<?> fluent,ObjectMeta instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAnnotations(instance.getAnnotations()); 
            fluent.withClusterName(instance.getClusterName()); 
            fluent.withCreationTimestamp(instance.getCreationTimestamp()); 
            fluent.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds()); 
            fluent.withDeletionTimestamp(instance.getDeletionTimestamp()); 
            fluent.withFinalizers(instance.getFinalizers()); 
            fluent.withGenerateName(instance.getGenerateName()); 
            fluent.withGeneration(instance.getGeneration()); 
            fluent.withInitializers(instance.getInitializers()); 
            fluent.withLabels(instance.getLabels()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withOwnerReferences(instance.getOwnerReferences()); 
            fluent.withResourceVersion(instance.getResourceVersion()); 
            fluent.withSelfLink(instance.getSelfLink()); 
            fluent.withUid(instance.getUid()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ObjectMetaBuilder(ObjectMeta instance,Validator validator){
            this.fluent = this; 
            this.withAnnotations(instance.getAnnotations()); 
            this.withClusterName(instance.getClusterName()); 
            this.withCreationTimestamp(instance.getCreationTimestamp()); 
            this.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds()); 
            this.withDeletionTimestamp(instance.getDeletionTimestamp()); 
            this.withFinalizers(instance.getFinalizers()); 
            this.withGenerateName(instance.getGenerateName()); 
            this.withGeneration(instance.getGeneration()); 
            this.withInitializers(instance.getInitializers()); 
            this.withLabels(instance.getLabels()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withOwnerReferences(instance.getOwnerReferences()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withSelfLink(instance.getSelfLink()); 
            this.withUid(instance.getUid()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ObjectMeta build(){
            ObjectMeta buildable = new ObjectMeta(fluent.getAnnotations(),fluent.getClusterName(),fluent.getCreationTimestamp(),fluent.getDeletionGracePeriodSeconds(),fluent.getDeletionTimestamp(),fluent.getFinalizers(),fluent.getGenerateName(),fluent.getGeneration(),fluent.getInitializers(),fluent.getLabels(),fluent.getName(),fluent.getNamespace(),fluent.getOwnerReferences(),fluent.getResourceVersion(),fluent.getSelfLink(),fluent.getUid());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectMetaBuilder that = (ObjectMetaBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
