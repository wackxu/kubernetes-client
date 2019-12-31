package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DaemonSetListBuilder extends DaemonSetListFluentImpl<DaemonSetListBuilder> implements VisitableBuilder<DaemonSetList,DaemonSetListBuilder>{

    DaemonSetListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DaemonSetListBuilder(){
            this(true);
    }
    public DaemonSetListBuilder(Boolean validationEnabled){
            this(new DaemonSetList(), validationEnabled);
    }
    public DaemonSetListBuilder(DaemonSetListFluent<?> fluent){
            this(fluent, true);
    }
    public DaemonSetListBuilder(DaemonSetListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DaemonSetList(), validationEnabled);
    }
    public DaemonSetListBuilder(DaemonSetListFluent<?> fluent,DaemonSetList instance){
            this(fluent, instance, true);
    }
    public DaemonSetListBuilder(DaemonSetListFluent<?> fluent,DaemonSetList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetListBuilder(DaemonSetList instance){
            this(instance,true);
    }
    public DaemonSetListBuilder(DaemonSetList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetListBuilder(Validator validator){
            this(new DaemonSetList(), true);
    }
    public DaemonSetListBuilder(DaemonSetListFluent<?> fluent,DaemonSetList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DaemonSetListBuilder(DaemonSetList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DaemonSetList build(){
            DaemonSetList buildable = new DaemonSetList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetListBuilder that = (DaemonSetListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
