package com.Immutability;

public final class User {
	private final Integer userId;
	private final String userName;
	private final String userPassword;

	public User(Integer userId, String userName, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public User modifyUser(Integer id, String userName, String password) {
		if (this.userId.equals(id) && this.userName.equals(userName) && this.userPassword.equals(password)) {
			return this;
		} else {
			return new User(id, userName, password);
		}
	}

	public Integer getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}

}