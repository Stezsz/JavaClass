# Comandos de Loop em Java

Este arquivo contém explicações simples e exemplos de comandos básicos de controle de loop em Java.

## **For**
Usado para loops com número conhecido de iterações.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

## **While**
Usado quando a quantidade de iterações não é fixa e depende de uma condição.

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

## **Break**
Interrompe um loop imediatamente.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break; // Sai do loop quando i == 5
    System.out.println(i);
}
```

## **Continue**
Pula para a próxima iteração do loop, ignorando o restante do código na iteração atual.

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) continue; // Pula números pares
    System.out.println(i);
}
