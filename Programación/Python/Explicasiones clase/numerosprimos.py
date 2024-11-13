#Calcula número primos
'''def es_primo(n):
    if n < 2: 
        return False
    for i in range (2,int(n**0.5)+1):
        if n % i ==0:
            return False
        return True'''

def es_primo(n):
    if n < 2: 
        return False
    
    for i in range(2,n):
        if n % i ==0:
            return False
    return True

inicio = int(input("Introduce un nº: "))
fin = int(input("Introduce otro nº: "))

primos = []
for i in range(inicio, fin):
    if es_primo(i):
        primos.append(i)

print (f"Lista de números primos desde {inicio} hasta {fin}: {primos}")
