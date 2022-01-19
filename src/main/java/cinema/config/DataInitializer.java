package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName(Role.RoleName.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@email.ua");
        admin.setPassword("PasswordAdmin");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
        User user = new User();
        user.setEmail("user@email.ua");
        user.setPassword("PasswordUser");
        user.setRoles(Set.of(userRole));
        userService.add(user);
    }
}
