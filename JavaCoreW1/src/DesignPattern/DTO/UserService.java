package DesignPattern.DTO;

public class UserService {

    private UserDao userDao= new UserDao();

    public UserDTO getUser(String id){
        UserModel u = userDao.get(id);
        return convertToDTO(u);
    }

    public void saveUser(UserDTO dto){
        userDao.save(convertToModel(dto));
    }

    private UserDTO convertToDTO(UserModel u) {
        UserDTO dto = new UserDTO();
        dto.setID(u.getID());
        dto.setName(u.getName());
        dto.setAge(u.getAge());

        return dto;
    }

    private UserModel convertToModel(UserDTO dto){
        UserModel um = new UserModel();
        um.setID(dto.getID());
        um.setName(dto.getName());
        um.setAge(dto.getAge());

        return um;
    }
}
