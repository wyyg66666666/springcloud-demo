package com.gh.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {

	//用我们重新选择的随机算法替代默认的轮询
	@Bean
	public IRule myRule() {
		return new RandomRule();
	}

}
