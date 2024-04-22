package Service;

import Entity.Admin;

import java.util.List;

public interface AdminService {
    Admin createAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(Long adminId);
    Admin getAdminById(Long adminId);
    List<Admin> getAllAdmins();
}
