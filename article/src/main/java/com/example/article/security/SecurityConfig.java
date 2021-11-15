package com.example.article.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.csrf().disable(); 
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); 
		//pour securisé l'api
		//lister tous les produits 
		http.authorizeRequests().antMatchers("/api/all/**").hasAnyAuthority("ADMIN","USER"); 
		
		//consulter produits par son id 
		http.authorizeRequests().antMatchers(HttpMethod.GET,"api/**").hasAnyAuthority("ADMIN","USER"); 
		
		//ajouter un produit 
		http.authorizeRequests().antMatchers(HttpMethod.POST,"api/**").hasAuthority("ADMIN"); 
		
		
		//securisé la modification d'un produit 
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/api/**").hasAuthority("ADMIN"); 
		
		//pour supprimer 
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/api/**").hasAuthority("ADMIN"); 
		
		http.authorizeRequests().anyRequest().authenticated(); 
		
		http.addFilterBefore(new JWTAuthorizationFilter(),UsernamePasswordAuthenticationFilter.class);
		
		
		
	}

	
	
	
	
	
}//fin de classe 
