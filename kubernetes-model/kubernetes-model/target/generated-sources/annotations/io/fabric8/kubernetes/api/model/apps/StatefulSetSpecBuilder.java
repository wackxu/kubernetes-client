package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StatefulSetSpecBuilder extends StatefulSetSpecFluentImpl<StatefulSetSpecBuilder> implements VisitableBuilder<StatefulSetSpec,StatefulSetSpecBuilder>{

    StatefulSetSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StatefulSetSpecBuilder(){
            this(true);
    }
    public StatefulSetSpecBuilder(Boolean validationEnabled){
            this(new StatefulSetSpec(), validationEnabled);
    }
    public StatefulSetSpecBuilder(StatefulSetSpecFluent<?> fluent){
            this(fluent, true);
    }
    public StatefulSetSpecBuilder(StatefulSetSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StatefulSetSpec(), validationEnabled);
    }
    public StatefulSetSpecBuilder(StatefulSetSpecFluent<?> fluent,StatefulSetSpec instance){
            this(fluent, instance, true);
    }
    public StatefulSetSpecBuilder(StatefulSetSpecFluent<?> fluent,StatefulSetSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPodManagementPolicy(instance.getPodManagementPolicy()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withServiceName(instance.getServiceName()); 
            fluent.withTemplate(instance.getTemplate()); 
            fluent.withUpdateStrategy(instance.getUpdateStrategy()); 
            fluent.withVolumeClaimTemplates(instance.getVolumeClaimTemplates()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetSpecBuilder(StatefulSetSpec instance){
            this(instance,true);
    }
    public StatefulSetSpecBuilder(StatefulSetSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPodManagementPolicy(instance.getPodManagementPolicy()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withServiceName(instance.getServiceName()); 
            this.withTemplate(instance.getTemplate()); 
            this.withUpdateStrategy(instance.getUpdateStrategy()); 
            this.withVolumeClaimTemplates(instance.getVolumeClaimTemplates()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetSpecBuilder(Validator validator){
            this(new StatefulSetSpec(), true);
    }
    public StatefulSetSpecBuilder(StatefulSetSpecFluent<?> fluent,StatefulSetSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPodManagementPolicy(instance.getPodManagementPolicy()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withServiceName(instance.getServiceName()); 
            fluent.withTemplate(instance.getTemplate()); 
            fluent.withUpdateStrategy(instance.getUpdateStrategy()); 
            fluent.withVolumeClaimTemplates(instance.getVolumeClaimTemplates()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StatefulSetSpecBuilder(StatefulSetSpec instance,Validator validator){
            this.fluent = this; 
            this.withPodManagementPolicy(instance.getPodManagementPolicy()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withServiceName(instance.getServiceName()); 
            this.withTemplate(instance.getTemplate()); 
            this.withUpdateStrategy(instance.getUpdateStrategy()); 
            this.withVolumeClaimTemplates(instance.getVolumeClaimTemplates()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StatefulSetSpec build(){
            StatefulSetSpec buildable = new StatefulSetSpec(fluent.getPodManagementPolicy(),fluent.getReplicas(),fluent.getRevisionHistoryLimit(),fluent.getSelector(),fluent.getServiceName(),fluent.getTemplate(),fluent.getUpdateStrategy(),fluent.getVolumeClaimTemplates());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatefulSetSpecBuilder that = (StatefulSetSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
