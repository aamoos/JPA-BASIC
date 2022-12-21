package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * packageName    : hellojpa
 * fileName       : Member
 * author         : 김재성
 * date           : 2022-12-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-22        김재성       최초 생성
 */

@Entity
public class Member {

    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
