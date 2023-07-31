import pytest

@pytest.fixture
def user_data():
    user_data={
        "user_id": 1,
        "username": "john",
        "email": "john.doe@gmail.com",
    }
    return user_data

@pytest.fixture
def product_data():
    product_data={
        "product_id": 101,
        "product_name": "Sample_Product",
        "price": "500",
    }
    return product_data

def test_user_data(user_data):
    assert user_data["user_id"] == 1
    assert user_data["username"] == "john"
    assert user_data["email"] == "john.doe@gmail.com"

def test_product_data(product_data):
    assert product_data["product_id"] == 101
    assert product_data["product_name"] == "Sample_Product"
    assert product_data["price"] == "500"