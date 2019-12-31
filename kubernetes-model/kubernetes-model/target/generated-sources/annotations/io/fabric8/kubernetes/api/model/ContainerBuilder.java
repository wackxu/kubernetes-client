package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ContainerBuilder extends ContainerFluentImpl<ContainerBuilder> implements VisitableBuilder<Container,ContainerBuilder>{

    ContainerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ContainerBuilder(){
            this(true);
    }
    public ContainerBuilder(Boolean validationEnabled){
            this(new Container(), validationEnabled);
    }
    public ContainerBuilder(ContainerFluent<?> fluent){
            this(fluent, true);
    }
    public ContainerBuilder(ContainerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Container(), validationEnabled);
    }
    public ContainerBuilder(ContainerFluent<?> fluent,Container instance){
            this(fluent, instance, true);
    }
    public ContainerBuilder(ContainerFluent<?> fluent,Container instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withArgs(instance.getArgs()); 
            fluent.withCommand(instance.getCommand()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withEnvFrom(instance.getEnvFrom()); 
            fluent.withImage(instance.getImage()); 
            fluent.withImagePullPolicy(instance.getImagePullPolicy()); 
            fluent.withLifecycle(instance.getLifecycle()); 
            fluent.withLivenessProbe(instance.getLivenessProbe()); 
            fluent.withName(instance.getName()); 
            fluent.withPorts(instance.getPorts()); 
            fluent.withReadinessProbe(instance.getReadinessProbe()); 
            fluent.withResources(instance.getResources()); 
            fluent.withSecurityContext(instance.getSecurityContext()); 
            fluent.withStdin(instance.getStdin()); 
            fluent.withStdinOnce(instance.getStdinOnce()); 
            fluent.withTerminationMessagePath(instance.getTerminationMessagePath()); 
            fluent.withTerminationMessagePolicy(instance.getTerminationMessagePolicy()); 
            fluent.withTty(instance.getTty()); 
            fluent.withVolumeDevices(instance.getVolumeDevices()); 
            fluent.withVolumeMounts(instance.getVolumeMounts()); 
            fluent.withWorkingDir(instance.getWorkingDir()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerBuilder(Container instance){
            this(instance,true);
    }
    public ContainerBuilder(Container instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withArgs(instance.getArgs()); 
            this.withCommand(instance.getCommand()); 
            this.withEnv(instance.getEnv()); 
            this.withEnvFrom(instance.getEnvFrom()); 
            this.withImage(instance.getImage()); 
            this.withImagePullPolicy(instance.getImagePullPolicy()); 
            this.withLifecycle(instance.getLifecycle()); 
            this.withLivenessProbe(instance.getLivenessProbe()); 
            this.withName(instance.getName()); 
            this.withPorts(instance.getPorts()); 
            this.withReadinessProbe(instance.getReadinessProbe()); 
            this.withResources(instance.getResources()); 
            this.withSecurityContext(instance.getSecurityContext()); 
            this.withStdin(instance.getStdin()); 
            this.withStdinOnce(instance.getStdinOnce()); 
            this.withTerminationMessagePath(instance.getTerminationMessagePath()); 
            this.withTerminationMessagePolicy(instance.getTerminationMessagePolicy()); 
            this.withTty(instance.getTty()); 
            this.withVolumeDevices(instance.getVolumeDevices()); 
            this.withVolumeMounts(instance.getVolumeMounts()); 
            this.withWorkingDir(instance.getWorkingDir()); 
            this.validationEnabled = validationEnabled; 
    }
    public ContainerBuilder(Validator validator){
            this(new Container(), true);
    }
    public ContainerBuilder(ContainerFluent<?> fluent,Container instance,Validator validator){
            this.fluent = fluent; 
            fluent.withArgs(instance.getArgs()); 
            fluent.withCommand(instance.getCommand()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withEnvFrom(instance.getEnvFrom()); 
            fluent.withImage(instance.getImage()); 
            fluent.withImagePullPolicy(instance.getImagePullPolicy()); 
            fluent.withLifecycle(instance.getLifecycle()); 
            fluent.withLivenessProbe(instance.getLivenessProbe()); 
            fluent.withName(instance.getName()); 
            fluent.withPorts(instance.getPorts()); 
            fluent.withReadinessProbe(instance.getReadinessProbe()); 
            fluent.withResources(instance.getResources()); 
            fluent.withSecurityContext(instance.getSecurityContext()); 
            fluent.withStdin(instance.getStdin()); 
            fluent.withStdinOnce(instance.getStdinOnce()); 
            fluent.withTerminationMessagePath(instance.getTerminationMessagePath()); 
            fluent.withTerminationMessagePolicy(instance.getTerminationMessagePolicy()); 
            fluent.withTty(instance.getTty()); 
            fluent.withVolumeDevices(instance.getVolumeDevices()); 
            fluent.withVolumeMounts(instance.getVolumeMounts()); 
            fluent.withWorkingDir(instance.getWorkingDir()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ContainerBuilder(Container instance,Validator validator){
            this.fluent = this; 
            this.withArgs(instance.getArgs()); 
            this.withCommand(instance.getCommand()); 
            this.withEnv(instance.getEnv()); 
            this.withEnvFrom(instance.getEnvFrom()); 
            this.withImage(instance.getImage()); 
            this.withImagePullPolicy(instance.getImagePullPolicy()); 
            this.withLifecycle(instance.getLifecycle()); 
            this.withLivenessProbe(instance.getLivenessProbe()); 
            this.withName(instance.getName()); 
            this.withPorts(instance.getPorts()); 
            this.withReadinessProbe(instance.getReadinessProbe()); 
            this.withResources(instance.getResources()); 
            this.withSecurityContext(instance.getSecurityContext()); 
            this.withStdin(instance.getStdin()); 
            this.withStdinOnce(instance.getStdinOnce()); 
            this.withTerminationMessagePath(instance.getTerminationMessagePath()); 
            this.withTerminationMessagePolicy(instance.getTerminationMessagePolicy()); 
            this.withTty(instance.getTty()); 
            this.withVolumeDevices(instance.getVolumeDevices()); 
            this.withVolumeMounts(instance.getVolumeMounts()); 
            this.withWorkingDir(instance.getWorkingDir()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Container build(){
            Container buildable = new Container(fluent.getArgs(),fluent.getCommand(),fluent.getEnv(),fluent.getEnvFrom(),fluent.getImage(),fluent.getImagePullPolicy(),fluent.getLifecycle(),fluent.getLivenessProbe(),fluent.getName(),fluent.getPorts(),fluent.getReadinessProbe(),fluent.getResources(),fluent.getSecurityContext(),fluent.isStdin(),fluent.isStdinOnce(),fluent.getTerminationMessagePath(),fluent.getTerminationMessagePolicy(),fluent.isTty(),fluent.getVolumeDevices(),fluent.getVolumeMounts(),fluent.getWorkingDir());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerBuilder that = (ContainerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
