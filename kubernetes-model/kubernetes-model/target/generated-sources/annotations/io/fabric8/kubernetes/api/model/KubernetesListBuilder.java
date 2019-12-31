package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class KubernetesListBuilder extends KubernetesListFluentImpl<KubernetesListBuilder> implements VisitableBuilder<KubernetesList,KubernetesListBuilder>{

    KubernetesListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public KubernetesListBuilder(){
            this(true);
    }
    public KubernetesListBuilder(Boolean validationEnabled){
            this(new KubernetesList(), validationEnabled);
    }
    public KubernetesListBuilder(KubernetesListFluent<?> fluent){
            this(fluent, true);
    }
    public KubernetesListBuilder(KubernetesListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new KubernetesList(), validationEnabled);
    }
    public KubernetesListBuilder(KubernetesListFluent<?> fluent,KubernetesList instance){
            this(fluent, instance, true);
    }
    public KubernetesListBuilder(KubernetesListFluent<?> fluent,KubernetesList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public KubernetesListBuilder(KubernetesList instance){
            this(instance,true);
    }
    public KubernetesListBuilder(KubernetesList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public KubernetesListBuilder(Validator validator){
            this(new KubernetesList(), true);
    }
    public KubernetesListBuilder(KubernetesListFluent<?> fluent,KubernetesList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public KubernetesListBuilder(KubernetesList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public KubernetesList build(){
            KubernetesList buildable = new KubernetesList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            KubernetesListBuilder that = (KubernetesListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
