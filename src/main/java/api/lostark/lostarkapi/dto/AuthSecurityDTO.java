package api.lostark.lostarkapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
@Setter
@ToString
public class AuthSecurityDTO extends User {
    private String id;
    private String pw;
    private String email;
    private boolean del;
    private boolean social;

    public AuthSecurityDTO(String username, String password, String email, boolean del, boolean social, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);

        this.id = username;
        this.pw = password;
        this.email = email;
        this.del = del;
        this.social = social;
    }
}
