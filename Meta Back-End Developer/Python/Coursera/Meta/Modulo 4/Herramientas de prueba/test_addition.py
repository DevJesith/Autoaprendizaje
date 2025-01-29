# test_addition.py
import pytest
from addition import add, sub

def test_add():
    assert add(4, 5) == 9  # Prueba que 4 + 5 es igual a 9

def test_sub():
    assert sub(4, 5) == -1  # Prueba que 4 - 5 es igual a -1
