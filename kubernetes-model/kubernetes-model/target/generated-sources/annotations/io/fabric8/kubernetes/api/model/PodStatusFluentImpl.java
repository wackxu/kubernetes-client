package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class PodStatusFluentImpl<A extends PodStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodStatusFluent<A>{

    private List<PodConditionBuilder> conditions;
    private List<ContainerStatusBuilder> containerStatuses;
    private String hostIP;
    private List<ContainerStatusBuilder> initContainerStatuses;
    private String message;
    private String nominatedNodeName;
    private String phase;
    private String podIP;
    private String qosClass;
    private String reason;
    private String startTime;

    public PodStatusFluentImpl(){
    }
    public PodStatusFluentImpl(PodStatus instance){
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
    }

    public A addToConditions(int index,PodCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<PodConditionBuilder>();}
            PodConditionBuilder builder = new PodConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,PodCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<PodConditionBuilder>();}
            PodConditionBuilder builder = new PodConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(PodCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<PodConditionBuilder>();}
            for (PodCondition item : items) {PodConditionBuilder builder = new PodConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<PodCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<PodConditionBuilder>();}
            for (PodCondition item : items) {PodConditionBuilder builder = new PodConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(PodCondition... items){
            for (PodCondition item : items) {PodConditionBuilder builder = new PodConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<PodCondition> items){
            for (PodCondition item : items) {PodConditionBuilder builder = new PodConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<PodCondition> getConditions(){
            return build(conditions);
    }

    public List<PodCondition> buildConditions(){
            return build(conditions);
    }

    public PodCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public PodCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public PodCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public PodCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<PodConditionBuilder> predicate){
            for (PodConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<PodCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<PodConditionBuilder>(); for (PodCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<PodConditionBuilder>();} return (A) this;
    }

    public A withConditions(PodCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (PodCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public PodStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public PodStatusFluent.ConditionsNested<A> addNewConditionLike(PodCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public PodStatusFluent.ConditionsNested<A> setNewConditionLike(int index,PodCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public PodStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public PodStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public PodStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public PodStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<PodConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public A addToContainerStatuses(int index,ContainerStatus item){
            if (this.containerStatuses == null) {this.containerStatuses = new ArrayList<ContainerStatusBuilder>();}
            ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.containerStatuses.add(index >= 0 ? index : containerStatuses.size(), builder); return (A)this;
    }

    public A setToContainerStatuses(int index,ContainerStatus item){
            if (this.containerStatuses == null) {this.containerStatuses = new ArrayList<ContainerStatusBuilder>();}
            ContainerStatusBuilder builder = new ContainerStatusBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= containerStatuses.size()) { containerStatuses.add(builder); } else { containerStatuses.set(index, builder);}
             return (A)this;
    }

    public A addToContainerStatuses(ContainerStatus... items){
            if (this.containerStatuses == null) {this.containerStatuses = new ArrayList<ContainerStatusBuilder>();}
            for (ContainerStatus item : items) {ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.add(builder);this.containerStatuses.add(builder);} return (A)this;
    }

    public A addAllToContainerStatuses(Collection<ContainerStatus> items){
            if (this.containerStatuses == null) {this.containerStatuses = new ArrayList<ContainerStatusBuilder>();}
            for (ContainerStatus item : items) {ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.add(builder);this.containerStatuses.add(builder);} return (A)this;
    }

    public A removeFromContainerStatuses(ContainerStatus... items){
            for (ContainerStatus item : items) {ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.remove(builder);if (this.containerStatuses != null) {this.containerStatuses.remove(builder);}} return (A)this;
    }

    public A removeAllFromContainerStatuses(Collection<ContainerStatus> items){
            for (ContainerStatus item : items) {ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.remove(builder);if (this.containerStatuses != null) {this.containerStatuses.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildContainerStatuses instead.
 * @return The buildable object.
 */
@Deprecated public List<ContainerStatus> getContainerStatuses(){
            return build(containerStatuses);
    }

    public List<ContainerStatus> buildContainerStatuses(){
            return build(containerStatuses);
    }

    public ContainerStatus buildContainerStatus(int index){
            return this.containerStatuses.get(index).build();
    }

    public ContainerStatus buildFirstContainerStatus(){
            return this.containerStatuses.get(0).build();
    }

    public ContainerStatus buildLastContainerStatus(){
            return this.containerStatuses.get(containerStatuses.size() - 1).build();
    }

    public ContainerStatus buildMatchingContainerStatus(io.fabric8.kubernetes.api.builder.Predicate<ContainerStatusBuilder> predicate){
            for (ContainerStatusBuilder item: containerStatuses) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withContainerStatuses(List<ContainerStatus> containerStatuses){
            if (this.containerStatuses != null) { _visitables.removeAll(this.containerStatuses);}
            if (containerStatuses != null) {this.containerStatuses = new ArrayList<ContainerStatusBuilder>(); for (ContainerStatus item : containerStatuses){this.addToContainerStatuses(item);}} else { this.containerStatuses = new ArrayList<ContainerStatusBuilder>();} return (A) this;
    }

    public A withContainerStatuses(ContainerStatus... containerStatuses){
            if (this.containerStatuses != null) {this.containerStatuses.clear();}
            if (containerStatuses != null) {for (ContainerStatus item :containerStatuses){ this.addToContainerStatuses(item);}} return (A) this;
    }

    public Boolean hasContainerStatuses(){
            return containerStatuses != null && !containerStatuses.isEmpty();
    }

    public PodStatusFluent.ContainerStatusesNested<A> addNewContainerStatus(){
            return new ContainerStatusesNestedImpl();
    }

    public PodStatusFluent.ContainerStatusesNested<A> addNewContainerStatusLike(ContainerStatus item){
            return new ContainerStatusesNestedImpl(-1, item);
    }

    public PodStatusFluent.ContainerStatusesNested<A> setNewContainerStatusLike(int index,ContainerStatus item){
            return new ContainerStatusesNestedImpl(index, item);
    }

    public PodStatusFluent.ContainerStatusesNested<A> editContainerStatus(int index){
            if (containerStatuses.size() <= index) throw new RuntimeException("Can't edit containerStatuses. Index exceeds size.");
            return setNewContainerStatusLike(index, buildContainerStatus(index));
    }

    public PodStatusFluent.ContainerStatusesNested<A> editFirstContainerStatus(){
            if (containerStatuses.size() == 0) throw new RuntimeException("Can't edit first containerStatuses. The list is empty.");
            return setNewContainerStatusLike(0, buildContainerStatus(0));
    }

    public PodStatusFluent.ContainerStatusesNested<A> editLastContainerStatus(){
            int index = containerStatuses.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last containerStatuses. The list is empty.");
            return setNewContainerStatusLike(index, buildContainerStatus(index));
    }

    public PodStatusFluent.ContainerStatusesNested<A> editMatchingContainerStatus(io.fabric8.kubernetes.api.builder.Predicate<ContainerStatusBuilder> predicate){
            int index = -1;
            for (int i=0;i<containerStatuses.size();i++) { 
            if (predicate.apply(containerStatuses.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching containerStatuses. No match found.");
            return setNewContainerStatusLike(index, buildContainerStatus(index));
    }

    public String getHostIP(){
            return this.hostIP;
    }

    public A withHostIP(String hostIP){
            this.hostIP=hostIP; return (A) this;
    }

    public Boolean hasHostIP(){
            return this.hostIP != null;
    }

    public A addToInitContainerStatuses(int index,ContainerStatus item){
            if (this.initContainerStatuses == null) {this.initContainerStatuses = new ArrayList<ContainerStatusBuilder>();}
            ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.initContainerStatuses.add(index >= 0 ? index : initContainerStatuses.size(), builder); return (A)this;
    }

    public A setToInitContainerStatuses(int index,ContainerStatus item){
            if (this.initContainerStatuses == null) {this.initContainerStatuses = new ArrayList<ContainerStatusBuilder>();}
            ContainerStatusBuilder builder = new ContainerStatusBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= initContainerStatuses.size()) { initContainerStatuses.add(builder); } else { initContainerStatuses.set(index, builder);}
             return (A)this;
    }

    public A addToInitContainerStatuses(ContainerStatus... items){
            if (this.initContainerStatuses == null) {this.initContainerStatuses = new ArrayList<ContainerStatusBuilder>();}
            for (ContainerStatus item : items) {ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.add(builder);this.initContainerStatuses.add(builder);} return (A)this;
    }

    public A addAllToInitContainerStatuses(Collection<ContainerStatus> items){
            if (this.initContainerStatuses == null) {this.initContainerStatuses = new ArrayList<ContainerStatusBuilder>();}
            for (ContainerStatus item : items) {ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.add(builder);this.initContainerStatuses.add(builder);} return (A)this;
    }

    public A removeFromInitContainerStatuses(ContainerStatus... items){
            for (ContainerStatus item : items) {ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.remove(builder);if (this.initContainerStatuses != null) {this.initContainerStatuses.remove(builder);}} return (A)this;
    }

    public A removeAllFromInitContainerStatuses(Collection<ContainerStatus> items){
            for (ContainerStatus item : items) {ContainerStatusBuilder builder = new ContainerStatusBuilder(item);_visitables.remove(builder);if (this.initContainerStatuses != null) {this.initContainerStatuses.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildInitContainerStatuses instead.
 * @return The buildable object.
 */
@Deprecated public List<ContainerStatus> getInitContainerStatuses(){
            return build(initContainerStatuses);
    }

    public List<ContainerStatus> buildInitContainerStatuses(){
            return build(initContainerStatuses);
    }

    public ContainerStatus buildInitContainerStatus(int index){
            return this.initContainerStatuses.get(index).build();
    }

    public ContainerStatus buildFirstInitContainerStatus(){
            return this.initContainerStatuses.get(0).build();
    }

    public ContainerStatus buildLastInitContainerStatus(){
            return this.initContainerStatuses.get(initContainerStatuses.size() - 1).build();
    }

    public ContainerStatus buildMatchingInitContainerStatus(io.fabric8.kubernetes.api.builder.Predicate<ContainerStatusBuilder> predicate){
            for (ContainerStatusBuilder item: initContainerStatuses) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withInitContainerStatuses(List<ContainerStatus> initContainerStatuses){
            if (this.initContainerStatuses != null) { _visitables.removeAll(this.initContainerStatuses);}
            if (initContainerStatuses != null) {this.initContainerStatuses = new ArrayList<ContainerStatusBuilder>(); for (ContainerStatus item : initContainerStatuses){this.addToInitContainerStatuses(item);}} else { this.initContainerStatuses = new ArrayList<ContainerStatusBuilder>();} return (A) this;
    }

    public A withInitContainerStatuses(ContainerStatus... initContainerStatuses){
            if (this.initContainerStatuses != null) {this.initContainerStatuses.clear();}
            if (initContainerStatuses != null) {for (ContainerStatus item :initContainerStatuses){ this.addToInitContainerStatuses(item);}} return (A) this;
    }

    public Boolean hasInitContainerStatuses(){
            return initContainerStatuses != null && !initContainerStatuses.isEmpty();
    }

    public PodStatusFluent.InitContainerStatusesNested<A> addNewInitContainerStatus(){
            return new InitContainerStatusesNestedImpl();
    }

    public PodStatusFluent.InitContainerStatusesNested<A> addNewInitContainerStatusLike(ContainerStatus item){
            return new InitContainerStatusesNestedImpl(-1, item);
    }

    public PodStatusFluent.InitContainerStatusesNested<A> setNewInitContainerStatusLike(int index,ContainerStatus item){
            return new InitContainerStatusesNestedImpl(index, item);
    }

    public PodStatusFluent.InitContainerStatusesNested<A> editInitContainerStatus(int index){
            if (initContainerStatuses.size() <= index) throw new RuntimeException("Can't edit initContainerStatuses. Index exceeds size.");
            return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
    }

    public PodStatusFluent.InitContainerStatusesNested<A> editFirstInitContainerStatus(){
            if (initContainerStatuses.size() == 0) throw new RuntimeException("Can't edit first initContainerStatuses. The list is empty.");
            return setNewInitContainerStatusLike(0, buildInitContainerStatus(0));
    }

    public PodStatusFluent.InitContainerStatusesNested<A> editLastInitContainerStatus(){
            int index = initContainerStatuses.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last initContainerStatuses. The list is empty.");
            return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
    }

    public PodStatusFluent.InitContainerStatusesNested<A> editMatchingInitContainerStatus(io.fabric8.kubernetes.api.builder.Predicate<ContainerStatusBuilder> predicate){
            int index = -1;
            for (int i=0;i<initContainerStatuses.size();i++) { 
            if (predicate.apply(initContainerStatuses.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching initContainerStatuses. No match found.");
            return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
    }

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
    }

    public String getNominatedNodeName(){
            return this.nominatedNodeName;
    }

    public A withNominatedNodeName(String nominatedNodeName){
            this.nominatedNodeName=nominatedNodeName; return (A) this;
    }

    public Boolean hasNominatedNodeName(){
            return this.nominatedNodeName != null;
    }

    public String getPhase(){
            return this.phase;
    }

    public A withPhase(String phase){
            this.phase=phase; return (A) this;
    }

    public Boolean hasPhase(){
            return this.phase != null;
    }

    public String getPodIP(){
            return this.podIP;
    }

    public A withPodIP(String podIP){
            this.podIP=podIP; return (A) this;
    }

    public Boolean hasPodIP(){
            return this.podIP != null;
    }

    public String getQosClass(){
            return this.qosClass;
    }

    public A withQosClass(String qosClass){
            this.qosClass=qosClass; return (A) this;
    }

    public Boolean hasQosClass(){
            return this.qosClass != null;
    }

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
    }

    public String getStartTime(){
            return this.startTime;
    }

    public A withStartTime(String startTime){
            this.startTime=startTime; return (A) this;
    }

    public Boolean hasStartTime(){
            return this.startTime != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodStatusFluentImpl that = (PodStatusFluentImpl) o;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (containerStatuses != null ? !containerStatuses.equals(that.containerStatuses) :that.containerStatuses != null) return false;
            if (hostIP != null ? !hostIP.equals(that.hostIP) :that.hostIP != null) return false;
            if (initContainerStatuses != null ? !initContainerStatuses.equals(that.initContainerStatuses) :that.initContainerStatuses != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (nominatedNodeName != null ? !nominatedNodeName.equals(that.nominatedNodeName) :that.nominatedNodeName != null) return false;
            if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
            if (podIP != null ? !podIP.equals(that.podIP) :that.podIP != null) return false;
            if (qosClass != null ? !qosClass.equals(that.qosClass) :that.qosClass != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            if (startTime != null ? !startTime.equals(that.startTime) :that.startTime != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends PodConditionFluentImpl<PodStatusFluent.ConditionsNested<N>> implements PodStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,PodCondition item){
                    this.index = index;
                    this.builder = new PodConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodConditionBuilder(this);
            }
    
    public N and(){
            return (N) PodStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}
    public class ContainerStatusesNestedImpl<N> extends ContainerStatusFluentImpl<PodStatusFluent.ContainerStatusesNested<N>> implements PodStatusFluent.ContainerStatusesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStatusBuilder builder;
        private final int index;
    
            ContainerStatusesNestedImpl(int index,ContainerStatus item){
                    this.index = index;
                    this.builder = new ContainerStatusBuilder(this, item);
            }
            ContainerStatusesNestedImpl(){
                    this.index = -1;
                    this.builder = new ContainerStatusBuilder(this);
            }
    
    public N and(){
            return (N) PodStatusFluentImpl.this.setToContainerStatuses(index, builder.build());
    }
    public N endContainerStatus(){
            return and();
    }

}
    public class InitContainerStatusesNestedImpl<N> extends ContainerStatusFluentImpl<PodStatusFluent.InitContainerStatusesNested<N>> implements PodStatusFluent.InitContainerStatusesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStatusBuilder builder;
        private final int index;
    
            InitContainerStatusesNestedImpl(int index,ContainerStatus item){
                    this.index = index;
                    this.builder = new ContainerStatusBuilder(this, item);
            }
            InitContainerStatusesNestedImpl(){
                    this.index = -1;
                    this.builder = new ContainerStatusBuilder(this);
            }
    
    public N and(){
            return (N) PodStatusFluentImpl.this.setToInitContainerStatuses(index, builder.build());
    }
    public N endInitContainerStatus(){
            return and();
    }

}


}
