package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BaseKubernetesListBuilder extends BaseKubernetesListFluentImpl<BaseKubernetesListBuilder> implements VisitableBuilder<BaseKubernetesList,BaseKubernetesListBuilder>{

    BaseKubernetesListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BaseKubernetesListBuilder(){
            this(true);
    }
    public BaseKubernetesListBuilder(Boolean validationEnabled){
            this(new BaseKubernetesList(), validationEnabled);
    }
    public BaseKubernetesListBuilder(BaseKubernetesListFluent<?> fluent){
            this(fluent, true);
    }
    public BaseKubernetesListBuilder(BaseKubernetesListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BaseKubernetesList(), validationEnabled);
    }
    public BaseKubernetesListBuilder(BaseKubernetesListFluent<?> fluent,BaseKubernetesList instance){
            this(fluent, instance, true);
    }
    public BaseKubernetesListBuilder(BaseKubernetesListFluent<?> fluent,BaseKubernetesList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public BaseKubernetesListBuilder(BaseKubernetesList instance){
            this(instance,true);
    }
    public BaseKubernetesListBuilder(BaseKubernetesList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public BaseKubernetesListBuilder(Validator validator){
            this(new BaseKubernetesList(), true);
    }
    public BaseKubernetesListBuilder(BaseKubernetesListFluent<?> fluent,BaseKubernetesList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BaseKubernetesListBuilder(BaseKubernetesList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BaseKubernetesList build(){
            BaseKubernetesList buildable = new BaseKubernetesList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BaseKubernetesListBuilder that = (BaseKubernetesListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
