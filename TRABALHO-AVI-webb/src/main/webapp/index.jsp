<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="tp-br">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="AddStyle.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <main>
        <form action="add" method="post">
            <h1>Cadastrar Cordenador</h1>
            <label for="produto">Nome:</label>
            <input type="text" id="nome" name="nome" required><br>

            <label style="font-size: 18px;" for="fotos">Diciplinas</label>
            <div id="fotos">

            </div>
            <div class="bnt">
                <button type="button" onclick="addFoto()">Adicionar Cursos</button>
                <button id="remove" type="button">remover Cursos</button>
            </div>

            <label style="font-size: 18px;" for="Hora">Horarios</label>
            <div class="hora" id="hora">

            </div>


            <div class="bnt">
                <button type="button" onclick="addhora()">Adicionar Horarios</button>
                <button id="removeh" type="button">romover Horarios</button>
            </div>

            <input type="submit" value="Cadastrar">
        </form>
    </main>
</body>
<script src="./scripts/Add.js"></script>
</html>