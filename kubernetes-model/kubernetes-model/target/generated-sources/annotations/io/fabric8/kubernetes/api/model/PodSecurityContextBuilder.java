package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodSecurityContextBuilder extends PodSecurityContextFluentImpl<PodSecurityContextBuilder> implements VisitableBuilder<PodSecurityContext,PodSecurityContextBuilder>{

    PodSecurityContextFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodSecurityContextBuilder(){
            this(true);
    }
    public PodSecurityContextBuilder(Boolean validationEnabled){
            this(new PodSecurityContext(), validationEnabled);
    }
    public PodSecurityContextBuilder(PodSecurityContextFluent<?> fluent){
            this(fluent, true);
    }
    public PodSecurityContextBuilder(PodSecurityContextFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodSecurityContext(), validationEnabled);
    }
    public PodSecurityContextBuilder(PodSecurityContextFluent<?> fluent,PodSecurityContext instance){
            this(fluent, instance, true);
    }
    public PodSecurityContextBuilder(PodSecurityContextFluent<?> fluent,PodSecurityContext instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsGroup(instance.getFsGroup()); 
            fluent.withRunAsGroup(instance.getRunAsGroup()); 
            fluent.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            fluent.withRunAsUser(instance.getRunAsUser()); 
            fluent.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            fluent.withSupplementalGroups(instance.getSupplementalGroups()); 
            fluent.withSysctls(instance.getSysctls()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSecurityContextBuilder(PodSecurityContext instance){
            this(instance,true);
    }
    public PodSecurityContextBuilder(PodSecurityContext instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsGroup(instance.getFsGroup()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withSysctls(instance.getSysctls()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodSecurityContextBuilder(Validator validator){
            this(new PodSecurityContext(), true);
    }
    public PodSecurityContextBuilder(PodSecurityContextFluent<?> fluent,PodSecurityContext instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsGroup(instance.getFsGroup()); 
            fluent.withRunAsGroup(instance.getRunAsGroup()); 
            fluent.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            fluent.withRunAsUser(instance.getRunAsUser()); 
            fluent.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            fluent.withSupplementalGroups(instance.getSupplementalGroups()); 
            fluent.withSysctls(instance.getSysctls()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodSecurityContextBuilder(PodSecurityContext instance,Validator validator){
            this.fluent = this; 
            this.withFsGroup(instance.getFsGroup()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withSysctls(instance.getSysctls()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodSecurityContext build(){
            PodSecurityContext buildable = new PodSecurityContext(fluent.getFsGroup(),fluent.getRunAsGroup(),fluent.isRunAsNonRoot(),fluent.getRunAsUser(),fluent.getSeLinuxOptions(),fluent.getSupplementalGroups(),fluent.getSysctls());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodSecurityContextBuilder that = (PodSecurityContextBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
