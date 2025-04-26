package com.InventoryMgtSystem.services;

import com.InventoryMgtSystem.dtos.LoginRequest;
import com.InventoryMgtSystem.dtos.RegisterRequest;
import com.InventoryMgtSystem.dtos.Response;
import com.InventoryMgtSystem.dtos.UserDTO;
import com.InventoryMgtSystem.models.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
