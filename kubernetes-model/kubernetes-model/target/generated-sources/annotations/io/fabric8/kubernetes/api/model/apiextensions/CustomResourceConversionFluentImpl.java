package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class CustomResourceConversionFluentImpl<A extends CustomResourceConversionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceConversionFluent<A>{

    private String strategy;
    private io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder webhookClientConfig;

    public CustomResourceConversionFluentImpl(){
    }
    public CustomResourceConversionFluentImpl(CustomResourceConversion instance){
            this.withStrategy(instance.getStrategy()); 
            this.withWebhookClientConfig(instance.getWebhookClientConfig()); 
    }

    public String getStrategy(){
            return this.strategy;
    }

    public A withStrategy(String strategy){
            this.strategy=strategy; return (A) this;
    }

    public Boolean hasStrategy(){
            return this.strategy != null;
    }

    
/**
 * This method has been deprecated, please use method buildWebhookClientConfig instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig getWebhookClientConfig(){
            return this.webhookClientConfig!=null?this.webhookClientConfig.build():null;
    }

    public io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig buildWebhookClientConfig(){
            return this.webhookClientConfig!=null?this.webhookClientConfig.build():null;
    }

    public A withWebhookClientConfig(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig webhookClientConfig){
            _visitables.remove(this.webhookClientConfig);
            if (webhookClientConfig!=null){ this.webhookClientConfig= new io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder(webhookClientConfig); _visitables.add(this.webhookClientConfig);} return (A) this;
    }

    public Boolean hasWebhookClientConfig(){
            return this.webhookClientConfig != null;
    }

    public CustomResourceConversionFluent.WebhookClientConfigNested<A> withNewWebhookClientConfig(){
            return new WebhookClientConfigNestedImpl();
    }

    public CustomResourceConversionFluent.WebhookClientConfigNested<A> withNewWebhookClientConfigLike(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item){
            return new WebhookClientConfigNestedImpl(item);
    }

    public CustomResourceConversionFluent.WebhookClientConfigNested<A> editWebhookClientConfig(){
            return withNewWebhookClientConfigLike(getWebhookClientConfig());
    }

    public CustomResourceConversionFluent.WebhookClientConfigNested<A> editOrNewWebhookClientConfig(){
            return withNewWebhookClientConfigLike(getWebhookClientConfig() != null ? getWebhookClientConfig(): new io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder().build());
    }

    public CustomResourceConversionFluent.WebhookClientConfigNested<A> editOrNewWebhookClientConfigLike(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item){
            return withNewWebhookClientConfigLike(getWebhookClientConfig() != null ? getWebhookClientConfig(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceConversionFluentImpl that = (CustomResourceConversionFluentImpl) o;
            if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
            if (webhookClientConfig != null ? !webhookClientConfig.equals(that.webhookClientConfig) :that.webhookClientConfig != null) return false;
            return true;
    }


    public class WebhookClientConfigNestedImpl<N> extends io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigFluentImpl<CustomResourceConversionFluent.WebhookClientConfigNested<N>> implements CustomResourceConversionFluent.WebhookClientConfigNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder builder;
    
            WebhookClientConfigNestedImpl(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item){
                    this.builder = new io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder(this, item);
            }
            WebhookClientConfigNestedImpl(){
                    this.builder = new io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceConversionFluentImpl.this.withWebhookClientConfig(builder.build());
    }
    public N endWebhookClientConfig(){
            return and();
    }

}


}
