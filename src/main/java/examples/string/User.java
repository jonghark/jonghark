package examples.string;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private String name;

//        // Builder 패턴
//        private User(Builder builder) {
//            this.name = builder.name;
//        }
//
//        public static Builder builder() {
//            return new Builder();
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public static class Builder {
//            private String name;
//
//            public Builder name(String name) {
//                this.name = name;
//                return this;
//            }
//
//            public User build() {
//                return new User(this);
//            }
//        }

}
