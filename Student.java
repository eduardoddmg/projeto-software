import java.util.*;
public class Student {
    private Long id;
        
    
        private String name;
        
    
        private String cpf;
        
    
        private String email;
        
    
        private Integer score;
    
        private HashMap<String, String> student_info;

        public Student(String id, String name, String cpf, String email, String score) {
            this.id = id;
            this.name = name;
            this.cpf = cpf;
            this.email = email;
            this.score = score;
            this.student_info = new HashMap<String, String>();
            this.student_info.put("id", id);
            this.student_info.put("name", name);
            this.student_info.put("cpf", cpf);
            this.student_info.put("email", email);
            this.student_info.put("email", score);
            //this.student_info.put("idSchool", idSchool);
            //this.student_info.put("idSubject", idSubject);
            
        }
        
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
    
    
        public String getCpf() {
            return cpf;
        }
    
    
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    
    
        public String getEmail() {
            return email;
        }
    
    
        public void setEmail(String email) {
            this.email = email;
        }
    
    
        public Integer getScore() {
            return score;
        }
    
    
        public void setScore(Integer score) {
            this.score = score;
        }
    
    
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
            result = prime * result + ((email == null) ? 0 : email.hashCode());
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + ((score == null) ? 0 : score.hashCode());
            return result;
        }
    
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Student other = (Student) obj;
            if (cpf == null) {
                if (other.cpf != null)
                    return false;
            } else if (!cpf.equals(other.cpf))
                return false;
            if (email == null) {
                if (other.email != null)
                    return false;
            } else if (!email.equals(other.email))
                return false;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (score == null) {
                if (other.score != null)
                    return false;
            } else if (!score.equals(other.score))
                return false;
            return true;
        }
    
    
        @Override
        public String toString() {
            return "Id=" + id + ", name=" + name + ", cpf=" + cpf + ", email=" + email + ", score=" + score + "]";
        }
        
        
    }
    