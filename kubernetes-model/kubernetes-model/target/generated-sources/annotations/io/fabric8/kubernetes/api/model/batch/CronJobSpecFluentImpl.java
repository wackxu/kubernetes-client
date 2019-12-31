package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

public class CronJobSpecFluentImpl<A extends CronJobSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CronJobSpecFluent<A>{

    private String concurrencyPolicy;
    private Integer failedJobsHistoryLimit;
    private JobTemplateSpecBuilder jobTemplate;
    private String schedule;
    private Long startingDeadlineSeconds;
    private Integer successfulJobsHistoryLimit;
    private Boolean suspend;

    public CronJobSpecFluentImpl(){
    }
    public CronJobSpecFluentImpl(CronJobSpec instance){
            this.withConcurrencyPolicy(instance.getConcurrencyPolicy()); 
            this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit()); 
            this.withJobTemplate(instance.getJobTemplate()); 
            this.withSchedule(instance.getSchedule()); 
            this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds()); 
            this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit()); 
            this.withSuspend(instance.getSuspend()); 
    }

    public String getConcurrencyPolicy(){
            return this.concurrencyPolicy;
    }

    public A withConcurrencyPolicy(String concurrencyPolicy){
            this.concurrencyPolicy=concurrencyPolicy; return (A) this;
    }

    public Boolean hasConcurrencyPolicy(){
            return this.concurrencyPolicy != null;
    }

    public Integer getFailedJobsHistoryLimit(){
            return this.failedJobsHistoryLimit;
    }

    public A withFailedJobsHistoryLimit(Integer failedJobsHistoryLimit){
            this.failedJobsHistoryLimit=failedJobsHistoryLimit; return (A) this;
    }

    public Boolean hasFailedJobsHistoryLimit(){
            return this.failedJobsHistoryLimit != null;
    }

    
/**
 * This method has been deprecated, please use method buildJobTemplate instead.
 * @return The buildable object.
 */
@Deprecated public JobTemplateSpec getJobTemplate(){
            return this.jobTemplate!=null?this.jobTemplate.build():null;
    }

    public JobTemplateSpec buildJobTemplate(){
            return this.jobTemplate!=null?this.jobTemplate.build():null;
    }

    public A withJobTemplate(JobTemplateSpec jobTemplate){
            _visitables.remove(this.jobTemplate);
            if (jobTemplate!=null){ this.jobTemplate= new JobTemplateSpecBuilder(jobTemplate); _visitables.add(this.jobTemplate);} return (A) this;
    }

    public Boolean hasJobTemplate(){
            return this.jobTemplate != null;
    }

    public CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate(){
            return new JobTemplateNestedImpl();
    }

    public CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplateLike(JobTemplateSpec item){
            return new JobTemplateNestedImpl(item);
    }

    public CronJobSpecFluent.JobTemplateNested<A> editJobTemplate(){
            return withNewJobTemplateLike(getJobTemplate());
    }

    public CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplate(){
            return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate(): new JobTemplateSpecBuilder().build());
    }

    public CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplateLike(JobTemplateSpec item){
            return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate(): item);
    }

    public String getSchedule(){
            return this.schedule;
    }

    public A withSchedule(String schedule){
            this.schedule=schedule; return (A) this;
    }

    public Boolean hasSchedule(){
            return this.schedule != null;
    }

    public Long getStartingDeadlineSeconds(){
            return this.startingDeadlineSeconds;
    }

    public A withStartingDeadlineSeconds(Long startingDeadlineSeconds){
            this.startingDeadlineSeconds=startingDeadlineSeconds; return (A) this;
    }

    public Boolean hasStartingDeadlineSeconds(){
            return this.startingDeadlineSeconds != null;
    }

    public A withNewStartingDeadlineSeconds(String arg1){
            return (A)withStartingDeadlineSeconds(new Long(arg1));
    }

    public A withNewStartingDeadlineSeconds(long arg1){
            return (A)withStartingDeadlineSeconds(new Long(arg1));
    }

    public Integer getSuccessfulJobsHistoryLimit(){
            return this.successfulJobsHistoryLimit;
    }

    public A withSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit){
            this.successfulJobsHistoryLimit=successfulJobsHistoryLimit; return (A) this;
    }

    public Boolean hasSuccessfulJobsHistoryLimit(){
            return this.successfulJobsHistoryLimit != null;
    }

    public Boolean isSuspend(){
            return this.suspend;
    }

    public A withSuspend(Boolean suspend){
            this.suspend=suspend; return (A) this;
    }

    public Boolean hasSuspend(){
            return this.suspend != null;
    }

    public A withNewSuspend(String arg1){
            return (A)withSuspend(new Boolean(arg1));
    }

    public A withNewSuspend(boolean arg1){
            return (A)withSuspend(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CronJobSpecFluentImpl that = (CronJobSpecFluentImpl) o;
            if (concurrencyPolicy != null ? !concurrencyPolicy.equals(that.concurrencyPolicy) :that.concurrencyPolicy != null) return false;
            if (failedJobsHistoryLimit != null ? !failedJobsHistoryLimit.equals(that.failedJobsHistoryLimit) :that.failedJobsHistoryLimit != null) return false;
            if (jobTemplate != null ? !jobTemplate.equals(that.jobTemplate) :that.jobTemplate != null) return false;
            if (schedule != null ? !schedule.equals(that.schedule) :that.schedule != null) return false;
            if (startingDeadlineSeconds != null ? !startingDeadlineSeconds.equals(that.startingDeadlineSeconds) :that.startingDeadlineSeconds != null) return false;
            if (successfulJobsHistoryLimit != null ? !successfulJobsHistoryLimit.equals(that.successfulJobsHistoryLimit) :that.successfulJobsHistoryLimit != null) return false;
            if (suspend != null ? !suspend.equals(that.suspend) :that.suspend != null) return false;
            return true;
    }


    public class JobTemplateNestedImpl<N> extends JobTemplateSpecFluentImpl<CronJobSpecFluent.JobTemplateNested<N>> implements CronJobSpecFluent.JobTemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobTemplateSpecBuilder builder;
    
            JobTemplateNestedImpl(JobTemplateSpec item){
                    this.builder = new JobTemplateSpecBuilder(this, item);
            }
            JobTemplateNestedImpl(){
                    this.builder = new JobTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) CronJobSpecFluentImpl.this.withJobTemplate(builder.build());
    }
    public N endJobTemplate(){
            return and();
    }

}


}
