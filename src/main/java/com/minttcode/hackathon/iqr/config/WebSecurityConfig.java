package com.minttcode.hackathon.iqr.config;



public class WebSecurityConfig  {} /**extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;

    / * @Override
    protected void configure(final HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .authorizeRequests().anyRequest().authenticated()
                .and().httpBasic()
                .and().sessionManagement().disable();

    } * /

    protected void configure(final HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/api/user/hello",  "/home", "/login").permitAll()
                .anyRequest().authenticated();

    }


  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }



    @Override
    public void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(userService);
    } * /

} */



