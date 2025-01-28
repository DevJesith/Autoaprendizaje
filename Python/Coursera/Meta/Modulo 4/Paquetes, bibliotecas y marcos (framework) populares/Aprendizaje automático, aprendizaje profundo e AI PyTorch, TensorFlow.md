# Aprendizaje Automático (Machine Learning)

* Definición: Es una rama de la inteligencia artificial (IA) que permite a las máquinas aprender de los datos y hacer predicciones o decisiones sin ser programadas explícitamente.

* Ejemplo: Un modelo que predice el precio de una casa basado en características como el tamaño, la ubicación y el número de habitaciones.

## Aprendizaje Profundo (Deep Learning)

* Definición: Es una subcategoría del aprendizaje automático que utiliza redes neuronales con muchas capas (de ahí "profundo") para modelar patrones complejos en grandes volúmenes de datos.

* Ejemplo: Un sistema de reconocimiento de imágenes que puede identificar objetos en fotos, como gatos o perros, utilizando una red neuronal profunda.


## PyTorch y TensorFlow

* Definición: Son dos de las bibliotecas más populares para implementar modelos de aprendizaje automático y aprendizaje profundo.

    * PyTorch: Es conocido por su flexibilidad y facilidad de uso, especialmente en investigación. Permite construir redes neuronales de manera dinámica.

    * TensorFlow: Es ampliamente utilizado en producción y tiene un ecosistema robusto para implementar modelos a gran escala.

### Ejemplo de Uso

* PyTorch: Si quisieras crear un modelo de clasificación de imágenes, podrías usar PyTorch para definir la arquitectura de la red neuronal y entrenarla con un conjunto de datos de imágenes.

```python
import torch
import torch.nn as nn

class SimpleNN(nn.Module):
    def __init__(self):
        super(SimpleNN, self).__init__()
        self.fc1 = nn.Linear(784, 128)  # Capa de entrada
        self.fc2 = nn.Linear(128, 10)    # Capa de salida

    def forward(self, x):
        x = torch.relu(self.fc1(x))
        x = self.fc2(x)
        return x
```

* TensorFlow: De manera similar, en TensorFlow podrías construir un modelo de red neuronal para la misma tarea, pero con una sintaxis diferente.

```python
import tensorflow as tf

model = tf.keras.Sequential([
    tf.keras.layers.Dense(128, activation='relu', input_shape=(784,)),  # Capa de entrada
    tf.keras.layers.Dense(10)  # Capa de salida
])
```