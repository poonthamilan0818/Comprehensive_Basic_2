import pytest

@pytest.fixture
def supply_A_B_C():
    a = 1/4
    b = 1/4
    c = 1/2
    return [a, b, c]

def test_sum(supply_A_B_C):
    return supply_A_B_C[1] + supply_A_B_C[2] + supply_A_B_C[3]

def test_sum(supply_A_B_C):
    result = sum(supply_A_B_C)
    assert result == 1

if __name__ == "__main__":
    pytest.main()
