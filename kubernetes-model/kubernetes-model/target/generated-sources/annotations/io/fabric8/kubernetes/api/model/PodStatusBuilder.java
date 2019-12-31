package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodStatusBuilder extends PodStatusFluentImpl<PodStatusBuilder> implements VisitableBuilder<PodStatus,PodStatusBuilder>{

    PodStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodStatusBuilder(){
            this(true);
    }
    public PodStatusBuilder(Boolean validationEnabled){
            this(new PodStatus(), validationEnabled);
    }
    public PodStatusBuilder(PodStatusFluent<?> fluent){
            this(fluent, true);
    }
    public PodStatusBuilder(PodStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodStatus(), validationEnabled);
    }
    public PodStatusBuilder(PodStatusFluent<?> fluent,PodStatus instance){
            this(fluent, instance, true);
    }
    public PodStatusBuilder(PodStatusFluent<?> fluent,PodStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConditions(instance.getConditions()); 
            fluent.withContainerStatuses(instance.getContainerStatuses()); 
            fluent.withHostIP(instance.getHostIP()); 
            fluent.withInitContainerStatuses(instance.getInitContainerStatuses()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withNominatedNodeName(instance.getNominatedNodeName()); 
            fluent.withPhase(instance.getPhase()); 
            fluent.withPodIP(instance.getPodIP()); 
            fluent.withQosClass(instance.getQosClass()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStartTime(instance.getStartTime()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodStatusBuilder(PodStatus instance){
            this(instance,true);
    }
    public PodStatusBuilder(PodStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConditions(instance.getConditions()); 
            this.withContainerStatuses(instance.getContainerStatuses()); 
            this.withHostIP(instance.getHostIP()); 
            this.withInitContainerStatuses(instance.getInitContainerStatuses()); 
            this.withMessage(instance.getMessage()); 
            this.withNominatedNodeName(instance.getNominatedNodeName()); 
            this.withPhase(instance.getPhase()); 
            this.withPodIP(instance.getPodIP()); 
            this.withQosClass(instance.getQosClass()); 
            this.withReason(instance.getReason()); 
            this.withStartTime(instance.getStartTime()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodStatusBuilder(Validator validator){
            this(new PodStatus(), true);
    }
    public PodStatusBuilder(PodStatusFluent<?> fluent,PodStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConditions(instance.getConditions()); 
            fluent.withContainerStatuses(instance.getContainerStatuses()); 
            fluent.withHostIP(instance.getHostIP()); 
            fluent.withInitContainerStatuses(instance.getInitContainerStatuses()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withNominatedNodeName(instance.getNominatedNodeName()); 
            fluent.withPhase(instance.getPhase()); 
            fluent.withPodIP(instance.getPodIP()); 
            fluent.withQosClass(instance.getQosClass()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStartTime(instance.getStartTime()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodStatusBuilder(PodStatus instance,Validator validator){
            this.fluent = this; 
            this.withConditions(instance.getConditions()); 
            this.withContainerStatuses(instance.getContainerStatuses()); 
            this.withHostIP(instance.getHostIP()); 
            this.withInitContainerStatuses(instance.getInitContainerStatuses()); 
            this.withMessage(instance.getMessage()); 
            this.withNominatedNodeName(instance.getNominatedNodeName()); 
            this.withPhase(instance.getPhase()); 
            this.withPodIP(instance.getPodIP()); 
            this.withQosClass(instance.getQosClass()); 
            this.withReason(instance.getReason()); 
            this.withStartTime(instance.getStartTime()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodStatus build(){
            PodStatus buildable = new PodStatus(fluent.getConditions(),fluent.getContainerStatuses(),fluent.getHostIP(),fluent.getInitContainerStatuses(),fluent.getMessage(),fluent.getNominatedNodeName(),fluent.getPhase(),fluent.getPodIP(),fluent.getQosClass(),fluent.getReason(),fluent.getStartTime());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodStatusBuilder that = (PodStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
