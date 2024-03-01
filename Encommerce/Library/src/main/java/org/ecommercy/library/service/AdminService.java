package org.ecommercy.library.service;

import org.ecommercy.library.dto.AdminDto;
import org.ecommercy.library.model.Admin;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}