<!DOCTYPE html>
<html>
<head>
    <title>Editar Pessoa</title>
</head>
<body>
<h1>Editar Pessoa</h1>
<form action="/pessoas/edit/${pessoa.id}" method="post">
    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" value="${pessoa.nome}" required><br><br>
    <label for="idade">Idade:</label>
    <input type="number" id="idade" name="idade" value="${pessoa.idade}" required><br><br>
    <label for="endereco">Endereço:</label>
    <input type="text" id="endereco" name="

</form>
