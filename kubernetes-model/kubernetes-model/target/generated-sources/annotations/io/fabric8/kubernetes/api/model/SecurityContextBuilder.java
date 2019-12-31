package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecurityContextBuilder extends SecurityContextFluentImpl<SecurityContextBuilder> implements VisitableBuilder<SecurityContext,SecurityContextBuilder>{

    SecurityContextFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecurityContextBuilder(){
            this(true);
    }
    public SecurityContextBuilder(Boolean validationEnabled){
            this(new SecurityContext(), validationEnabled);
    }
    public SecurityContextBuilder(SecurityContextFluent<?> fluent){
            this(fluent, true);
    }
    public SecurityContextBuilder(SecurityContextFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecurityContext(), validationEnabled);
    }
    public SecurityContextBuilder(SecurityContextFluent<?> fluent,SecurityContext instance){
            this(fluent, instance, true);
    }
    public SecurityContextBuilder(SecurityContextFluent<?> fluent,SecurityContext instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            fluent.withCapabilities(instance.getCapabilities()); 
            fluent.withPrivileged(instance.getPrivileged()); 
            fluent.withProcMount(instance.getProcMount()); 
            fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            fluent.withRunAsGroup(instance.getRunAsGroup()); 
            fluent.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            fluent.withRunAsUser(instance.getRunAsUser()); 
            fluent.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecurityContextBuilder(SecurityContext instance){
            this(instance,true);
    }
    public SecurityContextBuilder(SecurityContext instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withCapabilities(instance.getCapabilities()); 
            this.withPrivileged(instance.getPrivileged()); 
            this.withProcMount(instance.getProcMount()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecurityContextBuilder(Validator validator){
            this(new SecurityContext(), true);
    }
    public SecurityContextBuilder(SecurityContextFluent<?> fluent,SecurityContext instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            fluent.withCapabilities(instance.getCapabilities()); 
            fluent.withPrivileged(instance.getPrivileged()); 
            fluent.withProcMount(instance.getProcMount()); 
            fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            fluent.withRunAsGroup(instance.getRunAsGroup()); 
            fluent.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            fluent.withRunAsUser(instance.getRunAsUser()); 
            fluent.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecurityContextBuilder(SecurityContext instance,Validator validator){
            this.fluent = this; 
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withCapabilities(instance.getCapabilities()); 
            this.withPrivileged(instance.getPrivileged()); 
            this.withProcMount(instance.getProcMount()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsNonRoot(instance.getRunAsNonRoot()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxOptions(instance.getSeLinuxOptions()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecurityContext build(){
            SecurityContext buildable = new SecurityContext(fluent.isAllowPrivilegeEscalation(),fluent.getCapabilities(),fluent.isPrivileged(),fluent.getProcMount(),fluent.isReadOnlyRootFilesystem(),fluent.getRunAsGroup(),fluent.isRunAsNonRoot(),fluent.getRunAsUser(),fluent.getSeLinuxOptions());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecurityContextBuilder that = (SecurityContextBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
