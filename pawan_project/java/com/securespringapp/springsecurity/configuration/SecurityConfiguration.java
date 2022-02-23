package com.securespringapp.springsecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.happiestminds.springsecurity.services.CustomeUserDetailsService;

@EnableGlobalMethodSecurity(prePostEnabled=true)
@Configuration
@EnableWebSecurity
@EnableJpaRepositories(basePackages="com.happiestminds.springsecurity")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	CustomeUserDetailsService customuserDetailsService;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customuserDetailsService)
       	.passwordEncoder(getPasswordEncoder());
               
    }
	
	 private PasswordEncoder getPasswordEncoder() {
	   return new PasswordEncoder() {
	       
	    
	    @Override
	    public boolean matches(CharSequence rawPassword, String encodedPassword) {
		System.out.print("rawPassword ::"+rawPassword +" encodedPassword:: "+encodedPassword);
		return true;
	    }
	    
	    @Override
	    public String encode(CharSequence rawPassword) {
		System.out.println("encode::"+rawPassword);
		return rawPassword.toString();
	    }
	};
	   
	}

	@Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.formLogin().and().
	                authorizeRequests().antMatchers("**/secure/**").hasRole("ADMIN")
	                	.anyRequest().authenticated().and().csrf().disable();
	    }
	 
	  @Override
	    public void configure(WebSecurity web) throws Exception {
	        web
	                .ignoring()
	                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
	    }

}
