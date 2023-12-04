# Tela de login



## :camera_flash: Screenshots
<!-- You can add more screenshots here if you like -->

<table>
  <tr>
    <td><img src="/result/Screenshot_splashscreen.png" width="260"></td>
    <td><img src="/result/Screenshot_1.png" width="260"></td>
    <td><img src="/result/Screenshot_2.png" width="260"></td>
  </tr>
  <tr>
    <td><img src="/result/Screenshot_3.png" width="260"></td>
    <td><img src="/result/Screenshot_4.png" width="260"></td>
    <!-- Adicione mais colunas conforme necessário -->
  </tr>
</table>



# Tela de Login em Kotlin

Simulando uma tela de login. O usuário insere um nome de usuário e senha, pressiona o botão "Entrar", e o aplicativo verifica se o login é válido. 
Se o login for bem-sucedido, uma mensagem de "Login OK" é exibida e o usuário é redirecionado para uma tela de sucesso. Se o login for inválido, uma mensagem de "Login Inválido" é exibida e o usuário é redirecionado para uma tela de erro.

## Tecnologias


- **Activity para Host de Telas:** Utilizada para hospedar as diferentes telas do aplicativo.

- **ViewGroup:**
  - **LinearLayout:** Utilizado para organizar elementos linearmente.

- **Components de UI:**
  - **TextView:** Para exibição de textos.
  - **EditText:** Para entrada de texto pelo usuário.
  - **Button:** Botão para interações do usuário.

- **Toast:** Utilizado para exibir mensagens curtas na interface do usuário.

- **Intent Explicita:** Utilizada para abrir a segunda Activity e para a navegação entre telas.

- **View Binding:** Vinculação eficiente das views do layout.



## Estrutura do Projeto

O projeto possui as seguintes telas:

1. **SplashScreen:**
   - Uma tela inicial que é exibida por 3 segundos antes de redirecionar para a tela principal (`MainActivity::class.java`) utilizando `Intent`.
   - Arquivo: `SplashScreen.kt`

2. **LoginOK:**
   - Tela exibida quando o login é bem-sucedido.
   - Possui um botão "Logout" para voltar à tela de login.
   - Redireciona para a tela de login (`MainActivity::class.java`) utilizando `Intent`.
   - Arquivo: `LoginOK.kt`

3. **LoginErrado:**
   - Tela exibida quando o login é inválido.
   - Possui um botão "Voltar" para retornar à tela de login.
   - Redireciona para a tela de login (`MainActivity::class.java`) utilizando `Intent`.
   - Arquivo: `LoginErrado.kt`

## TODO

- Melhorar a estilização do aplicativo.
  
- Adicionar novas funcionalidades.

## Autor
Antonio Felipe Oliveira (www.linkedin.com/in/id-antonio-felipe)

## License

The MIT License (MIT)

Copyright (c) 2023 Antonio Felipe Oliveira

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
