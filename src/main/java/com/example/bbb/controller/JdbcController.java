package com.example.bbb.controller;

/*@Controller

@RequestMapping("/jdbc")

public class JdbcController {
    @Resource

    private JdbcTemplate jdbcTemplate;



    @RequestMapping("/userlist")

    public String getUserList(ModelMap map){

        String sql = "SELECT * FROM t1;";

        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {

            User user = null;

            @Override

            public User mapRow(ResultSet rs, int rowNum) throws SQLException {

                user = new User();

                user.setId(rs.getInt("id"));


                return user;

            }});

        for(User user:userList){

            System.out.println(user.getUsername());

        }

        map.addAttribute("users", userList);

        return "user";

    }

}*/
