package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import javax.validation.constraints.Pattern;
import java.lang.Integer;

public class ContainerFluentImpl<A extends ContainerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ContainerFluent<A>{

    private List<String> args;
    private List<String> command;
    private List<EnvVarBuilder> env;
    private List<EnvFromSourceBuilder> envFrom;
    private String image;
    private String imagePullPolicy;
    private LifecycleBuilder lifecycle;
    private ProbeBuilder livenessProbe;
    private String name;
    private List<ContainerPortBuilder> ports;
    private ProbeBuilder readinessProbe;
    private ResourceRequirementsBuilder resources;
    private SecurityContextBuilder securityContext;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<VolumeDeviceBuilder> volumeDevices;
    private List<VolumeMountBuilder> volumeMounts;
    private String workingDir;

    public ContainerFluentImpl(){
    }
    public ContainerFluentImpl(Container instance){
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
    }

    public A addToArgs(int index,String item){
            if (this.args == null) {this.args = new ArrayList<String>();}
            this.args.add(index, item);
            return (A)this;
    }

    public A setToArgs(int index,String item){
            if (this.args == null) {this.args = new ArrayList<String>();}
            this.args.set(index, item); return (A)this;
    }

    public A addToArgs(String... items){
            if (this.args == null) {this.args = new ArrayList<String>();}
            for (String item : items) {this.args.add(item);} return (A)this;
    }

    public A addAllToArgs(Collection<String> items){
            if (this.args == null) {this.args = new ArrayList<String>();}
            for (String item : items) {this.args.add(item);} return (A)this;
    }

    public A removeFromArgs(String... items){
            for (String item : items) {if (this.args!= null){ this.args.remove(item);}} return (A)this;
    }

    public A removeAllFromArgs(Collection<String> items){
            for (String item : items) {if (this.args!= null){ this.args.remove(item);}} return (A)this;
    }

    public List<String> getArgs(){
            return this.args;
    }

    public String getArg(int index){
            return this.args.get(index);
    }

    public String getFirstArg(){
            return this.args.get(0);
    }

    public String getLastArg(){
            return this.args.get(args.size() - 1);
    }

    public String getMatchingArg(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: args) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withArgs(List<String> args){
            if (this.args != null) { _visitables.removeAll(this.args);}
            if (args != null) {this.args = new ArrayList<String>(); for (String item : args){this.addToArgs(item);}} else { this.args = new ArrayList<String>();} return (A) this;
    }

    public A withArgs(String... args){
            if (this.args != null) {this.args.clear();}
            if (args != null) {for (String item :args){ this.addToArgs(item);}} return (A) this;
    }

    public Boolean hasArgs(){
            return args != null && !args.isEmpty();
    }

    public A addToCommand(int index,String item){
            if (this.command == null) {this.command = new ArrayList<String>();}
            this.command.add(index, item);
            return (A)this;
    }

    public A setToCommand(int index,String item){
            if (this.command == null) {this.command = new ArrayList<String>();}
            this.command.set(index, item); return (A)this;
    }

    public A addToCommand(String... items){
            if (this.command == null) {this.command = new ArrayList<String>();}
            for (String item : items) {this.command.add(item);} return (A)this;
    }

    public A addAllToCommand(Collection<String> items){
            if (this.command == null) {this.command = new ArrayList<String>();}
            for (String item : items) {this.command.add(item);} return (A)this;
    }

    public A removeFromCommand(String... items){
            for (String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
    }

    public A removeAllFromCommand(Collection<String> items){
            for (String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
    }

    public List<String> getCommand(){
            return this.command;
    }

    public String getCommand(int index){
            return this.command.get(index);
    }

    public String getFirstCommand(){
            return this.command.get(0);
    }

    public String getLastCommand(){
            return this.command.get(command.size() - 1);
    }

    public String getMatchingCommand(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: command) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withCommand(List<String> command){
            if (this.command != null) { _visitables.removeAll(this.command);}
            if (command != null) {this.command = new ArrayList<String>(); for (String item : command){this.addToCommand(item);}} else { this.command = new ArrayList<String>();} return (A) this;
    }

    public A withCommand(String... command){
            if (this.command != null) {this.command.clear();}
            if (command != null) {for (String item :command){ this.addToCommand(item);}} return (A) this;
    }

    public Boolean hasCommand(){
            return command != null && !command.isEmpty();
    }

    public A addToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.env.add(index >= 0 ? index : env.size(), builder); return (A)this;
    }

    public A setToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= env.size()) { env.add(builder); } else { env.set(index, builder);}
             return (A)this;
    }

    public A addToEnv(EnvVar... items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A addAllToEnv(Collection<EnvVar> items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A removeFromEnv(EnvVar... items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnv(Collection<EnvVar> items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv(){
            return build(env);
    }

    public List<EnvVar> buildEnv(){
            return build(env);
    }

    public EnvVar buildEnv(int index){
            return this.env.get(index).build();
    }

    public EnvVar buildFirstEnv(){
            return this.env.get(0).build();
    }

    public EnvVar buildLastEnv(){
            return this.env.get(env.size() - 1).build();
    }

    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            for (EnvVarBuilder item: env) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnv(List<EnvVar> env){
            if (this.env != null) { _visitables.removeAll(this.env);}
            if (env != null) {this.env = new ArrayList<EnvVarBuilder>(); for (EnvVar item : env){this.addToEnv(item);}} else { this.env = new ArrayList<EnvVarBuilder>();} return (A) this;
    }

    public A withEnv(EnvVar... env){
            if (this.env != null) {this.env.clear();}
            if (env != null) {for (EnvVar item :env){ this.addToEnv(item);}} return (A) this;
    }

    public Boolean hasEnv(){
            return env != null && !env.isEmpty();
    }

    public ContainerFluent.EnvNested<A> addNewEnv(){
            return new EnvNestedImpl();
    }

    public ContainerFluent.EnvNested<A> addNewEnvLike(EnvVar item){
            return new EnvNestedImpl(-1, item);
    }

    public ContainerFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item){
            return new EnvNestedImpl(index, item);
    }

    public ContainerFluent.EnvNested<A> editEnv(int index){
            if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public ContainerFluent.EnvNested<A> editFirstEnv(){
            if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
            return setNewEnvLike(0, buildEnv(0));
    }

    public ContainerFluent.EnvNested<A> editLastEnv(){
            int index = env.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public ContainerFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<env.size();i++) { 
            if (predicate.apply(env.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public A addToEnvFrom(int index,EnvFromSource item){
            if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>();}
            EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.envFrom.add(index >= 0 ? index : envFrom.size(), builder); return (A)this;
    }

    public A setToEnvFrom(int index,EnvFromSource item){
            if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>();}
            EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= envFrom.size()) { envFrom.add(builder); } else { envFrom.set(index, builder);}
             return (A)this;
    }

    public A addToEnvFrom(EnvFromSource... items){
            if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>();}
            for (EnvFromSource item : items) {EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.add(builder);this.envFrom.add(builder);} return (A)this;
    }

    public A addAllToEnvFrom(Collection<EnvFromSource> items){
            if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>();}
            for (EnvFromSource item : items) {EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.add(builder);this.envFrom.add(builder);} return (A)this;
    }

    public A removeFromEnvFrom(EnvFromSource... items){
            for (EnvFromSource item : items) {EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.remove(builder);if (this.envFrom != null) {this.envFrom.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnvFrom(Collection<EnvFromSource> items){
            for (EnvFromSource item : items) {EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.remove(builder);if (this.envFrom != null) {this.envFrom.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnvFrom instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvFromSource> getEnvFrom(){
            return build(envFrom);
    }

    public List<EnvFromSource> buildEnvFrom(){
            return build(envFrom);
    }

    public EnvFromSource buildEnvFrom(int index){
            return this.envFrom.get(index).build();
    }

    public EnvFromSource buildFirstEnvFrom(){
            return this.envFrom.get(0).build();
    }

    public EnvFromSource buildLastEnvFrom(){
            return this.envFrom.get(envFrom.size() - 1).build();
    }

    public EnvFromSource buildMatchingEnvFrom(io.fabric8.kubernetes.api.builder.Predicate<EnvFromSourceBuilder> predicate){
            for (EnvFromSourceBuilder item: envFrom) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnvFrom(List<EnvFromSource> envFrom){
            if (this.envFrom != null) { _visitables.removeAll(this.envFrom);}
            if (envFrom != null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>(); for (EnvFromSource item : envFrom){this.addToEnvFrom(item);}} else { this.envFrom = new ArrayList<EnvFromSourceBuilder>();} return (A) this;
    }

    public A withEnvFrom(EnvFromSource... envFrom){
            if (this.envFrom != null) {this.envFrom.clear();}
            if (envFrom != null) {for (EnvFromSource item :envFrom){ this.addToEnvFrom(item);}} return (A) this;
    }

    public Boolean hasEnvFrom(){
            return envFrom != null && !envFrom.isEmpty();
    }

    public ContainerFluent.EnvFromNested<A> addNewEnvFrom(){
            return new EnvFromNestedImpl();
    }

    public ContainerFluent.EnvFromNested<A> addNewEnvFromLike(EnvFromSource item){
            return new EnvFromNestedImpl(-1, item);
    }

    public ContainerFluent.EnvFromNested<A> setNewEnvFromLike(int index,EnvFromSource item){
            return new EnvFromNestedImpl(index, item);
    }

    public ContainerFluent.EnvFromNested<A> editEnvFrom(int index){
            if (envFrom.size() <= index) throw new RuntimeException("Can't edit envFrom. Index exceeds size.");
            return setNewEnvFromLike(index, buildEnvFrom(index));
    }

    public ContainerFluent.EnvFromNested<A> editFirstEnvFrom(){
            if (envFrom.size() == 0) throw new RuntimeException("Can't edit first envFrom. The list is empty.");
            return setNewEnvFromLike(0, buildEnvFrom(0));
    }

    public ContainerFluent.EnvFromNested<A> editLastEnvFrom(){
            int index = envFrom.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last envFrom. The list is empty.");
            return setNewEnvFromLike(index, buildEnvFrom(index));
    }

    public ContainerFluent.EnvFromNested<A> editMatchingEnvFrom(io.fabric8.kubernetes.api.builder.Predicate<EnvFromSourceBuilder> predicate){
            int index = -1;
            for (int i=0;i<envFrom.size();i++) { 
            if (predicate.apply(envFrom.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching envFrom. No match found.");
            return setNewEnvFromLike(index, buildEnvFrom(index));
    }

    public String getImage(){
            return this.image;
    }

    public A withImage(String image){
            this.image=image; return (A) this;
    }

    public Boolean hasImage(){
            return this.image != null;
    }

    public String getImagePullPolicy(){
            return this.imagePullPolicy;
    }

    public A withImagePullPolicy(String imagePullPolicy){
            this.imagePullPolicy=imagePullPolicy; return (A) this;
    }

    public Boolean hasImagePullPolicy(){
            return this.imagePullPolicy != null;
    }

    
/**
 * This method has been deprecated, please use method buildLifecycle instead.
 * @return The buildable object.
 */
@Deprecated public Lifecycle getLifecycle(){
            return this.lifecycle!=null?this.lifecycle.build():null;
    }

    public Lifecycle buildLifecycle(){
            return this.lifecycle!=null?this.lifecycle.build():null;
    }

    public A withLifecycle(Lifecycle lifecycle){
            _visitables.remove(this.lifecycle);
            if (lifecycle!=null){ this.lifecycle= new LifecycleBuilder(lifecycle); _visitables.add(this.lifecycle);} return (A) this;
    }

    public Boolean hasLifecycle(){
            return this.lifecycle != null;
    }

    public ContainerFluent.LifecycleNested<A> withNewLifecycle(){
            return new LifecycleNestedImpl();
    }

    public ContainerFluent.LifecycleNested<A> withNewLifecycleLike(Lifecycle item){
            return new LifecycleNestedImpl(item);
    }

    public ContainerFluent.LifecycleNested<A> editLifecycle(){
            return withNewLifecycleLike(getLifecycle());
    }

    public ContainerFluent.LifecycleNested<A> editOrNewLifecycle(){
            return withNewLifecycleLike(getLifecycle() != null ? getLifecycle(): new LifecycleBuilder().build());
    }

    public ContainerFluent.LifecycleNested<A> editOrNewLifecycleLike(Lifecycle item){
            return withNewLifecycleLike(getLifecycle() != null ? getLifecycle(): item);
    }

    
/**
 * This method has been deprecated, please use method buildLivenessProbe instead.
 * @return The buildable object.
 */
@Deprecated public Probe getLivenessProbe(){
            return this.livenessProbe!=null?this.livenessProbe.build():null;
    }

    public Probe buildLivenessProbe(){
            return this.livenessProbe!=null?this.livenessProbe.build():null;
    }

    public A withLivenessProbe(Probe livenessProbe){
            _visitables.remove(this.livenessProbe);
            if (livenessProbe!=null){ this.livenessProbe= new ProbeBuilder(livenessProbe); _visitables.add(this.livenessProbe);} return (A) this;
    }

    public Boolean hasLivenessProbe(){
            return this.livenessProbe != null;
    }

    public ContainerFluent.LivenessProbeNested<A> withNewLivenessProbe(){
            return new LivenessProbeNestedImpl();
    }

    public ContainerFluent.LivenessProbeNested<A> withNewLivenessProbeLike(Probe item){
            return new LivenessProbeNestedImpl(item);
    }

    public ContainerFluent.LivenessProbeNested<A> editLivenessProbe(){
            return withNewLivenessProbeLike(getLivenessProbe());
    }

    public ContainerFluent.LivenessProbeNested<A> editOrNewLivenessProbe(){
            return withNewLivenessProbeLike(getLivenessProbe() != null ? getLivenessProbe(): new ProbeBuilder().build());
    }

    public ContainerFluent.LivenessProbeNested<A> editOrNewLivenessProbeLike(Probe item){
            return withNewLivenessProbeLike(getLivenessProbe() != null ? getLivenessProbe(): item);
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public A addToPorts(int index,ContainerPort item){
            if (this.ports == null) {this.ports = new ArrayList<ContainerPortBuilder>();}
            ContainerPortBuilder builder = new ContainerPortBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ports.add(index >= 0 ? index : ports.size(), builder); return (A)this;
    }

    public A setToPorts(int index,ContainerPort item){
            if (this.ports == null) {this.ports = new ArrayList<ContainerPortBuilder>();}
            ContainerPortBuilder builder = new ContainerPortBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ports.size()) { ports.add(builder); } else { ports.set(index, builder);}
             return (A)this;
    }

    public A addToPorts(ContainerPort... items){
            if (this.ports == null) {this.ports = new ArrayList<ContainerPortBuilder>();}
            for (ContainerPort item : items) {ContainerPortBuilder builder = new ContainerPortBuilder(item);_visitables.add(builder);this.ports.add(builder);} return (A)this;
    }

    public A addAllToPorts(Collection<ContainerPort> items){
            if (this.ports == null) {this.ports = new ArrayList<ContainerPortBuilder>();}
            for (ContainerPort item : items) {ContainerPortBuilder builder = new ContainerPortBuilder(item);_visitables.add(builder);this.ports.add(builder);} return (A)this;
    }

    public A removeFromPorts(ContainerPort... items){
            for (ContainerPort item : items) {ContainerPortBuilder builder = new ContainerPortBuilder(item);_visitables.remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
    }

    public A removeAllFromPorts(Collection<ContainerPort> items){
            for (ContainerPort item : items) {ContainerPortBuilder builder = new ContainerPortBuilder(item);_visitables.remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<ContainerPort> getPorts(){
            return build(ports);
    }

    public List<ContainerPort> buildPorts(){
            return build(ports);
    }

    public ContainerPort buildPort(int index){
            return this.ports.get(index).build();
    }

    public ContainerPort buildFirstPort(){
            return this.ports.get(0).build();
    }

    public ContainerPort buildLastPort(){
            return this.ports.get(ports.size() - 1).build();
    }

    public ContainerPort buildMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<ContainerPortBuilder> predicate){
            for (ContainerPortBuilder item: ports) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPorts(List<ContainerPort> ports){
            if (this.ports != null) { _visitables.removeAll(this.ports);}
            if (ports != null) {this.ports = new ArrayList<ContainerPortBuilder>(); for (ContainerPort item : ports){this.addToPorts(item);}} else { this.ports = new ArrayList<ContainerPortBuilder>();} return (A) this;
    }

    public A withPorts(ContainerPort... ports){
            if (this.ports != null) {this.ports.clear();}
            if (ports != null) {for (ContainerPort item :ports){ this.addToPorts(item);}} return (A) this;
    }

    public Boolean hasPorts(){
            return ports != null && !ports.isEmpty();
    }

    public A addNewPort(Integer containerPort,String hostIP,Integer hostPort,String name,String protocol){
            return (A)addToPorts(new ContainerPort(containerPort, hostIP, hostPort, name, protocol));
    }

    public ContainerFluent.PortsNested<A> addNewPort(){
            return new PortsNestedImpl();
    }

    public ContainerFluent.PortsNested<A> addNewPortLike(ContainerPort item){
            return new PortsNestedImpl(-1, item);
    }

    public ContainerFluent.PortsNested<A> setNewPortLike(int index,ContainerPort item){
            return new PortsNestedImpl(index, item);
    }

    public ContainerFluent.PortsNested<A> editPort(int index){
            if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
            return setNewPortLike(index, buildPort(index));
    }

    public ContainerFluent.PortsNested<A> editFirstPort(){
            if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
            return setNewPortLike(0, buildPort(0));
    }

    public ContainerFluent.PortsNested<A> editLastPort(){
            int index = ports.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
            return setNewPortLike(index, buildPort(index));
    }

    public ContainerFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<ContainerPortBuilder> predicate){
            int index = -1;
            for (int i=0;i<ports.size();i++) { 
            if (predicate.apply(ports.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
            return setNewPortLike(index, buildPort(index));
    }

    
/**
 * This method has been deprecated, please use method buildReadinessProbe instead.
 * @return The buildable object.
 */
@Deprecated public Probe getReadinessProbe(){
            return this.readinessProbe!=null?this.readinessProbe.build():null;
    }

    public Probe buildReadinessProbe(){
            return this.readinessProbe!=null?this.readinessProbe.build():null;
    }

    public A withReadinessProbe(Probe readinessProbe){
            _visitables.remove(this.readinessProbe);
            if (readinessProbe!=null){ this.readinessProbe= new ProbeBuilder(readinessProbe); _visitables.add(this.readinessProbe);} return (A) this;
    }

    public Boolean hasReadinessProbe(){
            return this.readinessProbe != null;
    }

    public ContainerFluent.ReadinessProbeNested<A> withNewReadinessProbe(){
            return new ReadinessProbeNestedImpl();
    }

    public ContainerFluent.ReadinessProbeNested<A> withNewReadinessProbeLike(Probe item){
            return new ReadinessProbeNestedImpl(item);
    }

    public ContainerFluent.ReadinessProbeNested<A> editReadinessProbe(){
            return withNewReadinessProbeLike(getReadinessProbe());
    }

    public ContainerFluent.ReadinessProbeNested<A> editOrNewReadinessProbe(){
            return withNewReadinessProbeLike(getReadinessProbe() != null ? getReadinessProbe(): new ProbeBuilder().build());
    }

    public ContainerFluent.ReadinessProbeNested<A> editOrNewReadinessProbeLike(Probe item){
            return withNewReadinessProbeLike(getReadinessProbe() != null ? getReadinessProbe(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources(){
            return this.resources!=null?this.resources.build():null;
    }

    public ResourceRequirements buildResources(){
            return this.resources!=null?this.resources.build():null;
    }

    public A withResources(ResourceRequirements resources){
            _visitables.remove(this.resources);
            if (resources!=null){ this.resources= new ResourceRequirementsBuilder(resources); _visitables.add(this.resources);} return (A) this;
    }

    public Boolean hasResources(){
            return this.resources != null;
    }

    public ContainerFluent.ResourcesNested<A> withNewResources(){
            return new ResourcesNestedImpl();
    }

    public ContainerFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item){
            return new ResourcesNestedImpl(item);
    }

    public ContainerFluent.ResourcesNested<A> editResources(){
            return withNewResourcesLike(getResources());
    }

    public ContainerFluent.ResourcesNested<A> editOrNewResources(){
            return withNewResourcesLike(getResources() != null ? getResources(): new ResourceRequirementsBuilder().build());
    }

    public ContainerFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item){
            return withNewResourcesLike(getResources() != null ? getResources(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSecurityContext instead.
 * @return The buildable object.
 */
@Deprecated public SecurityContext getSecurityContext(){
            return this.securityContext!=null?this.securityContext.build():null;
    }

    public SecurityContext buildSecurityContext(){
            return this.securityContext!=null?this.securityContext.build():null;
    }

    public A withSecurityContext(SecurityContext securityContext){
            _visitables.remove(this.securityContext);
            if (securityContext!=null){ this.securityContext= new SecurityContextBuilder(securityContext); _visitables.add(this.securityContext);} return (A) this;
    }

    public Boolean hasSecurityContext(){
            return this.securityContext != null;
    }

    public ContainerFluent.SecurityContextNested<A> withNewSecurityContext(){
            return new SecurityContextNestedImpl();
    }

    public ContainerFluent.SecurityContextNested<A> withNewSecurityContextLike(SecurityContext item){
            return new SecurityContextNestedImpl(item);
    }

    public ContainerFluent.SecurityContextNested<A> editSecurityContext(){
            return withNewSecurityContextLike(getSecurityContext());
    }

    public ContainerFluent.SecurityContextNested<A> editOrNewSecurityContext(){
            return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext(): new SecurityContextBuilder().build());
    }

    public ContainerFluent.SecurityContextNested<A> editOrNewSecurityContextLike(SecurityContext item){
            return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext(): item);
    }

    public Boolean isStdin(){
            return this.stdin;
    }

    public A withStdin(Boolean stdin){
            this.stdin=stdin; return (A) this;
    }

    public Boolean hasStdin(){
            return this.stdin != null;
    }

    public A withNewStdin(String arg1){
            return (A)withStdin(new Boolean(arg1));
    }

    public A withNewStdin(boolean arg1){
            return (A)withStdin(new Boolean(arg1));
    }

    public Boolean isStdinOnce(){
            return this.stdinOnce;
    }

    public A withStdinOnce(Boolean stdinOnce){
            this.stdinOnce=stdinOnce; return (A) this;
    }

    public Boolean hasStdinOnce(){
            return this.stdinOnce != null;
    }

    public A withNewStdinOnce(String arg1){
            return (A)withStdinOnce(new Boolean(arg1));
    }

    public A withNewStdinOnce(boolean arg1){
            return (A)withStdinOnce(new Boolean(arg1));
    }

    public String getTerminationMessagePath(){
            return this.terminationMessagePath;
    }

    public A withTerminationMessagePath(String terminationMessagePath){
            this.terminationMessagePath=terminationMessagePath; return (A) this;
    }

    public Boolean hasTerminationMessagePath(){
            return this.terminationMessagePath != null;
    }

    public String getTerminationMessagePolicy(){
            return this.terminationMessagePolicy;
    }

    public A withTerminationMessagePolicy(String terminationMessagePolicy){
            this.terminationMessagePolicy=terminationMessagePolicy; return (A) this;
    }

    public Boolean hasTerminationMessagePolicy(){
            return this.terminationMessagePolicy != null;
    }

    public Boolean isTty(){
            return this.tty;
    }

    public A withTty(Boolean tty){
            this.tty=tty; return (A) this;
    }

    public Boolean hasTty(){
            return this.tty != null;
    }

    public A withNewTty(String arg1){
            return (A)withTty(new Boolean(arg1));
    }

    public A withNewTty(boolean arg1){
            return (A)withTty(new Boolean(arg1));
    }

    public A addToVolumeDevices(int index,VolumeDevice item){
            if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<VolumeDeviceBuilder>();}
            VolumeDeviceBuilder builder = new VolumeDeviceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.volumeDevices.add(index >= 0 ? index : volumeDevices.size(), builder); return (A)this;
    }

    public A setToVolumeDevices(int index,VolumeDevice item){
            if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<VolumeDeviceBuilder>();}
            VolumeDeviceBuilder builder = new VolumeDeviceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= volumeDevices.size()) { volumeDevices.add(builder); } else { volumeDevices.set(index, builder);}
             return (A)this;
    }

    public A addToVolumeDevices(VolumeDevice... items){
            if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<VolumeDeviceBuilder>();}
            for (VolumeDevice item : items) {VolumeDeviceBuilder builder = new VolumeDeviceBuilder(item);_visitables.add(builder);this.volumeDevices.add(builder);} return (A)this;
    }

    public A addAllToVolumeDevices(Collection<VolumeDevice> items){
            if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<VolumeDeviceBuilder>();}
            for (VolumeDevice item : items) {VolumeDeviceBuilder builder = new VolumeDeviceBuilder(item);_visitables.add(builder);this.volumeDevices.add(builder);} return (A)this;
    }

    public A removeFromVolumeDevices(VolumeDevice... items){
            for (VolumeDevice item : items) {VolumeDeviceBuilder builder = new VolumeDeviceBuilder(item);_visitables.remove(builder);if (this.volumeDevices != null) {this.volumeDevices.remove(builder);}} return (A)this;
    }

    public A removeAllFromVolumeDevices(Collection<VolumeDevice> items){
            for (VolumeDevice item : items) {VolumeDeviceBuilder builder = new VolumeDeviceBuilder(item);_visitables.remove(builder);if (this.volumeDevices != null) {this.volumeDevices.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildVolumeDevices instead.
 * @return The buildable object.
 */
@Deprecated public List<VolumeDevice> getVolumeDevices(){
            return build(volumeDevices);
    }

    public List<VolumeDevice> buildVolumeDevices(){
            return build(volumeDevices);
    }

    public VolumeDevice buildVolumeDevice(int index){
            return this.volumeDevices.get(index).build();
    }

    public VolumeDevice buildFirstVolumeDevice(){
            return this.volumeDevices.get(0).build();
    }

    public VolumeDevice buildLastVolumeDevice(){
            return this.volumeDevices.get(volumeDevices.size() - 1).build();
    }

    public VolumeDevice buildMatchingVolumeDevice(io.fabric8.kubernetes.api.builder.Predicate<VolumeDeviceBuilder> predicate){
            for (VolumeDeviceBuilder item: volumeDevices) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withVolumeDevices(List<VolumeDevice> volumeDevices){
            if (this.volumeDevices != null) { _visitables.removeAll(this.volumeDevices);}
            if (volumeDevices != null) {this.volumeDevices = new ArrayList<VolumeDeviceBuilder>(); for (VolumeDevice item : volumeDevices){this.addToVolumeDevices(item);}} else { this.volumeDevices = new ArrayList<VolumeDeviceBuilder>();} return (A) this;
    }

    public A withVolumeDevices(VolumeDevice... volumeDevices){
            if (this.volumeDevices != null) {this.volumeDevices.clear();}
            if (volumeDevices != null) {for (VolumeDevice item :volumeDevices){ this.addToVolumeDevices(item);}} return (A) this;
    }

    public Boolean hasVolumeDevices(){
            return volumeDevices != null && !volumeDevices.isEmpty();
    }

    public A addNewVolumeDevice(String devicePath,String name){
            return (A)addToVolumeDevices(new VolumeDevice(devicePath, name));
    }

    public ContainerFluent.VolumeDevicesNested<A> addNewVolumeDevice(){
            return new VolumeDevicesNestedImpl();
    }

    public ContainerFluent.VolumeDevicesNested<A> addNewVolumeDeviceLike(VolumeDevice item){
            return new VolumeDevicesNestedImpl(-1, item);
    }

    public ContainerFluent.VolumeDevicesNested<A> setNewVolumeDeviceLike(int index,VolumeDevice item){
            return new VolumeDevicesNestedImpl(index, item);
    }

    public ContainerFluent.VolumeDevicesNested<A> editVolumeDevice(int index){
            if (volumeDevices.size() <= index) throw new RuntimeException("Can't edit volumeDevices. Index exceeds size.");
            return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
    }

    public ContainerFluent.VolumeDevicesNested<A> editFirstVolumeDevice(){
            if (volumeDevices.size() == 0) throw new RuntimeException("Can't edit first volumeDevices. The list is empty.");
            return setNewVolumeDeviceLike(0, buildVolumeDevice(0));
    }

    public ContainerFluent.VolumeDevicesNested<A> editLastVolumeDevice(){
            int index = volumeDevices.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last volumeDevices. The list is empty.");
            return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
    }

    public ContainerFluent.VolumeDevicesNested<A> editMatchingVolumeDevice(io.fabric8.kubernetes.api.builder.Predicate<VolumeDeviceBuilder> predicate){
            int index = -1;
            for (int i=0;i<volumeDevices.size();i++) { 
            if (predicate.apply(volumeDevices.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching volumeDevices. No match found.");
            return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
    }

    public A addToVolumeMounts(int index,VolumeMount item){
            if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>();}
            VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.volumeMounts.add(index >= 0 ? index : volumeMounts.size(), builder); return (A)this;
    }

    public A setToVolumeMounts(int index,VolumeMount item){
            if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>();}
            VolumeMountBuilder builder = new VolumeMountBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= volumeMounts.size()) { volumeMounts.add(builder); } else { volumeMounts.set(index, builder);}
             return (A)this;
    }

    public A addToVolumeMounts(VolumeMount... items){
            if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>();}
            for (VolumeMount item : items) {VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.add(builder);this.volumeMounts.add(builder);} return (A)this;
    }

    public A addAllToVolumeMounts(Collection<VolumeMount> items){
            if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>();}
            for (VolumeMount item : items) {VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.add(builder);this.volumeMounts.add(builder);} return (A)this;
    }

    public A removeFromVolumeMounts(VolumeMount... items){
            for (VolumeMount item : items) {VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.remove(builder);if (this.volumeMounts != null) {this.volumeMounts.remove(builder);}} return (A)this;
    }

    public A removeAllFromVolumeMounts(Collection<VolumeMount> items){
            for (VolumeMount item : items) {VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.remove(builder);if (this.volumeMounts != null) {this.volumeMounts.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildVolumeMounts instead.
 * @return The buildable object.
 */
@Deprecated public List<VolumeMount> getVolumeMounts(){
            return build(volumeMounts);
    }

    public List<VolumeMount> buildVolumeMounts(){
            return build(volumeMounts);
    }

    public VolumeMount buildVolumeMount(int index){
            return this.volumeMounts.get(index).build();
    }

    public VolumeMount buildFirstVolumeMount(){
            return this.volumeMounts.get(0).build();
    }

    public VolumeMount buildLastVolumeMount(){
            return this.volumeMounts.get(volumeMounts.size() - 1).build();
    }

    public VolumeMount buildMatchingVolumeMount(io.fabric8.kubernetes.api.builder.Predicate<VolumeMountBuilder> predicate){
            for (VolumeMountBuilder item: volumeMounts) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withVolumeMounts(List<VolumeMount> volumeMounts){
            if (this.volumeMounts != null) { _visitables.removeAll(this.volumeMounts);}
            if (volumeMounts != null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>(); for (VolumeMount item : volumeMounts){this.addToVolumeMounts(item);}} else { this.volumeMounts = new ArrayList<VolumeMountBuilder>();} return (A) this;
    }

    public A withVolumeMounts(VolumeMount... volumeMounts){
            if (this.volumeMounts != null) {this.volumeMounts.clear();}
            if (volumeMounts != null) {for (VolumeMount item :volumeMounts){ this.addToVolumeMounts(item);}} return (A) this;
    }

    public Boolean hasVolumeMounts(){
            return volumeMounts != null && !volumeMounts.isEmpty();
    }

    public A addNewVolumeMount(String mountPath,String mountPropagation,String name,Boolean readOnly,String subPath){
            return (A)addToVolumeMounts(new VolumeMount(mountPath, mountPropagation, name, readOnly, subPath));
    }

    public ContainerFluent.VolumeMountsNested<A> addNewVolumeMount(){
            return new VolumeMountsNestedImpl();
    }

    public ContainerFluent.VolumeMountsNested<A> addNewVolumeMountLike(VolumeMount item){
            return new VolumeMountsNestedImpl(-1, item);
    }

    public ContainerFluent.VolumeMountsNested<A> setNewVolumeMountLike(int index,VolumeMount item){
            return new VolumeMountsNestedImpl(index, item);
    }

    public ContainerFluent.VolumeMountsNested<A> editVolumeMount(int index){
            if (volumeMounts.size() <= index) throw new RuntimeException("Can't edit volumeMounts. Index exceeds size.");
            return setNewVolumeMountLike(index, buildVolumeMount(index));
    }

    public ContainerFluent.VolumeMountsNested<A> editFirstVolumeMount(){
            if (volumeMounts.size() == 0) throw new RuntimeException("Can't edit first volumeMounts. The list is empty.");
            return setNewVolumeMountLike(0, buildVolumeMount(0));
    }

    public ContainerFluent.VolumeMountsNested<A> editLastVolumeMount(){
            int index = volumeMounts.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last volumeMounts. The list is empty.");
            return setNewVolumeMountLike(index, buildVolumeMount(index));
    }

    public ContainerFluent.VolumeMountsNested<A> editMatchingVolumeMount(io.fabric8.kubernetes.api.builder.Predicate<VolumeMountBuilder> predicate){
            int index = -1;
            for (int i=0;i<volumeMounts.size();i++) { 
            if (predicate.apply(volumeMounts.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching volumeMounts. No match found.");
            return setNewVolumeMountLike(index, buildVolumeMount(index));
    }

    public String getWorkingDir(){
            return this.workingDir;
    }

    public A withWorkingDir(String workingDir){
            this.workingDir=workingDir; return (A) this;
    }

    public Boolean hasWorkingDir(){
            return this.workingDir != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerFluentImpl that = (ContainerFluentImpl) o;
            if (args != null ? !args.equals(that.args) :that.args != null) return false;
            if (command != null ? !command.equals(that.command) :that.command != null) return false;
            if (env != null ? !env.equals(that.env) :that.env != null) return false;
            if (envFrom != null ? !envFrom.equals(that.envFrom) :that.envFrom != null) return false;
            if (image != null ? !image.equals(that.image) :that.image != null) return false;
            if (imagePullPolicy != null ? !imagePullPolicy.equals(that.imagePullPolicy) :that.imagePullPolicy != null) return false;
            if (lifecycle != null ? !lifecycle.equals(that.lifecycle) :that.lifecycle != null) return false;
            if (livenessProbe != null ? !livenessProbe.equals(that.livenessProbe) :that.livenessProbe != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
            if (readinessProbe != null ? !readinessProbe.equals(that.readinessProbe) :that.readinessProbe != null) return false;
            if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
            if (securityContext != null ? !securityContext.equals(that.securityContext) :that.securityContext != null) return false;
            if (stdin != null ? !stdin.equals(that.stdin) :that.stdin != null) return false;
            if (stdinOnce != null ? !stdinOnce.equals(that.stdinOnce) :that.stdinOnce != null) return false;
            if (terminationMessagePath != null ? !terminationMessagePath.equals(that.terminationMessagePath) :that.terminationMessagePath != null) return false;
            if (terminationMessagePolicy != null ? !terminationMessagePolicy.equals(that.terminationMessagePolicy) :that.terminationMessagePolicy != null) return false;
            if (tty != null ? !tty.equals(that.tty) :that.tty != null) return false;
            if (volumeDevices != null ? !volumeDevices.equals(that.volumeDevices) :that.volumeDevices != null) return false;
            if (volumeMounts != null ? !volumeMounts.equals(that.volumeMounts) :that.volumeMounts != null) return false;
            if (workingDir != null ? !workingDir.equals(that.workingDir) :that.workingDir != null) return false;
            return true;
    }


    public class EnvNestedImpl<N> extends EnvVarFluentImpl<ContainerFluent.EnvNested<N>> implements ContainerFluent.EnvNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
        private final int index;
    
            EnvNestedImpl(int index,EnvVar item){
                    this.index = index;
                    this.builder = new EnvVarBuilder(this, item);
            }
            EnvNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.setToEnv(index, builder.build());
    }
    public N endEnv(){
            return and();
    }

}
    public class EnvFromNestedImpl<N> extends EnvFromSourceFluentImpl<ContainerFluent.EnvFromNested<N>> implements ContainerFluent.EnvFromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvFromSourceBuilder builder;
        private final int index;
    
            EnvFromNestedImpl(int index,EnvFromSource item){
                    this.index = index;
                    this.builder = new EnvFromSourceBuilder(this, item);
            }
            EnvFromNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvFromSourceBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.setToEnvFrom(index, builder.build());
    }
    public N endEnvFrom(){
            return and();
    }

}
    public class LifecycleNestedImpl<N> extends LifecycleFluentImpl<ContainerFluent.LifecycleNested<N>> implements ContainerFluent.LifecycleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LifecycleBuilder builder;
    
            LifecycleNestedImpl(Lifecycle item){
                    this.builder = new LifecycleBuilder(this, item);
            }
            LifecycleNestedImpl(){
                    this.builder = new LifecycleBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.withLifecycle(builder.build());
    }
    public N endLifecycle(){
            return and();
    }

}
    public class LivenessProbeNestedImpl<N> extends ProbeFluentImpl<ContainerFluent.LivenessProbeNested<N>> implements ContainerFluent.LivenessProbeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProbeBuilder builder;
    
            LivenessProbeNestedImpl(Probe item){
                    this.builder = new ProbeBuilder(this, item);
            }
            LivenessProbeNestedImpl(){
                    this.builder = new ProbeBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.withLivenessProbe(builder.build());
    }
    public N endLivenessProbe(){
            return and();
    }

}
    public class PortsNestedImpl<N> extends ContainerPortFluentImpl<ContainerFluent.PortsNested<N>> implements ContainerFluent.PortsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerPortBuilder builder;
        private final int index;
    
            PortsNestedImpl(int index,ContainerPort item){
                    this.index = index;
                    this.builder = new ContainerPortBuilder(this, item);
            }
            PortsNestedImpl(){
                    this.index = -1;
                    this.builder = new ContainerPortBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.setToPorts(index, builder.build());
    }
    public N endPort(){
            return and();
    }

}
    public class ReadinessProbeNestedImpl<N> extends ProbeFluentImpl<ContainerFluent.ReadinessProbeNested<N>> implements ContainerFluent.ReadinessProbeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProbeBuilder builder;
    
            ReadinessProbeNestedImpl(Probe item){
                    this.builder = new ProbeBuilder(this, item);
            }
            ReadinessProbeNestedImpl(){
                    this.builder = new ProbeBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.withReadinessProbe(builder.build());
    }
    public N endReadinessProbe(){
            return and();
    }

}
    public class ResourcesNestedImpl<N> extends ResourceRequirementsFluentImpl<ContainerFluent.ResourcesNested<N>> implements ContainerFluent.ResourcesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceRequirementsBuilder builder;
    
            ResourcesNestedImpl(ResourceRequirements item){
                    this.builder = new ResourceRequirementsBuilder(this, item);
            }
            ResourcesNestedImpl(){
                    this.builder = new ResourceRequirementsBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.withResources(builder.build());
    }
    public N endResources(){
            return and();
    }

}
    public class SecurityContextNestedImpl<N> extends SecurityContextFluentImpl<ContainerFluent.SecurityContextNested<N>> implements ContainerFluent.SecurityContextNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecurityContextBuilder builder;
    
            SecurityContextNestedImpl(SecurityContext item){
                    this.builder = new SecurityContextBuilder(this, item);
            }
            SecurityContextNestedImpl(){
                    this.builder = new SecurityContextBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.withSecurityContext(builder.build());
    }
    public N endSecurityContext(){
            return and();
    }

}
    public class VolumeDevicesNestedImpl<N> extends VolumeDeviceFluentImpl<ContainerFluent.VolumeDevicesNested<N>> implements ContainerFluent.VolumeDevicesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeDeviceBuilder builder;
        private final int index;
    
            VolumeDevicesNestedImpl(int index,VolumeDevice item){
                    this.index = index;
                    this.builder = new VolumeDeviceBuilder(this, item);
            }
            VolumeDevicesNestedImpl(){
                    this.index = -1;
                    this.builder = new VolumeDeviceBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.setToVolumeDevices(index, builder.build());
    }
    public N endVolumeDevice(){
            return and();
    }

}
    public class VolumeMountsNestedImpl<N> extends VolumeMountFluentImpl<ContainerFluent.VolumeMountsNested<N>> implements ContainerFluent.VolumeMountsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeMountBuilder builder;
        private final int index;
    
            VolumeMountsNestedImpl(int index,VolumeMount item){
                    this.index = index;
                    this.builder = new VolumeMountBuilder(this, item);
            }
            VolumeMountsNestedImpl(){
                    this.index = -1;
                    this.builder = new VolumeMountBuilder(this);
            }
    
    public N and(){
            return (N) ContainerFluentImpl.this.setToVolumeMounts(index, builder.build());
    }
    public N endVolumeMount(){
            return and();
    }

}


}
