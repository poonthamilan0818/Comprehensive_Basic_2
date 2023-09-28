def data_fixture(fixture_func):
    def wrapper(*args, **kwargs):
        data = fixture_func(*args, **kwargs)
        if not isinstance(data, dict):
            raise ValueError("Fixture must return a dictionary.")
        return data
    return wrapper

@data_fixture
def user_fixture():
    return {
        "username": "poonthamilan",
        "email": "poonthamilan@test.com",
        "password": "1233234445"
    }

@data_fixture
def product_fixture():
    return {
        "product_name": "Iphone 14 Pro",
        "price": 100000,
        "stock_quantity": 10
    }

def test_user_details():
    user_data = user_fixture()
    email = user_data["email"]
    password = user_data["password"]
    assert "poonthamilan" in user_data["username"]
    assert "@" in email
    assert "." in email
    assert "poonthamilan@test.com" in email
    password.split()
    spCount = 0
    upCount = 0
    lcCount = 0
    numCount = 0
    numbers = '0123456789'
    specialCharacters = '[@_!#$%^&*()<>?/\|}{~:]'
    UpperCaseCharacter = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    for i in range(len(password)):
        if password[i] in specialCharacters:
            spCount += 1
        elif password[i] in numbers:
            numCount += 1
        elif password[i] in numbers:
            UpperCaseCharacter += 1
        else:
            lcCount += 1
    if spCount > 0 and upCount > 0 and lcCount > 0 and numCount > 0:
        print("Given password contains all type of characters")
    else:
        print("Given password in not a strong pasword: "+ password)

def test_product_details():
    product_data = product_fixture()
    assert "Iphone 14 Pro" in product_data["product_name"]
    assert product_data["price"] == 100000
    assert product_data["stock_quantity"] > 0

# Run the tests
if __name__ == "__main__":
    test_user_details()
    test_product_details()
